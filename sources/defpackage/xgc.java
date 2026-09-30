package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xgc extends gbe implements l26 {
    final /* synthetic */ jmb $consumed;
    final /* synthetic */ float $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xgc(jmb jmbVar, float f, xn2 xn2Var) {
        super(2, xn2Var);
        this.$consumed = jmbVar;
        this.$value = f;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        xgc xgcVar = new xgc(this.$consumed, this.$value, xn2Var);
        xgcVar.L$0 = obj;
        return xgcVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        fhc fhcVar = (fhc) this.L$0;
        this.$consumed.element = fhcVar.a(this.$value);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        xgc xgcVar = (xgc) k((xn2) obj2, (fhc) obj);
        wef wefVar = wef.a;
        xgcVar.r(wefVar);
        return wefVar;
    }
}
