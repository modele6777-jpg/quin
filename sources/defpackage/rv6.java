package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import io.sentry.config.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rv6 extends gbe implements l26 {
    final /* synthetic */ String $fileName;
    final /* synthetic */ String $subDir;
    final /* synthetic */ String $videoUrl;
    int label;
    final /* synthetic */ sv6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv6(String str, sv6 sv6Var, String str2, String str3, xn2 xn2Var) {
        super(2, xn2Var);
        this.$videoUrl = str;
        this.this$0 = sv6Var;
        this.$fileName = str2;
        this.$subDir = str3;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new rv6(this.$videoUrl, this.this$0, this.$fileName, this.$subDir, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        try {
            zsb zsbVar = new zsb();
            zsbVar.c(this.$videoUrl);
            zsbVar.b("GET", null);
            ryb rybVarExecute = FirebasePerfOkHttpClient.execute(new cib(this.this$0.b, new btb(zsbVar)));
            boolean z = rybVarExecute.F0;
            int i = rybVarExecute.d;
            if (!z) {
                return new mv6(new IOException("HTTP error code: " + i), "Download failed: HTTP " + i);
            }
            vyb vybVar = rybVarExecute.g;
            if (vybVar == null) {
                return new mv6(new IOException("Empty response body"), "Response body is null");
            }
            String str = "video/mp4";
            String strC = rybVarExecute.f.c("Content-Type");
            if (strC != null) {
                str = strC;
            }
            String strB = this.$fileName;
            if (strB == null) {
                strB = this.this$0.b(this.$videoUrl, str);
            }
            if (Build.VERSION.SDK_INT < 29) {
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES), this.$subDir);
                if (!file.exists() && !file.mkdirs()) {
                    return new mv6("Failed to create directory: " + file.getAbsolutePath());
                }
                File file2 = new File(file, strB);
                InputStream inputStreamB = vybVar.b();
                try {
                    FileOutputStream fileOutputStreamE = a.e(new FileOutputStream(file2), file2);
                    try {
                        lmg.Y(inputStreamB, fileOutputStreamE);
                        fileOutputStreamE.close();
                        inputStreamB.close();
                        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                        intent.setData(Uri.fromFile(file2));
                        this.this$0.a.sendBroadcast(intent);
                        Uri uriFromFile = Uri.fromFile(file2);
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
            ContentValues contentValues = new ContentValues();
            String str2 = this.$subDir;
            contentValues.put("_display_name", strB);
            contentValues.put("mime_type", str);
            contentValues.put("relative_path", Environment.DIRECTORY_MOVIES + File.separator + str2);
            contentValues.put("is_pending", new Integer(1));
            ContentResolver contentResolver = this.this$0.a.getContentResolver();
            Uri uriInsert = contentResolver.insert(MediaStore.Video.Media.getContentUri("external_primary"), contentValues);
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
                contentValues.put("is_pending", new Integer(0));
                contentResolver.update(uriInsert, contentValues, null, null);
                return new nv6(null, uriInsert);
            } catch (Exception e) {
                contentResolver.delete(uriInsert, null, null);
                hf8.Q.getClass();
                ef8.a("ImageDownloader").c("Failed to save video to MediaStore: " + e.getMessage(), e);
                return new mv6(e, "Failed to save video to MediaStore");
            }
            hf8.Q.getClass();
            ef8.a("ImageDownloader").c("Video download failed: " + e.getMessage(), e);
            return new mv6(e, ub3.i("Video download failed: ", e.getMessage()));
        } catch (Exception e2) {
            hf8.Q.getClass();
            ef8.a("ImageDownloader").c("Video download failed: " + e2.getMessage(), e2);
            return new mv6(e2, ub3.i("Video download failed: ", e2.getMessage()));
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((rv6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
