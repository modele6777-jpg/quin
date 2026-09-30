package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class io extends gbe implements n26 {
    final /* synthetic */ l26 $block;
    int label;
    final /* synthetic */ ko this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io(ko koVar, l26 l26Var, xn2 xn2Var) {
        super(3, xn2Var);
        this.this$0 = koVar;
        this.$block = l26Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        return new io(this.this$0, this.$block, (xn2) obj3).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            jo joVar = this.this$0.a;
            l26 l26Var = this.$block;
            this.label = 1;
            Object objZ = l26Var.z(joVar, this);
            bw2 bw2Var = bw2.a;
            if (objZ == bw2Var) {
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
}
