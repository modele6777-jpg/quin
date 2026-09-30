package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mx9 extends gbe implements l26 {
    final /* synthetic */ yx9 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx9(yx9 yx9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$state = yx9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new mx9(this.$state, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object objF;
        int i = this.label;
        wef wefVar = wef.a;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        yx9 yx9Var = this.$state;
        this.label = 1;
        zx9 zx9Var = ay9.a;
        int iJ = ((sz9) yx9Var.d.c).j() + 1;
        int iL = yx9Var.l();
        bw2 bw2Var = bw2.a;
        if (iJ >= iL || (objF = yx9Var.f(((sz9) yx9Var.d.c).j() + 1, b21.P(0.0f, 0.0f, 7, null), this)) != bw2Var) {
            objF = wefVar;
        }
        return objF == bw2Var ? bw2Var : wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((mx9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
