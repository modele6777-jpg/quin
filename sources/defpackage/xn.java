package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xn extends gbe implements a26 {
    final /* synthetic */ n26 $block;
    int label;
    final /* synthetic */ lo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn(lo loVar, xn2 xn2Var, n26 n26Var) {
        super(1, xn2Var);
        this.this$0 = loVar;
        this.$block = n26Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new xn(this.this$0, (xn2) obj, this.$block).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            lo loVar = this.this$0;
            sn snVar = new sn(loVar, 2);
            vn vnVar = new vn(loVar, null, this.$block);
            this.label = 1;
            Object objO = y41.O(snVar, vnVar, this);
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
}
