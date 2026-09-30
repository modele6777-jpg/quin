package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b5f extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ j5f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5f(j5f j5fVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = j5fVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        b5f b5fVar = new b5f(this.this$0, xn2Var);
        b5fVar.L$0 = obj;
        return b5fVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        v0a v0aVar = (v0a) this.L$0;
        j5f j5fVar = this.this$0;
        this.label = 1;
        Object objA = j5fVar.a(v0aVar, this);
        bw2 bw2Var = bw2.a;
        return objA == bw2Var ? bw2Var : objA;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((b5f) k((xn2) obj2, (v0a) obj)).r(wef.a);
    }
}
