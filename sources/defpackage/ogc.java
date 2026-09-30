package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ogc implements p01 {
    public final xh6 a;

    public ogc(xh6 xh6Var) {
        this.a = xh6Var;
    }

    @Override // defpackage.p01
    public final void a(vv7 vv7Var) {
        b68 b68VarJ;
        lw7 lw7Var = zh6.a;
        xh6 xh6Var = this.a;
        li6 li6Var = xh6Var.W0;
        if (!li6Var.a()) {
            li6Var = null;
        }
        if (li6Var == null) {
            li6Var = xh6Var.K0.e;
            if (!li6Var.a()) {
                li6Var = null;
            }
            if (li6Var == null) {
                li6Var = xh6Var.J0.e;
            }
        }
        if (!li6Var.a()) {
            li6Var = null;
        }
        if (li6Var == null) {
            li6Var = (li6) s72.x0(zh6.f(xh6Var));
            if (li6Var != null) {
                float fD = zh6.d(xh6Var);
                if (Float.isNaN(fD)) {
                    fD = 0.0f;
                }
                b41 b41Var = li6Var.c;
                if (b41Var == null) {
                    if (Float.isNaN(fD)) {
                        y02 y02Var = th6.a;
                        fD = 20.0f;
                    }
                    long j = li6Var.a;
                    float fC = y72.c(j) * ((fD / 72.0f) + 1.0f);
                    if (fC > 1.0f) {
                        fC = 1.0f;
                    }
                    li6Var = new li6(y72.b(j, fC), li6Var.b, b41Var);
                }
            } else {
                li6Var = null;
            }
            if (li6Var == null) {
                return;
            }
        }
        float f = xh6Var.X0;
        if (f >= 1.0f) {
            b68 b68Var = xh6Var.T0;
            if (b68Var == null) {
                ci6 ci6Var = xh6Var.Y0;
                b68VarJ = ci6Var != null ? urg.j(ci6Var) : null;
            } else {
                b68VarJ = b68Var;
            }
            eb3.J(vv7Var, li6Var, xh6Var, 0L, vv7Var.f(), b68VarJ);
            return;
        }
        ie6 ie6Var = (ie6) eb3.H(xh6Var, zg2.g);
        ke6 ke6VarC = ie6Var.c();
        try {
            ke6VarC.getClass();
            ke6VarC.f(f);
            sn4.j0(vv7Var, ke6VarC, new d5(26, li6Var, this));
            i7h.r(vv7Var, ke6VarC);
        } finally {
            ie6Var.a(ke6VarC);
        }
    }
}
