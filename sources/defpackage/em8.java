package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class em8 extends gbe implements l26 {
    final /* synthetic */ ja2 $commonmarkAstNodeParser;
    final /* synthetic */ String $content;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em8(ja2 ja2Var, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$commonmarkAstNodeParser = ja2Var;
        this.$content = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        em8 em8Var = new em8(this.$commonmarkAstNodeParser, this.$content, xn2Var);
        em8Var.L$0 = obj;
        return em8Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        xva xvaVar = (xva) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        ((yva) xvaVar).setValue(this.$commonmarkAstNodeParser.a(this.$content));
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        em8 em8Var = (em8) k((xn2) obj2, (xva) obj);
        wef wefVar = wef.a;
        em8Var.r(wefVar);
        return wefVar;
    }
}
