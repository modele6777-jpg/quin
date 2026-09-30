package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v0e extends gbe implements l26 {
    final /* synthetic */ vz $incomingAnimationSpec;
    final /* synthetic */ float $targetAlpha;
    int label;
    final /* synthetic */ x0e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0e(x0e x0eVar, float f, vz vzVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = x0eVar;
        this.$targetAlpha = f;
        this.$incomingAnimationSpec = vzVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new v0e(this.this$0, this.$targetAlpha, this.$incomingAnimationSpec, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            jx jxVar = this.this$0.c;
            Float f = new Float(this.$targetAlpha);
            vz vzVar = this.$incomingAnimationSpec;
            this.label = 1;
            Object objB = jx.b(jxVar, f, vzVar, null, null, this, 12);
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
        return ((v0e) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
