package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class g4e extends gbe implements l26 {
    final /* synthetic */ n26 $extractContent;
    final /* synthetic */ Object $initAcc;
    final /* synthetic */ l26 $makeProgress;
    final /* synthetic */ a26 $makeRequest;
    final /* synthetic */ l26 $makeSuccess;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e(a26 a26Var, Object obj, l26 l26Var, n26 n26Var, l26 l26Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$makeRequest = a26Var;
        this.$initAcc = obj;
        this.$makeSuccess = l26Var;
        this.$extractContent = n26Var;
        this.$makeProgress = l26Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        g4e g4eVar = new g4e(this.$makeRequest, this.$initAcc, this.$makeSuccess, this.$extractContent, this.$makeProgress, xn2Var);
        g4eVar.L$0 = obj;
        return g4eVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        xj5 xj5Var = (xj5) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            f4e f4eVar = new f4e(xj5Var, this.$makeRequest, this.$initAcc, this.$makeSuccess, this.$extractContent, this.$makeProgress, null);
            this.L$0 = null;
            this.label = 1;
            Object objO = jgb.O(f4eVar, this);
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
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((g4e) k((xn2) obj2, (xj5) obj)).r(wef.a);
    }
}
