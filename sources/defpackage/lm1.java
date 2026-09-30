package defpackage;

import io.sentry.android.core.b1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lm1 implements atb, nd6 {
    public final long a;
    public final yh0 b;
    public td6 c;

    public lm1(long j) {
        this.a = j;
        if (j <= 0) {
            qc0.j("Failed requirement.");
            throw null;
        }
        yh0 yh0Var = new yh0();
        yh0Var.a = 0L;
        this.b = yh0Var;
    }

    @Override // defpackage.nd6
    public final void a() {
        long j;
        yh0 yh0Var = this.b;
        do {
            j = yh0Var.a;
        } while (!yh0.b.compareAndSet(yh0Var, j, j != -1 ? 0L : -1L));
        td6 td6Var = this.c;
        td6Var.getClass();
        td6Var.U(false);
        StringBuilder sb = new StringBuilder("Capture processing has been disabled for ");
        td6 td6Var2 = this.c;
        td6Var2.getClass();
        sb.append(td6Var2);
        sb.append(" until ");
        sb.append(this.a);
        sb.append(" frames have been completed.");
        b1.l("CXCP", sb.toString());
    }

    @Override // defpackage.nd6
    public final void b() {
        this.b.a = -1L;
        td6 td6Var = this.c;
        td6Var.getClass();
        td6Var.U(false);
    }

    @Override // defpackage.atb
    public final void h0(qtb qtbVar, long j, ds dsVar) {
        long j2;
        long j3;
        yh0 yh0Var = this.b;
        do {
            j2 = yh0Var.a;
            j3 = j2 != -1 ? 1 + j2 : -1L;
        } while (!yh0.b.compareAndSet(yh0Var, j2, j3));
        if (j3 == this.a) {
            b1.l("CXCP", "Capture processing is now enabled for " + this.c + " after " + j3 + " frames.");
            td6 td6Var = this.c;
            td6Var.getClass();
            td6Var.U(true);
        }
    }

    @Override // defpackage.nd6
    public final void c() {
    }
}
