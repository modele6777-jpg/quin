package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g5g extends gbe implements l26 {
    final /* synthetic */ r4g $kind;
    final /* synthetic */ long $now;
    final /* synthetic */ String $scenario;
    final /* synthetic */ w4g $source;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5g(r4g r4gVar, w4g w4gVar, long j, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$kind = r4gVar;
        this.$source = w4gVar;
        this.$now = j;
        this.$scenario = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        g5g g5gVar = new g5g(this.$kind, this.$source, this.$now, this.$scenario, xn2Var);
        g5gVar.L$0 = obj;
        return g5gVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object dzbVar;
        int i = this.label;
        wef wefVar = wef.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                r4g r4gVar = this.$kind;
                w4g w4gVar = this.$source;
                long j = this.$now;
                String str = this.$scenario;
                ypa ypaVar = ypa.a;
                f5g f5gVar = new f5g(r4gVar, w4gVar, j, str, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                Object objA = ypaVar.a(f5gVar, this);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            dzbVar = wefVar;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            hf8.Q.getClass();
            ef8.a("WidgetInstallTracker").h("Failed to persist widget guide attribution", thA);
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((g5g) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
