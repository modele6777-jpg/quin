package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yr1 extends gbe implements l26 {
    final /* synthetic */ use $textState;
    final /* synthetic */ float $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr1(use useVar, float f, xn2 xn2Var) {
        super(2, xn2Var);
        this.$textState = useVar;
        this.$value = f;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new yr1(this.$textState, this.$value, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Float fValueOf = null;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        String string = this.$textState.d().c.toString();
        string.getClass();
        try {
            if (b5e.r(string)) {
                fValueOf = Float.valueOf(Float.parseFloat(string));
            }
        } catch (NumberFormatException unused) {
        }
        float f = this.$value;
        if (fValueOf == null || fValueOf.floatValue() != f) {
            n3d.q(this.$textState, String.valueOf((int) this.$value));
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        yr1 yr1Var = (yr1) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        yr1Var.r(wefVar);
        return wefVar;
    }
}
