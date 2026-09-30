package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ms3 extends gbe implements l26 {
    final /* synthetic */ l26 $block;
    final /* synthetic */ s89 $scrollPriority;
    int label;
    final /* synthetic */ os3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms3(os3 os3Var, s89 s89Var, l26 l26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = os3Var;
        this.$scrollPriority = s89Var;
        this.$block = l26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ms3(this.this$0, this.$scrollPriority, this.$block, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            os3 os3Var = this.this$0;
            b99 b99Var = os3Var.c;
            ns3 ns3Var = os3Var.b;
            s89 s89Var = this.$scrollPriority;
            ls3 ls3Var = new ls3(os3Var, this.$block, null);
            this.label = 1;
            b99Var.getClass();
            Object objO = jgb.O(new a99(s89Var, b99Var, ls3Var, ns3Var, null), this);
            bw2 bw2Var = bw2.a;
            if (objO == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ms3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
