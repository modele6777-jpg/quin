package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x68 implements xn8 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ x68(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xn8
    public final yn8 b(zn8 zn8Var, List list, long j) {
        int i;
        Float fValueOf;
        int iMax;
        int iMax2;
        int i2;
        int i3;
        int iL;
        int i4 = this.a;
        qu4 qu4Var = qu4.a;
        switch (i4) {
            case 0:
                return zn8Var.n0(kl2.h(j), kl2.g(j), qu4Var, new so5(27, list, this));
            default:
                gpd gpdVar = (gpd) this.b;
                int i5 = gpdVar.a;
                float[] fArr = gpdVar.f;
                ks9 ks9Var = gpdVar.l;
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    tn8 tn8Var = (tn8) list.get(i6);
                    if (vfh.v(tn8Var) == qod.a) {
                        final cea ceaVarV = tn8Var.v(j);
                        int size2 = list.size();
                        for (int i7 = 0; i7 < size2; i7++) {
                            tn8 tn8Var2 = (tn8) list.get(i7);
                            if (vfh.v(tn8Var2) == qod.b) {
                                int i8 = 1;
                                ks9 ks9Var2 = ks9.a;
                                cea ceaVarV2 = ks9Var == ks9Var2 ? tn8Var2.v(kl2.a(ll2.j(0, -ceaVarV.b, 1, j), 0, 0, 0, 0, 14)) : tn8Var2.v(kl2.a(ll2.j(-ceaVarV.a, 0, 2, j), 0, 0, 0, 0, 11));
                                final kmb kmbVar = new kmb();
                                float fC = gpdVar.c();
                                fArr.getClass();
                                if (fArr.length == 0) {
                                    fValueOf = null;
                                    i = 0;
                                } else {
                                    i = 0;
                                    fValueOf = Float.valueOf(fArr[0]);
                                }
                                if (!pa7.s(fC, fValueOf) && !pa7.s(fC, qd0.v0(fArr))) {
                                    i8 = i;
                                }
                                int iW = ceaVarV2.W(epd.f);
                                if (iW != Integer.MIN_VALUE) {
                                    i = iW;
                                }
                                if (ks9Var == ks9Var2) {
                                    iMax = Math.max(ceaVarV2.a, ceaVarV.a);
                                    int i9 = ceaVarV.b;
                                    int i10 = ceaVarV2.b;
                                    iMax2 = i9 + i10;
                                    i2 = (iMax - ceaVarV2.a) / 2;
                                    i3 = i9 / 2;
                                    iL = (iMax - ceaVarV.a) / 2;
                                    kmbVar.element = (i5 <= 0 || i8 != 0) ? ym8.L(i10 * fC) : ym8.L((i10 - (i * 2)) * fC) + i;
                                } else {
                                    iMax = ceaVarV.a + ceaVarV2.a;
                                    iMax2 = Math.max(ceaVarV2.b, ceaVarV.b);
                                    i2 = ceaVarV.a / 2;
                                    i3 = (iMax2 - ceaVarV2.b) / 2;
                                    iL = (i5 <= 0 || i8 != 0) ? ym8.L(ceaVarV2.a * fC) : ym8.L((ceaVarV2.a - (i * 2)) * fC) + i;
                                    kmbVar.element = (iMax2 - ceaVarV.b) / 2;
                                }
                                final int i11 = i3;
                                final int i12 = i2;
                                final int i13 = iL;
                                gpdVar.g.k(iMax);
                                gpdVar.h.k(iMax2);
                                final cea ceaVar = ceaVarV2;
                                return zn8Var.n0(iMax, iMax2, qu4Var, new a26() { // from class: apd
                                    @Override // defpackage.a26
                                    public final Object d(Object obj) {
                                        bea beaVar = (bea) obj;
                                        beaVar.k(ceaVar, i12, i11, 0.0f);
                                        beaVar.k(ceaVarV, i13, kmbVar.element, 0.0f);
                                        return wef.a;
                                    }
                                });
                            }
                        }
                        k88.b("Collection contains no element matching the predicate.");
                        oo3.f();
                        return null;
                    }
                }
                k88.b("Collection contains no element matching the predicate.");
                oo3.f();
                return null;
        }
    }
}
