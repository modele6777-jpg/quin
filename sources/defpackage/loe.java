package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class loe implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ape b;

    public /* synthetic */ loe(ape apeVar, int i) {
        this.a = i;
        this.b = apeVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        int i2 = 1;
        wef wefVar = wef.a;
        ape apeVar = this.b;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean z = apeVar.I0;
                if (zBooleanValue) {
                    if (((m47) ((o47) ((n47) eb3.H(apeVar, zg2.m))).a.getValue()).a != 1) {
                        apeVar.H0.v(false);
                    }
                    if (z) {
                        apeVar.t1(false);
                    }
                } else {
                    apeVar.o1();
                    z2f z2fVar = apeVar.F0;
                    use useVar = z2fVar.a;
                    u47 u47Var = z2fVar.b;
                    useVar.b.a().v();
                    une uneVar = useVar.b;
                    uneVar.g(null);
                    z2fVar.l(uneVar);
                    useVar.b(u47Var, true, fpe.a);
                    useVar.g(true);
                    useVar.f(useVar.b.e);
                    apeVar.F0.a();
                }
                if9.C(apeVar, new koe(apeVar, i2));
                return wefVar;
            case 1:
                fj4 fj4Var = (fj4) obj;
                if (b21.B(apeVar) != null) {
                    urg.t(apeVar, fj4Var);
                }
                return wefVar;
            case 2:
                gj4 gj4Var = new gj4();
                ((u69) apeVar.M0).b(gj4Var);
                apeVar.Q0 = gj4Var;
                yib yibVarB = b21.B(apeVar);
                if (yibVarB != null) {
                    ((wr4) yibVarB).b.e();
                }
                return wefVar;
            case 3:
                ute uteVar = apeVar.G0;
                long jC = ((hl9) obj).a;
                bv7 bv7VarB = uteVar.b();
                if (bv7VarB != null && bv7VarB.h()) {
                    jC = bv7VarB.C(jC);
                }
                int iD = apeVar.G0.d(jC, true);
                if (iD >= 0) {
                    apeVar.F0.j(u3c.b(iD, iD));
                }
                apeVar.H0.A(sg6.a, jC);
                return wefVar;
            case 4:
                apeVar.p1();
                apeVar.H0.b();
                yib yibVarB2 = b21.B(apeVar);
                if (yibVarB2 != null) {
                    ((wr4) yibVarB2).b.c();
                }
                return wefVar;
            case 5:
                apeVar.p1();
                return wefVar;
            case 6:
                List list = (List) obj;
                ste steVarC = apeVar.G0.c();
                return Boolean.valueOf(steVarC != null ? list.add(steVarC) : false);
            default:
                apeVar.H0.v(((Boolean) obj).booleanValue());
                return wefVar;
        }
    }
}
