package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class m19 extends gbe implements l26 {
    final /* synthetic */ h0e $currentOnVisibilityChanged$delegate;
    final /* synthetic */ boolean $hasPopup;
    final /* synthetic */ h0e $monthlyEventResolved$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m19(boolean z, h0e h0eVar, h0e h0eVar2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$hasPopup = z;
        this.$monthlyEventResolved$delegate = h0eVar;
        this.$currentOnVisibilityChanged$delegate = h0eVar2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new m19(this.$hasPopup, this.$monthlyEventResolved$delegate, this.$currentOnVisibilityChanged$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (((Boolean) this.$monthlyEventResolved$delegate.getValue()).booleanValue() && !this.$hasPopup) {
            ((a26) this.$currentOnVisibilityChanged$delegate.getValue()).d(Boolean.FALSE);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        m19 m19Var = (m19) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        m19Var.r(wefVar);
        return wefVar;
    }
}
