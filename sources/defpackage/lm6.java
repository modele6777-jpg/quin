package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lm6 extends gbe implements l26 {
    final /* synthetic */ float $dragAmount;
    final /* synthetic */ eh6 $haptic;
    final /* synthetic */ e89 $isHapticTriggered$delegate;
    final /* synthetic */ float $openThresholdPx;
    final /* synthetic */ jx $translationY;
    final /* synthetic */ float $upperBound;
    float F$0;
    float F$1;
    float F$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm6(jx jxVar, float f, float f2, float f3, eh6 eh6Var, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$translationY = jxVar;
        this.$dragAmount = f;
        this.$upperBound = f2;
        this.$openThresholdPx = f3;
        this.$haptic = eh6Var;
        this.$isHapticTriggered$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new lm6(this.$translationY, this.$dragAmount, this.$upperBound, this.$openThresholdPx, this.$haptic, this.$isHapticTriggered$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            float fFloatValue = ((Number) this.$translationY.e()).floatValue();
            float f = this.$dragAmount;
            if (f > 0.0f) {
                f = um6.f(fFloatValue, f, this.$upperBound);
            }
            float f2 = fFloatValue + f;
            if (f2 >= this.$openThresholdPx) {
                e89 e89Var = this.$isHapticTriggered$delegate;
                float f3 = um6.a;
                if (!((Boolean) e89Var.getValue()).booleanValue()) {
                    ((afa) this.$haptic).a(23);
                    this.$isHapticTriggered$delegate.setValue(Boolean.TRUE);
                }
            }
            jx jxVar = this.$translationY;
            Float f4 = new Float(f2);
            this.F$0 = fFloatValue;
            this.F$1 = f;
            this.F$2 = f2;
            this.label = 1;
            Object objG = jxVar.g(this, f4);
            bw2 bw2Var = bw2.a;
            if (objG == bw2Var) {
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
        return ((lm6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
