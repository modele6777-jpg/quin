package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e93 extends gbe implements l26 {
    final /* synthetic */ String $failureMessage;
    final /* synthetic */ b73 $gate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e93(b73 b73Var, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$gate = b73Var;
        this.$failureMessage = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        e93 e93Var = new e93(this.$gate, this.$failureMessage, xn2Var);
        e93Var.L$0 = obj;
        return e93Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object dzbVar;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                b73 b73Var = this.$gate;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                obj = b73Var.a(this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            dzbVar = (Boolean) obj;
            dzbVar.getClass();
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        String str = this.$failureMessage;
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            hf8.Q.getClass();
            ef8.a("DailyMixpanelEvents").c(str, thA);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((e93) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
