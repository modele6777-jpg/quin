package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class paa extends gbe implements l26 {
    int label;
    final /* synthetic */ aba this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public paa(aba abaVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = abaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new paa(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        ((rab) this.this$0.b).f();
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        paa paaVar = (paa) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        paaVar.r(wefVar);
        return wefVar;
    }
}
