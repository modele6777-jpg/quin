package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rad extends gbe implements l26 {
    final /* synthetic */ int $expectedImageCount;
    final /* synthetic */ e89 $fallbackReady$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rad(int i, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$expectedImageCount = i;
        this.$fallbackReady$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new rad(this.$expectedImageCount, this.$fallbackReady$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        if (i == 0) {
            jzb.q(obj);
            if (this.$expectedImageCount == 0) {
                return wefVar;
            }
            this.label = 1;
            Object objQ = vfh.q(1000L, this);
            bw2 bw2Var = bw2.a;
            if (objQ == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        e89 e89Var = this.$fallbackReady$delegate;
        pr4 pr4Var = sad.a;
        e89Var.setValue(Boolean.TRUE);
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((rad) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
