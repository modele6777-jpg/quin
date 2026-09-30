package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b23 extends gbe implements l26 {
    final /* synthetic */ a26 $block$inlined;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b23(xn2 xn2Var, a26 a26Var) {
        super(2, xn2Var);
        this.$block$inlined = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        b23 b23Var = new b23(xn2Var, this.$block$inlined);
        b23Var.L$0 = obj;
        return b23Var;
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
        a26 a26Var = this.$block$inlined;
        this.label = 1;
        Object objD = a26Var.d(this);
        bw2 bw2Var = bw2.a;
        return objD == bw2Var ? bw2Var : objD;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((b23) k((xn2) obj2, (v0a) obj)).r(wef.a);
    }
}
