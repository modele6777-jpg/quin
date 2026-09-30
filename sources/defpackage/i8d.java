package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i8d extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ bi $exifData;
    final /* synthetic */ mmb $itemUri;
    final /* synthetic */ mmb $legacyFile;
    final /* synthetic */ ContentResolver $resolver;
    final /* synthetic */ File $this_saveImageToMediaStore;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8d(File file, ContentResolver contentResolver, mmb mmbVar, bi biVar, mmb mmbVar2, Context context, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_saveImageToMediaStore = file;
        this.$resolver = contentResolver;
        this.$itemUri = mmbVar;
        this.$exifData = biVar;
        this.$legacyFile = mmbVar2;
        this.$context = context;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new i8d(this.$this_saveImageToMediaStore, this.$resolver, this.$itemUri, this.$exifData, this.$legacyFile, this.$context, xn2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws IOException {
        Uri uriInsert;
        ?? r0 = this.label;
        try {
            if (r0 == 0) {
                jzb.q(obj);
                q8d q8dVarY = pa7.Y(this.$this_saveImageToMediaStore);
                String str = "quin_image_" + UUID.randomUUID() + "." + q8dVarY.a();
                ContentValues contentValues = new ContentValues();
                mmb mmbVar = this.$legacyFile;
                contentValues.put("_display_name", str);
                contentValues.put("mime_type", q8dVarY.b());
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + "/Xmind");
                    contentValues.put("is_pending", new Integer(1));
                } else {
                    File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Xmind");
                    if (!file.mkdirs() && !file.isDirectory()) {
                        qc0.p("Check failed.");
                        return null;
                    }
                    File fileCreateTempFile = File.createTempFile("quin_image_", "." + q8dVarY.a(), file);
                    mmbVar.element = fileCreateTempFile;
                    contentValues.put("_display_name", fileCreateTempFile.getName());
                    contentValues.put("_data", fileCreateTempFile.getAbsolutePath());
                }
                uriInsert = this.$resolver.insert(i >= 29 ? MediaStore.Images.Media.getContentUri("external_primary") : MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                if (uriInsert == null) {
                    yg5.m("Failed to create MediaStore record");
                    return null;
                }
                this.$itemUri.element = uriInsert;
                OutputStream outputStreamOpenOutputStream = this.$resolver.openOutputStream(uriInsert);
                if (outputStreamOpenOutputStream == null) {
                    yg5.m("Failed to open MediaStore output");
                    return null;
                }
                File file2 = this.$this_saveImageToMediaStore;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = uriInsert;
                this.L$5 = null;
                this.L$6 = outputStreamOpenOutputStream;
                this.L$7 = null;
                this.label = 1;
                pa7.N(file2, outputStreamOpenOutputStream, this);
                wef wefVar = wef.a;
                bw2 bw2Var = bw2.a;
                r0 = outputStreamOpenOutputStream;
                if (wefVar == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (r0 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Closeable closeable = (Closeable) this.L$6;
                uriInsert = (Uri) this.L$4;
                jzb.q(obj);
                r0 = closeable;
            }
            ym8.t(r0, null);
            tq.v(getContext());
            bi biVar = this.$exifData;
            if (biVar != null) {
                ci.b(this.$context, uriInsert, biVar);
            }
            tq.v(getContext());
            if (Build.VERSION.SDK_INT >= 29) {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("is_pending", new Integer(0));
                if (this.$resolver.update(uriInsert, contentValues2, null, null) != 1) {
                    yg5.m("Failed to publish MediaStore image");
                    return null;
                }
            }
            return uriInsert;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ym8.t(r0, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((i8d) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
