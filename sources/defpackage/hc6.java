package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hc6 extends gbe implements l26 {
    final /* synthetic */ vb2 $activity;
    final /* synthetic */ e76 $request;
    Object L$0;
    int label;
    final /* synthetic */ ic6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc6(vb2 vb2Var, e76 e76Var, ic6 ic6Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$activity = vb2Var;
        this.$request = e76Var;
        this.this$0 = ic6Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new hc6(this.$activity, this.$request, this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                this.$activity.getClass();
                jy2 jy2Var = new jy2();
                vb2 vb2Var = this.$activity;
                e76 e76Var = this.$request;
                this.L$0 = null;
                this.label = 1;
                obj = jy2.a(jy2Var, vb2Var, e76Var, this);
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
            ic6 ic6Var = this.this$0;
            int i2 = ic6.c;
            ic6Var.f((f76) obj);
        } catch (b76 e) {
            this.this$0.d().c(ub3.k("Error getting credential ", e.getType(), ":", e.getMessage()), e);
            this.this$0.e(new zve(null, e, 26));
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((hc6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
