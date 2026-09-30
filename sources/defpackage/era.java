package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class era extends gbe implements l26 {
    final /* synthetic */ Object $default;
    final /* synthetic */ l26 $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public era(l26 l26Var, Object obj, xn2 xn2Var) {
        super(2, xn2Var);
        this.$transform = l26Var;
        this.$default = obj;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        era eraVar = new era(this.$transform, this.$default, xn2Var);
        eraVar.L$0 = obj;
        return eraVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object dzbVar;
        l26 l26Var;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                l26Var = this.$transform;
                ypa.a.getClass();
                wj5 wj5VarB = ypa.b();
                this.L$0 = null;
                this.L$1 = l26Var;
                this.L$2 = null;
                this.label = 1;
                obj = tm7.B(wj5VarB, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l26Var = (l26) this.L$1;
                jzb.q(obj);
            }
            p79 p79Var = (p79) obj;
            String str = (String) p79Var.c(xqa.A.a);
            if (str == null) {
                str = "";
            }
            dzbVar = l26Var.z(p79Var, str);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            hf8.Q.getClass();
            ef8.a("Preference").c("Failed to load account-scoped notification preference", thA);
        }
        return ezb.a(dzbVar) == null ? dzbVar : this.$default;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((era) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
