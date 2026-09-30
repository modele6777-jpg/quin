package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oqb implements p01 {
    public final xh6 a;
    public nqb b;

    public oqb(xh6 xh6Var) {
        this.a = xh6Var;
    }

    @Override // defpackage.p01
    public final void a(vv7 vv7Var) {
        wf8 wf8Var = new wf8(17, this);
        xh6 xh6Var = this.a;
        float fA = zh6.a(xh6Var);
        boolean z = xh6Var.d1 != null;
        ie6 ie6Var = (ie6) eb3.H(xh6Var, zg2.g);
        ke6 ke6VarF = eb3.F(vv7Var, xh6Var, fA, xh6Var.P0, xh6Var.Q0);
        if (ke6VarF != null) {
            ke6VarF.g(z);
            eb3.I(vv7Var, xh6Var.Q0 ^ (-9223372034707292160L), ald.f(vv7Var.a.f(), fA), z, new l0(23, wf8Var, ke6VarF));
            ie6Var.a(ke6VarF);
        }
    }
}
