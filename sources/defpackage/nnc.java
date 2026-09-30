package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nnc implements xn8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ nnc(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.xn8
    public final yn8 b(zn8 zn8Var, List list, long j) {
        int i = this.a;
        qu4 qu4Var = qu4.a;
        int i2 = this.b;
        list.getClass();
        switch (i) {
            case 0:
                long jA = kl2.a(j, 0, 0, 0, 0, 10);
                List listC1 = s72.c1(list, i2);
                final ArrayList arrayList = new ArrayList(t72.u(listC1, 10));
                Iterator it = listC1.iterator();
                while (it.hasNext()) {
                    arrayList.add(((tn8) it.next()).v(jA));
                }
                tn8 tn8Var = (tn8) s72.y0(i2, list);
                final cea ceaVarV = tn8Var != null ? tn8Var.v(jA) : null;
                final int iH = kl2.h(j);
                final float fP0 = zn8Var.p0(onc.b);
                final float fP1 = zn8Var.p0(onc.c);
                final float f = iH / 2.0f;
                final float fP2 = zn8Var.p0(onc.d);
                float fP3 = zn8Var.p0(onc.e) + (ceaVarV != null ? ceaVarV.b : 0) + fP2;
                float f2 = onc.g;
                final float fP4 = (zn8Var.p0(f2) / 2.0f) + fP3 + fP1;
                final int i3 = 0;
                return zn8Var.n0(iH, Math.max(kl2.i(j), (int) (zn8Var.p0(onc.j) + (zn8Var.p0(f2) / 2.0f) + fP4 + fP1)), qu4Var, new a26() { // from class: mnc
                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        int i4 = i3;
                        wef wefVar = wef.a;
                        int i5 = 0;
                        float f3 = fP1;
                        float f4 = fP4;
                        float f5 = fP0;
                        float f6 = f;
                        float f7 = fP2;
                        int i6 = iH;
                        ArrayList arrayList2 = arrayList;
                        cea ceaVar = ceaVarV;
                        bea beaVar = (bea) obj;
                        switch (i4) {
                            case 0:
                                beaVar.getClass();
                                if (ceaVar != null) {
                                    beaVar.k(ceaVar, (int) ((i6 - ceaVar.a) / 2.0f), (int) f7, 0.0f);
                                }
                                for (Object obj2 : arrayList2) {
                                    int i7 = i5 + 1;
                                    if (i5 < 0) {
                                        t72.Z();
                                        throw null;
                                    }
                                    cea ceaVar2 = (cea) obj2;
                                    iy9 iy9Var = (iy9) onc.a.get(i5);
                                    beaVar.k(ceaVar2, (int) (((((Number) iy9Var.a()).floatValue() * f5) + f6) - (ceaVar2.a / 2.0f)), (int) (((((Number) iy9Var.b()).floatValue() * f3) + f4) - (ceaVar2.b / 2.0f)), 0.0f);
                                    i5 = i7;
                                }
                                return wefVar;
                            default:
                                beaVar.getClass();
                                if (ceaVar != null) {
                                    beaVar.k(ceaVar, (int) ((i6 - ceaVar.a) / 2.0f), (int) f7, 0.0f);
                                }
                                for (Object obj3 : arrayList2) {
                                    int i8 = i5 + 1;
                                    if (i5 < 0) {
                                        t72.Z();
                                        throw null;
                                    }
                                    cea ceaVar3 = (cea) obj3;
                                    iy9 iy9Var2 = (iy9) zrc.a.get(i5);
                                    beaVar.k(ceaVar3, (int) (((((Number) iy9Var2.a()).floatValue() * f5) + f6) - (ceaVar3.a / 2.0f)), (int) (((((Number) iy9Var2.b()).floatValue() * f3) + f4) - (ceaVar3.b / 2.0f)), 0.0f);
                                    i5 = i8;
                                }
                                return wefVar;
                        }
                    }
                });
            default:
                long jA2 = kl2.a(j, 0, 0, 0, 0, 10);
                List listC2 = s72.c1(list, i2);
                final ArrayList arrayList2 = new ArrayList(t72.u(listC2, 10));
                Iterator it2 = listC2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((tn8) it2.next()).v(jA2));
                }
                tn8 tn8Var2 = (tn8) s72.y0(i2, list);
                final cea ceaVarV2 = tn8Var2 != null ? tn8Var2.v(jA2) : null;
                final int iH2 = kl2.h(j);
                final float fP5 = zn8Var.p0(zrc.b);
                final float fP6 = zn8Var.p0(zrc.c);
                final float f3 = iH2 / 2.0f;
                final float fP7 = zn8Var.p0(zrc.d);
                float fP8 = zn8Var.p0(zrc.e) + fP7 + (ceaVarV2 != null ? ceaVarV2.b : 0);
                float fP9 = zn8Var.p0(zrc.g + zrc.n);
                final float f4 = (fP9 / 2.0f) + fP8 + fP6;
                cea ceaVar = (cea) s72.y0(1, arrayList2);
                final int i4 = 1;
                return zn8Var.n0(iH2, Math.max(kl2.i(j), (int) (zn8Var.p0(zrc.k) + ((ceaVar != null ? ceaVar.b : (int) fP9) / 2.0f) + f4 + fP6)), qu4Var, new a26() { // from class: mnc
                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        int i5 = i4;
                        wef wefVar = wef.a;
                        int i6 = 0;
                        float f5 = fP6;
                        float f6 = f4;
                        float f7 = fP5;
                        float f8 = f3;
                        float f9 = fP7;
                        int i7 = iH2;
                        ArrayList arrayList3 = arrayList2;
                        cea ceaVar2 = ceaVarV2;
                        bea beaVar = (bea) obj;
                        switch (i5) {
                            case 0:
                                beaVar.getClass();
                                if (ceaVar2 != null) {
                                    beaVar.k(ceaVar2, (int) ((i7 - ceaVar2.a) / 2.0f), (int) f9, 0.0f);
                                }
                                for (Object obj2 : arrayList3) {
                                    int i8 = i6 + 1;
                                    if (i6 < 0) {
                                        t72.Z();
                                        throw null;
                                    }
                                    cea ceaVar3 = (cea) obj2;
                                    iy9 iy9Var = (iy9) onc.a.get(i6);
                                    beaVar.k(ceaVar3, (int) (((((Number) iy9Var.a()).floatValue() * f7) + f8) - (ceaVar3.a / 2.0f)), (int) (((((Number) iy9Var.b()).floatValue() * f5) + f6) - (ceaVar3.b / 2.0f)), 0.0f);
                                    i6 = i8;
                                }
                                return wefVar;
                            default:
                                beaVar.getClass();
                                if (ceaVar2 != null) {
                                    beaVar.k(ceaVar2, (int) ((i7 - ceaVar2.a) / 2.0f), (int) f9, 0.0f);
                                }
                                for (Object obj3 : arrayList3) {
                                    int i9 = i6 + 1;
                                    if (i6 < 0) {
                                        t72.Z();
                                        throw null;
                                    }
                                    cea ceaVar4 = (cea) obj3;
                                    iy9 iy9Var2 = (iy9) zrc.a.get(i6);
                                    beaVar.k(ceaVar4, (int) (((((Number) iy9Var2.a()).floatValue() * f7) + f8) - (ceaVar4.a / 2.0f)), (int) (((((Number) iy9Var2.b()).floatValue() * f5) + f6) - (ceaVar4.b / 2.0f)), 0.0f);
                                    i6 = i9;
                                }
                                return wefVar;
                        }
                    }
                });
        }
    }
}
