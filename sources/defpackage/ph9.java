package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ph9 extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ rh9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph9(rh9 rh9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = rh9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ph9 ph9Var = new ph9(this.this$0, xn2Var);
        ph9Var.L$0 = obj;
        return ph9Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object dzbVar;
        Object objA;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                gpf gpfVar = this.this$0.b;
                Boolean bool = Boolean.FALSE;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                objA = gpf.a(gpfVar, null, null, null, null, null, null, bool, bool, bool, null, this, 4607);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
                objA = obj;
            }
            dzbVar = (Boolean) objA;
            dzbVar.getClass();
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        return new ezb(dzbVar);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ph9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
