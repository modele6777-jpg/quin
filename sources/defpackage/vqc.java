package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vqc extends gbe implements l26 {
    final /* synthetic */ use $observedQuestion;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ xqc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqc(xqc xqcVar, use useVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = xqcVar;
        this.$observedQuestion = useVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        vqc vqcVar = new vqc(this.this$0, this.$observedQuestion, xn2Var);
        vqcVar.L$0 = obj;
        return vqcVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        String str = (String) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        lsc lscVar = (lsc) this.this$0.d.getValue();
        wef wefVar = wef.a;
        if (lscVar == null || lscVar.d != this.$observedQuestion) {
            return wefVar;
        }
        xqc xqcVar = this.this$0;
        String str2 = v4e.Q(str) ? null : str;
        xqcVar.getClass();
        ynb.V(hwf.a(xqcVar), null, null, new wqc(xqcVar, lscVar.e, lscVar, str2, null), 3);
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        vqc vqcVar = (vqc) k((xn2) obj2, (String) obj);
        wef wefVar = wef.a;
        vqcVar.r(wefVar);
        return wefVar;
    }
}
