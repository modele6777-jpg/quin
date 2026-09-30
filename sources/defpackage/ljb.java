package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ljb extends gbe implements l26 {
    final /* synthetic */ boolean $animateReveal;
    final /* synthetic */ int $index;
    final /* synthetic */ e89 $isRevealStarted$delegate;
    final /* synthetic */ jx $progress;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ljb(boolean z, int i, jx jxVar, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$animateReveal = z;
        this.$index = i;
        this.$progress = jxVar;
        this.$isRevealStarted$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ljb(this.$animateReveal, this.$index, this.$progress, this.$isRevealStarted$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            if (this.$animateReveal) {
                long j = ((long) this.$index) * 120;
                this.label = 1;
                if (vfh.q(j, this) != bw2Var) {
                }
            }
        }
        if (i != 1) {
            if (i == 2) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        e89 e89Var = this.$isRevealStarted$delegate;
        int i2 = njb.a;
        e89Var.setValue(Boolean.TRUE);
        jx jxVar = this.$progress;
        Float f = new Float(1.0f);
        x6f x6fVarT = b21.T(320, 0, hs4.a, 2);
        this.label = 2;
        return jx.b(jxVar, f, x6fVarT, null, null, this, 12) == bw2Var ? bw2Var : wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ljb) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
