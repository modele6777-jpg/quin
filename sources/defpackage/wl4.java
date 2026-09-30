package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wl4 extends gbe implements l26 {
    final /* synthetic */ long $startedPosition;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ yl4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl4(yl4 yl4Var, long j, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = yl4Var;
        this.$startedPosition = j;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        wl4 wl4Var = new wl4(this.this$0, this.$startedPosition, xn2Var);
        wl4Var.L$0 = obj;
        return wl4Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            aw2 aw2Var = (aw2) this.L$0;
            n26 n26Var = this.this$0.a1;
            hl9 hl9Var = new hl9(this.$startedPosition);
            this.label = 1;
            Object objM = n26Var.m(aw2Var, hl9Var, this);
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
        return ((wl4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
