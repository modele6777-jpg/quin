package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i9d extends gbe implements l26 {
    final /* synthetic */ String $id;
    final /* synthetic */ String $target;
    int label;
    final /* synthetic */ bad this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9d(bad badVar, String str, String str2, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = badVar;
        this.$id = str;
        this.$target = str2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new i9d(this.this$0, this.$id, this.$target, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label == 0) {
            jzb.q(obj);
            return f95.a.e(this.this$0.a, this.$id, "Failed", this.$target);
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((i9d) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
