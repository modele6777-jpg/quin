package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t97 extends gbe implements n26 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ u97 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t97(u97 u97Var, xn2 xn2Var) {
        super(3, xn2Var);
        this.this$0 = u97Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        t97 t97Var = new t97(this.this$0, (xn2) obj3);
        t97Var.L$0 = (xj5) obj;
        t97Var.L$1 = (oyb) obj2;
        return t97Var.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        xj5 xj5Var = (xj5) this.L$0;
        oyb oybVar = (oyb) this.L$1;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            this.L$0 = null;
            this.L$1 = oybVar;
            this.label = 1;
            Object objA = xj5Var.a(oybVar, this);
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
        }
        u97 u97Var = this.this$0;
        int i2 = u97.v;
        u97Var.getClass();
        return Boolean.valueOf(!u97.f(oybVar));
    }
}
