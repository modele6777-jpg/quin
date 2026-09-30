package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w78 implements w49 {
    public static int f(ga7 ga7Var, ArrayList arrayList, int i, l26 l26Var) {
        int iIntValue;
        int iIntValue2;
        int i2;
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        int iG0 = g21.g0(i, ga7Var.D0(32.0f));
        tn8 tn8Var = (tn8) s72.x0(list4);
        if (tn8Var != null) {
            iIntValue = ((Number) l26Var.z(tn8Var, Integer.valueOf(iG0))).intValue();
            iG0 = g21.g0(iG0, tn8Var.q(Integer.MAX_VALUE));
        } else {
            iIntValue = 0;
        }
        tn8 tn8Var2 = (tn8) s72.x0(list5);
        if (tn8Var2 != null) {
            iIntValue2 = ((Number) l26Var.z(tn8Var2, Integer.valueOf(iG0))).intValue();
            iG0 = g21.g0(iG0, tn8Var2.q(Integer.MAX_VALUE));
        } else {
            iIntValue2 = 0;
        }
        Object obj = (tn8) s72.x0(list2);
        int iIntValue3 = obj != null ? ((Number) l26Var.z(obj, Integer.valueOf(iG0))).intValue() : 0;
        Object obj2 = (tn8) s72.x0(list);
        int iIntValue4 = obj2 != null ? ((Number) l26Var.z(obj2, Integer.valueOf(iG0))).intValue() : 0;
        Object obj3 = (tn8) s72.x0(list3);
        int iIntValue5 = obj3 != null ? ((Number) l26Var.z(obj3, Integer.valueOf(iG0))).intValue() : 0;
        boolean z = iIntValue5 > ga7Var.x0(w6c.l(30));
        boolean z2 = iIntValue3 > 0;
        boolean z3 = iIntValue5 > 0;
        if ((z2 && z3) || z) {
            i2 = 3;
        } else {
            i2 = (z2 || z3) ? 2 : 1;
        }
        return rxg.A(ga7Var, iIntValue, iIntValue2, iIntValue4, iIntValue3, iIntValue5, i2, ga7Var.D0((i2 == 3 ? 12.0f : 8.0f) * 2.0f), ll2.b(0, 0, 0, 0, 15));
    }

    public static int g(ga7 ga7Var, ArrayList arrayList, int i, l26 l26Var) {
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        tn8 tn8Var = (tn8) s72.x0(list4);
        int iIntValue = tn8Var != null ? ((Number) l26Var.z(tn8Var, Integer.valueOf(i))).intValue() : 0;
        tn8 tn8Var2 = (tn8) s72.x0(list5);
        int iIntValue2 = tn8Var2 != null ? ((Number) l26Var.z(tn8Var2, Integer.valueOf(i))).intValue() : 0;
        tn8 tn8Var3 = (tn8) s72.x0(list);
        int iIntValue3 = tn8Var3 != null ? ((Number) l26Var.z(tn8Var3, Integer.valueOf(i))).intValue() : 0;
        tn8 tn8Var4 = (tn8) s72.x0(list2);
        int iIntValue4 = tn8Var4 != null ? ((Number) l26Var.z(tn8Var4, Integer.valueOf(i))).intValue() : 0;
        tn8 tn8Var5 = (tn8) s72.x0(list3);
        int iIntValue5 = tn8Var5 != null ? ((Number) l26Var.z(tn8Var5, Integer.valueOf(i))).intValue() : 0;
        int iD0 = ga7Var.D0(32.0f);
        long jB = ll2.b(0, 0, 0, 0, 15);
        if (kl2.d(jB)) {
            return kl2.h(jB);
        }
        return iD0 + iIntValue + Math.max(iIntValue3, Math.max(iIntValue4, iIntValue5)) + iIntValue2;
    }

    @Override // defpackage.w49
    public final int a(ga7 ga7Var, List list, int i) {
        return g(ga7Var, (ArrayList) list, i, t78.a);
    }

    @Override // defpackage.w49
    public final yn8 b(zn8 zn8Var, List list, long j) {
        int i;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        List list5 = (List) arrayList.get(3);
        List list6 = (List) arrayList.get(4);
        long jA = kl2.a(j, 0, 0, 0, 0, 10);
        int iD0 = zn8Var.D0(32.0f);
        tn8 tn8Var = (tn8) s72.x0(list5);
        int iN = tn8Var != null ? tn8Var.n(kl2.g(j)) : 0;
        tn8 tn8Var2 = (tn8) s72.x0(list6);
        int iG0 = g21.g0(kl2.h(jA), iN + (tn8Var2 != null ? tn8Var2.n(kl2.g(j)) : 0) + iD0);
        tn8 tn8Var3 = (tn8) s72.x0(list4);
        long jI = ll2.i(-iD0, -zn8Var.D0(((((s72.x0(list3) != null) && (s72.x0(list4) != null)) || ((tn8Var3 != null ? tn8Var3.V(iG0) : 0) > zn8Var.x0(w6c.l(30)))) ? 12.0f : 8.0f) * 2.0f), jA);
        tn8 tn8Var4 = (tn8) s72.x0(list5);
        cea ceaVarV = tn8Var4 != null ? tn8Var4.v(jI) : null;
        int i2 = ceaVarV != null ? ceaVarV.a : 0;
        tn8 tn8Var5 = (tn8) s72.x0(list6);
        cea ceaVarV2 = tn8Var5 != null ? tn8Var5.v(ll2.j(-i2, 0, 2, jI)) : null;
        int i3 = i2 + (ceaVarV2 != null ? ceaVarV2.a : 0);
        tn8 tn8Var6 = (tn8) s72.x0(list2);
        cea ceaVarV3 = tn8Var6 != null ? tn8Var6.v(ll2.j(-i3, 0, 2, jI)) : null;
        int i4 = ceaVarV3 != null ? ceaVarV3.b : 0;
        tn8 tn8Var7 = (tn8) s72.x0(list4);
        cea ceaVarV4 = tn8Var7 != null ? tn8Var7.v(ll2.i(-i3, -i4, jI)) : null;
        int i5 = i4 + (ceaVarV4 != null ? ceaVarV4.b : 0);
        boolean z = (ceaVarV4 == null || ceaVarV4.W(cj.a) == ceaVarV4.W(cj.b)) ? false : true;
        tn8 tn8Var8 = (tn8) s72.x0(list3);
        cea ceaVarV5 = tn8Var8 != null ? tn8Var8.v(ll2.i(-i3, -i5, jI)) : null;
        boolean z2 = ceaVarV5 != null;
        boolean z3 = ceaVarV4 != null;
        if ((z2 && z3) || z) {
            i = 3;
        } else {
            i = (z2 || z3) ? 2 : 1;
        }
        float f = i == 3 ? 12.0f : 8.0f;
        float f2 = f * 2.0f;
        final int iH = kl2.d(j) ? kl2.h(j) : iD0 + (ceaVarV != null ? ceaVarV.a : 0) + Math.max(ceaVarV3 != null ? ceaVarV3.a : 0, Math.max(ceaVarV5 != null ? ceaVarV5.a : 0, ceaVarV4 != null ? ceaVarV4.a : 0)) + (ceaVarV2 != null ? ceaVarV2.a : 0);
        final cea ceaVar = ceaVarV5;
        float f3 = f;
        final int iA = rxg.A(zn8Var, ceaVarV != null ? ceaVarV.b : 0, ceaVarV2 != null ? ceaVarV2.b : 0, ceaVarV3 != null ? ceaVarV3.b : 0, ceaVarV5 != null ? ceaVarV5.b : 0, ceaVarV4 != null ? ceaVarV4.b : 0, i, zn8Var.D0(f2), j);
        final boolean z4 = i == 3;
        final int iD1 = zn8Var.D0(16.0f);
        final int iD2 = zn8Var.D0(16.0f);
        final int iD3 = zn8Var.D0(f3);
        final cea ceaVar2 = ceaVarV2;
        final cea ceaVar3 = ceaVarV3;
        final cea ceaVar4 = ceaVarV4;
        final cea ceaVar5 = ceaVarV;
        return zn8Var.n0(iH, iA, qu4.a, new a26() { // from class: r78
            @Override // defpackage.a26
            public final Object d(Object obj) {
                int iRound;
                bea beaVar = (bea) obj;
                cea ceaVar6 = ceaVar5;
                int i6 = iD1;
                boolean z5 = z4;
                int iRound2 = iD3;
                int i7 = iA;
                if (ceaVar6 != null) {
                    beaVar.k(ceaVar6, i6, z5 ? iRound2 : Math.round(((i7 - ceaVar6.b) / 2.0f) * 1.0f), 0.0f);
                }
                int i8 = i6 + (ceaVar6 != null ? ceaVar6.a : 0);
                cea ceaVar7 = ceaVar3;
                cea ceaVar8 = ceaVar;
                cea ceaVar9 = ceaVar4;
                if (z5) {
                    iRound = iRound2;
                } else {
                    iRound = Math.round(((i7 - (((ceaVar7 != null ? ceaVar7.b : 0) + (ceaVar8 != null ? ceaVar8.b : 0)) + (ceaVar9 != null ? ceaVar9.b : 0))) / 2.0f) * 1.0f);
                }
                if (ceaVar8 != null) {
                    beaVar.k(ceaVar8, i8, iRound, 0.0f);
                }
                int i9 = iRound + (ceaVar8 != null ? ceaVar8.b : 0);
                if (ceaVar7 != null) {
                    beaVar.k(ceaVar7, i8, i9, 0.0f);
                }
                int i10 = i9 + (ceaVar7 != null ? ceaVar7.b : 0);
                if (ceaVar9 != null) {
                    beaVar.k(ceaVar9, i8, i10, 0.0f);
                }
                cea ceaVar10 = ceaVar2;
                if (ceaVar10 != null) {
                    int i11 = (iH - iD2) - ceaVar10.a;
                    if (!z5) {
                        iRound2 = Math.round(((i7 - ceaVar10.b) / 2.0f) * 1.0f);
                    }
                    beaVar.k(ceaVar10, i11, iRound2, 0.0f);
                }
                return wef.a;
            }
        });
    }

    @Override // defpackage.w49
    public final int c(ga7 ga7Var, List list, int i) {
        return g(ga7Var, (ArrayList) list, i, v78.a);
    }

    @Override // defpackage.w49
    public final int d(ga7 ga7Var, List list, int i) {
        return f(ga7Var, (ArrayList) list, i, s78.a);
    }

    @Override // defpackage.w49
    public final int e(ga7 ga7Var, List list, int i) {
        return f(ga7Var, (ArrayList) list, i, u78.a);
    }
}
