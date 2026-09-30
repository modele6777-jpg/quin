package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uxd implements xn2, cw2 {
    public final ew1 a;
    public final pv2 b;

    public uxd(ew1 ew1Var, pv2 pv2Var) {
        this.a = ew1Var;
        this.b = pv2Var;
    }

    @Override // defpackage.cw2
    public final cw2 e() {
        return this.a;
    }

    @Override // defpackage.xn2
    public final void g(Object obj) {
        this.a.g(obj);
    }

    @Override // defpackage.xn2
    public final pv2 getContext() {
        return this.b;
    }
}
