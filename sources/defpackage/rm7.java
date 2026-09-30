package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rm7 extends bl2 {
    public rm7(j22 j22Var, int i) {
        super(new pm7(new m22(j22Var, i)));
    }

    @Override // defpackage.bl2
    public final tt7 a(w09 w09Var) {
        tt7 tt7VarC;
        w09Var.getClass();
        e7f.b.getClass();
        e7f e7fVar = e7f.c;
        xr7 xr7VarF = w09Var.f();
        xr7VarF.getClass();
        u09 u09VarJ = xr7VarF.j(syd.Q.i());
        Object obj = this.a;
        qm7 qm7Var = (qm7) obj;
        if (qm7Var instanceof om7) {
            tt7VarC = ((om7) obj).a;
        } else {
            if (!(qm7Var instanceof pm7)) {
                ap.c();
                return null;
            }
            m22 m22Var = ((pm7) obj).a;
            j22 j22Var = m22Var.a;
            int i = m22Var.b;
            u09 u09VarP = od4.p(w09Var, j22Var);
            if (u09VarP == null) {
                tt7VarC = sy4.c(qy4.b, j22Var.toString(), String.valueOf(i));
            } else {
                tjd tjdVarS = u09VarP.S();
                tjdVarS.getClass();
                tt7 tt7VarZ = o7c.z(tjdVarS);
                for (int i2 = 0; i2 < i; i2++) {
                    tt7VarZ = w09Var.f().h(tt7VarZ);
                }
                tt7VarC = tt7VarZ;
            }
        }
        return rxg.S(e7fVar, u09VarJ, t72.H(new dzd(tt7VarC)));
    }
}
