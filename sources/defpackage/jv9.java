package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jv9 extends gbe implements l26 {
    final /* synthetic */ ru9 $autoScrollState;
    final /* synthetic */ h0e $isAtBottom$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv9(h0e h0eVar, ru9 ru9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$isAtBottom$delegate = h0eVar;
        this.$autoScrollState = ru9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new jv9(this.$isAtBottom$delegate, this.$autoScrollState, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            ybc ybcVarP = jzb.p(new zk1(11, this.$isAtBottom$delegate));
            ts tsVar = new ts(18, this.$autoScrollState);
            this.label = 1;
            Object objB = ybcVarP.b(tsVar, this);
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
        return ((jv9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
