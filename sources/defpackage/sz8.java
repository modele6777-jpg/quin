package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sz8 extends gbe implements n26 {
    final /* synthetic */ a26 $settleToDismiss;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz8(xn2 xn2Var, a26 a26Var) {
        super(3, xn2Var);
        this.$settleToDismiss = a26Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        sz8 sz8Var = new sz8((xn2) obj3, this.$settleToDismiss);
        sz8Var.F$0 = fFloatValue;
        wef wefVar = wef.a;
        sz8Var.r(wefVar);
        return wefVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.$settleToDismiss.d(new Float(this.F$0));
        return wef.a;
    }
}
