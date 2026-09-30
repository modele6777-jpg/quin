package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends gbe implements l26 {
    int label;
    final /* synthetic */ b1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(b1 b1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = b1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new z0(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        b1 b1Var = this.this$0;
        if (b1Var.S0 == null) {
            yq6 yq6Var = new yq6();
            t69 t69Var = b1Var.F0;
            if (t69Var != null) {
                ynb.V(b1Var.Z0(), null, null, new m0(t69Var, yq6Var, null), 3);
            }
            b1Var.S0 = yq6Var;
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        z0 z0Var = (z0) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        z0Var.r(wefVar);
        return wefVar;
    }
}
