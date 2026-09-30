package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gq2 extends gbe implements l26 {
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new gq2(2, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        hs3 hs3Var = xqa.c0;
        String str = (String) z5c.I(nu4.a, new cq2(hs3Var.a, hs3Var.b, null));
        th5 th5Var = cye.b;
        String string = gcc.E(z57.a.a(), fbc.d()).a().toString();
        if (pa7.t(str, string)) {
            return Boolean.FALSE;
        }
        ynb.V(lw2.a, null, null, new fq2(hs3Var.a, string, null), 3);
        return Boolean.TRUE;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((gq2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
