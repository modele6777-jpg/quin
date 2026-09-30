package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hqe implements xn8 {
    public final boolean a;
    public final rpe b;
    public final mpe c;
    public final xw9 d;
    public final float e;

    public hqe(boolean z, rpe rpeVar, mpe mpeVar, xw9 xw9Var, float f) {
        this.a = z;
        this.b = rpeVar;
        this.c = mpeVar;
        this.d = xw9Var;
        this.e = f;
    }

    public static int h(List list, int i, l26 l26Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (pa7.t(g21.O((tn8) obj7), "TextField")) {
                int iIntValue = ((Number) l26Var.z(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (pa7.t(g21.O((tn8) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                tn8 tn8Var = (tn8) obj2;
                int iIntValue2 = tn8Var != null ? ((Number) l26Var.z(tn8Var, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (pa7.t(g21.O((tn8) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                tn8 tn8Var2 = (tn8) obj3;
                int iIntValue3 = tn8Var2 != null ? ((Number) l26Var.z(tn8Var2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (pa7.t(g21.O((tn8) obj4), "Prefix")) {
                        break;
                    }
                    i5++;
                }
                tn8 tn8Var3 = (tn8) obj4;
                int iIntValue4 = tn8Var3 != null ? ((Number) l26Var.z(tn8Var3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (pa7.t(g21.O((tn8) obj5), "Suffix")) {
                        break;
                    }
                    i6++;
                }
                tn8 tn8Var4 = (tn8) obj5;
                int iIntValue5 = tn8Var4 != null ? ((Number) l26Var.z(tn8Var4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (pa7.t(g21.O((tn8) obj6), "Leading")) {
                        break;
                    }
                    i7++;
                }
                tn8 tn8Var5 = (tn8) obj6;
                int iIntValue6 = tn8Var5 != null ? ((Number) l26Var.z(tn8Var5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    Object obj8 = list.get(i8);
                    if (pa7.t(g21.O((tn8) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                }
                tn8 tn8Var6 = (tn8) obj;
                int i9 = iIntValue4 + iIntValue5;
                return ll2.g(Math.max(iIntValue + i9, Math.max((tn8Var6 != null ? ((Number) l26Var.z(tn8Var6, Integer.valueOf(i))).intValue() : 0) + i9, iIntValue2)) + iIntValue6 + iIntValue3, ll2.b(0, 0, 0, 0, 15));
            }
        }
        k88.b("Collection contains no element matching the predicate.");
        oo3.f();
        return 0;
    }

    public static final int i(hqe hqeVar, int i, int i2, cea ceaVar) {
        return hqeVar.a ? Math.round(((i - ceaVar.b) / 2.0f) * 1.0f) : i2;
    }

    @Override // defpackage.xn8
    public final int a(ga7 ga7Var, List list, int i) {
        return h(list, i, new mle(24));
    }

    @Override // defpackage.xn8
    public final yn8 b(final zn8 zn8Var, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        Object obj6;
        Object obj7;
        cea ceaVar;
        int i2;
        cea ceaVar2;
        int i3;
        float f;
        int i4;
        int i5;
        float fInvoke = this.c.invoke();
        xw9 xw9Var = this.d;
        final int iD0 = zn8Var.D0(xw9Var.d());
        int iD1 = zn8Var.D0(xw9Var.a());
        long jA = kl2.a(j, 0, 0, 0, 0, 10);
        int size = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i6);
            if (pa7.t(vfh.v((tn8) obj), "Leading")) {
                break;
            }
            i6++;
        }
        tn8 tn8Var = (tn8) obj;
        cea ceaVarV = tn8Var != null ? tn8Var.v(jA) : null;
        int i7 = ceaVarV != null ? ceaVarV.a : 0;
        int iMax = Math.max(0, ceaVarV != null ? ceaVarV.b : 0);
        int size2 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i8);
            if (pa7.t(vfh.v((tn8) obj2), "Trailing")) {
                break;
            }
            i8++;
        }
        tn8 tn8Var2 = (tn8) obj2;
        cea ceaVarV2 = tn8Var2 != null ? tn8Var2.v(ll2.j(-i7, 0, 2, jA)) : null;
        int i9 = i7 + (ceaVarV2 != null ? ceaVarV2.a : 0);
        int iMax2 = Math.max(iMax, ceaVarV2 != null ? ceaVarV2.b : 0);
        int size3 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i10);
            if (pa7.t(vfh.v((tn8) obj3), "Prefix")) {
                break;
            }
            i10++;
        }
        tn8 tn8Var3 = (tn8) obj3;
        cea ceaVarV3 = tn8Var3 != null ? tn8Var3.v(ll2.j(-i9, 0, 2, jA)) : null;
        int i11 = (ceaVarV3 != null ? ceaVarV3.a : 0) + i9;
        int iMax3 = Math.max(iMax2, ceaVarV3 != null ? ceaVarV3.b : 0);
        int size4 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i12);
            if (pa7.t(vfh.v((tn8) obj4), "Suffix")) {
                break;
            }
            i12++;
        }
        tn8 tn8Var4 = (tn8) obj4;
        cea ceaVarV4 = tn8Var4 != null ? tn8Var4.v(ll2.j(-i11, 0, 2, jA)) : null;
        int i13 = i11 + (ceaVarV4 != null ? ceaVarV4.a : 0);
        int iMax4 = Math.max(iMax3, ceaVarV4 != null ? ceaVarV4.b : 0);
        int size5 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i14);
            int i15 = size5;
            if (pa7.t(vfh.v((tn8) obj5), "Label")) {
                break;
            }
            i14++;
            size5 = i15;
        }
        tn8 tn8Var5 = (tn8) obj5;
        final mmb mmbVar = new mmb();
        int i16 = -i13;
        mmbVar.element = tn8Var5 != null ? tn8Var5.v(ll2.i(i16, -iD1, jA)) : null;
        int size6 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size6) {
                i = iD1;
                obj6 = null;
                break;
            }
            obj6 = list.get(i17);
            i = iD1;
            if (pa7.t(vfh.v((tn8) obj6), "Supporting")) {
                break;
            }
            i17++;
            iD1 = i;
        }
        tn8 tn8Var6 = (tn8) obj6;
        int iV = tn8Var6 != null ? tn8Var6.V(kl2.j(j)) : 0;
        cea ceaVar3 = (cea) mmbVar.element;
        int i18 = iD0 + (ceaVar3 != null ? ceaVar3.b : 0);
        long jI = ll2.i(i16, ((-i18) - i) - iV, kl2.a(j, 0, 0, 0, 0, 11));
        int size7 = list.size();
        int i19 = 0;
        while (i19 < size7) {
            int i20 = i18;
            tn8 tn8Var7 = (tn8) list.get(i19);
            int i21 = size7;
            float f2 = fInvoke;
            if (pa7.t(vfh.v(tn8Var7), "TextField")) {
                final cea ceaVarV5 = tn8Var7.v(jI);
                long jA2 = kl2.a(jI, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i22);
                    int i23 = size8;
                    int i24 = i22;
                    if (pa7.t(vfh.v((tn8) obj7), "Hint")) {
                        break;
                    }
                    i22 = i24 + 1;
                    size8 = i23;
                }
                tn8 tn8Var8 = (tn8) obj7;
                cea ceaVarV6 = tn8Var8 != null ? tn8Var8.v(jA2) : null;
                int iMax5 = Math.max(iMax4, Math.max(ceaVarV5.b, ceaVarV6 != null ? ceaVarV6.b : 0) + i20 + i);
                int i25 = ceaVarV != null ? ceaVarV.a : 0;
                int i26 = ceaVarV2 != null ? ceaVarV2.a : 0;
                int i27 = ceaVarV3 != null ? ceaVarV3.a : 0;
                int i28 = ceaVarV4 != null ? ceaVarV4.a : 0;
                int i29 = i26;
                int i30 = ceaVarV5.a;
                cea ceaVar4 = (cea) mmbVar.element;
                int i31 = i27 + i28;
                final int iG = ll2.g(Math.max(i30 + i31, Math.max((ceaVarV6 != null ? ceaVarV6.a : 0) + i31, ceaVar4 != null ? ceaVar4.a : 0)) + i25 + i29, j);
                cea ceaVarV7 = tn8Var6 != null ? tn8Var6.v(kl2.a(ll2.j(0, -iMax5, 1, jA), 0, iG, 0, 0, 9)) : null;
                int i32 = ceaVarV7 != null ? ceaVarV7.b : 0;
                int i33 = ceaVarV5.b;
                cea ceaVar5 = (cea) mmbVar.element;
                int i34 = ceaVar5 != null ? ceaVar5.b : 0;
                int i35 = ceaVarV != null ? ceaVarV.b : 0;
                int i36 = ceaVarV2 != null ? ceaVarV2.b : 0;
                int i37 = ceaVarV3 != null ? ceaVarV3.b : 0;
                final cea ceaVar6 = ceaVarV2;
                if (ceaVarV4 != null) {
                    cea ceaVar7 = ceaVarV3;
                    i2 = ceaVarV4.b;
                    ceaVar = ceaVar7;
                } else {
                    ceaVar = ceaVarV3;
                    i2 = 0;
                }
                final cea ceaVar8 = ceaVar;
                if (ceaVarV6 != null) {
                    i3 = ceaVarV6.b;
                    ceaVar2 = ceaVarV;
                } else {
                    ceaVar2 = ceaVarV;
                    i3 = 0;
                }
                if (ceaVarV7 != null) {
                    f = f2;
                    i4 = ceaVarV7.b;
                    i5 = 0;
                } else {
                    f = f2;
                    i4 = 0;
                    i5 = 0;
                }
                final int iF = f(zn8Var, i33, i34, i35, i36, i37, i2, i3, i4, j, f);
                final int i38 = iF - i32;
                int size9 = list.size();
                int i39 = i5;
                while (i39 < size9) {
                    tn8 tn8Var9 = (tn8) list.get(i39);
                    if (pa7.t(vfh.v(tn8Var9), "Container")) {
                        final cea ceaVarV8 = tn8Var9.v(ll2.a(iG != 2147483647 ? iG : i5, iG, i38 != Integer.MAX_VALUE ? i38 : i5, i38));
                        final float f3 = f;
                        final cea ceaVar9 = ceaVarV4;
                        final cea ceaVar10 = ceaVar2;
                        final cea ceaVar11 = ceaVarV6;
                        final cea ceaVar12 = ceaVarV7;
                        return zn8Var.n0(iG, iF, qu4.a, new a26() { // from class: gqe
                            /* JADX WARN: Code duplicated, block: B:20:0x009e  */
                            @Override // defpackage.a26
                            public final Object d(Object obj8) {
                                float f4;
                                float f5;
                                int iD2;
                                int i40;
                                float f6;
                                bea beaVar = (bea) obj8;
                                mmb mmbVar2 = mmbVar;
                                Object obj9 = mmbVar2.element;
                                hqe hqeVar = this;
                                zn8 zn8Var2 = zn8Var;
                                int i41 = iG;
                                int i42 = iF;
                                cea ceaVar13 = ceaVarV5;
                                cea ceaVar14 = ceaVar11;
                                cea ceaVar15 = ceaVar10;
                                cea ceaVar16 = ceaVar6;
                                cea ceaVar17 = ceaVar8;
                                cea ceaVar18 = ceaVar9;
                                cea ceaVar19 = ceaVarV8;
                                cea ceaVar20 = ceaVar12;
                                if (obj9 != null) {
                                    boolean z = hqeVar.a;
                                    int i43 = iD0;
                                    if (z) {
                                        iD2 = Math.round(((i38 - ((cea) obj9).b) / 2.0f) * 1.0f);
                                    } else {
                                        iD2 = zn8Var2.D0(hqeVar.e) + i43;
                                    }
                                    cea ceaVar21 = (cea) mmbVar2.element;
                                    int i44 = ceaVar21.b + i43;
                                    cv7 layoutDirection = zn8Var2.getLayoutDirection();
                                    rpe rpeVar = hqeVar.b;
                                    beaVar.g(ceaVar19, 0, 0, 0.0f);
                                    int i45 = i42 - (ceaVar20 != null ? ceaVar20.b : 0);
                                    if (ceaVar15 != null) {
                                        beaVar.k(ceaVar15, 0, Math.round(((i45 - ceaVar15.b) / 2.0f) * 1.0f), 0.0f);
                                    }
                                    float f7 = f3;
                                    int iQ = abg.Q(f7, iD2, i43);
                                    cv7 cv7Var = cv7.a;
                                    if (layoutDirection == cv7Var) {
                                        if (ceaVar15 != null) {
                                            i40 = ceaVar15.a;
                                        } else {
                                            i40 = 0;
                                        }
                                    } else if (ceaVar16 != null) {
                                        i40 = ceaVar16.a;
                                    } else {
                                        i40 = 0;
                                    }
                                    if (!(rpeVar instanceof rpe)) {
                                        yg5.l(rpeVar, "Unknown position: ");
                                        return null;
                                    }
                                    int i46 = i40;
                                    int iRound = Math.round((1.0f + (layoutDirection == cv7Var ? -1.0f : (-1.0f) * (-1.0f))) * ((((i41 - (ceaVar15 != null ? ceaVar15.a : 0)) - (ceaVar16 != null ? ceaVar16.a : 0)) - ceaVar21.a) / 2.0f)) + i46;
                                    iec.j(rpeVar);
                                    beaVar.g(ceaVar21, abg.Q(f7, iRound, Math.round((1.0f + (layoutDirection == cv7Var ? -1.0f : (-1.0f) * (-1.0f))) * ((((i41 - (ceaVar15 != null ? ceaVar15.a : 0)) - (ceaVar16 != null ? ceaVar16.a : 0)) - ceaVar21.a) / 2.0f)) + i46), iQ, 0.0f);
                                    if (ceaVar17 != null) {
                                        beaVar.k(ceaVar17, ceaVar15 != null ? ceaVar15.a : 0, i44, 0.0f);
                                    }
                                    int i47 = (ceaVar15 != null ? ceaVar15.a : 0) + (ceaVar17 != null ? ceaVar17.a : 0);
                                    beaVar.k(ceaVar13, i47, i44, 0.0f);
                                    if (ceaVar14 != null) {
                                        beaVar.k(ceaVar14, i47, i44, 0.0f);
                                    }
                                    if (ceaVar18 != null) {
                                        beaVar.k(ceaVar18, (i41 - (ceaVar16 != null ? ceaVar16.a : 0)) - ceaVar18.a, i44, 0.0f);
                                    }
                                    if (ceaVar16 != null) {
                                        f6 = 0.0f;
                                        beaVar.k(ceaVar16, i41 - ceaVar16.a, Math.round(((i45 - ceaVar16.b) / 2.0f) * 1.0f), 0.0f);
                                    } else {
                                        f6 = 0.0f;
                                    }
                                    if (ceaVar20 != 0) {
                                        beaVar.k(ceaVar20, 0, i45, f6);
                                    }
                                } else {
                                    float density = zn8Var2.getDensity();
                                    bea.j(beaVar, ceaVar19, 0L);
                                    int i48 = i42 - (ceaVar20 != null ? ceaVar20.b : 0);
                                    int iL = ym8.L(hqeVar.d.d() * density);
                                    if (ceaVar15 != null) {
                                        f4 = 0.0f;
                                        beaVar.k(ceaVar15, 0, Math.round(((i48 - ceaVar15.b) / 2.0f) * 1.0f), 0.0f);
                                    } else {
                                        f4 = 0.0f;
                                    }
                                    if (ceaVar17 != null) {
                                        beaVar.k(ceaVar17, ceaVar15 != null ? ceaVar15.a : 0, hqe.i(hqeVar, i48, iL, ceaVar17), f4);
                                    }
                                    int i49 = (ceaVar15 != null ? ceaVar15.a : 0) + (ceaVar17 != null ? ceaVar17.a : 0);
                                    beaVar.k(ceaVar13, i49, hqe.i(hqeVar, i48, iL, ceaVar13), 0.0f);
                                    if (ceaVar14 != null) {
                                        beaVar.k(ceaVar14, i49, hqe.i(hqeVar, i48, iL, ceaVar14), 0.0f);
                                    }
                                    if (ceaVar18 != null) {
                                        beaVar.k(ceaVar18, (i41 - (ceaVar16 != null ? ceaVar16.a : 0)) - ceaVar18.a, hqe.i(hqeVar, i48, iL, ceaVar18), 0.0f);
                                    }
                                    if (ceaVar16 != null) {
                                        f5 = 0.0f;
                                        beaVar.k(ceaVar16, i41 - ceaVar16.a, Math.round(((i48 - ceaVar16.b) / 2.0f) * 1.0f), 0.0f);
                                    } else {
                                        f5 = 0.0f;
                                    }
                                    if (ceaVar20 != null) {
                                        beaVar.k(ceaVar20, 0, i48, f5);
                                    }
                                }
                                return wef.a;
                            }
                        });
                    }
                    i39++;
                    i38 = i38;
                }
                k88.b("Collection contains no element matching the predicate.");
                oo3.f();
                return null;
            }
            fInvoke = f2;
            i19++;
            size7 = i21;
            i18 = i20;
            ceaVarV = ceaVarV;
        }
        k88.b("Collection contains no element matching the predicate.");
        oo3.f();
        return null;
    }

    @Override // defpackage.xn8
    public final int c(ga7 ga7Var, List list, int i) {
        return h(list, i, new mle(23));
    }

    @Override // defpackage.xn8
    public final int d(ga7 ga7Var, List list, int i) {
        return g(ga7Var, list, i, new mle(26));
    }

    @Override // defpackage.xn8
    public final int e(ga7 ga7Var, List list, int i) {
        return g(ga7Var, list, i, new mle(25));
    }

    public final int f(sw3 sw3Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        xw9 xw9Var = this.d;
        int iD0 = sw3Var.D0(xw9Var.a() + xw9Var.d());
        int[] iArr = {i7, i5, i6, abg.Q(f, i2, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i = Math.max(i, iArr[i9]);
        }
        return ll2.f(Math.max(i3, Math.max(i4, iD0 + (i2 > 0 ? Math.max(sw3Var.D0(this.e * 2.0f), abg.Q(u39.a.b(f), 0, i2)) : 0) + i)) + i8, j);
    }

    public final int g(ga7 ga7Var, List list, int i, l26 l26Var) {
        Object obj;
        int i2;
        int iIntValue;
        int iG0;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int i3;
        Object obj5;
        int i4;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i5);
            if (pa7.t(g21.O((tn8) obj), "Leading")) {
                break;
            }
            i5++;
        }
        tn8 tn8Var = (tn8) obj;
        if (tn8Var != null) {
            i2 = i;
            iG0 = g21.g0(i2, tn8Var.q(Integer.MAX_VALUE));
            iIntValue = ((Number) l26Var.z(tn8Var, Integer.valueOf(i2))).intValue();
        } else {
            i2 = i;
            iIntValue = 0;
            iG0 = i2;
        }
        int size2 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i6);
            if (pa7.t(g21.O((tn8) obj2), "Trailing")) {
                break;
            }
            i6++;
        }
        tn8 tn8Var2 = (tn8) obj2;
        if (tn8Var2 != null) {
            iG0 = g21.g0(iG0, tn8Var2.q(Integer.MAX_VALUE));
            iIntValue2 = ((Number) l26Var.z(tn8Var2, Integer.valueOf(i2))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i7);
            if (pa7.t(g21.O((tn8) obj3), "Label")) {
                break;
            }
            i7++;
        }
        Object obj8 = (tn8) obj3;
        int iIntValue3 = obj8 != null ? ((Number) l26Var.z(obj8, Integer.valueOf(iG0))).intValue() : 0;
        int size4 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i8);
            if (pa7.t(g21.O((tn8) obj4), "Prefix")) {
                break;
            }
            i8++;
        }
        tn8 tn8Var3 = (tn8) obj4;
        if (tn8Var3 != null) {
            int iIntValue4 = ((Number) l26Var.z(tn8Var3, Integer.valueOf(iG0))).intValue();
            iG0 = g21.g0(iG0, tn8Var3.q(Integer.MAX_VALUE));
            i3 = iIntValue4;
        } else {
            i3 = 0;
        }
        int size5 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i9);
            if (pa7.t(g21.O((tn8) obj5), "Suffix")) {
                break;
            }
            i9++;
        }
        tn8 tn8Var4 = (tn8) obj5;
        if (tn8Var4 != null) {
            int iIntValue5 = ((Number) l26Var.z(tn8Var4, Integer.valueOf(iG0))).intValue();
            iG0 = g21.g0(iG0, tn8Var4.q(Integer.MAX_VALUE));
            i4 = iIntValue5;
        } else {
            i4 = 0;
        }
        int size6 = list.size();
        for (int i10 = 0; i10 < size6; i10++) {
            Object obj9 = list.get(i10);
            if (pa7.t(g21.O((tn8) obj9), "TextField")) {
                int iIntValue6 = ((Number) l26Var.z(obj9, Integer.valueOf(iG0))).intValue();
                int size7 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i11);
                    if (pa7.t(g21.O((tn8) obj6), "Hint")) {
                        break;
                    }
                    i11++;
                }
                Object obj10 = (tn8) obj6;
                int iIntValue7 = obj10 != null ? ((Number) l26Var.z(obj10, Integer.valueOf(iG0))).intValue() : 0;
                int size8 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i12);
                    if (pa7.t(g21.O((tn8) obj7), "Supporting")) {
                        break;
                    }
                    i12++;
                }
                Object obj11 = (tn8) obj7;
                return f(ga7Var, iIntValue6, iIntValue3, iIntValue, iIntValue2, i3, i4, iIntValue7, obj11 != null ? ((Number) l26Var.z(obj11, Integer.valueOf(i2))).intValue() : 0, ll2.b(0, 0, 0, 0, 15), this.c.invoke());
            }
        }
        k88.b("Collection contains no element matching the predicate.");
        oo3.f();
        return 0;
    }
}
