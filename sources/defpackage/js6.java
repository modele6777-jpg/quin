package defpackage;

import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class js6 extends gh0 {
    public final /* synthetic */ ks6 n;

    public js6(ks6 ks6Var) {
        this.n = ks6Var;
    }

    @Override // defpackage.gh0
    public final void j() {
        this.n.f(ay4.CANCEL);
        ds6 ds6Var = this.n.b;
        synchronized (ds6Var) {
            long j = ds6Var.Y;
            long j2 = ds6Var.X;
            if (j < j2) {
                return;
            }
            ds6Var.X = j2 + 1;
            ds6Var.Z = System.nanoTime() + 1000000000;
            jle.b(ds6Var.v, ks0.l(new StringBuilder(), ds6Var.c, " ping"), new uo2(29, ds6Var));
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
