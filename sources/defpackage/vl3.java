package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vl3 extends gbe implements l26 {
    final /* synthetic */ int $durationMs;
    final /* synthetic */ n69 $offset$delegate;
    final /* synthetic */ float $shifted;
    final /* synthetic */ float $target;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl3(float f, float f2, int i, n69 n69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$shifted = f;
        this.$target = f2;
        this.$durationMs = i;
        this.$offset$delegate = n69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new vl3(this.$shifted, this.$target, this.$durationMs, this.$offset$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            float f = this.$shifted;
            float f2 = this.$target;
            x6f x6fVarT = b21.T(this.$durationMs, 0, am3.a, 2);
            iu1 iu1Var = new iu1(this.$offset$delegate, 7);
            this.label = 1;
            Object objS = hkg.S(f, f2, x6fVarT, iu1Var, this, 4);
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
        return ((vl3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
