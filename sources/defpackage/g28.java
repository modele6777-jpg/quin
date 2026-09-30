package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g28 extends gbe implements l26 {
    final /* synthetic */ l26 $block;
    int label;
    final /* synthetic */ h28 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g28(h28 h28Var, l26 l26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = h28Var;
        this.$block = l26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new g28(this.this$0, this.$block, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            oo3.f();
            return null;
        }
        jzb.q(obj);
        h28 h28Var = this.this$0;
        l26 l26Var = this.$block;
        this.label = 1;
        fga.a(h28Var, l26Var, this);
        return bw2.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((g28) k((xn2) obj2, (aw2) obj)).r(wef.a);
        return bw2.a;
    }
}
