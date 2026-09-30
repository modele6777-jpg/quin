package defpackage;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k81 implements mtd {
    public boolean a;
    public final /* synthetic */ v41 b;
    public final /* synthetic */ kv c;
    public final /* synthetic */ xhb d;

    public k81(v41 v41Var, kv kvVar, xhb xhbVar) {
        this.b = v41Var;
        this.c = kvVar;
        this.d = xhbVar;
    }

    @Override // defpackage.mtd
    public final long c0(f41 f41Var, long j) throws IOException {
        f41Var.getClass();
        try {
            long jC0 = this.b.c0(f41Var, j);
            xhb xhbVar = this.d;
            if (jC0 != -1) {
                f41Var.u(xhbVar.b, f41Var.b - jC0, jC0);
                xhbVar.b();
                return jC0;
            }
            if (!this.a) {
                this.a = true;
                xhbVar.close();
            }
            return -1L;
        } catch (IOException e) {
            if (this.a) {
                throw e;
            }
            this.a = true;
            this.c.a();
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean zG;
        if (!this.a) {
            TimeZone timeZone = keg.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zG = keg.g(this, 100);
            } catch (IOException unused) {
                zG = false;
            }
            if (!zG) {
                this.a = true;
                this.c.a();
            }
        }
        this.b.close();
    }

    @Override // defpackage.mtd
    public final jye j() {
        return this.b.j();
    }
}
