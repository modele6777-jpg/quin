package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gtc extends gbe implements l26 {
    final /* synthetic */ float $fraction;
    final /* synthetic */ Object $oldTargetState;
    final /* synthetic */ Object $targetState;
    final /* synthetic */ n3f $transition;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ltc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtc(Object obj, Object obj2, ltc ltcVar, n3f n3fVar, float f, xn2 xn2Var) {
        super(2, xn2Var);
        this.$targetState = obj;
        this.$oldTargetState = obj2;
        this.this$0 = ltcVar;
        this.$transition = n3fVar;
        this.$fraction = f;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        gtc gtcVar = new gtc(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, xn2Var);
        gtcVar.L$0 = obj;
        return gtcVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        if (i == 0) {
            jzb.q(obj);
            aw2 aw2Var = (aw2) this.L$0;
            boolean zT = pa7.t(this.$targetState, this.$oldTargetState);
            ltc ltcVar = this.this$0;
            if (zT) {
                ltcVar.o = null;
                if (pa7.t(ltcVar.c.getValue(), this.$targetState)) {
                    return wefVar;
                }
            } else {
                ltcVar.h();
            }
            if (!pa7.t(this.$targetState, this.$oldTargetState)) {
                this.$transition.s(this.$targetState);
                this.$transition.o(0L);
                ltc ltcVar2 = this.this$0;
                ltcVar2.b.setValue(this.$targetState);
                this.$transition.k(this.$fraction);
            }
            this.this$0.m(this.$fraction);
            boolean zE = this.this$0.n.e();
            ltc ltcVar3 = this.this$0;
            if (zE) {
                ynb.V(aw2Var, null, null, new ftc(ltcVar3, null), 3);
            } else {
                ltcVar3.m = Long.MIN_VALUE;
            }
            ltc ltcVar4 = this.this$0;
            this.label = 1;
            Object objP = ltcVar4.p(this);
            bw2 bw2Var = bw2.a;
            if (objP == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        this.this$0.l();
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((gtc) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
