package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z4g extends gbe implements l26 {
    final /* synthetic */ r4g $kind;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4g(r4g r4gVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$kind = r4gVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new z4g(this.$kind, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        if (i == 0) {
            jzb.q(obj);
            Boolean bool = (Boolean) h5g.c.get(this.$kind);
            if (bool == null) {
                h5g h5gVar = h5g.a;
                hs3 hs3VarA = h5g.a(this.$kind);
                bool = (Boolean) z5c.I(nu4.a, new y4g(hs3VarA.a, hs3VarA.b, null));
            }
            if (!bool.booleanValue()) {
                return wefVar;
            }
            h5g h5gVar2 = h5g.a;
            hs3 hs3VarA2 = h5g.a(this.$kind);
            Boolean bool2 = Boolean.FALSE;
            isa isaVar = hs3VarA2.a;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            Object objO = bsa.o(isaVar, bool2, this);
            bw2 bw2Var = bw2.a;
            if (objO == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        h5g.c.put(this.$kind, Boolean.FALSE);
        x1f x1fVar = x1f.a;
        x1f.k(new r05("widget_removed"), new f3g(2, this.$kind), 2);
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((z4g) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
