package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vk6 extends gbe implements l26 {
    final /* synthetic */ x16 $onLoadMore;
    final /* synthetic */ h0e $shouldLoadMore$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk6(x16 x16Var, h0e h0eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$onLoadMore = x16Var;
        this.$shouldLoadMore$delegate = h0eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new vk6(this.$onLoadMore, this.$shouldLoadMore$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        h0e h0eVar = this.$shouldLoadMore$delegate;
        int i = al6.a;
        if (((Boolean) h0eVar.getValue()).booleanValue()) {
            this.$onLoadMore.invoke();
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        vk6 vk6Var = (vk6) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        vk6Var.r(wefVar);
        return wefVar;
    }
}
