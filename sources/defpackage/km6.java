package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class km6 extends gbe implements n26 {
    final /* synthetic */ float $containerHeightPx;
    final /* synthetic */ aw2 $coroutineScope;
    final /* synthetic */ ph3 $decay;
    final /* synthetic */ e89 $drawerStateValue$delegate;
    final /* synthetic */ e89 $isHapticTriggered$delegate;
    final /* synthetic */ float $openThresholdPx;
    final /* synthetic */ jx $translationY;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km6(aw2 aw2Var, jx jxVar, ph3 ph3Var, float f, float f2, e89 e89Var, e89 e89Var2, xn2 xn2Var) {
        super(3, xn2Var);
        this.$coroutineScope = aw2Var;
        this.$translationY = jxVar;
        this.$decay = ph3Var;
        this.$containerHeightPx = f;
        this.$openThresholdPx = f2;
        this.$isHapticTriggered$delegate = e89Var;
        this.$drawerStateValue$delegate = e89Var2;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        km6 km6Var = new km6(this.$coroutineScope, this.$translationY, this.$decay, this.$containerHeightPx, this.$openThresholdPx, this.$isHapticTriggered$delegate, this.$drawerStateValue$delegate, (xn2) obj3);
        km6Var.F$0 = fFloatValue;
        wef wefVar = wef.a;
        km6Var.r(wefVar);
        return wefVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        float f = this.F$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        ynb.V(this.$coroutineScope, null, null, new jm6(this.$translationY, f, this.$decay, this.$containerHeightPx, this.$openThresholdPx, this.$isHapticTriggered$delegate, this.$drawerStateValue$delegate, null), 3);
        return wef.a;
    }
}
