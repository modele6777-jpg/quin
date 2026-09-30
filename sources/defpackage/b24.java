package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b24 extends gbe implements l26 {
    final /* synthetic */ tc4 $repository;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b24(tc4 tc4Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$repository = tc4Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new b24(this.$repository, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            tc4 tc4Var = this.$repository;
            this.label = 1;
            Object objH = tc4Var.h(this);
            bw2 bw2Var = bw2.a;
            if (objH == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        jcc.k(0, "Cloud refresh done");
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((b24) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
