package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class di3 extends gbe implements l26 {
    final /* synthetic */ n69 $boxRotation$delegate;
    final /* synthetic */ boolean $exitRequested;
    final /* synthetic */ x16 $onRequestBackToPicker;
    final /* synthetic */ hi3 $spinAnim;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di3(boolean z, hi3 hi3Var, x16 x16Var, n69 n69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$exitRequested = z;
        this.$spinAnim = hi3Var;
        this.$onRequestBackToPicker = x16Var;
        this.$boxRotation$delegate = n69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new di3(this.$exitRequested, this.$spinAnim, this.$onRequestBackToPicker, this.$boxRotation$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        di3 di3Var;
        int i = this.label;
        wef wefVar = wef.a;
        if (i == 0) {
            jzb.q(obj);
            if (!this.$exitRequested) {
                return wefVar;
            }
            lyd lydVar = this.$spinAnim.a;
            if (lydVar != null) {
                lydVar.h(null);
            }
            float fJ = ((qz9) this.$boxRotation$delegate).j();
            float fL = (ym8.L((((qz9) this.$boxRotation$delegate).j() - 22.0f) / 360.0f) * 360.0f) + 22.0f;
            x6f x6fVarT = b21.T(280, 0, hs4.a, 2);
            iu1 iu1Var = new iu1(this.$boxRotation$delegate, 4);
            this.label = 1;
            di3Var = this;
            Object objS = hkg.S(fJ, fL, x6fVarT, iu1Var, di3Var, 4);
            bw2 bw2Var = bw2.a;
            if (objS == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            di3Var = this;
        }
        di3Var.$onRequestBackToPicker.invoke();
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((di3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
