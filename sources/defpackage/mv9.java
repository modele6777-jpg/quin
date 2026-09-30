package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mv9 extends gbe implements l26 {
    final /* synthetic */ ru9 $autoScrollState;
    final /* synthetic */ h0e $currentIsFinished$delegate;
    final /* synthetic */ h0e $currentIsTyping$delegate;
    final /* synthetic */ h0e $currentOnCompletedReadingPinned$delegate;
    final /* synthetic */ j18 $scrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv9(h0e h0eVar, h0e h0eVar2, ru9 ru9Var, j18 j18Var, h0e h0eVar3, xn2 xn2Var) {
        super(2, xn2Var);
        this.$currentIsTyping$delegate = h0eVar;
        this.$currentIsFinished$delegate = h0eVar2;
        this.$autoScrollState = ru9Var;
        this.$scrollState = j18Var;
        this.$currentOnCompletedReadingPinned$delegate = h0eVar3;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new mv9(this.$currentIsTyping$delegate, this.$currentIsFinished$delegate, this.$autoScrollState, this.$scrollState, this.$currentOnCompletedReadingPinned$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        if (i == 0) {
            jzb.q(obj);
            ybc ybcVarP = jzb.p(new ek9(6, this.$currentIsTyping$delegate, this.$currentIsFinished$delegate));
            lv9 lv9Var = new lv9(this.$autoScrollState, this.$scrollState, this.$currentOnCompletedReadingPinned$delegate);
            this.label = 1;
            Object objB = ybcVarP.b(new jl5(new kmb(), lv9Var), this);
            bw2 bw2Var = bw2.a;
            if (objB != bw2Var) {
                objB = wefVar;
            }
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
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((mv9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
