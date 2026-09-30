package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jo8 extends gbe implements l26 {
    final /* synthetic */ ttd $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ko8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo8(ko8 ko8Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = ko8Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        jo8 jo8Var = new jo8(this.this$0, xn2Var);
        jo8Var.L$0 = obj;
        return jo8Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jzb.q(obj);
        throw null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((jo8) k((xn2) obj2, (aw2) obj)).r(wef.a);
        throw null;
    }
}
