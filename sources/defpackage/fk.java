package defpackage;

import androidx.compose.foundation.layout.b;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fk implements o26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ a26 c;
    public final /* synthetic */ a26 d;

    public /* synthetic */ fk(List list, a26 a26Var, a26 a26Var2, int i) {
        this.a = i;
        this.b = list;
        this.c = a26Var;
        this.d = a26Var2;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        l46 l46Var;
        int i3 = this.a;
        wef wefVar = wef.a;
        List list = this.b;
        a26 a26Var = this.c;
        i8c i8cVar = sf2.a;
        a26 a26Var2 = this.d;
        g09 g09Var = g09.a;
        switch (i3) {
            case 0:
                mx7 mx7Var = (mx7) obj;
                int iIntValue = ((Number) obj2).intValue();
                l46 l46Var2 = (l46) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (l46Var2.g(mx7Var) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= l46Var2.e(iIntValue) ? 32 : 16;
                }
                if (l46Var2.W(i & 1, (i & 147) != 146)) {
                    jaa jaaVar = (jaa) list.get(iIntValue);
                    l46Var2.f0(986309420);
                    j09 j09VarD = b.d(b.c(g09Var, 1.0f), 112.0f);
                    boolean zG = l46Var2.g(a26Var) | l46Var2.i(jaaVar);
                    Object objR = l46Var2.R();
                    if (zG || objR == i8cVar) {
                        objR = new ek(a26Var, jaaVar, 0);
                        l46Var2.p0(objR);
                    }
                    x16 x16Var = (x16) objR;
                    boolean zG2 = l46Var2.g(a26Var2) | l46Var2.i(jaaVar);
                    Object objR2 = l46Var2.R();
                    if (zG2 || objR2 == i8cVar) {
                        objR2 = new ek(a26Var2, jaaVar, 1);
                        l46Var2.p0(objR2);
                    }
                    if9.k(j09VarD, jaaVar, x16Var, (x16) objR2, l46Var2, 6);
                    l46Var2.r(false);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            default:
                y02 y02Var = g21.f;
                mx7 mx7Var2 = (mx7) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l46 l46Var3 = (l46) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (l46Var3.g(mx7Var2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= l46Var3.e(iIntValue3) ? 32 : 16;
                }
                if (l46Var3.W(i2 & 1, (i2 & 147) != 146)) {
                    bc4 bc4Var = (bc4) list.get(iIntValue3);
                    l46Var3.f0(-1221684531);
                    if (bc4Var instanceof zb4) {
                        l46Var3.f0(-1221642527);
                        j09 j09VarO = tm7.o(oa7.E(g09Var, ((s5d) l46Var3.k(u5d.a)).e), kn2.J(l46Var3), y02Var);
                        zb4 zb4Var = (zb4) bc4Var;
                        boolean zG3 = l46Var3.g(a26Var) | l46Var3.i(bc4Var);
                        Object objR3 = l46Var3.R();
                        if (zG3 || objR3 == i8cVar) {
                            objR3 = new jk6(a26Var, zb4Var, 0);
                            l46Var3.p0(objR3);
                        }
                        eb3.u(j09VarO, zb4Var, (x16) objR3, l46Var3, 64, 0);
                        l46Var = l46Var3;
                        l46Var.r(false);
                    } else {
                        l46Var = l46Var3;
                        if (!(bc4Var instanceof ac4)) {
                            throw tec.d(514780097, l46Var, false);
                        }
                        l46Var.f0(-1221330853);
                        j09 j09VarO2 = tm7.o(oa7.E(b.c(b.f(130.0f, 0.0f, g09Var, 2), 1.0f), eze.a(l46Var).e.c.a), kn2.J(l46Var), y02Var);
                        ac4 ac4Var = (ac4) bc4Var;
                        boolean zG4 = l46Var.g(a26Var2) | l46Var.i(bc4Var);
                        Object objR4 = l46Var.R();
                        if (zG4 || objR4 == i8cVar) {
                            objR4 = new kk6(a26Var2, ac4Var, 0);
                            l46Var.p0(objR4);
                        }
                        jgb.A(j09VarO2, ac4Var, (x16) objR4, l46Var, 64, 0);
                        l46Var.r(false);
                    }
                    jgb.p(fbf.Block, l46Var, 6, 0);
                    l46Var.r(false);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
        }
    }
}
