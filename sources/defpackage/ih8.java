package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ih8 extends gbe implements l26 {
    final /* synthetic */ int $iterations;
    final /* synthetic */ x16 $onAnimationComplete;
    final /* synthetic */ qh8 $progress$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih8(int i, x16 x16Var, qh8 qh8Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$iterations = i;
        this.$onAnimationComplete = x16Var;
        this.$progress$delegate = qh8Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ih8(this.$iterations, this.$onAnimationComplete, this.$progress$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (((Number) ((eh8) this.$progress$delegate).getValue()).floatValue() >= 1.0f && this.$iterations != Integer.MAX_VALUE) {
            this.$onAnimationComplete.invoke();
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ih8 ih8Var = (ih8) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        ih8Var.r(wefVar);
        return wefVar;
    }
}
