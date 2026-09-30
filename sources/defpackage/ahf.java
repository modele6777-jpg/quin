package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ahf extends gbe implements l26 {
    final /* synthetic */ k31 $bringIntoViewRequester;
    final /* synthetic */ e89 $isPositioned$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahf(k31 k31Var, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$bringIntoViewRequester = k31Var;
        this.$isPositioned$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ahf(this.$bringIntoViewRequester, this.$isPositioned$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (((Boolean) this.$isPositioned$delegate.getValue()).booleanValue()) {
                k31 k31Var = this.$bringIntoViewRequester;
                this.label = 1;
                Object objA = ((n31) k31Var).a(null, this);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
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
        return ((ahf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
