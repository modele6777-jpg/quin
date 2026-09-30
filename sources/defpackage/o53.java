package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o53 implements l26 {
    public final /* synthetic */ int a = 5;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ o53(e63 e63Var, x16 x16Var, a26 a26Var, x16 x16Var2, l26 l26Var, a26 a26Var2, a26 a26Var3, int i) {
        this.v = e63Var;
        this.b = x16Var;
        this.c = a26Var;
        this.f = x16Var2;
        this.w = l26Var;
        this.d = a26Var2;
        this.e = a26Var3;
        this.g = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        final cea ceaVar;
        int iD0;
        int iD1;
        h71 h71Var;
        final Integer numValueOf;
        int iIntValue;
        int iD2;
        int iC;
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.g;
        Object obj3 = this.c;
        Object obj4 = this.w;
        Object obj5 = this.f;
        Object obj6 = this.b;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.v;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                x57.n((e63) obj9, (x16) obj6, (a26) obj3, (x16) obj5, (l26) obj4, (a26) obj8, (a26) obj7, (l46) obj, k99.P(i2 | 1));
                return wefVar;
            case 1:
                ((Integer) obj2).getClass();
                al6.a((fl6) obj9, (x16) obj6, (a26) obj3, (a26) obj8, (a26) obj7, (a26) obj4, (x16) obj5, (l46) obj, k99.P(1 | i2));
                return wefVar;
            case 2:
                final g7g g7gVar = (g7g) obj9;
                l26 l26Var = (l26) obj3;
                wdc wdcVar = (wdc) obj8;
                l26 l26Var2 = (l26) obj7;
                final r6e r6eVar = (r6e) obj;
                kl2 kl2Var = (kl2) obj2;
                final int iH = kl2.h(kl2Var.a);
                final int iG = kl2.g(kl2Var.a);
                long jA = kl2.a(kl2Var.a, 0, 0, 0, 0, 10);
                int iD = g7gVar.d(r6eVar, r6eVar.getLayoutDirection());
                int iB = g7gVar.b(r6eVar, r6eVar.getLayoutDirection());
                int iC2 = g7gVar.c(r6eVar);
                final cea ceaVarV = ((tn8) s72.v0(r6eVar.z0((l26) obj4, ydc.a))).v(jA);
                int i3 = (-iD) - iB;
                int i4 = -iC2;
                final cea ceaVarV2 = ((tn8) s72.v0(r6eVar.z0((l26) obj6, ydc.c))).v(ll2.i(i3, i4, jA));
                cea ceaVarV3 = ((tn8) s72.v0(r6eVar.z0((l26) obj5, ydc.d))).v(ll2.i(i3, i4, jA));
                int i5 = ceaVarV3.a;
                if (i5 == 0 && ceaVarV3.b == 0) {
                    ceaVar = ceaVarV3;
                    h71Var = null;
                } else {
                    int i6 = ceaVarV3.b;
                    cv7 cv7Var = cv7.a;
                    if (i2 == 0) {
                        ceaVar = ceaVarV3;
                        if (r6eVar.getLayoutDirection() == cv7Var) {
                            iD0 = r6eVar.D0(16.0f);
                            iD1 = iD0 + iD;
                        } else {
                            iD1 = ((iH - r6eVar.D0(16.0f)) - i5) - iB;
                        }
                    } else {
                        ceaVar = ceaVarV3;
                        if (i2 != 2 && i2 != 3) {
                            iD1 = (((iH - i5) + iD) - iB) / 2;
                        } else if (r6eVar.getLayoutDirection() == cv7Var) {
                            iD1 = ((iH - r6eVar.D0(16.0f)) - i5) - iB;
                        } else {
                            iD0 = r6eVar.D0(16.0f);
                            iD1 = iD0 + iD;
                        }
                    }
                    h71Var = new h71(iD1, i6, 1);
                }
                final cea ceaVarV4 = ((tn8) s72.v0(r6eVar.z0(l26Var, ydc.e))).v(jA);
                int i7 = 0;
                boolean z = ceaVarV4.a == 0 && ceaVarV4.b == 0;
                if (h71Var != null) {
                    int i8 = h71Var.c;
                    if (z || i2 == 3) {
                        iD2 = r6eVar.D0(16.0f) + i8;
                        iC = g7gVar.c(r6eVar);
                    } else {
                        iD2 = ceaVarV4.b + i8;
                        iC = r6eVar.D0(16.0f);
                    }
                    numValueOf = Integer.valueOf(iC + iD2);
                } else {
                    numValueOf = null;
                }
                int i9 = ceaVarV2.b;
                if (i9 != 0) {
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        Integer numValueOf2 = !z ? Integer.valueOf(ceaVarV4.b) : null;
                        iIntValue = numValueOf2 != null ? numValueOf2.intValue() : g7gVar.c(r6eVar);
                    }
                    i7 = iIntValue + i9;
                }
                final int i10 = i7;
                f57 f57Var = new f57(g7gVar, r6eVar);
                wdcVar.a.setValue(new bx9(ynb.B(f57Var, r6eVar.getLayoutDirection()), (ceaVarV.a == 0 && ceaVarV.b == 0) ? f57Var.d() : r6eVar.Z(ceaVarV.b), ynb.A(f57Var, r6eVar.getLayoutDirection()), z ? f57Var.a() : r6eVar.Z(ceaVarV4.b)));
                final cea ceaVarV5 = ((tn8) s72.v0(r6eVar.z0(l26Var2, ydc.b))).v(jA);
                final h71 h71Var2 = h71Var;
                return r6eVar.n0(iH, iG, qu4.a, new a26() { // from class: udc
                    @Override // defpackage.a26
                    public final Object d(Object obj10) {
                        bea beaVar = (bea) obj10;
                        beaVar.g(ceaVarV5, 0, 0, 0.0f);
                        beaVar.g(ceaVarV, 0, 0, 0.0f);
                        cea ceaVar2 = ceaVarV2;
                        int i11 = iH - ceaVar2.a;
                        r6e r6eVar2 = r6eVar;
                        cv7 layoutDirection = r6eVar2.getLayoutDirection();
                        g7g g7gVar2 = g7gVar;
                        int iD3 = ((g7gVar2.d(r6eVar2, layoutDirection) + i11) - g7gVar2.b(r6eVar2, r6eVar2.getLayoutDirection())) / 2;
                        int i12 = iG;
                        beaVar.g(ceaVar2, iD3, i12 - i10, 0.0f);
                        cea ceaVar3 = ceaVarV4;
                        beaVar.g(ceaVar3, 0, i12 - ceaVar3.b, 0.0f);
                        h71 h71Var3 = h71Var2;
                        if (h71Var3 != null) {
                            int i13 = h71Var3.b;
                            Integer num = numValueOf;
                            num.getClass();
                            beaVar.g(ceaVar, i13, i12 - num.intValue(), 0.0f);
                        }
                        return wef.a;
                    }
                });
            case 3:
                ((Integer) obj2).getClass();
                vtb.g((sdd) obj9, (jkc) obj6, (mic) obj5, (egd) obj3, (xw9) obj8, (bx9) obj7, (ft1) obj4, (l46) obj, k99.P(1 | i2));
                return wefVar;
            case 4:
                ((Integer) obj2).getClass();
                b4d.e((j09) obj9, (ju6) obj5, (String) obj3, (String) obj8, (l26) obj4, (l26) obj7, (x16) obj6, (l46) obj, k99.P(i2 | 1));
                return wefVar;
            default:
                ((Integer) obj2).getClass();
                sfc.b((TarotSkinIdentify) obj9, (dmd) obj8, (hmd) obj7, (x16) obj6, (x16) obj5, (x16) obj4, (a26) obj3, (l46) obj, k99.P(i2 | 1));
                return wefVar;
        }
    }

    public /* synthetic */ o53(fl6 fl6Var, x16 x16Var, a26 a26Var, a26 a26Var2, a26 a26Var3, a26 a26Var4, x16 x16Var2, int i) {
        this.v = fl6Var;
        this.b = x16Var;
        this.c = a26Var;
        this.d = a26Var2;
        this.e = a26Var3;
        this.w = a26Var4;
        this.f = x16Var2;
        this.g = i;
    }

    public /* synthetic */ o53(j09 j09Var, ju6 ju6Var, String str, String str2, l26 l26Var, l26 l26Var2, x16 x16Var, int i) {
        this.v = j09Var;
        this.f = ju6Var;
        this.c = str;
        this.d = str2;
        this.w = l26Var;
        this.e = l26Var2;
        this.b = x16Var;
        this.g = i;
    }

    public /* synthetic */ o53(sdd sddVar, jkc jkcVar, mic micVar, egd egdVar, xw9 xw9Var, bx9 bx9Var, ft1 ft1Var, int i) {
        this.v = sddVar;
        this.b = jkcVar;
        this.f = micVar;
        this.c = egdVar;
        this.d = xw9Var;
        this.e = bx9Var;
        this.w = ft1Var;
        this.g = i;
    }

    public /* synthetic */ o53(g7g g7gVar, l26 l26Var, l26 l26Var2, l26 l26Var3, int i, l26 l26Var4, wdc wdcVar, l26 l26Var5) {
        this.v = g7gVar;
        this.w = l26Var;
        this.b = l26Var2;
        this.f = l26Var3;
        this.g = i;
        this.c = l26Var4;
        this.d = wdcVar;
        this.e = l26Var5;
    }

    public /* synthetic */ o53(TarotSkinIdentify tarotSkinIdentify, dmd dmdVar, hmd hmdVar, x16 x16Var, x16 x16Var2, x16 x16Var3, a26 a26Var, int i) {
        this.v = tarotSkinIdentify;
        this.d = dmdVar;
        this.e = hmdVar;
        this.b = x16Var;
        this.f = x16Var2;
        this.w = x16Var3;
        this.c = a26Var;
        this.g = i;
    }
}
