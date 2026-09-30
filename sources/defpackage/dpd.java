package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dpd extends gbe implements n26 {
    final /* synthetic */ gpd $state;
    /* synthetic */ long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpd(gpd gpdVar, xn2 xn2Var) {
        super(3, xn2Var);
        this.$state = gpdVar;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        long j = ((hl9) obj2).a;
        dpd dpdVar = new dpd(this.$state, (xn2) obj3);
        dpdVar.J$0 = j;
        wef wefVar = wef.a;
        dpdVar.r(wefVar);
        return wefVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        float fJ;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        long j = this.J$0;
        gpd gpdVar = this.$state;
        if (gpdVar.l == ks9.a) {
            fJ = Float.intBitsToFloat((int) (j & 4294967295L));
        } else {
            fJ = gpdVar.i ? gpdVar.g.j() - Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat((int) (j >> 32));
        }
        gpdVar.p.k(fJ - gpdVar.o.j());
        return wef.a;
    }
}
