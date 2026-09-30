package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fi1 extends gbe implements l26 {
    final /* synthetic */ n69 $rotation$delegate;
    final /* synthetic */ aee $uiState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi1(aee aeeVar, n69 n69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$uiState = aeeVar;
        this.$rotation$delegate = n69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new fi1(this.$uiState, this.$rotation$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (this.$uiState.a == null) {
            ((qz9) this.$rotation$delegate).k(0.0f);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        fi1 fi1Var = (fi1) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        fi1Var.r(wefVar);
        return wefVar;
    }
}
