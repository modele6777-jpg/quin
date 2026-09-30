package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tg6 implements lla {
    public final yi a;
    public final ul9 b;
    public long c = 0;

    public tg6(yi yiVar, ul9 ul9Var) {
        this.a = yiVar;
        this.b = ul9Var;
    }

    @Override // defpackage.lla
    public final long x(a77 a77Var, long j, cv7 cv7Var, long j2) {
        long jA = this.b.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.c;
        }
        this.c = jA;
        return w67.d(w67.d(a77Var.c(), qn4.R(jA)), this.a.a(j2, 0L, cv7Var));
    }
}
