package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xoc extends gbe implements l26 {
    final /* synthetic */ boolean $analyticsEnabled;
    final /* synthetic */ boolean $isRevisit;
    final /* synthetic */ e89 $lastReportedPage$delegate;
    final /* synthetic */ x48 $lifecycleOwner;
    final /* synthetic */ String $pageName;
    final /* synthetic */ yx9 $pagerState;
    final /* synthetic */ String $seasonalPeriod;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xoc(boolean z, x48 x48Var, yx9 yx9Var, e89 e89Var, String str, boolean z2, String str2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$analyticsEnabled = z;
        this.$lifecycleOwner = x48Var;
        this.$pagerState = yx9Var;
        this.$lastReportedPage$delegate = e89Var;
        this.$pageName = str;
        this.$isRevisit = z2;
        this.$seasonalPeriod = str2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new xoc(this.$analyticsEnabled, this.$lifecycleOwner, this.$pagerState, this.$lastReportedPage$delegate, this.$pageName, this.$isRevisit, this.$seasonalPeriod, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (this.$analyticsEnabled) {
            h48 h48VarK = this.$lifecycleOwner.k();
            woc wocVar = new woc(this.$pagerState, this.$lastReportedPage$delegate, this.$pageName, this.$isRevisit, this.$seasonalPeriod, null);
            this.label = 1;
            Object objO = rrb.o(h48VarK, g48.e, wocVar, this);
            bw2 bw2Var = bw2.a;
            if (objO == bw2Var) {
                return bw2Var;
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((xoc) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
