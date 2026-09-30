package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vp2 extends gbe implements l26 {
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new vp2(2, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        hs3 hs3Var = xqa.c0;
        th5 th5Var = cye.b;
        String string = gcc.E(z57.a.a(), fbc.d()).a().toString();
        ynb.V(lw2.a, null, null, new up2(hs3Var.a, string, null), 3);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        vp2 vp2Var = (vp2) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        vp2Var.r(wefVar);
        return wefVar;
    }
}
