package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mke extends gbe implements l26 {
    final /* synthetic */ a26 $makeRequest;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mke(xn2 xn2Var, a26 a26Var) {
        super(2, xn2Var);
        this.$makeRequest = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        mke mkeVar = new mke(xn2Var, this.$makeRequest);
        mkeVar.L$0 = obj;
        return mkeVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        xj5 xj5Var = (xj5) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            StringBuilder sb = new StringBuilder();
            wj5 wj5VarO = r8c.o(fzc.a, this.$makeRequest);
            qb1 qb1Var = new qb1(13, xj5Var, sb);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            Object objB = wj5VarO.b(qb1Var, this);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((mke) k((xn2) obj2, (xj5) obj)).r(wef.a);
    }
}
