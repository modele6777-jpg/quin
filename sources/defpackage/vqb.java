package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vqb extends gbe implements l26 {
    final /* synthetic */ jmb $blurRadiusPx;
    final /* synthetic */ ke6 $layer;
    int label;
    final /* synthetic */ zqb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqb(zqb zqbVar, ke6 ke6Var, jmb jmbVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = zqbVar;
        this.$layer = ke6Var;
        this.$blurRadiusPx = jmbVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new vqb(this.this$0, this.$layer, this.$blurRadiusPx, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            zqb zqbVar = this.this$0;
            ke6 ke6Var = this.$layer;
            float f = this.$blurRadiusPx.element;
            this.label = 1;
            Object objC = zqbVar.c(ke6Var, f, this);
            bw2 bw2Var = bw2.a;
            if (objC == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        ((ie6) eb3.H(this.this$0.a, zg2.g)).a(this.$layer);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((vqb) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
