package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o4g extends gbe implements l26 {
    final /* synthetic */ u4g $data;
    final /* synthetic */ String $widget;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4g(String str, u4g u4gVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$widget = str;
        this.$data = u4gVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new o4g(this.$widget, this.$data, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        x1f x1fVar = x1f.a;
        x1f.k(new r05("popup_view"), new p0g(3, this.$widget, this.$data), 2);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        o4g o4gVar = (o4g) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        o4gVar.r(wefVar);
        return wefVar;
    }
}
