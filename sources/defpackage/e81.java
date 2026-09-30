package defpackage;

import io.sentry.config.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e81 {
    public final yid a;
    public final long b;
    public dc3 c;
    public long d;
    public File e;
    public OutputStream f;
    public long g;
    public long h;
    public e0c i;

    public e81(yid yidVar) {
        yidVar.getClass();
        this.a = yidVar;
        this.b = 5242880L;
    }

    public final void a() {
        OutputStream outputStream = this.f;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            pqf.f(this.f);
            this.f = null;
            File file = this.e;
            this.e = null;
            yid yidVar = this.a;
            long j = this.g;
            synchronized (yidVar) {
                if (file.exists()) {
                    if (j == 0) {
                        file.delete();
                        return;
                    }
                    zid zidVarB = zid.b(file, j, -9223372036854775807L, yidVar.c);
                    zidVarB.getClass();
                    t81 t81VarV = yidVar.c.V(zidVarB.a);
                    t81VarV.getClass();
                    pa7.J(t81VarV.c(zidVarB.b, zidVarB.c));
                    byte[] bArr = (byte[]) t81VarV.e.b.get("exo_len");
                    long j2 = bArr != null ? ByteBuffer.wrap(bArr).getLong() : -1L;
                    if (j2 != -1) {
                        pa7.J(zidVarB.b + zidVarB.c <= j2);
                    }
                    if (yidVar.d == null) {
                        yidVar.a(zidVarB);
                        yidVar.c.M0();
                        yidVar.notifyAll();
                        return;
                    }
                    try {
                        yidVar.d.U(file.getName(), zidVarB.c, zidVarB.f);
                        yidVar.a(zidVarB);
                        try {
                            yidVar.c.M0();
                            yidVar.notifyAll();
                            return;
                        } catch (IOException e) {
                            throw new w71(e);
                        }
                    } catch (IOException e2) {
                        throw new w71(e2);
                    }
                    throw th;
                }
            }
        } catch (Throwable th) {
            pqf.f(this.f);
            this.f = null;
            File file2 = this.e;
            this.e = null;
            file2.delete();
            throw th;
        }
    }

    public final void b(dc3 dc3Var) {
        File fileC;
        long j = dc3Var.g;
        long jMin = j == -1 ? -1L : Math.min(j - this.h, this.d);
        yid yidVar = this.a;
        String str = dc3Var.h;
        String str2 = pqf.a;
        long j2 = dc3Var.f + this.h;
        synchronized (yidVar) {
            try {
                yidVar.c();
                t81 t81VarV = yidVar.c.V(str);
                t81VarV.getClass();
                pa7.J(t81VarV.c(j2, jMin));
                if (!yidVar.a.exists()) {
                    yid.d(yidVar.a);
                    yidVar.j();
                }
                d28 d28Var = yidVar.b;
                if (jMin != -1) {
                    d28Var.a(yidVar, jMin);
                } else {
                    d28Var.getClass();
                }
                File file = new File(yidVar.a, Integer.toString(yidVar.f.nextInt(10)));
                if (!file.exists()) {
                    yid.d(file);
                }
                fileC = zid.c(file, t81VarV.a, j2, System.currentTimeMillis());
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e = fileC;
        File file2 = this.e;
        FileOutputStream fileOutputStreamE = a.e(new FileOutputStream(file2), file2);
        e0c e0cVar = this.i;
        if (e0cVar == null) {
            this.i = new e0c(fileOutputStreamE, 20480);
        } else {
            e0cVar.b(fileOutputStreamE);
        }
        this.f = this.i;
        this.g = 0L;
    }
}
