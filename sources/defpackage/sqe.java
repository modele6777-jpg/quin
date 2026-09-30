package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sqe extends gbe implements a26 {
    int label;
    final /* synthetic */ cre this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqe(cre creVar, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = creVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        sqe sqeVar = new sqe(this.this$0, (xn2) obj);
        wef wefVar = wef.a;
        sqeVar.r(wefVar);
        return wefVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.this$0.A = false;
        return wef.a;
    }
}
