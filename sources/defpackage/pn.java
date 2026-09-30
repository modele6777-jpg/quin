package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pn extends gbe implements l26 {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ rn this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn(rn rnVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = rnVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        pn pnVar = new pn(this.this$0, xn2Var);
        pnVar.J$0 = ((zsf) obj).a;
        return pnVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        long j;
        int i = this.label;
        ks9 ks9Var = ks9.a;
        if (i == 0) {
            jzb.q(obj);
            long j2 = this.J$0;
            rn rnVar = this.this$0;
            float fC = rnVar.F0 == ks9Var ? zsf.c(j2) : zsf.b(j2);
            this.J$0 = j2;
            this.label = 1;
            obj = rnVar.G1(fC, this);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
            j = j2;
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.J$0;
            jzb.q(obj);
        }
        float fFloatValue = ((Number) obj).floatValue();
        float fE = this.this$0.Y0.e();
        float fD = this.this$0.Y0.b().d();
        if (fE >= this.this$0.Y0.b().c() || fE <= fD) {
            ks9 ks9Var2 = this.this$0.F0;
            float f = ks9Var2 == ks9.b ? fFloatValue : 0.0f;
            if (ks9Var2 != ks9Var) {
                fFloatValue = 0.0f;
            }
            j = q7c.j(f, fFloatValue);
        }
        return new zsf(j);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        long j = ((zsf) obj).a;
        pn pnVar = new pn(this.this$0, (xn2) obj2);
        pnVar.J$0 = j;
        return pnVar.r(wef.a);
    }
}
