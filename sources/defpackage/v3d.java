package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class v3d extends gbe implements l26 {
    final /* synthetic */ g0d $sessionConfigs;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3d(g0d g0dVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$sessionConfigs = g0dVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new v3d(this.$sessionConfigs, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label == 0) {
            jzb.q(obj);
            return this.$sessionConfigs;
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((v3d) k((xn2) obj2, (g0d) obj)).r(wef.a);
    }
}
