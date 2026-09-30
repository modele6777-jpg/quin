package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cic extends gbe implements l26 {
    final /* synthetic */ long $available;
    final /* synthetic */ lmb $result;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ gic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cic(gic gicVar, lmb lmbVar, long j, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = gicVar;
        this.$result = lmbVar;
        this.$available = j;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        cic cicVar = new cic(this.this$0, this.$result, this.$available, xn2Var);
        cicVar.L$0 = obj;
        return cicVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        gic gicVar;
        lmb lmbVar;
        long j;
        gic gicVar2;
        int i = this.label;
        ks9 ks9Var = ks9.b;
        int i2 = 1;
        if (i == 0) {
            jzb.q(obj);
            dic dicVar = (dic) this.L$0;
            gicVar = this.this$0;
            nn nnVar = new nn(i2, gicVar, dicVar);
            lmb lmbVar2 = this.$result;
            long j2 = this.$available;
            gj5 gj5Var = gicVar.c;
            long j3 = lmbVar2.element;
            float fE = gicVar.e(gicVar.d == ks9Var ? zsf.b(j2) : zsf.c(j2));
            this.L$0 = gicVar;
            this.L$1 = gicVar;
            this.L$2 = lmbVar2;
            this.J$0 = j3;
            this.label = 1;
            Object objA = gj5Var.a(nnVar, fE, this);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
            lmbVar = lmbVar2;
            j = j3;
            obj = objA;
            gicVar2 = gicVar;
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.J$0;
            lmbVar = (lmb) this.L$2;
            gicVar = (gic) this.L$1;
            gicVar2 = (gic) this.L$0;
            jzb.q(obj);
        }
        float fE2 = gicVar2.e(((Number) obj).floatValue());
        lmbVar.element = gicVar.d == ks9Var ? zsf.a(fE2, 0.0f, 2, j) : zsf.a(0.0f, fE2, 1, j);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((cic) k((xn2) obj2, (dic) obj)).r(wef.a);
    }
}
