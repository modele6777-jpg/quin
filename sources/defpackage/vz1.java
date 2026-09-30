package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vz1 extends gbe implements l26 {
    final /* synthetic */ a26 $onScaleChange;
    final /* synthetic */ n69 $scaleState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz1(a26 a26Var, n69 n69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$onScaleChange = a26Var;
        this.$scaleState$delegate = n69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new vz1(this.$onScaleChange, this.$scaleState$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        n69 n69Var = this.$scaleState$delegate;
        wn7[] wn7VarArr = q02.a;
        if (((qz9) n69Var).j() < 1.3f) {
            this.$onScaleChange.d(w02.a);
        } else if (((qz9) this.$scaleState$delegate).j() >= 1.3f) {
            this.$onScaleChange.d(w02.b);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        vz1 vz1Var = (vz1) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        vz1Var.r(wefVar);
        return wefVar;
    }
}
