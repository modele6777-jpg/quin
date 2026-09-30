package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ixf extends gbe implements l26 {
    final /* synthetic */ l26 $block;
    final /* synthetic */ qxf $surfaceSession;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixf(l26 l26Var, qxf qxfVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$block = l26Var;
        this.$surfaceSession = qxfVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ixf ixfVar = new ixf(this.$block, this.$surfaceSession, xn2Var);
        ixfVar.L$0 = obj;
        return ixfVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            hxf hxfVar = new hxf((aw2) this.L$0, this.$surfaceSession);
            l26 l26Var = this.$block;
            this.label = 1;
            Object objZ = l26Var.z(hxfVar, this);
            bw2 bw2Var = bw2.a;
            if (objZ == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ixf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
