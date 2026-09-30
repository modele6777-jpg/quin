package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e24 extends gbe implements l26 {
    final /* synthetic */ nb4 $dao;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e24(nb4 nb4Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$dao = nb4Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new e24(this.$dao, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            nb4 nb4Var = this.$dao;
            this.label = 1;
            obj = urg.K(this, new to3(13), ((vb4) nb4Var).a, true, false);
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
        jcc.k(0, "Soft-deleted: " + ((Number) obj).intValue());
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((e24) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
