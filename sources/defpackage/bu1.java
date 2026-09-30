package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bu1 extends gbe implements l26 {
    final /* synthetic */ jx $flipAngle;
    final /* synthetic */ n69 $lastFlipDirection$delegate;
    float F$0;
    float F$1;
    float F$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu1(jx jxVar, n69 n69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$flipAngle = jxVar;
        this.$lastFlipDirection$delegate = n69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new bu1(this.$flipAngle, this.$lastFlipDirection$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            float fFloatValue = ((Number) this.$flipAngle.e()).floatValue();
            float f = fFloatValue % 360.0f;
            if (f != 0.0f && Math.signum(f) != Math.signum(360.0f)) {
                f += 360.0f;
            }
            if (f != 0.0f) {
                float f2 = ((qz9) this.$lastFlipDirection$delegate).j() > 0.0f ? fFloatValue - f : 360.0f + (fFloatValue - f);
                jx jxVar = this.$flipAngle;
                Float f3 = new Float(f2);
                x6f x6fVarT = b21.T(450, 0, hs4.a, 2);
                this.F$0 = fFloatValue;
                this.F$1 = f;
                this.F$2 = f2;
                this.label = 1;
                Object objB = jx.b(jxVar, f3, x6fVarT, null, null, this, 12);
                bw2 bw2Var = bw2.a;
                if (objB == bw2Var) {
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
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((bu1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
