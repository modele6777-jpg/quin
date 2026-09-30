package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i1g extends gbe implements l26 {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ l1g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1g(l1g l1gVar, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = l1gVar;
        this.$url = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new i1g(this.this$0, this.$url, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        sv6 sv6Var = this.this$0.b;
        String str = this.$url;
        this.label = 1;
        js3 js3Var = ga4.a;
        Object objP0 = ynb.p0(hr3.c, new qv6(str, sv6Var, null, n2e.b, "Quin", null), this);
        bw2 bw2Var = bw2.a;
        return objP0 == bw2Var ? bw2Var : objP0;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((i1g) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
