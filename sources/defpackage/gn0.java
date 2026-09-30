package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gn0 extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ sn0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn0(sn0 sn0Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = sn0Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        gn0 gn0Var = new gn0(this.this$0, xn2Var);
        gn0Var.L$0 = obj;
        return gn0Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Object dzbVar;
        int i = this.label;
        wef wefVar = wef.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                p5a p5aVar = this.this$0.R0;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                u5a u5aVar = (u5a) p5aVar;
                u5aVar.getClass();
                js3 js3Var = ga4.a;
                Object objP0 = ynb.p0(hr3.c, new t5a(u5aVar, null), this);
                bw2 bw2Var = bw2.a;
                if (objP0 != bw2Var) {
                    objP0 = wefVar;
                }
                if (objP0 == bw2Var) {
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
            ynb.h0(thA);
        }
        s0e s0eVar = this.this$0.S0;
        s0eVar.n(null, new Long(((Number) s0eVar.getValue()).longValue() + 1));
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((gn0) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
