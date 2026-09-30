package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class woc extends gbe implements l26 {
    final /* synthetic */ boolean $isRevisit;
    final /* synthetic */ e89 $lastReportedPage$delegate;
    final /* synthetic */ String $pageName;
    final /* synthetic */ yx9 $pagerState;
    final /* synthetic */ String $seasonalPeriod;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public woc(yx9 yx9Var, e89 e89Var, String str, boolean z, String str2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$pagerState = yx9Var;
        this.$lastReportedPage$delegate = e89Var;
        this.$pageName = str;
        this.$isRevisit = z;
        this.$seasonalPeriod = str2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new woc(this.$pagerState, this.$lastReportedPage$delegate, this.$pageName, this.$isRevisit, this.$seasonalPeriod, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            wj5 wj5VarI = dj6.I(jzb.p(new f12(this.$pagerState, 6)));
            voc vocVar = new voc(this.$lastReportedPage$delegate, this.$pageName, this.$isRevisit, this.$seasonalPeriod);
            this.label = 1;
            Object objB = wj5VarI.b(vocVar, this);
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
        return ((woc) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
