package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cvc implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fwc b;

    public /* synthetic */ cvc(fwc fwcVar, int i) {
        this.a = i;
        this.b = fwcVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        uuc uucVar;
        uuc uucVar2;
        vuc vucVarJ;
        int i = this.a;
        wef wefVar = wef.a;
        fwc fwcVar = this.b;
        switch (i) {
            case 0:
                return new lf(20, fwcVar);
            case 1:
                if (fwcVar.a.a().b(((Long) obj).longValue())) {
                    fwcVar.m();
                    fwcVar.p(null);
                }
                return wefVar;
            case 2:
                long jLongValue = ((Long) obj).longValue();
                vuc vucVarJ2 = fwcVar.j();
                if (vucVarJ2 != null && (uucVar2 = vucVarJ2.a) != null && jLongValue == uucVar2.c) {
                    fwcVar.Y.setValue(null);
                }
                vuc vucVarJ3 = fwcVar.j();
                if (vucVarJ3 != null && (uucVar = vucVarJ3.b) != null && jLongValue == uucVar.c) {
                    fwcVar.Z.setValue(null);
                }
                if (fwcVar.a.a().b(jLongValue)) {
                    fwcVar.u();
                }
                a08 a08Var = (a08) fwcVar.K0.g(jLongValue);
                if (a08Var != null) {
                    a08Var.b();
                }
                return wefVar;
            case 3:
                bv7 bv7Var = (bv7) obj;
                hkb hkbVar = (hkb) fwcVar.x.getValue();
                if (hkbVar == null) {
                    return null;
                }
                bv7 bv7Var2 = fwcVar.z;
                if (bv7Var2 != null) {
                    return vd0.A0(hkbVar, bv7Var2, bv7Var);
                }
                l37.d("Required value was null.");
                oo3.f();
                return null;
            case 4:
                bv7 bv7Var3 = (bv7) obj;
                fwcVar.z = bv7Var3;
                if (bv7Var3 != null && bv7Var3.h() && (vucVarJ = fwcVar.j()) != null && fwcVar.a.a().e == 0) {
                    fwcVar.v(vucVarJ);
                    fo5.a(fwcVar.v);
                }
                if (((Boolean) fwcVar.w.getValue()).booleanValue() && fwcVar.j() != null) {
                    hl9 hl9Var = bv7Var3 != null ? new hl9(bv7Var3.c(0L)) : null;
                    if (!pa7.t(fwcVar.y, hl9Var)) {
                        fwcVar.y = hl9Var;
                        fwcVar.s();
                        fwcVar.u();
                    }
                }
                return wefVar;
            case 5:
                vz9 vz9Var = fwcVar.w;
                ko5 ko5Var = (ko5) ((jo5) obj);
                if (!ko5Var.a() && ((Boolean) vz9Var.getValue()).booleanValue()) {
                    fwcVar.m();
                }
                vz9Var.setValue(Boolean.valueOf(ko5Var.a()));
                return wefVar;
            case 6:
                fwcVar.o(((Boolean) obj).booleanValue());
                return wefVar;
            case 7:
                fwcVar.p((vuc) obj);
                return wefVar;
            default:
                if (fwcVar.a.a().b(((Long) obj).longValue())) {
                    fwcVar.X.setValue(wefVar);
                    fwcVar.s();
                    fwcVar.u();
                }
                return wefVar;
        }
    }
}
