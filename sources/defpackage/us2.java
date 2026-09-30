package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class us2 extends gbe implements l26 {
    final /* synthetic */ s4g $data;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us2(s4g s4gVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$data = s4gVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new us2(this.$data, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.$data.getClass();
        hs3 hs3Var = xqa.H0;
        th5 th5Var = cye.b;
        String string = gcc.E(z57.a.a(), fbc.d()).a().toString();
        ynb.V(lw2.a, null, null, new k5g(hs3Var.a, string, null), 3);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        us2 us2Var = (us2) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        us2Var.r(wefVar);
        return wefVar;
    }
}
