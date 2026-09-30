package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class t3e extends gbe implements l26 {
    final /* synthetic */ xj5 $$this$flow;
    final /* synthetic */ a26 $makeRequest;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3e(xj5 xj5Var, a26 a26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$$this$flow = xj5Var;
        this.$makeRequest = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        t3e t3eVar = new t3e(this.$$this$flow, this.$makeRequest, xn2Var);
        t3eVar.L$0 = obj;
        return t3eVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        aw2 aw2Var = (aw2) this.L$0;
        int i = this.label;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            xj5 xj5Var = this.$$this$flow;
            lyb lybVar = new lyb(aw2Var);
            this.L$0 = null;
            this.label = 1;
            if (xj5Var.a(lybVar, this) != bw2Var) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        a26 a26Var = this.$makeRequest;
        this.L$0 = null;
        this.label = 2;
        Object objD = a26Var.d(this);
        return objD == bw2Var ? bw2Var : objD;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((t3e) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
