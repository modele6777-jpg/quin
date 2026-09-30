package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bpd extends gbe implements n26 {
    final /* synthetic */ gpd $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpd(gpd gpdVar, xn2 xn2Var) {
        super(3, xn2Var);
        this.$state = gpdVar;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) throws Throwable {
        ((Number) obj2).floatValue();
        bpd bpdVar = new bpd(this.$state, (xn2) obj3);
        wef wefVar = wef.a;
        bpdVar.r(wefVar);
        return wefVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.$state.n.invoke();
        return wef.a;
    }
}
