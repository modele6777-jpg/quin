package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class itc extends gbe implements a26 {
    final /* synthetic */ Object $targetState;
    final /* synthetic */ n3f $transition;
    int label;
    final /* synthetic */ ltc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itc(ltc ltcVar, Object obj, n3f n3fVar, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = ltcVar;
        this.$targetState = obj;
        this.$transition = n3fVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new itc(this.this$0, this.$targetState, this.$transition, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        float f;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            this.this$0.g();
            ltc ltcVar = this.this$0;
            ltcVar.m = Long.MIN_VALUE;
            ltcVar.m(0.0f);
            Object obj2 = this.$targetState;
            if (pa7.t(obj2, this.this$0.c.getValue())) {
                f = -4.0f;
            } else {
                f = pa7.t(obj2, this.this$0.b.getValue()) ? -5.0f : -3.0f;
            }
            this.$transition.s(this.$targetState);
            this.$transition.o(0L);
            this.this$0.b.setValue(this.$targetState);
            this.this$0.m(0.0f);
            this.this$0.c(this.$targetState);
            this.$transition.k(f);
            if (f == -3.0f) {
                ltc ltcVar2 = this.this$0;
                this.label = 1;
                Object objP = ltcVar2.p(this);
                bw2 bw2Var = bw2.a;
                if (objP == bw2Var) {
                    return bw2Var;
                }
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        this.$transition.j();
        return wef.a;
    }
}
