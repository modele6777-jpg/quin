package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends gbe implements l26 {
    int label;
    final /* synthetic */ b1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(b1 b1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = b1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new a1(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        b1 b1Var = this.this$0;
        yq6 yq6Var = b1Var.S0;
        if (yq6Var != null) {
            zq6 zq6Var = new zq6(yq6Var);
            t69 t69Var = b1Var.F0;
            if (t69Var != null) {
                ynb.V(b1Var.Z0(), null, null, new n0(t69Var, zq6Var, null), 3);
            }
            b1Var.S0 = null;
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        a1 a1Var = (a1) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        a1Var.r(wefVar);
        return wefVar;
    }
}
