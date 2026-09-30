package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class odf extends gbe implements l26 {
    final /* synthetic */ boolean $sheetSettled;
    final /* synthetic */ e89 $visualEffectsReady$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odf(boolean z, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$sheetSettled = z;
        this.$visualEffectsReady$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new odf(this.$sheetSettled, this.$visualEffectsReady$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        if (i == 0) {
            jzb.q(obj);
            if (this.$sheetSettled && !((Boolean) this.$visualEffectsReady$delegate.getValue()).booleanValue()) {
                k8f k8fVar = new k8f(5);
                this.label = 1;
                Object objG0 = tm7.J(getContext()).g0(this, k8fVar);
                bw2 bw2Var = bw2.a;
                if (objG0 == bw2Var) {
                    return bw2Var;
                }
            }
            return wefVar;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.$visualEffectsReady$delegate.setValue(Boolean.TRUE);
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((odf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
