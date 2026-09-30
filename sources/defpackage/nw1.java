package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nw1 extends gbe implements l26 {
    final /* synthetic */ byc $collector;
    final /* synthetic */ wj5 $flow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw1(wj5 wj5Var, byc bycVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$flow = wj5Var;
        this.$collector = bycVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new nw1(this.$flow, this.$collector, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            wj5 wj5Var = this.$flow;
            byc bycVar = this.$collector;
            this.label = 1;
            Object objB = wj5Var.b(bycVar, this);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
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
        return ((nw1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
