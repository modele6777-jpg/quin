package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pwe extends gbe implements l26 {
    final /* synthetic */ a26 $block;
    final /* synthetic */ long $timeoutMs;
    int label;
    final /* synthetic */ qwe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwe(qwe qweVar, a26 a26Var, long j, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = qweVar;
        this.$block = a26Var;
        this.$timeoutMs = j;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new pwe(this.this$0, this.$block, this.$timeoutMs, xn2Var);
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
        qwe qweVar = this.this$0;
        pu3 pu3VarY = ynb.y(qweVar.b, qweVar.f, new nwe(null, this.$block), 2);
        long j = this.$timeoutMs;
        owe oweVar = new owe(pu3VarY, null);
        this.label = 1;
        Object objS = rs0.S(j, oweVar, this);
        bw2 bw2Var = bw2.a;
        return objS == bw2Var ? bw2Var : objS;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((pwe) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
