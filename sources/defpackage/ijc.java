package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ijc extends gbe implements l26 {
    final /* synthetic */ jx $rotationAnimatable;
    final /* synthetic */ float $rotationLimit;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ijc(jx jxVar, float f, xn2 xn2Var) {
        super(2, xn2Var);
        this.$rotationAnimatable = jxVar;
        this.$rotationLimit = f;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ijc(this.$rotationAnimatable, this.$rotationLimit, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.$rotationAnimatable.i(new Float(-this.$rotationLimit), new Float(this.$rotationLimit));
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ijc ijcVar = (ijc) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        ijcVar.r(wefVar);
        return wefVar;
    }
}
