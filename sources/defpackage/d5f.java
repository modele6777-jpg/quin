package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d5f extends gbe implements l26 {
    final /* synthetic */ x16 $onRefreshCompleted;
    int label;
    final /* synthetic */ j5f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5f(j5f j5fVar, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = j5fVar;
        this.$onRefreshCompleted = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new d5f(this.this$0, this.$onRefreshCompleted, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                j5f j5fVar = this.this$0;
                this.label = 1;
                obj = j5fVar.b(this);
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
            this.$onRefreshCompleted.invoke();
            return wef.a;
        } catch (Throwable th) {
            this.$onRefreshCompleted.invoke();
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((d5f) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
