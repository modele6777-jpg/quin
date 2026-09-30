package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fa7 extends ja7 {
    public ia7 E0;
    public boolean F0;

    @Override // defpackage.ja7, defpackage.kv7
    public final int i0(lg8 lg8Var, tn8 tn8Var, int i) {
        return this.E0 == ia7.a ? tn8Var.V(i) : tn8Var.b(i);
    }

    @Override // defpackage.ja7
    public final long l1(tn8 tn8Var, long j) {
        int iV = this.E0 == ia7.a ? tn8Var.V(kl2.h(j)) : tn8Var.b(kl2.h(j));
        if (iV < 0) {
            iV = 0;
        }
        if (iV < 0) {
            k37.a("height must be >= 0");
        }
        return ll2.h(0, Integer.MAX_VALUE, iV, iV);
    }

    @Override // defpackage.ja7
    public final boolean m1() {
        return this.F0;
    }

    @Override // defpackage.ja7, defpackage.kv7
    public final int u0(lg8 lg8Var, tn8 tn8Var, int i) {
        return this.E0 == ia7.a ? tn8Var.V(i) : tn8Var.b(i);
    }
}
