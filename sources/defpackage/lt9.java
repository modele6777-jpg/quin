package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lt9 implements xn8 {
    public final a26 a;
    public final boolean b;
    public final rpe c;
    public final mpe d;
    public final xw9 e;
    public final float f;

    public lt9(a26 a26Var, boolean z, rpe rpeVar, mpe mpeVar, xw9 xw9Var, float f) {
        this.a = a26Var;
        this.b = z;
        this.c = rpeVar;
        this.d = mpeVar;
        this.e = xw9Var;
        this.f = f;
    }

    public static final int j(int i, lt9 lt9Var, int i2, int i3, cea ceaVar, cea ceaVar2) {
        if (lt9Var.b) {
            i3 = Math.round(((i2 - ceaVar2.b) / 2.0f) * 1.0f);
        }
        return Math.max(i + i3, (ceaVar != null ? ceaVar.b : 0) / 2);
    }

    @Override // defpackage.xn8
    public final int a(ga7 ga7Var, List list, int i) {
        return i(ga7Var, list, i, new db9(7));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v17 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.xn8
    public final defpackage.yn8 b(defpackage.zn8 r44, java.util.List r45, long r46) {
        /*
            Method dump skipped, instruction units count: 1133
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lt9.b(zn8, java.util.List, long):yn8");
    }

    @Override // defpackage.xn8
    public final int c(ga7 ga7Var, List list, int i) {
        return i(ga7Var, list, i, new db9(9));
    }

    @Override // defpackage.xn8
    public final int d(ga7 ga7Var, List list, int i) {
        return h(ga7Var, list, i, new db9(8));
    }

    @Override // defpackage.xn8
    public final int e(ga7 ga7Var, List list, int i) {
        return h(ga7Var, list, i, new db9(6));
    }

    public final int f(sw3 sw3Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        int[] iArr = {i7, i3, i4, abg.Q(f, i6, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i5 = Math.max(i5, iArr[i9]);
        }
        xw9 xw9Var = this.e;
        float fP0 = sw3Var.p0(xw9Var.d());
        return ll2.f(Math.max(i, Math.max(i2, ym8.L(abg.P(fP0, Math.max(fP0, i6 / 2.0f), f) + i5 + sw3Var.p0(xw9Var.a())))) + i8, j);
    }

    public final int g(sw3 sw3Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int iMax = Math.max(i5 + i8, Math.max(i7 + i8, abg.Q(f, i6, 0))) + i + i2;
        xw9 xw9Var = this.e;
        cv7 cv7Var = cv7.a;
        return ll2.g(Math.max(iMax, ym8.L((i6 + sw3Var.p0(xw9Var.c(cv7Var) + xw9Var.b(cv7Var))) * f)), j);
    }

    public final int h(ga7 ga7Var, List list, int i, l26 l26Var) {
        Object obj;
        int iG0;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int iIntValue4;
        Object obj6;
        Object obj7;
        lt9 lt9Var = this;
        float fInvoke = lt9Var.d.invoke();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (pa7.t(g21.O((tn8) obj), "Leading")) {
                break;
            }
            i2++;
        }
        tn8 tn8Var = (tn8) obj;
        if (tn8Var != null) {
            iG0 = g21.g0(i, tn8Var.q(Integer.MAX_VALUE));
            iIntValue = ((Number) l26Var.z(tn8Var, Integer.valueOf(i))).intValue();
        } else {
            iG0 = i;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i3);
            if (pa7.t(g21.O((tn8) obj2), "Trailing")) {
                break;
            }
            i3++;
        }
        tn8 tn8Var2 = (tn8) obj2;
        if (tn8Var2 != null) {
            iG0 = g21.g0(iG0, tn8Var2.q(Integer.MAX_VALUE));
            iIntValue2 = ((Number) l26Var.z(tn8Var2, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i4);
            if (pa7.t(g21.O((tn8) obj3), "Label")) {
                break;
            }
            i4++;
        }
        Object obj8 = (tn8) obj3;
        int iIntValue5 = obj8 != null ? ((Number) l26Var.z(obj8, Integer.valueOf(abg.Q(fInvoke, iG0, i)))).intValue() : 0;
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
        if (tn8Var3 != null) {
            iIntValue3 = ((Number) l26Var.z(tn8Var3, Integer.valueOf(iG0))).intValue();
            iG0 = g21.g0(iG0, tn8Var3.q(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
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
        if (tn8Var4 != null) {
            iIntValue4 = ((Number) l26Var.z(tn8Var4, Integer.valueOf(iG0))).intValue();
            iG0 = g21.g0(iG0, tn8Var4.q(Integer.MAX_VALUE));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list.size();
        int i7 = 0;
        while (i7 < size6) {
            Object obj9 = list.get(i7);
            if (pa7.t(g21.O((tn8) obj9), "TextField")) {
                int iIntValue6 = ((Number) l26Var.z(obj9, Integer.valueOf(iG0))).intValue();
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i8);
                    if (pa7.t(g21.O((tn8) obj6), "Hint")) {
                        break;
                    }
                    i8++;
                }
                Object obj10 = (tn8) obj6;
                int iIntValue7 = obj10 != null ? ((Number) l26Var.z(obj10, Integer.valueOf(iG0))).intValue() : 0;
                int size8 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i9);
                    if (pa7.t(g21.O((tn8) obj7), "Supporting")) {
                        break;
                    }
                    i9++;
                }
                Object obj11 = (tn8) obj7;
                return lt9Var.f(ga7Var, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue6, iIntValue5, iIntValue7, obj11 != null ? ((Number) l26Var.z(obj11, Integer.valueOf(i))).intValue() : 0, ll2.b(0, 0, 0, 0, 15), fInvoke);
            }
            i7++;
            iIntValue4 = iIntValue4;
            lt9Var = this;
            iIntValue3 = iIntValue3;
        }
        k88.b("Collection contains no element matching the predicate.");
        oo3.f();
        return 0;
    }

    public final int i(ga7 ga7Var, List list, int i, l26 l26Var) {
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
                    if (pa7.t(g21.O((tn8) obj4), "Leading")) {
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
                    if (pa7.t(g21.O((tn8) obj5), "Prefix")) {
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
                    if (pa7.t(g21.O((tn8) obj6), "Suffix")) {
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
                return g(ga7Var, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, tn8Var6 != null ? ((Number) l26Var.z(tn8Var6, Integer.valueOf(i))).intValue() : 0, ll2.b(0, 0, 0, 0, 15), this.d.invoke());
            }
        }
        k88.b("Collection contains no element matching the predicate.");
        oo3.f();
        return 0;
    }
}
