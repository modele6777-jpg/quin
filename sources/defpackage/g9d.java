package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g9d extends gbe implements l26 {
    final /* synthetic */ o7a $action;
    int label;
    final /* synthetic */ bad this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9d(bad badVar, o7a o7aVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = badVar;
        this.$action = o7aVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new g9d(this.this$0, this.$action, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            bad badVar = this.this$0;
            n7a n7aVar = (n7a) this.$action;
            String str = n7aVar.c;
            String strV = w6c.v(n7aVar.b);
            this.label = 1;
            Object objE = badVar.e(str, strV, this);
            bw2 bw2Var = bw2.a;
            if (objE == bw2Var) {
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
        return ((g9d) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
