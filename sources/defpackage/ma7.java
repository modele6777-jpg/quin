package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ma7 extends ja7 {
    public ia7 E0;
    public boolean F0;

    @Override // defpackage.ja7, defpackage.kv7
    public final int E0(lg8 lg8Var, tn8 tn8Var, int i) {
        return this.E0 == ia7.a ? tn8Var.n(i) : tn8Var.q(i);
    }

    @Override // defpackage.ja7, defpackage.kv7
    public final int h(lg8 lg8Var, tn8 tn8Var, int i) {
        return this.E0 == ia7.a ? tn8Var.n(i) : tn8Var.q(i);
    }

    @Override // defpackage.ja7
    public final long l1(tn8 tn8Var, long j) {
        int iN = this.E0 == ia7.a ? tn8Var.n(kl2.g(j)) : tn8Var.q(kl2.g(j));
        if (iN < 0) {
            iN = 0;
        }
        if (iN < 0) {
            k37.a("width must be >= 0");
        }
        return ll2.h(iN, iN, 0, Integer.MAX_VALUE);
    }

    @Override // defpackage.ja7
    public final boolean m1() {
        return this.F0;
    }
}
