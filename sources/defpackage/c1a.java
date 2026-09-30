package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c1a extends gbe implements l26 {
    final /* synthetic */ l26 $block;
    final /* synthetic */ a1a $connectionWrapper;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1a(l26 l26Var, a1a a1aVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$block = l26Var;
        this.$connectionWrapper = a1aVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new c1a(this.$block, this.$connectionWrapper, xn2Var);
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
        l26 l26Var = this.$block;
        a1a a1aVar = this.$connectionWrapper;
        this.label = 1;
        Object objZ = l26Var.z(a1aVar, this);
        bw2 bw2Var = bw2.a;
        return objZ == bw2Var ? bw2Var : objZ;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((c1a) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
