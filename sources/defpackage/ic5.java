package defpackage;

import android.content.Context;
import io.sentry.config.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ic5 extends gbe implements l26 {
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ic5(2, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        File[] fileArrListFiles;
        Object dzbVar;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        hf8.Q.getClass();
        Context contextZ = cn1.z();
        File file = af1.Z;
        if (file == null || (fileArrListFiles = file.listFiles(new tb3(1))) == null) {
            return null;
        }
        if (fileArrListFiles.length == 0) {
            fileArrListFiles = null;
        }
        if (fileArrListFiles == null) {
            return null;
        }
        File file2 = new File(contextZ.getCacheDir(), kv2.m("quin-logs-", ".zip", System.currentTimeMillis()));
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(a.e(new FileOutputStream(file2), file2));
            try {
                for (File file3 : qd0.A0(new kv8(7), fileArrListFiles)) {
                    zipOutputStream.putNextEntry(new ZipEntry(file3.getName()));
                    FileInputStream fileInputStreamB = a.b(file3, new FileInputStream(file3));
                    try {
                        lmg.Y(fileInputStreamB, zipOutputStream);
                        fileInputStreamB.close();
                        zipOutputStream.closeEntry();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ym8.t(fileInputStreamB, th);
                            throw th2;
                        }
                    }
                }
                zipOutputStream.close();
                dzbVar = wef.a;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    ym8.t(zipOutputStream, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            dzbVar = new dzb(th5);
        }
        if (ezb.a(dzbVar) != null) {
            return null;
        }
        return file2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ic5) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
