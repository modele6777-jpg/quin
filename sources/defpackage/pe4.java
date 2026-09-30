package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pe4 extends gbe implements l26 {
    final /* synthetic */ l26 $action;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe4(l26 l26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$action = l26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        pe4 pe4Var = new pe4(this.$action, xn2Var);
        pe4Var.L$0 = obj;
        return pe4Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        oyb oybVar = (oyb) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (oybVar instanceof nyb) {
                l26 l26Var = this.$action;
                Object obj2 = ((nyb) oybVar).a;
                this.L$0 = null;
                this.label = 1;
                Object objZ = l26Var.z(obj2, this);
                bw2 bw2Var = bw2.a;
                if (objZ == bw2Var) {
                    return bw2Var;
                }
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
        return ((pe4) k((xn2) obj2, (oyb) obj)).r(wef.a);
    }
}
