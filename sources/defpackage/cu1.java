package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cu1 extends gbe implements l26 {
    final /* synthetic */ tt1 $controller;
    final /* synthetic */ jx $flipAngle;
    final /* synthetic */ n69 $lastFlipDirection$delegate;
    final /* synthetic */ jx $progress;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu1(tt1 tt1Var, jx jxVar, jx jxVar2, n69 n69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$controller = tt1Var;
        this.$progress = jxVar;
        this.$flipAngle = jxVar2;
        this.$lastFlipDirection$delegate = n69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        cu1 cu1Var = new cu1(this.$controller, this.$progress, this.$flipAngle, this.$lastFlipDirection$delegate, xn2Var);
        cu1Var.L$0 = obj;
        return cu1Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        aw2 aw2Var = (aw2) this.L$0;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (((hkb) this.$controller.d.getValue()) != null) {
            ynb.V(aw2Var, null, null, new bu1(this.$flipAngle, this.$lastFlipDirection$delegate, null), 3);
        }
        jx jxVar = this.$progress;
        Float f = new Float(0.0f);
        x6f x6fVarT = b21.T(450, 0, hs4.a, 2);
        this.L$0 = null;
        this.label = 1;
        Object objB = jx.b(jxVar, f, x6fVarT, null, null, this, 12);
        bw2 bw2Var = bw2.a;
        return objB == bw2Var ? bw2Var : objB;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((cu1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
