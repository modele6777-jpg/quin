package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xoe extends gbe implements l26 {
    final /* synthetic */ yib $receiveContentConfiguration;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ape this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xoe(ape apeVar, yib yibVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = apeVar;
        this.$receiveContentConfiguration = yibVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        xoe xoeVar = new xoe(this.this$0, this.$receiveContentConfiguration, xn2Var);
        xoeVar.L$0 = obj;
        return xoeVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            oo3.f();
            return null;
        }
        jzb.q(obj);
        iu iuVar = (iu) this.L$0;
        ape apeVar = this.this$0;
        z2f z2fVar = apeVar.F0;
        ute uteVar = apeVar.G0;
        rx6 rx6VarB = apeVar.J0.b(apeVar.L0);
        yib yibVar = this.$receiveContentConfiguration;
        ape apeVar2 = this.this$0;
        d60 d60Var = new d60(1, apeVar2, ape.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)Z", 8, 5);
        koe koeVar = new koe(apeVar2, 12);
        b89 b89Var = apeVar2.N0;
        rvf rvfVar = (rvf) eb3.H(apeVar2, zg2.t);
        loe loeVar = new loe(this.this$0, 7);
        this.label = 1;
        af1.Z(iuVar, z2fVar, uteVar, rx6VarB, yibVar, d60Var, koeVar, b89Var, rvfVar, loeVar, this);
        return bw2.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((xoe) k((xn2) obj2, (iu) obj)).r(wef.a);
        return bw2.a;
    }
}
