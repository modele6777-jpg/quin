package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class htc extends gbe implements a26 {
    final /* synthetic */ float $fraction;
    final /* synthetic */ Object $oldTargetState;
    final /* synthetic */ Object $targetState;
    final /* synthetic */ n3f $transition;
    int label;
    final /* synthetic */ ltc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htc(Object obj, Object obj2, ltc ltcVar, n3f n3fVar, float f, xn2 xn2Var) {
        super(1, xn2Var);
        this.$targetState = obj;
        this.$oldTargetState = obj2;
        this.this$0 = ltcVar;
        this.$transition = n3fVar;
        this.$fraction = f;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new htc(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            gtc gtcVar = new gtc(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, null);
            this.label = 1;
            Object objO = jgb.O(gtcVar, this);
            bw2 bw2Var = bw2.a;
            if (objO == bw2Var) {
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
}
