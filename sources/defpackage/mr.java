package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mr implements xn8 {
    public static final mr b = new mr(0);
    public static final mr c = new mr(1);
    public static final mr d = new mr(2);
    public static final mr e = new mr(3);
    public static final mr f = new mr(4);
    public static final mr g = new mr(5);
    public static final hl4 h = new hl4(10);
    public static final mr i = new mr(6);
    public static final mr j = new mr(7);
    public static final mr k = new mr(8);
    public static final mr l = new mr(9);
    public static final mr m = new mr(10);
    public final /* synthetic */ int a;

    public /* synthetic */ mr(int i2) {
        this.a = i2;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x011d A[PHI: r6 r7
  0x011d: PHI (r6v24 int) = (r6v23 int), (r6v29 int), (r6v29 int) binds: [B:68:0x0137, B:61:0x0111, B:63:0x0117] A[DONT_GENERATE, DONT_INLINE]
  0x011d: PHI (r7v24 int) = (r7v23 int), (r7v29 int), (r7v29 int) binds: [B:68:0x0137, B:61:0x0111, B:63:0x0117] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.xn8
    public final yn8 b(zn8 zn8Var, List list, long j2) {
        Object obj;
        Object obj2;
        int iD0;
        int iMax;
        int i2;
        int iW;
        int i3 = this.a;
        int i4 = 6;
        qu4 qu4Var = qu4.a;
        switch (i3) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int iJ = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < size; i6++) {
                    cea ceaVarV = ((tn8) list.get(i6)).v(j2);
                    iJ = Math.max(iJ, ceaVarV.a);
                    i5 = Math.max(i5, ceaVarV.b);
                    arrayList.add(ceaVarV);
                }
                if (list.isEmpty()) {
                    iJ = kl2.j(j2);
                    i5 = kl2.i(j2);
                }
                return zn8Var.n0(iJ, i5, qu4Var, new lr(0, arrayList));
            case 1:
                int size2 = list.size();
                if (size2 == 0) {
                    return zn8Var.n0(0, 0, qu4Var, v8.v);
                }
                if (size2 == 1) {
                    cea ceaVarV2 = ((tn8) list.get(0)).v(j2);
                    return zn8Var.n0(ceaVarV2.a, ceaVarV2.b, qu4Var, new x(i4, ceaVarV2));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax2 = 0;
                int iMax3 = 0;
                for (int i7 = 0; i7 < size3; i7++) {
                    cea ceaVarV3 = ((tn8) list.get(i7)).v(j2);
                    iMax2 = Math.max(iMax2, ceaVarV3.a);
                    iMax3 = Math.max(iMax3, ceaVarV3.b);
                    arrayList2.add(ceaVarV3);
                }
                return zn8Var.n0(iMax2, iMax3, qu4Var, new x(7, arrayList2));
            case 2:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size4 = list.size();
                for (int i8 = 0; i8 < size4; i8++) {
                    arrayList3.add(((tn8) list.get(i8)).v(j2));
                }
                return zn8Var.n0(kl2.h(j2), kl2.g(j2), qu4Var, new lr(1, arrayList3));
            case 3:
                list.getClass();
                tn8 tn8Var = (tn8) list.get(0);
                tn8 tn8Var2 = (tn8) list.get(1);
                int iN = tn8Var.n(kl2.g(j2));
                cea ceaVarV4 = tn8Var2.v(ll2.j(-iN, 0, 2, j2));
                int i9 = ceaVarV4.a + iN;
                int i10 = ceaVarV4.b;
                return zn8Var.n0(i9, i10, qu4Var, new g01(tn8Var.v(kl2.a(j2, 0, iN, i10, i10, 1)), ceaVarV4, iN, 0));
            case 4:
                return zn8Var.n0(kl2.j(j2), kl2.i(j2), qu4Var, new wu0(6));
            case 5:
                return zn8Var.n0(kl2.h(j2), kl2.g(j2), qu4Var, h);
            case 6:
                return zn8Var.n0(kl2.j(j2), kl2.i(j2), qu4Var, new tk6(17));
            case 7:
                ArrayList arrayList4 = new ArrayList(list.size());
                int size5 = list.size();
                int iMax4 = 0;
                int iMax5 = 0;
                for (int i11 = 0; i11 < size5; i11++) {
                    cea ceaVarV5 = ((tn8) list.get(i11)).v(j2);
                    iMax4 = Math.max(iMax4, ceaVarV5.a);
                    iMax5 = Math.max(iMax5, ceaVarV5.b);
                    arrayList4.add(ceaVarV5);
                }
                return zn8Var.n0(iMax4, iMax5, qu4Var, new lr(6, arrayList4));
            case 8:
                return zn8Var.n0(kl2.f(j2) ? kl2.h(j2) : 0, kl2.e(j2) ? kl2.g(j2) : 0, qu4Var, new znd(2));
            case 9:
                int i12 = 2;
                list.getClass();
                ArrayList arrayList5 = new ArrayList(t72.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList5.add(((tn8) it.next()).v(j2));
                }
                int iH = kl2.h(j2);
                int iG = kl2.g(j2);
                return zn8Var.n0(iH, iG, qu4Var, new rp4(arrayList5, iH, iG, i12));
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return zn8Var.n0(kl2.j(j2), kl2.i(j2), qu4Var, new k8f(23));
            default:
                int iMin = Math.min(kl2.h(j2), zn8Var.D0(600.0f));
                int size6 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size6) {
                        obj = list.get(i13);
                        if (!pa7.t(vfh.v((tn8) obj), "action")) {
                            i13++;
                        }
                    } else {
                        obj = null;
                    }
                }
                tn8 tn8Var3 = (tn8) obj;
                cea ceaVarV6 = tn8Var3 != null ? tn8Var3.v(j2) : null;
                int size7 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 < size7) {
                        obj2 = list.get(i14);
                        if (!pa7.t(vfh.v((tn8) obj2), "dismissAction")) {
                            i14++;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                tn8 tn8Var4 = (tn8) obj2;
                cea ceaVarV7 = tn8Var4 != null ? tn8Var4.v(j2) : null;
                int i15 = ceaVarV6 != null ? ceaVarV6.a : 0;
                int i16 = ceaVarV6 != null ? ceaVarV6.b : 0;
                int i17 = ceaVarV7 != null ? ceaVarV7.a : 0;
                int i18 = ceaVarV7 != null ? ceaVarV7.b : 0;
                int iD1 = ((iMin - i15) - i17) - (i17 == 0 ? zn8Var.D0(8.0f) : 0);
                int iJ2 = kl2.j(j2);
                if (iD1 < iJ2) {
                    iD1 = iJ2;
                }
                int size8 = list.size();
                int i19 = 0;
                while (i19 < size8) {
                    tn8 tn8Var5 = (tn8) list.get(i19);
                    int i20 = i16;
                    if (pa7.t(vfh.v(tn8Var5), "text")) {
                        int i21 = i18;
                        final cea ceaVarV8 = tn8Var5.v(kl2.a(j2, 0, iD1, 0, 0, 9));
                        oq6 oq6Var = cj.a;
                        int iW2 = ceaVarV8.W(oq6Var);
                        int iW3 = ceaVarV8.W(cj.b);
                        boolean z = iW2 == iW3 || !(iW2 != Integer.MIN_VALUE && iW3 != Integer.MIN_VALUE);
                        final int i22 = iMin - i17;
                        final int i23 = i22 - i15;
                        if (z) {
                            iMax = Math.max(zn8Var.D0(bm8.M), Math.max(i20, i21));
                            iD0 = (iMax - ceaVarV8.b) / 2;
                            if (ceaVarV6 == null || (iW = ceaVarV6.W(oq6Var)) == Integer.MIN_VALUE) {
                                i2 = 0;
                            } else {
                                i2 = (iW2 + iD0) - iW;
                            }
                        } else {
                            iD0 = zn8Var.D0(30.0f) - iW2;
                            iMax = Math.max(zn8Var.D0(bm8.N), ceaVarV8.b + iD0);
                            if (ceaVarV6 != null) {
                                i2 = (iMax - ceaVarV6.b) / 2;
                            } else {
                                i2 = 0;
                            }
                        }
                        final int i24 = i2;
                        final int i25 = iD0;
                        final int i26 = ceaVarV7 != null ? (iMax - ceaVarV7.b) / 2 : 0;
                        final cea ceaVar = ceaVarV6;
                        final cea ceaVar2 = ceaVarV7;
                        return zn8Var.n0(iMin, iMax, qu4Var, new a26() { // from class: qqd
                            @Override // defpackage.a26
                            public final Object d(Object obj3) {
                                bea beaVar = (bea) obj3;
                                beaVar.k(ceaVarV8, 0, i25, 0.0f);
                                cea ceaVar3 = ceaVar2;
                                if (ceaVar3 != null) {
                                    beaVar.k(ceaVar3, i22, i26, 0.0f);
                                }
                                cea ceaVar4 = ceaVar;
                                if (ceaVar4 != null) {
                                    beaVar.k(ceaVar4, i23, i24, 0.0f);
                                }
                                return wef.a;
                            }
                        });
                    }
                    i19++;
                    i16 = i20;
                    i18 = i18;
                }
                k88.b("Collection contains no element matching the predicate.");
                oo3.f();
                return null;
        }
    }
}
