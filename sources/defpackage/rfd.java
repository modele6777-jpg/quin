package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rfd extends gbe implements l26 {
    final /* synthetic */ int $autoShuffleCount;
    final /* synthetic */ boolean $cutPresentationReady;
    final /* synthetic */ egd $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfd(egd egdVar, int i, boolean z, xn2 xn2Var) {
        super(2, xn2Var);
        this.$state = egdVar;
        this.$autoShuffleCount = i;
        this.$cutPresentationReady = z;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new rfd(this.$state, this.$autoShuffleCount, this.$cutPresentationReady, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Exception {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (this.$state.a() == hgd.b && this.$state.c.j() == 0 && this.$autoShuffleCount == 0) {
                bv9 bv9Var = this.$state.h;
                if (bv9Var != null) {
                    bv9Var.d(Boolean.FALSE);
                }
            } else if (this.$state.a() == hgd.e && this.$state.d.j() == 0 && this.$cutPresentationReady) {
                this.label = 1;
                Object objQ = vfh.q(200L, this);
                bw2 bw2Var = bw2.a;
                if (objQ == bw2Var) {
                    return bw2Var;
                }
            }
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        k11 k11Var = this.$state.k;
        if (k11Var != null) {
            k11Var.d(Boolean.FALSE);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((rfd) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
