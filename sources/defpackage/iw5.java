package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class iw5 extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        iw5 iw5Var = new iw5(2, xn2Var);
        iw5Var.L$0 = obj;
        return iw5Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        p79 p79Var = (p79) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        isa isaVar = xqa.A.a;
        p79Var.getClass();
        p79Var.f(isaVar, "");
        p79Var.d(xqa.Y0.a);
        p79Var.d(xqa.X0.a);
        p79Var.d(xqa.Z0.a);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        iw5 iw5Var = (iw5) k((xn2) obj2, (p79) obj);
        wef wefVar = wef.a;
        iw5Var.r(wefVar);
        return wefVar;
    }
}
