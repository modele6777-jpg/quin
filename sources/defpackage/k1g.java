package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k1g extends gbe implements l26 {
    final /* synthetic */ a26 $onComplete;
    final /* synthetic */ String $videoUrl;
    int label;
    final /* synthetic */ l1g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1g(l1g l1gVar, String str, a26 a26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = l1gVar;
        this.$videoUrl = str;
        this.$onComplete = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new k1g(this.this$0, this.$videoUrl, this.$onComplete, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            l1g l1gVar = this.this$0;
            l1gVar.c.setValue(g1g.a);
            sv6 sv6Var = this.this$0.b;
            String str = this.$videoUrl;
            this.label = 1;
            js3 js3Var = ga4.a;
            obj = ynb.p0(hr3.c, new rv6(str, sv6Var, null, "Quin", null), this);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        l1g l1gVar2 = this.this$0;
        l1gVar2.c.setValue(h1g.a);
        this.$onComplete.d(Boolean.valueOf(((ov6) obj) instanceof nv6));
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((k1g) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
