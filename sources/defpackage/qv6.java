package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import androidx.core.content.FileProvider;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import io.sentry.config.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qv6 extends gbe implements l26 {
    final /* synthetic */ String $fileName;
    final /* synthetic */ String $imageUrl;
    final /* synthetic */ n2e $storageLocation;
    final /* synthetic */ String $subDir;
    int label;
    final /* synthetic */ sv6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv6(String str, sv6 sv6Var, String str2, n2e n2eVar, String str3, xn2 xn2Var) {
        super(2, xn2Var);
        this.$imageUrl = str;
        this.this$0 = sv6Var;
        this.$fileName = str2;
        this.$storageLocation = n2eVar;
        this.$subDir = str3;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new qv6(this.$imageUrl, this.this$0, this.$fileName, this.$storageLocation, this.$subDir, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Uri contentUri;
        File file;
        Uri uriFromFile;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        try {
            zsb zsbVar = new zsb();
            zsbVar.c(this.$imageUrl);
            zsbVar.b("GET", null);
            ryb rybVarExecute = FirebasePerfOkHttpClient.execute(new cib(this.this$0.b, new btb(zsbVar)));
            boolean z = rybVarExecute.F0;
            si6 si6Var = rybVarExecute.f;
            int i = rybVarExecute.d;
            if (!z) {
                return new mv6(new IOException("HTTP error code: " + i), "Download failed: HTTP " + i);
            }
            vyb vybVar = rybVarExecute.g;
            if (vybVar == null) {
                return new mv6(new IOException("Empty response body"), "Response body is null");
            }
            String strA = this.$fileName;
            if (strA == null) {
                sv6 sv6Var = this.this$0;
                String str = this.$imageUrl;
                String strC = si6Var.c("Content-Type");
                if (strC == null) {
                    strC = null;
                }
                strA = sv6Var.a(str, strC);
            }
            String str2 = "image/jpeg";
            String strC2 = si6Var.c("Content-Type");
            if (strC2 != null) {
                str2 = strC2;
            }
            n2e n2eVar = this.$storageLocation;
            if ((n2eVar != n2e.b && n2eVar != n2e.c && n2eVar != n2e.d) || Build.VERSION.SDK_INT < 29) {
                int iOrdinal = n2eVar.ordinal();
                if (iOrdinal == 0) {
                    file = new File(this.this$0.a.getFilesDir(), this.$subDir);
                } else if (iOrdinal == 1) {
                    file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), this.$subDir);
                } else if (iOrdinal == 2) {
                    file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), this.$subDir);
                } else {
                    if (iOrdinal != 3) {
                        throw new rf9();
                    }
                    file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES), this.$subDir);
                }
                if (!file.exists() && !file.mkdirs()) {
                    return new mv6("Failed to create directory: " + file.getAbsolutePath());
                }
                File file2 = new File(file, strA);
                InputStream inputStreamB = vybVar.b();
                try {
                    FileOutputStream fileOutputStreamE = a.e(new FileOutputStream(file2), file2);
                    try {
                        lmg.Y(inputStreamB, fileOutputStreamE);
                        fileOutputStreamE.close();
                        inputStreamB.close();
                        n2e n2eVar2 = this.$storageLocation;
                        n2e n2eVar3 = n2e.a;
                        if (n2eVar2 != n2eVar3) {
                            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                            intent.setData(Uri.fromFile(file2));
                            this.this$0.a.sendBroadcast(intent);
                        }
                        if (this.$storageLocation == n2eVar3) {
                            uriFromFile = FileProvider.c(this.this$0.a, this.this$0.a.getPackageName() + ".contentprovider", file2);
                        } else {
                            uriFromFile = Uri.fromFile(file2);
                        }
                        uriFromFile.getClass();
                        return new nv6(file2, uriFromFile);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ym8.t(fileOutputStreamE, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        ym8.t(inputStreamB, th3);
                        throw th4;
                    }
                }
            }
            ContentResolver contentResolver = this.this$0.a.getContentResolver();
            ContentValues contentValues = new ContentValues();
            int iOrdinal2 = this.$storageLocation.ordinal();
            if (iOrdinal2 == 1) {
                contentUri = MediaStore.Images.Media.getContentUri("external_primary");
                contentUri.getClass();
                contentValues.put("_display_name", strA);
                contentValues.put("mime_type", str2);
                contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + File.separator + this.$subDir);
                contentValues.put("is_pending", new Integer(1));
            } else if (iOrdinal2 != 3) {
                contentUri = MediaStore.Downloads.getContentUri("external_primary");
                contentUri.getClass();
                contentValues.put("_display_name", strA);
                contentValues.put("mime_type", str2);
                contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS + File.separator + this.$subDir);
                contentValues.put("is_pending", new Integer(1));
            } else {
                contentUri = MediaStore.Video.Media.getContentUri("external_primary");
                contentUri.getClass();
                contentValues.put("_display_name", strA);
                contentValues.put("mime_type", str2);
                contentValues.put("relative_path", Environment.DIRECTORY_MOVIES + File.separator + this.$subDir);
                contentValues.put("is_pending", new Integer(1));
            }
            Uri uriInsert = contentResolver.insert(contentUri, contentValues);
            if (uriInsert == null) {
                return new mv6("MediaStore insert failed");
            }
            try {
                OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                if (outputStreamOpenOutputStream != null) {
                    try {
                        InputStream inputStreamB2 = vybVar.b();
                        try {
                            long jY = lmg.Y(inputStreamB2, outputStreamOpenOutputStream);
                            inputStreamB2.close();
                            new Long(jY);
                            outputStreamOpenOutputStream.close();
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                ym8.t(inputStreamB2, th5);
                                throw th6;
                            }
                        }
                    } catch (Throwable th7) {
                        try {
                            throw th7;
                        } catch (Throwable th8) {
                            ym8.t(outputStreamOpenOutputStream, th7);
                            throw th8;
                        }
                    }
                }
                contentValues.clear();
                if (pv6.a[this.$storageLocation.ordinal()] == 2) {
                    contentValues.put("is_pending", new Integer(0));
                } else {
                    contentValues.put("is_pending", new Integer(0));
                }
                contentResolver.update(uriInsert, contentValues, null, null);
                return new nv6(null, uriInsert);
            } catch (Exception e) {
                contentResolver.delete(uriInsert, null, null);
                hf8.Q.getClass();
                ef8.a("ImageDownloader").c("Failed to save to MediaStore: " + e.getMessage(), e);
                return new mv6(e, "Failed to save to MediaStore");
            }
            hf8.Q.getClass();
            ef8.a("ImageDownloader").c("Download failed: " + e.getMessage(), e);
            return new mv6(e, ub3.i("Download failed: ", e.getMessage()));
        } catch (Exception e2) {
            hf8.Q.getClass();
            ef8.a("ImageDownloader").c("Download failed: " + e2.getMessage(), e2);
            return new mv6(e2, ub3.i("Download failed: ", e2.getMessage()));
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((qv6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
