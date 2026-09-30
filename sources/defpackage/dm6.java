package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dm6 extends gbe implements l26 {
    final /* synthetic */ jx $translationY;
    final /* synthetic */ float $upperBound;
    float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm6(jx jxVar, float f, xn2 xn2Var) {
        super(2, xn2Var);
        this.$translationY = jxVar;
        this.$upperBound = f;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new dm6(this.$translationY, this.$upperBound, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            this.$translationY.i(new Float(0.0f), new Float(this.$upperBound));
            float fN = mh3.n(((Number) this.$translationY.e()).floatValue(), 0.0f, this.$upperBound);
            if (fN != ((Number) this.$translationY.e()).floatValue()) {
                jx jxVar = this.$translationY;
                Float f = new Float(fN);
                this.F$0 = fN;
                this.label = 1;
                Object objG = jxVar.g(this, f);
                bw2 bw2Var = bw2.a;
                if (objG == bw2Var) {
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
        return ((dm6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
