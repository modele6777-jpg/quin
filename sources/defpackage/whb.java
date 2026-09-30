package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class whb implements q0e, wj5, q36 {
    public final /* synthetic */ q0e a;
    private final dg7 job;

    public whb(h89 h89Var, lyd lydVar) {
        this.a = h89Var;
        this.job = lydVar;
    }

    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        return this.a.b(xj5Var, xn2Var);
    }

    @Override // defpackage.q36
    public final wj5 c(pv2 pv2Var, int i, i41 i41Var) {
        return (((i < 0 || i >= 2) && i != -2) || i41Var != i41.b) ? ocd.c(this, pv2Var, i, i41Var) : this;
    }

    @Override // defpackage.q0e
    public final Object getValue() {
        return this.a.getValue();
    }
}
