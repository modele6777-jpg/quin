package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h4a extends gbe implements l26 {
    final /* synthetic */ lmb $currentDelay;
    final /* synthetic */ int $delayFactor;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4a(lmb lmbVar, int i, xn2 xn2Var) {
        super(2, xn2Var);
        this.$currentDelay = lmbVar;
        this.$delayFactor = i;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        h4a h4aVar = new h4a(this.$currentDelay, this.$delayFactor, xn2Var);
        h4aVar.L$0 = obj;
        return h4aVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Throwable th = (Throwable) this.L$0;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            jzb.q(obj);
            if (th instanceof IllegalStateException) {
                long j = this.$currentDelay.element;
                this.L$0 = null;
                this.label = 1;
                Object objQ = vfh.q(j, this);
                bw2 bw2Var = bw2.a;
                if (objQ == bw2Var) {
                    return bw2Var;
                }
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.$currentDelay.element *= (long) this.$delayFactor;
        return Boolean.valueOf(z);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((h4a) k((xn2) obj2, (Throwable) obj)).r(wef.a);
    }
}
