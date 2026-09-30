package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ka extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ cb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(cb cbVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = cbVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ka kaVar = new ka(this.this$0, xn2Var);
        kaVar.L$0 = obj;
        return kaVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Object dzbVar;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                d56 d56Var = this.this$0.a;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                Object objP = d56Var.p(this);
                bw2 bw2Var = bw2.a;
                if (objP == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            dzbVar = Boolean.TRUE;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        cb cbVar = this.this$0;
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            cbVar.d().c("compensate error", thA);
            ynb.h0(thA);
        }
        return dzbVar instanceof dzb ? Boolean.FALSE : dzbVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ka) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
