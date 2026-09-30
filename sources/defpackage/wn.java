package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wn extends gbe implements l26 {
    final /* synthetic */ n26 $block;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ mo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn(mo moVar, xn2 xn2Var, n26 n26Var) {
        super(2, xn2Var);
        this.$block = n26Var;
        this.this$0 = moVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        wn wnVar = new wn(this.this$0, xn2Var, this.$block);
        wnVar.L$0 = obj;
        return wnVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            hq3 hq3Var = (hq3) this.L$0;
            n26 n26Var = this.$block;
            ho hoVar = this.this$0.n;
            this.label = 1;
            Object objM = n26Var.m(hoVar, hq3Var, this);
            bw2 bw2Var = bw2.a;
            if (objM == bw2Var) {
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
        return ((wn) k((xn2) obj2, (hq3) obj)).r(wef.a);
    }
}
