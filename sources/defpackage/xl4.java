package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xl4 extends gbe implements l26 {
    final /* synthetic */ wj4 $event;
    final /* synthetic */ ks9 $orientation;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ yl4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl4(yl4 yl4Var, wj4 wj4Var, ks9 ks9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = yl4Var;
        this.$event = wj4Var;
        this.$orientation = ks9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        xl4 xl4Var = new xl4(this.this$0, this.$event, this.$orientation, xn2Var);
        xl4Var.L$0 = obj;
        return xl4Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            aw2 aw2Var = (aw2) this.L$0;
            yl4 yl4Var = this.this$0;
            n26 n26Var = yl4Var.b1;
            long jF = zsf.f(this.$event.a, yl4Var.c1 ? -1.0f : 1.0f);
            ks9 ks9Var = this.$orientation;
            sl4 sl4Var = ul4.a;
            Float f = new Float(ks9Var == ks9.a ? zsf.c(jF) : zsf.b(jF));
            this.label = 1;
            Object objM = n26Var.m(aw2Var, f, this);
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
        return ((xl4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
