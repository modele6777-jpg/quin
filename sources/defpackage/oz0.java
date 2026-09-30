package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class oz0 extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ bi $exifData;
    final /* synthetic */ String $filename;
    final /* synthetic */ String $folderName;
    final /* synthetic */ Bitmap $this_saveToMediaStore;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz0(Context context, Bitmap bitmap, String str, bi biVar, String str2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$context = context;
        this.$this_saveToMediaStore = bitmap;
        this.$filename = str;
        this.$exifData = biVar;
        this.$folderName = str2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new oz0(this.$context, this.$this_saveToMediaStore, this.$filename, this.$exifData, this.$folderName, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Uri uriInsert;
        Integer asInteger;
        Integer asInteger2;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        ContentValues contentValues = new ContentValues();
        String strConcat = this.$filename;
        String str = this.$folderName;
        if (strConcat == null) {
            String str2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
            str2.getClass();
            strConcat = "quin_image_".concat(str2);
        }
        contentValues.put("_display_name", strConcat);
        contentValues.put("mime_type", "image/jpeg");
        contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + File.separator + str);
        contentValues.put("is_pending", new Integer(1));
        ContentResolver contentResolver = this.$context.getContentResolver();
        Uri contentUri = Build.VERSION.SDK_INT >= 29 ? MediaStore.Images.Media.getContentUri("external_primary") : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        try {
            try {
                uriInsert = contentResolver.insert(contentUri, contentValues);
                if (uriInsert == null) {
                    throw new IOException("Failed to create new MediaStore record");
                }
                try {
                    bi biVar = this.$exifData;
                    Bitmap bitmap = this.$this_saveToMediaStore;
                    Context context = this.$context;
                    OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                    if (outputStreamOpenOutputStream != null) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, outputStreamOpenOutputStream);
                            outputStreamOpenOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                ym8.t(outputStreamOpenOutputStream, th);
                                throw th2;
                            }
                        }
                    }
                    if (biVar != null) {
                        try {
                            ci.b(context, uriInsert, biVar);
                        } catch (Exception e) {
                            hf8.Q.getClass();
                            ef8.a("BitmapUtil").c("Failed to write EXIF metadata", e);
                        }
                    }
                    contentValues.clear();
                    contentValues.put("is_pending", new Integer(0));
                    contentResolver.update(uriInsert, contentValues, null, null);
                    Integer asInteger3 = contentValues.getAsInteger("is_pending");
                    if (asInteger3 != null && asInteger3.intValue() == 1) {
                        contentResolver.delete(uriInsert, null, null);
                    }
                    return uriInsert;
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                uriInsert = null;
            } catch (Throwable th3) {
                th = th3;
                contentUri = null;
                if (contentUri != null) {
                    contentResolver.delete(contentUri, null, null);
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            if (contentUri != null && (asInteger = contentValues.getAsInteger("is_pending")) != null && asInteger.intValue() == 1) {
                contentResolver.delete(contentUri, null, null);
            }
            throw th;
        }
        hf8.Q.getClass();
        ef8.a("BitmapUtil").c("Failed to save image to MediaStore", e);
        Uri uriL = xo1.L(this.$this_saveToMediaStore, this.$filename, this.$exifData);
        if (uriInsert != null && (asInteger2 = contentValues.getAsInteger("is_pending")) != null && asInteger2.intValue() == 1) {
            contentResolver.delete(uriInsert, null, null);
        }
        return uriL;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((oz0) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
