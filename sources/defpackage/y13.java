package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y13 extends gbe implements l26 {
    final /* synthetic */ a26 $block;
    final /* synthetic */ pv2 $context;
    final /* synthetic */ w5c $db;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ boolean $isReadOnly;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y13(pv2 pv2Var, w5c w5cVar, boolean z, boolean z2, a26 a26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$context = pv2Var;
        this.$db = w5cVar;
        this.$inTransaction = z;
        this.$isReadOnly = z2;
        this.$block = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new y13(this.$context, this.$db, this.$inTransaction, this.$isReadOnly, this.$block, xn2Var);
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
        pv2 pv2Var = this.$context;
        x13 x13Var = new x13(null, this.$block, this.$db, this.$inTransaction, this.$isReadOnly);
        this.label = 1;
        Object objP0 = ynb.p0(pv2Var, x13Var, this);
        bw2 bw2Var = bw2.a;
        return objP0 == bw2Var ? bw2Var : objP0;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((y13) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
