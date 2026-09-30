package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hx extends gbe implements a26 {
    final /* synthetic */ Object $targetValue;
    int label;
    final /* synthetic */ jx this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx(jx jxVar, Object obj, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = jxVar;
        this.$targetValue = obj;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        hx hxVar = new hx(this.this$0, this.$targetValue, (xn2) obj);
        wef wefVar = wef.a;
        hxVar.r(wefVar);
        return wefVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.this$0.d();
        Object objC = this.this$0.c(this.$targetValue);
        this.this$0.c.b.setValue(objC);
        this.this$0.e.setValue(objC);
        return wef.a;
    }
}
