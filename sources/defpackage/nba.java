package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nba extends gbe implements n26 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ sba this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nba(sba sbaVar, xn2 xn2Var) {
        super(3, xn2Var);
        this.this$0 = sbaVar;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        nba nbaVar = new nba(this.this$0, (xn2) obj3);
        nbaVar.L$0 = (xj5) obj;
        nbaVar.L$1 = (Throwable) obj2;
        return nbaVar.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        xj5 xj5Var = (xj5) this.L$0;
        Throwable th = (Throwable) this.L$1;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            ynb.h0(th);
            this.this$0.d().c("Get analytic history failed", th);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            Object objA = xj5Var.a(pu4.a, this);
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
        return wef.a;
    }
}
