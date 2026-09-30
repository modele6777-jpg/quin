package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nj3 extends gbe implements l26 {
    final /* synthetic */ e89 $carouselLatched$delegate;
    final /* synthetic */ h0e $carouselReady$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj3(h0e h0eVar, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$carouselReady$delegate = h0eVar;
        this.$carouselLatched$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new nj3(this.$carouselReady$delegate, this.$carouselLatched$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        h0e h0eVar = this.$carouselReady$delegate;
        float f = xj3.e;
        if (((Boolean) h0eVar.getValue()).booleanValue()) {
            this.$carouselLatched$delegate.setValue(Boolean.TRUE);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        nj3 nj3Var = (nj3) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        nj3Var.r(wefVar);
        return wefVar;
    }
}
