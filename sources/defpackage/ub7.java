package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ub7 extends gbe implements l26 {
    final /* synthetic */ String $code;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ wb7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub7(wb7 wb7Var, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = wb7Var;
        this.$code = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ub7 ub7Var = new ub7(this.this$0, this.$code, xn2Var);
        ub7Var.L$0 = obj;
        return ub7Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object dzbVar;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                wb7 wb7Var = this.this$0;
                String str = this.$code;
                bc7 bc7Var = wb7Var.d;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                Object objC = bc7Var.c(str, "2405", this);
                bw2 bw2Var = bw2.a;
                if (objC == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            dzbVar = wef.a;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        return new ezb(dzbVar);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ub7) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
