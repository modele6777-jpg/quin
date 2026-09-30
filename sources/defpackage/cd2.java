package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cd2 extends gbe implements l26 {
    final /* synthetic */ n69 $alpha;
    final /* synthetic */ ghc $scrollState;
    final /* synthetic */ float $thresholdPx;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd2(ghc ghcVar, float f, n69 n69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$scrollState = ghcVar;
        this.$thresholdPx = f;
        this.$alpha = n69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new cd2(this.$scrollState, this.$thresholdPx, this.$alpha, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            bd2 bd2Var = new bd2(jzb.p(new xc2(this.$scrollState, 0)), this.$thresholdPx);
            ts tsVar = new ts(4, this.$alpha);
            this.label = 1;
            Object objB = bd2Var.b(tsVar, this);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
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
        return ((cd2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
