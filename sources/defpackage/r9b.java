package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r9b extends gbe implements n26 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ eab this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9b(eab eabVar, xn2 xn2Var) {
        super(3, xn2Var);
        this.this$0 = eabVar;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        r9b r9bVar = new r9b(this.this$0, (xn2) obj3);
        r9bVar.L$0 = (xj5) obj;
        r9bVar.L$1 = (Throwable) obj2;
        return r9bVar.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        xj5 xj5Var = (xj5) this.L$0;
        Throwable th = (Throwable) this.L$1;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            this.this$0.d().c("Failed to parse quota usage", th);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            Object objA = xj5Var.a(null, this);
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
