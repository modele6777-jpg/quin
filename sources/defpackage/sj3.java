package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sj3 extends gbe implements l26 {
    final /* synthetic */ n69 $boxSlideX$delegate;
    final /* synthetic */ float $screenWidthPx;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj3(float f, n69 n69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$screenWidthPx = f;
        this.$boxSlideX$delegate = n69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new sj3(this.$screenWidthPx, this.$boxSlideX$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            float f = this.$screenWidthPx * 1.2f;
            x6f x6fVarT = b21.T(500, 0, hs4.b, 2);
            iu1 iu1Var = new iu1(this.$boxSlideX$delegate, 6);
            this.label = 1;
            Object objS = hkg.S(0.0f, f, x6fVarT, iu1Var, this, 4);
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
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((sj3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
