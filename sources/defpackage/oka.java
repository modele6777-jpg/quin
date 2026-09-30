package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oka extends gbe implements l26 {
    final /* synthetic */ h0e $currentOnVisibilityChanged$delegate;
    final /* synthetic */ boolean $hasPopup;
    final /* synthetic */ boolean $popupsResolved;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oka(boolean z, boolean z2, h0e h0eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$popupsResolved = z;
        this.$hasPopup = z2;
        this.$currentOnVisibilityChanged$delegate = h0eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new oka(this.$popupsResolved, this.$hasPopup, this.$currentOnVisibilityChanged$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (this.$popupsResolved && !this.$hasPopup) {
            ((a26) this.$currentOnVisibilityChanged$delegate.getValue()).d(Boolean.FALSE);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        oka okaVar = (oka) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        okaVar.r(wefVar);
        return wefVar;
    }
}
