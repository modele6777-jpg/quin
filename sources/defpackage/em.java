package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class em extends gbe implements l26 {
    final /* synthetic */ im $state;
    final /* synthetic */ x16 $toLockedReport;
    final /* synthetic */ x16 $toViewReport;
    final /* synthetic */ String $unknowError;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em(im imVar, x16 x16Var, x16 x16Var2, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$state = imVar;
        this.$toLockedReport = x16Var;
        this.$toViewReport = x16Var2;
        this.$unknowError = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new em(this.$state, this.$toLockedReport, this.$toViewReport, this.$unknowError, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        im imVar = this.$state;
        if (!pa7.t(imVar, gm.a)) {
            if (pa7.t(imVar, gm.b)) {
                this.$toLockedReport.invoke();
            } else if (imVar instanceof hm) {
                this.$toViewReport.invoke();
            } else {
                if (!(imVar instanceof fm)) {
                    ap.c();
                    return null;
                }
                String message = ((fm) this.$state).a.getMessage();
                if (message == null) {
                    message = this.$unknowError;
                }
                jcc.l(message);
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        em emVar = (em) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        emVar.r(wefVar);
        return wefVar;
    }
}
