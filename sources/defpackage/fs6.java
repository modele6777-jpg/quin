package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fs6 implements mtd {
    public final yhb a;
    public int b;
    public int c;
    public int d;
    public int e;

    public fs6(yhb yhbVar) {
        this.a = yhbVar;
    }

    @Override // defpackage.mtd
    public final long c0(f41 f41Var, long j) throws IOException {
        int i;
        int iE;
        f41Var.getClass();
        do {
            int i2 = this.d;
            yhb yhbVar = this.a;
            if (i2 == 0) {
                yhbVar.k0(this.e);
                this.e = 0;
                if ((this.b & 4) == 0) {
                    i = this.c;
                    int iN = ieg.n(yhbVar);
                    this.d = iN;
                    int iU = yhbVar.u() & 255;
                    this.b = yhbVar.u() & 255;
                    Logger logger = gs6.d;
                    if (logger.isLoggable(Level.FINE)) {
                        a71 a71Var = wr6.a;
                        logger.fine(wr6.b(true, this.c, iN, iU, this.b));
                    }
                    iE = yhbVar.E() & Integer.MAX_VALUE;
                    this.c = iE;
                    if (iU != 9) {
                        yg5.m(ub3.g(iU, " != TYPE_CONTINUATION"));
                        return 0L;
                    }
                }
            } else {
                long jC0 = yhbVar.c0(f41Var, Math.min(j, i2));
                if (jC0 != -1) {
                    this.d -= (int) jC0;
                    return jC0;
                }
            }
            return -1L;
        } while (iE == i);
        yg5.m("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // defpackage.mtd
    public final jye j() {
        return this.a.a.j();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
