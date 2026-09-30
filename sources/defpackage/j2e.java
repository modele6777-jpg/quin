package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j2e extends gbe implements l26 {
    final /* synthetic */ s7d $renderState;
    final /* synthetic */ a26 $reportStatus;
    final /* synthetic */ s69 $retryVersion$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2e(s7d s7dVar, a26 a26Var, s69 s69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$renderState = s7dVar;
        this.$reportStatus = a26Var;
        this.$retryVersion$delegate = s69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new j2e(this.$renderState, this.$reportStatus, this.$retryVersion$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        RuntimeException runtimeExceptionA = this.$renderState.a();
        if (runtimeExceptionA != null) {
            hf8.Q.getClass();
            ef8.a("StitchedShare").c("Failed to render share document", runtimeExceptionA);
        }
        this.$reportStatus.d(this.$renderState.a() == null ? mad.a : new lad(new q50(this.$retryVersion$delegate, 12)));
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        j2e j2eVar = (j2e) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        j2eVar.r(wefVar);
        return wefVar;
    }
}
