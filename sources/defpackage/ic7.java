package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ic7 extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ oc7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic7(oc7 oc7Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = oc7Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ic7 ic7Var = new ic7(this.this$0, xn2Var);
        ic7Var.L$0 = obj;
        return ic7Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object dzbVar;
        oc7 oc7Var;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                oc7 oc7Var2 = this.this$0;
                bc7 bc7Var = oc7Var2.d;
                this.L$0 = null;
                this.L$1 = oc7Var2;
                this.L$2 = null;
                this.label = 1;
                Object objA = bc7Var.a("2511", this);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
                obj = objA;
                oc7Var = oc7Var2;
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oc7Var = (oc7) this.L$1;
                jzb.q(obj);
            }
            int i2 = oc7.v;
            oc7Var.g.setValue((String) obj);
            dzbVar = (String) obj;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        return new ezb(dzbVar);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ic7) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
