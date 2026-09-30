package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rh8 extends gbe implements l26 {
    final /* synthetic */ qh8 $animationState;
    final /* synthetic */ float $finishedTarget;
    final /* synthetic */ x16 $onAnimationFinish;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh8(qh8 qh8Var, float f, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$animationState = qh8Var;
        this.$finishedTarget = f;
        this.$onAnimationFinish = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new rh8(this.$animationState, this.$finishedTarget, this.$onAnimationFinish, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (((eh8) this.$animationState).d() >= this.$finishedTarget) {
            this.$onAnimationFinish.invoke();
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        rh8 rh8Var = (rh8) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        rh8Var.r(wefVar);
        return wefVar;
    }
}
