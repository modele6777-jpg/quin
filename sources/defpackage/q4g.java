package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q4g extends gbe implements l26 {
    final /* synthetic */ e89 $dontRemind$delegate;
    final /* synthetic */ x16 $onClose;
    final /* synthetic */ x16 $onOptOut;
    final /* synthetic */ ted $sheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4g(ted tedVar, x16 x16Var, x16 x16Var2, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$sheetState = tedVar;
        this.$onOptOut = x16Var;
        this.$onClose = x16Var2;
        this.$dontRemind$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new q4g(this.$sheetState, this.$onOptOut, this.$onClose, this.$dontRemind$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            ted tedVar = this.$sheetState;
            this.label = 1;
            Object objD = tedVar.d(this);
            bw2 bw2Var = bw2.a;
            if (objD == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        (v2c.k(this.$dontRemind$delegate) ? this.$onOptOut : this.$onClose).invoke();
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((q4g) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
