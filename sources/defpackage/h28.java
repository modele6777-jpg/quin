package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h28 extends i09 implements cga, ug2, mb6, f38 {
    public r38 E0;
    public cre F0;
    public final vz9 G0 = q1c.f(null);
    public ys Z;

    public h28(ys ysVar, r38 r38Var, cre creVar) {
        this.Z = ysVar;
        this.E0 = r38Var;
        this.F0 = creVar;
    }

    @Override // defpackage.i09
    public final void d1() {
        ys ysVar = this.Z;
        if (ysVar.a != null) {
            l37.c("Expected textInputModifierNode to be null");
        }
        ysVar.a = this;
    }

    @Override // defpackage.i09
    public final void e1() {
        this.Z.k(this);
    }

    @Override // defpackage.mb6
    public final void l0(yf9 yf9Var) {
        this.G0.setValue(yf9Var);
    }
}
