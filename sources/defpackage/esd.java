package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class esd extends gbe implements l26 {
    final /* synthetic */ l26 $producer;
    final /* synthetic */ e89 $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esd(l26 l26Var, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$producer = l26Var;
        this.$result = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        esd esdVar = new esd(this.$producer, this.$result, xn2Var);
        esdVar.L$0 = obj;
        return esdVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            aw2 aw2Var = (aw2) this.L$0;
            l26 l26Var = this.$producer;
            yva yvaVar = new yva(this.$result, aw2Var.getCoroutineContext());
            this.label = 1;
            Object objZ = l26Var.z(yvaVar, this);
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

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((esd) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
