package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class on extends gbe implements n26 {
    final /* synthetic */ jmb $leftoverVelocity;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ rn this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on(rn rnVar, jmb jmbVar, float f, xn2 xn2Var) {
        super(3, xn2Var);
        this.this$0 = rnVar;
        this.$leftoverVelocity = jmbVar;
        this.$velocity = f;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        on onVar = new on(this.this$0, this.$leftoverVelocity, this.$velocity, (xn2) obj3);
        onVar.L$0 = (ho) obj;
        return onVar.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        jmb jmbVar;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            ho hoVar = (ho) this.L$0;
            rn rnVar = this.this$0;
            nn nnVar = new nn(0, rnVar, hoVar);
            gj5 gj5Var = rnVar.a1;
            if (gj5Var == null) {
                pa7.g0("resolvedFlingBehavior");
                throw null;
            }
            jmb jmbVar2 = this.$leftoverVelocity;
            float f = this.$velocity;
            this.L$0 = jmbVar2;
            this.label = 1;
            obj = gj5Var.a(nnVar, f, this);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
            jmbVar = jmbVar2;
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jmbVar = (jmb) this.L$0;
            jzb.q(obj);
        }
        jmbVar.element = ((Number) obj).floatValue();
        return wef.a;
    }
}
