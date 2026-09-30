package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wv9 extends gbe implements l26 {
    final /* synthetic */ h0e $bottomPaddingState;
    final /* synthetic */ j18 $scrollState;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv9(h0e h0eVar, j18 j18Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$bottomPaddingState = h0eVar;
        this.$scrollState = j18Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new wv9(this.$bottomPaddingState, this.$scrollState, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            jmb jmbVar = new jmb();
            jmbVar.element = ((Number) this.$bottomPaddingState.getValue()).floatValue();
            ybc ybcVarP = jzb.p(new zk1(12, this.$bottomPaddingState));
            qb1 qb1Var = new qb1(10, jmbVar, this.$scrollState);
            this.L$0 = null;
            this.label = 1;
            Object objB = ybcVarP.b(qb1Var, this);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
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
        return ((wv9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
