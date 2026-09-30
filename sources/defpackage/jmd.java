package defpackage;

import ai.askquin.ui.skin.download.SkinDownloadWorker;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import io.sentry.config.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jmd extends gbe implements l26 {
    final /* synthetic */ a26 $onProgress;
    final /* synthetic */ File $partFile;
    final /* synthetic */ File $targetDir;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ SkinDownloadWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmd(SkinDownloadWorker skinDownloadWorker, String str, File file, File file2, a26 a26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = skinDownloadWorker;
        this.$url = str;
        this.$partFile = file;
        this.$targetDir = file2;
        this.$onProgress = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new jmd(this.this$0, this.$url, this.$partFile, this.$targetDir, this.$onProgress, xn2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [jmd] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.String] */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Exception {
        jmd jmdVar = this;
        int i = jmdVar.label;
        wef wefVar = wef.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                SkinDownloadWorker skinDownloadWorker = jmdVar.this$0;
                int i2 = SkinDownloadWorker.x;
                hm9 hm9Var = (hm9) skinDownloadWorker.w.getValue();
                String str = jmdVar.$url;
                File file = jmdVar.$partFile;
                a26 a26Var = jmdVar.$onProgress;
                hm9Var.getClass();
                str.getClass();
                file.getClass();
                long length = file.exists() ? file.length() : 0L;
                zsb zsbVar = new zsb();
                zsbVar.c(str);
                if (length > 0) {
                    zsbVar.a("Range", kv2.m("bytes=", "-", length));
                }
                ryb rybVarExecute = FirebasePerfOkHttpClient.execute(new cib(hm9Var, new btb(zsbVar)));
                try {
                    int i3 = rybVarExecute.d;
                    if (i3 == 416) {
                        a26Var.d(Float.valueOf(0.8f));
                    } else {
                        if (!rybVarExecute.F0) {
                            throw new IOException("HTTP " + i3 + ": " + rybVarExecute.c);
                        }
                        boolean z = i3 == 206;
                        vyb vybVar = rybVarExecute.g;
                        if (!z) {
                            length = 0;
                        }
                        long jH = vybVar.h() >= 0 ? vybVar.h() + length : -1L;
                        FileOutputStream fileOutputStreamD = a.d(file, new FileOutputStream(file, z), z);
                        try {
                            InputStream inputStreamB = vybVar.b();
                            try {
                                byte[] bArr = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
                                float f = -1.0f;
                                while (true) {
                                    int i4 = inputStreamB.read(bArr);
                                    if (i4 == -1) {
                                        break;
                                    }
                                    fileOutputStreamD.write(bArr, 0, i4);
                                    length += (long) i4;
                                    if (jH > 0) {
                                        float fN = mh3.n(length / jH, 0.0f, 1.0f);
                                        if (fN - f >= 0.01f || fN >= 1.0f) {
                                            a26Var.d(Float.valueOf(fN * 0.8f));
                                            f = fN;
                                        }
                                    }
                                    try {
                                        throw th;
                                    } catch (Throwable th) {
                                        ym8.t(fileOutputStreamD, th);
                                        throw th;
                                    }
                                }
                                inputStreamB.close();
                                fileOutputStreamD.close();
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    ym8.t(inputStreamB, th2);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    rybVarExecute.close();
                    jmdVar.this$0.d().e("Download complete, extracting ZIP...");
                    File file2 = jmdVar.$partFile;
                    File file3 = jmdVar.$targetDir;
                    hy0 hy0Var = new hy0(jmdVar.$onProgress, 16);
                    jmdVar.label = 1;
                    iec.h(file2, file3, hy0Var, jmdVar);
                    bw2 bw2Var = bw2.a;
                    if (wefVar == bw2Var) {
                        return bw2Var;
                    }
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        ym8.t(rybVarExecute, th5);
                        throw th6;
                    }
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            jmdVar.$partFile.delete();
            jmdVar.$onProgress.d(new Float(1.0f));
            m8b m8bVarD = jmdVar.this$0.d();
            jmdVar = "Extraction complete";
            m8bVarD.e("Extraction complete");
            return wefVar;
        } catch (Exception e) {
            if (!arb.m(e) && !(e instanceof CancellationException)) {
                jmdVar.$partFile.delete();
            }
            throw e;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((jmd) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
