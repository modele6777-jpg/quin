package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jm6 extends gbe implements l26 {
    final /* synthetic */ float $containerHeightPx;
    final /* synthetic */ ph3 $decay;
    final /* synthetic */ e89 $drawerStateValue$delegate;
    final /* synthetic */ e89 $isHapticTriggered$delegate;
    final /* synthetic */ float $openThresholdPx;
    final /* synthetic */ jx $translationY;
    final /* synthetic */ float $velocity;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm6(jx jxVar, float f, ph3 ph3Var, float f2, float f3, e89 e89Var, e89 e89Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$translationY = jxVar;
        this.$velocity = f;
        this.$decay = ph3Var;
        this.$containerHeightPx = f2;
        this.$openThresholdPx = f3;
        this.$isHapticTriggered$delegate = e89Var;
        this.$drawerStateValue$delegate = e89Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new jm6(this.$translationY, this.$velocity, this.$decay, this.$containerHeightPx, this.$openThresholdPx, this.$isHapticTriggered$delegate, this.$drawerStateValue$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            jx jxVar = this.$translationY;
            float f = this.$containerHeightPx;
            float f2 = this.$openThresholdPx;
            e89 e89Var = this.$isHapticTriggered$delegate;
            e89 e89Var2 = this.$drawerStateValue$delegate;
            float fFloatValue = ((Number) jxVar.e()).floatValue();
            float f3 = this.$velocity;
            ph3 ph3Var = this.$decay;
            this.label = 1;
            Object objD = um6.d(jxVar, f, f2, e89Var, e89Var2, fFloatValue, f3, ph3Var, this);
            bw2 bw2Var = bw2.a;
            if (objD == bw2Var) {
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
        return ((jm6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
