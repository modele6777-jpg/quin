package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wx4 implements z85 {
    @Override // defpackage.z85
    public final int a() {
        return 2;
    }

    @Override // defpackage.z85
    public final int b(ca1 ca1Var, ca1 ca1Var2, u09 u09Var) {
        ca1Var.getClass();
        ca1Var2.getClass();
        if (!(ca1Var2 instanceof if7)) {
            return 3;
        }
        if7 if7Var = (if7) ca1Var2;
        if (!if7Var.getTypeParameters().isEmpty()) {
            return 3;
        }
        hu9 hu9VarI = iu9.i(ca1Var, ca1Var2);
        if ((hu9VarI != null ? hu9VarI.b() : 0) != 0) {
            return 3;
        }
        List listG = if7Var.G();
        listG.getClass();
        c3f c3fVarX = fyc.x(new td0(1, listG), z03.Z);
        tt7 tt7Var = if7Var.v;
        tt7Var.getClass();
        zi5 zi5VarS = fyc.s(qd0.S(new cyc[]{c3fVarX, new td0(5, tt7Var)}));
        nw7 nw7Var = if7Var.x;
        ue5 ue5Var = new ue5(fyc.s(qd0.S(new cyc[]{zi5VarS, new td0(1, t72.J(nw7Var != null ? nw7Var.getType() : null))})));
        while (ue5Var.hasNext()) {
            tt7 tt7Var2 = (tt7) ue5Var.next();
            if (!tt7Var2.Z().isEmpty() && !(tt7Var2.k0() instanceof mdb)) {
                return 3;
            }
        }
        ca1 ca1VarBuild = (ca1) ca1Var.d(new q8f(new ldb()));
        if (ca1VarBuild == null) {
            return 3;
        }
        if (ca1VarBuild instanceof hjd) {
            hjd hjdVar = (hjd) ca1VarBuild;
            if (!hjdVar.getTypeParameters().isEmpty()) {
                ca1VarBuild = hjdVar.d0().t().build();
                ca1VarBuild.getClass();
            }
        }
        int iB = iu9.c.n(ca1VarBuild, ca1Var2, false).b();
        if (iB != 0) {
            return vx4.a[kv2.B(iB)] == 1 ? 1 : 3;
        }
        throw null;
    }
}
