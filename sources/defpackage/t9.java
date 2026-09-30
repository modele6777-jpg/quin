package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t9 extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ x9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(x9 x9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = x9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        t9 t9Var = new t9(this.this$0, xn2Var);
        t9Var.L$0 = obj;
        return t9Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object dzbVar;
        x9 x9Var;
        int i = this.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        try {
            if (i != 0) {
                if (i == 1) {
                    x9Var = (x9) this.L$2;
                    jzb.q(obj);
                } else {
                    if (i != 2) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jzb.q(obj);
                }
                return wefVar;
            }
            jzb.q(obj);
            x9Var = this.this$0;
            bc7 bc7Var = x9Var.f;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = x9Var;
            this.label = 1;
            obj = bc7Var.a("2511", this);
            if (obj == bw2Var) {
            }
            return bw2Var;
            int i2 = x9.X;
            x9Var.w.setValue((String) obj);
            dzbVar = wefVar;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        x9 x9Var2 = this.this$0;
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            x9Var2.d().c("Failed to generateCode", thA);
            js3 js3Var = ga4.a;
            wg6 wg6Var = mk8.a;
            s9 s9Var = new s9(2, null);
            this.L$0 = null;
            this.L$1 = dzbVar;
            this.L$2 = null;
            this.label = 2;
            if (ynb.p0(wg6Var, s9Var, this) == bw2Var) {
                return bw2Var;
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((t9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
