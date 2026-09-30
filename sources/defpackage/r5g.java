package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r5g extends gbe implements l26 {
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new r5g(2, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        hs3 hs3Var = xqa.B0;
        Boolean bool = Boolean.TRUE;
        isa isaVar = hs3Var.a;
        qn2 qn2Var = lw2.a;
        ynb.V(qn2Var, null, null, new y5g(isaVar, bool, null), 3);
        ynb.V(qn2Var, null, null, new b6g(xqa.C0.a, 1, null), 3);
        hs3 hs3Var2 = xqa.H0;
        th5 th5Var = cye.b;
        ynb.V(qn2Var, null, null, new k5g(hs3Var2.a, gcc.E(z57.a.a(), fbc.d()).a().toString(), null), 3);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        r5g r5gVar = (r5g) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        r5gVar.r(wefVar);
        return wefVar;
    }
}
