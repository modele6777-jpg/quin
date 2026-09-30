package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class trc extends gbe implements l26 {
    final /* synthetic */ x16 $onDismiss;
    final /* synthetic */ ted $sheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public trc(xn2 xn2Var, x16 x16Var, ted tedVar) {
        super(2, xn2Var);
        this.$sheetState = tedVar;
        this.$onDismiss = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new trc(xn2Var, this.$onDismiss, this.$sheetState);
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
        this.$onDismiss.invoke();
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((trc) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
