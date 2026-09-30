package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y5e extends gbe implements l26 {
    final /* synthetic */ m77 $source;
    int label;
    final /* synthetic */ z5e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5e(z5e z5eVar, m77 m77Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = z5eVar;
        this.$source = m77Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new y5e(this.this$0, this.$source, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return wef.a;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        l89 l89Var = this.this$0.N0;
        m77 m77Var = this.$source;
        this.label = 1;
        q95 q95Var = new q95();
        q95 q95Var2 = new q95();
        q95 q95Var3 = new q95();
        g89 g89Var = l89Var.c;
        g89 g89Var2 = l89Var.c;
        g89Var.b(1, false);
        g89Var2.b(2, false);
        g89Var2.b(4, false);
        ((u69) m77Var).a.b(new k89(q95Var, l89Var, q95Var2, q95Var3), this);
        return bw2.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((y5e) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
