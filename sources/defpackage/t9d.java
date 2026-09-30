package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t9d extends gbe implements l26 {
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ bad this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9d(bad badVar, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = badVar;
        this.$id = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new t9d(this.this$0, this.$id, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        f95 f95Var = f95.a;
        e95 e95VarC = f95Var.c(this.$id, System.currentTimeMillis(), this.this$0.a);
        return e95VarC == null ? f95Var.k(this.this$0.a, this.$id) : e95VarC;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((t9d) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
