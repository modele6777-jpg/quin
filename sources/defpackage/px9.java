package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class px9 implements tz7 {
    public final /* synthetic */ yx9 a;
    public final /* synthetic */ xw9 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ fx9 d;
    public final /* synthetic */ x16 e;
    public final /* synthetic */ x16 f;
    public final /* synthetic */ kx0 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ frd i;
    public final /* synthetic */ aw2 j;

    public px9(yx9 yx9Var, xw9 xw9Var, float f, fx9 fx9Var, sn7 sn7Var, x16 x16Var, kx0 kx0Var, int i, frd frdVar, aw2 aw2Var) {
        this.a = yx9Var;
        this.b = xw9Var;
        this.c = f;
        this.d = fx9Var;
        this.e = sn7Var;
        this.f = x16Var;
        this.g = kx0Var;
        this.h = i;
        this.i = frdVar;
        this.j = aw2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r17v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r18v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v13 */
    /* JADX WARN: Type inference failed for: r23v14 */
    /* JADX WARN: Type inference failed for: r23v15 */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r53v10 */
    /* JADX WARN: Type inference failed for: r53v8 */
    /* JADX WARN: Type inference failed for: r53v9 */
    @Override // defpackage.tz7
    public final yn8 a(uz7 uz7Var, long j) {
        kx0 kx0Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ao8 ao8Var;
        int i8;
        ad0 ad0Var;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        ao8 ao8Var2;
        ArrayList arrayList;
        int i14;
        int i15;
        pu4 pu4Var;
        int i16;
        List arrayList2;
        int i17;
        int i18;
        boolean z;
        ad0 ad0Var2;
        r6e r6eVar;
        ArrayList arrayList3;
        ?? arrayList4;
        ?? arrayList5;
        ?? r53;
        ?? r23;
        int i19;
        int i20;
        int i21;
        frd frdVar;
        ArrayList arrayList6;
        int i22;
        Object obj;
        qx9 qx9Var;
        uz7 uz7Var2;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int i23;
        int i24;
        int i25;
        boolean z2;
        px9 px9Var = this;
        yx9 yx9Var = px9Var.a;
        yx9Var.B.getValue();
        ks9 ks9Var = ks9.b;
        y41.e(j, ks9Var);
        r6e r6eVar2 = uz7Var.b;
        cv7 layoutDirection = r6eVar2.getLayoutDirection();
        xw9 xw9Var = px9Var.b;
        int iD0 = r6eVar2.D0(ynb.B(xw9Var, layoutDirection));
        int iD1 = r6eVar2.D0(ynb.A(xw9Var, r6eVar2.getLayoutDirection()));
        int iD2 = r6eVar2.D0(xw9Var.d());
        int iD3 = r6eVar2.D0(xw9Var.a()) + iD2;
        int i26 = iD1 + iD0;
        int i27 = i26 - iD0;
        long jI = ll2.i(-i26, -iD3, j);
        yx9Var.n = uz7Var;
        int iD4 = r6eVar2.D0(px9Var.c);
        int iH = kl2.h(j) - i26;
        int i28 = iD3;
        int i29 = i26;
        long j2 = (((long) iD0) << 32) | (((long) iD2) & 4294967295L);
        int iL = px9Var.d.l(uz7Var, iH);
        if (iL < 0) {
            iL = 0;
        }
        ll2.b(0, iL, 0, kl2.g(jI), 5);
        ox9 ox9Var = (ox9) px9Var.e.invoke();
        int i30 = iH + iD0 + i27;
        frd frdVar2 = px9Var.i;
        ird irdVarJ = iqf.j();
        long j3 = jI;
        a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
        ird irdVarL = iqf.l(irdVarJ);
        try {
            hzc hzcVar = yx9Var.d;
            int i31 = iH;
            int iJ = ((sz9) hzcVar.c).j();
            r6e r6eVar3 = r6eVar2;
            int I = db6.I(ox9Var, hzcVar.e, iJ);
            if (iJ != I) {
                ((sz9) hzcVar.c).k(I);
                ((wz7) hzcVar.f).c(iJ);
            }
            ((sz9) hzcVar.c).j();
            float fJ = ((qz9) hzcVar.d).j();
            yx9Var.l();
            int i32 = iL + iD4;
            int iL2 = ym8.L(frdVar2.g(i30, iL, iD0, i27) - (fJ * i32));
            iqf.p(irdVarJ, irdVarL, a26VarE);
            p69 p69VarJ = mh3.j(ox9Var, yx9Var.z, yx9Var.v);
            q69 q69Var = v67.a;
            q69 q69Var2 = new q69();
            int iIntValue = ((Number) px9Var.f.invoke()).intValue();
            e89 e89Var = yx9Var.A;
            if (iD0 < 0) {
                l37.a("negative beforeContentPadding");
            }
            if (i27 < 0) {
                l37.a("negative afterContentPadding");
            }
            int i33 = i32 < 0 ? 0 : i32;
            int i34 = px9Var.h;
            if (i34 > iIntValue) {
                i34 = iIntValue;
            }
            ox9 ox9Var2 = ox9Var;
            int i35 = iL2;
            long jB = ll2.b(0, iL, 0, kl2.g(j3), 5);
            qu4 qu4Var = qu4.a;
            frd frdVar3 = px9Var.i;
            int i36 = i33;
            aw2 aw2Var = px9Var.j;
            if (iIntValue <= 0) {
                qx9Var = new qx9(iL, iD4, i27, -iD0, i31 + i27, i34, frdVar3, r6eVar3.n0(ll2.g(kl2.j(j3) + i29, j), ll2.f(kl2.i(j3) + i28, j), qu4Var, new xn9(25)), aw2Var, uz7Var, jB);
                uz7Var2 = uz7Var;
            } else {
                long j4 = jB;
                int i37 = i30;
                int i38 = i34;
                int i39 = iIntValue;
                long j5 = j2;
                int i40 = iL;
                int i41 = I;
                while (i41 > 0 && i35 > 0) {
                    i41--;
                    i35 -= i36;
                }
                int i42 = i35 * (-1);
                if (i41 >= i39) {
                    i41 = i39 - 1;
                    i42 = 0;
                }
                ad0 ad0Var3 = new ad0();
                int i43 = -iD0;
                int i44 = i43 + (iD4 < 0 ? iD4 : 0);
                int i45 = i42 + i44;
                e89 e89Var2 = e89Var;
                int iMax = 0;
                while (true) {
                    kx0Var = px9Var.g;
                    if (i45 >= 0 || i41 <= 0) {
                        break;
                    }
                    int i46 = i41 - 1;
                    int i47 = i45;
                    q69 q69Var3 = q69Var2;
                    int i48 = i40;
                    int i49 = i38;
                    long j6 = j5;
                    ao8 ao8VarB = qk2.B(uz7Var, i46, j4, ox9Var2, j6, kx0Var, r6eVar3.getLayoutDirection(), i48, q69Var3);
                    i40 = i48;
                    q69Var2 = q69Var3;
                    ad0Var3.add(0, ao8VarB);
                    iMax = Math.max(iMax, ao8VarB.h);
                    i45 = i47 + i36;
                    px9Var = this;
                    i41 = i46;
                    j5 = j6;
                    p69VarJ = p69VarJ;
                    i28 = i28;
                    i29 = i29;
                    iD0 = iD0;
                    i39 = i39;
                    j3 = j3;
                    i37 = i37;
                    e89Var2 = e89Var2;
                    i38 = i49;
                    qu4Var = qu4Var;
                    frdVar3 = frdVar3;
                }
                int i50 = i37;
                qu4 qu4Var2 = qu4Var;
                int i51 = i38;
                frd frdVar4 = frdVar3;
                int i52 = i45;
                e89 e89Var3 = e89Var2;
                long j7 = j3;
                long j8 = j5;
                int i53 = i39;
                int i54 = iD0;
                int i55 = i29;
                int i56 = i28;
                p69 p69Var = p69VarJ;
                int i57 = i36;
                int i58 = (i52 < i44 ? i44 : i52) - i44;
                int i59 = i31 + i27;
                int i60 = i59 < 0 ? 0 : i59;
                int i61 = -i58;
                int i62 = i41;
                boolean z3 = false;
                int i63 = 0;
                while (i63 < ad0Var3.c) {
                    if (i61 >= i60) {
                        ad0Var3.d(i63);
                        i24 = i63;
                        i25 = i61;
                        z2 = true;
                    } else {
                        i62++;
                        i24 = i63 + 1;
                        i25 = i61 + i57;
                        z2 = z3;
                    }
                    z3 = z2;
                    i61 = i25;
                    i63 = i24;
                }
                int iMax2 = iMax;
                int i64 = i53;
                boolean z4 = z3;
                int i65 = i41;
                int i66 = i58;
                int i67 = i61;
                int i68 = i62;
                while (i68 < i64 && (i67 < i60 || i67 <= 0 || ad0Var3.isEmpty())) {
                    int i69 = i65;
                    int i70 = i57;
                    ox9 ox9Var3 = ox9Var2;
                    int i71 = i60;
                    int i72 = iMax2;
                    int i73 = i64;
                    long j9 = j4;
                    ao8 ao8VarB2 = qk2.B(uz7Var, i68, j9, ox9Var3, j8, kx0Var, r6eVar3.getLayoutDirection(), i40, q69Var2);
                    int i74 = i68;
                    int i75 = i73 - 1;
                    i67 += i74 == i75 ? i40 : i70;
                    if (i67 > i44 || i74 == i75) {
                        int iMax3 = Math.max(i72, ao8VarB2.h);
                        ad0Var3.addLast(ao8VarB2);
                        i72 = iMax3;
                        i23 = i69;
                    } else {
                        i23 = i74 + 1;
                        i66 -= i70;
                        z4 = true;
                    }
                    j4 = j9;
                    iMax2 = i72;
                    i64 = i73;
                    i57 = i70;
                    i65 = i23;
                    i68 = i74 + 1;
                    i60 = i71;
                    ox9Var2 = ox9Var3;
                }
                if (i67 < i31) {
                    int i76 = i31 - i67;
                    int i77 = i66 - i76;
                    int i78 = i67 + i76;
                    i2 = i54;
                    i5 = i65;
                    int i79 = i77;
                    while (i79 < i2 && i5 > 0) {
                        i5--;
                        int i80 = i79;
                        ao8 ao8VarB3 = qk2.B(uz7Var, i5, j4, ox9Var2, j8, kx0Var, r6eVar3.getLayoutDirection(), i40, q69Var2);
                        ad0Var3.add(0, ao8VarB3);
                        iMax2 = Math.max(iMax2, ao8VarB3.h);
                        i79 = i80 + i57;
                        i68 = i68;
                    }
                    i = i68;
                    int i81 = i79;
                    if (i81 < 0) {
                        i3 = i78 + i81;
                        i4 = 0;
                    } else {
                        i3 = i78;
                        i4 = i81;
                    }
                } else {
                    i = i68;
                    int i82 = i67;
                    i2 = i54;
                    i3 = i82;
                    i4 = i66;
                    i5 = i65;
                }
                if (i4 < 0) {
                    l37.a("invalid currentFirstPageScrollOffset");
                }
                int i83 = iMax2;
                int i84 = -i4;
                ao8 ao8Var3 = (ao8) ad0Var3.first();
                if (i2 > 0 || iD4 < 0) {
                    int iC = ad0Var3.c();
                    ao8 ao8Var4 = ao8Var3;
                    int i85 = 0;
                    while (true) {
                        if (i85 >= iC || i4 == 0) {
                            i6 = i2;
                            i7 = i57;
                            break;
                        }
                        i6 = i2;
                        i7 = i57;
                        if (i7 > i4) {
                            break;
                        }
                        int i86 = iC;
                        if (i85 == ad0Var3.c() - 1) {
                            break;
                        }
                        i4 -= i7;
                        i85++;
                        ao8Var4 = (ao8) ad0Var3.get(i85);
                        i57 = i7;
                        i2 = i6;
                        iC = i86;
                    }
                    ao8Var = ao8Var4;
                } else {
                    i6 = i2;
                    ao8Var = ao8Var3;
                    i7 = i57;
                }
                int i87 = i4;
                int iMax4 = Math.max(0, i5 - i51);
                int i88 = i5 - 1;
                if (iMax4 <= i88) {
                    int i89 = iMax4;
                    int i90 = i88;
                    ArrayList arrayList9 = null;
                    while (true) {
                        if (arrayList9 == null) {
                            arrayList9 = new ArrayList();
                        }
                        ad0 ad0Var4 = ad0Var3;
                        arrayList8 = arrayList9;
                        i9 = i31;
                        i12 = i89;
                        ad0Var = ad0Var4;
                        i8 = i7;
                        i10 = i3;
                        i11 = i51;
                        i13 = i84;
                        ao8Var2 = ao8Var;
                        arrayList8.add(qk2.B(uz7Var, i90, j4, ox9Var2, j8, kx0Var, r6eVar3.getLayoutDirection(), i40, q69Var2));
                        if (i90 == i12) {
                            break;
                        }
                        i90--;
                        i51 = i11;
                        ao8Var = ao8Var2;
                        arrayList9 = arrayList8;
                        ad0Var3 = ad0Var;
                        i84 = i13;
                        i7 = i8;
                        i3 = i10;
                        i89 = i12;
                        i31 = i9;
                    }
                    arrayList = arrayList8;
                } else {
                    i8 = i7;
                    ad0Var = ad0Var3;
                    i9 = i31;
                    i10 = i3;
                    i11 = i51;
                    i12 = iMax4;
                    i13 = i84;
                    ao8Var2 = ao8Var;
                    arrayList = null;
                }
                int[] iArr = p69Var.a;
                int i91 = p69Var.b;
                ao8 ao8Var5 = ao8Var2;
                int i92 = 0;
                while (i92 < i91) {
                    int i93 = i91;
                    int i94 = iArr[i92];
                    if (i94 < i12) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        ArrayList arrayList10 = arrayList;
                        arrayList10.add(qk2.B(uz7Var, i94, j4, ox9Var2, j8, kx0Var, r6eVar3.getLayoutDirection(), i40, q69Var2));
                        arrayList = arrayList10;
                    }
                    i92++;
                    iArr = iArr;
                    i91 = i93;
                }
                pu4 pu4Var2 = pu4.a;
                List list = arrayList == null ? pu4Var2 : arrayList;
                int iMax5 = i83;
                int i95 = 0;
                for (int size = list.size(); i95 < size; size = size) {
                    iMax5 = Math.max(iMax5, ((ao8) list.get(i95)).h);
                    i95++;
                }
                int i96 = ((ao8) ad0Var.last()).a;
                int iMin = Math.min(i11, (i64 - i96) - 1) + i96;
                int i97 = i96 + 1;
                if (i97 <= iMin) {
                    ArrayList arrayList11 = null;
                    while (true) {
                        if (arrayList11 == null) {
                            arrayList11 = new ArrayList();
                        }
                        i15 = i11;
                        arrayList7 = arrayList11;
                        pu4Var = pu4Var2;
                        i16 = iMin;
                        i14 = iMax5;
                        int i98 = i97;
                        arrayList7.add(qk2.B(uz7Var, i98, j4, ox9Var2, j8, kx0Var, r6eVar3.getLayoutDirection(), i40, q69Var2));
                        if (i98 == i16) {
                            break;
                        }
                        i97 = i98 + 1;
                        iMin = i16;
                        iMax5 = i14;
                        pu4Var2 = pu4Var;
                        arrayList11 = arrayList7;
                        i11 = i15;
                    }
                    arrayList2 = arrayList7;
                } else {
                    i14 = iMax5;
                    i15 = i11;
                    pu4Var = pu4Var2;
                    i16 = iMin;
                    arrayList2 = null;
                }
                int[] iArr2 = p69Var.a;
                int i99 = p69Var.b;
                int i100 = 0;
                while (i100 < i99) {
                    int i101 = iArr2[i100];
                    int i102 = i100;
                    if (i16 + 1 <= i101 && i101 < i64) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        List list2 = arrayList2;
                        list2.add(qk2.B(uz7Var, i101, j4, ox9Var2, j8, kx0Var, r6eVar3.getLayoutDirection(), i40, q69Var2));
                        arrayList2 = list2;
                    }
                    i100 = i102 + 1;
                    iArr2 = iArr2;
                    j4 = j4;
                }
                long j10 = j4;
                if (arrayList2 == null) {
                    arrayList2 = pu4Var;
                }
                int size2 = arrayList2.size();
                int iMax6 = i14;
                for (int i103 = 0; i103 < size2; i103++) {
                    iMax6 = Math.max(iMax6, ((ao8) arrayList2.get(i103)).h);
                }
                boolean z5 = pa7.t(ao8Var5, ad0Var.first()) && list.isEmpty() && arrayList2.isEmpty();
                int i104 = i10;
                int iG = ll2.g(i104, j7);
                int iF = ll2.f(iMax6, j7);
                int i105 = i9;
                boolean z6 = i104 < Math.min(iG, i105);
                if (!z6 || i13 == 0) {
                    i17 = i13;
                } else {
                    StringBuilder sb = new StringBuilder("non-zero pagesScrollOffset=");
                    i17 = i13;
                    sb.append(i17);
                    l37.c(sb.toString());
                }
                ArrayList arrayList12 = new ArrayList(arrayList2.size() + list.size() + ad0Var.c());
                if (z6) {
                    if (!list.isEmpty() || !arrayList2.isEmpty()) {
                        l37.a("No extra pages");
                    }
                    int iC2 = ad0Var.c();
                    int[] iArr3 = new int[iC2];
                    for (int i106 = 0; i106 < iC2; i106++) {
                        iArr3[i106] = i40;
                    }
                    int[] iArr4 = new int[iC2];
                    i18 = iG;
                    z = z5;
                    r6eVar = r6eVar3;
                    new uc0(r6eVar3.Z(iD4), false, null).m(uz7Var, i18, iArr3, cv7.a, iArr4);
                    z67 z67VarN0 = qd0.n0(iArr4);
                    int i107 = z67VarN0.b;
                    int i108 = z67VarN0.c;
                    if ((i108 > 0 && i107 >= 0) || (i108 < 0 && i107 <= 0)) {
                        int i109 = 0;
                        while (true) {
                            int i110 = iArr4[i109];
                            int i111 = i108;
                            ad0Var2 = ad0Var;
                            int[] iArr5 = iArr4;
                            ao8 ao8Var6 = (ao8) ad0Var2.get(i109);
                            ao8Var6.b(i110, i18, iF);
                            arrayList12.add(ao8Var6);
                            if (i109 == i107) {
                                break;
                            }
                            i109 += i111;
                            ad0Var = ad0Var2;
                            i108 = i111;
                            iArr4 = iArr5;
                        }
                    } else {
                        ad0Var2 = ad0Var;
                    }
                } else {
                    i18 = iG;
                    z = z5;
                    ad0Var2 = ad0Var;
                    r6eVar = r6eVar3;
                    int size3 = list.size();
                    int i112 = i17;
                    int i113 = 0;
                    while (i113 < size3) {
                        int i114 = size3;
                        ao8 ao8Var7 = (ao8) list.get(i113);
                        i112 -= i32;
                        ao8Var7.b(i112, i18, iF);
                        arrayList12.add(ao8Var7);
                        i113++;
                        size3 = i114;
                    }
                    int iC3 = ad0Var2.c();
                    for (int i115 = 0; i115 < iC3; i115++) {
                        ao8 ao8Var8 = (ao8) ad0Var2.get(i115);
                        ao8Var8.b(i17, i18, iF);
                        arrayList12.add(ao8Var8);
                        i17 += i32;
                    }
                    int size4 = arrayList2.size();
                    for (int i116 = 0; i116 < size4; i116++) {
                        ao8 ao8Var9 = (ao8) arrayList2.get(i116);
                        ao8Var9.b(i17, i18, iF);
                        arrayList12.add(ao8Var9);
                        i17 += i32;
                    }
                }
                if (z) {
                    arrayList3 = arrayList12;
                } else {
                    arrayList3 = new ArrayList(arrayList12.size());
                    int size5 = arrayList12.size();
                    int i117 = 0;
                    while (i117 < size5) {
                        Object obj2 = arrayList12.get(i117);
                        ad0 ad0Var5 = ad0Var2;
                        ao8 ao8Var10 = (ao8) obj2;
                        int i118 = i18;
                        int i119 = size5;
                        if (ao8Var10.a >= ((ao8) ad0Var5.first()).a && ao8Var10.a <= ((ao8) ad0Var5.last()).a) {
                            arrayList3.add(obj2);
                        }
                        i117++;
                        ad0Var2 = ad0Var5;
                        i18 = i118;
                        size5 = i119;
                    }
                }
                ad0 ad0Var6 = ad0Var2;
                int i120 = i18;
                if (list.isEmpty()) {
                    arrayList4 = pu4Var;
                } else {
                    arrayList4 = new ArrayList(arrayList12.size());
                    int size6 = arrayList12.size();
                    for (int i121 = 0; i121 < size6; i121++) {
                        Object obj3 = arrayList12.get(i121);
                        if (((ao8) obj3).a < ((ao8) ad0Var6.first()).a) {
                            arrayList4.add(obj3);
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList5 = pu4Var;
                } else {
                    arrayList5 = new ArrayList(arrayList12.size());
                    int size7 = arrayList12.size();
                    for (int i122 = 0; i122 < size7; i122++) {
                        Object obj4 = arrayList12.get(i122);
                        if (((ao8) obj4).a > ((ao8) ad0Var6.last()).a) {
                            arrayList5.add(obj4);
                        }
                    }
                }
                if (arrayList3.isEmpty()) {
                    r53 = arrayList4;
                    arrayList6 = arrayList3;
                    r23 = arrayList5;
                    i19 = i6;
                    i20 = i27;
                    i21 = i50;
                    frdVar = frdVar4;
                    obj = null;
                    i22 = iF;
                } else {
                    Object obj5 = arrayList3.get(0);
                    r53 = arrayList4;
                    r23 = arrayList5;
                    i19 = i6;
                    i20 = i27;
                    i21 = i50;
                    frdVar = frdVar4;
                    float f = -Math.abs(((ao8) obj5).j - frdVar.g(i21, i40, i19, i20));
                    int size8 = arrayList3.size() - 1;
                    int i123 = 1;
                    if (1 <= size8) {
                        obj = obj5;
                        float f2 = f;
                        while (true) {
                            Object obj6 = arrayList3.get(i123);
                            arrayList6 = arrayList3;
                            i22 = iF;
                            float f3 = -Math.abs(((ao8) obj6).j - frdVar.g(i21, i40, i19, i20));
                            if (Float.compare(f2, f3) < 0) {
                                f2 = f3;
                                obj = obj6;
                            }
                            if (i123 == size8) {
                                break;
                            }
                            i123++;
                            arrayList3 = arrayList6;
                            iF = i22;
                        }
                    } else {
                        arrayList6 = arrayList3;
                        i22 = iF;
                        obj = obj5;
                    }
                }
                ao8 ao8Var11 = (ao8) obj;
                float fN = i8 == 0 ? 0.0f : mh3.n((frdVar.g(i21, i40, i19, i20) - (ao8Var11 != null ? ao8Var11.j : 0)) / i8, -0.5f, 0.5f);
                yn8 yn8VarN0 = r6eVar.n0(ll2.g(i120 + i55, j), ll2.f(i22 + i56, j), qu4Var2, new kz8(17, e89Var3, arrayList12));
                boolean z7 = i < i64 || i104 > i105;
                r6eVar3 = r6eVar;
                qx9Var = new qx9(arrayList6, i40, iD4, i20, ks9Var, i43, i59, i15, ao8Var5, ao8Var11, fN, i87, z7, frdVar, yn8VarN0, z4, r53, r23, aw2Var, uz7Var, j10);
                uz7Var2 = uz7Var;
            }
            yx9Var.h(qx9Var, r6eVar3.k0(), false);
            ix9 ix9Var = yx9Var.u;
            List list3 = qx9Var.a;
            Trace.beginSection("compose:pager:cache_window:keepAroundItems");
            try {
                if (ix9Var.b() && !list3.isEmpty()) {
                    int i124 = ((ao8) s72.v0(list3)).a;
                    int i125 = ((ao8) s72.F0(list3)).a;
                    for (int i126 = ix9Var.h; i126 < i124; i126++) {
                        uz7Var2.a(i126);
                    }
                    int i127 = i125 + 1;
                    int i128 = ix9Var.i;
                    if (i127 <= i128) {
                        while (true) {
                            uz7Var2.a(i127);
                            if (i127 == i128) {
                                break;
                            }
                            i127++;
                        }
                    }
                }
                return qx9Var;
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th) {
            iqf.p(irdVarJ, irdVarL, a26VarE);
            throw th;
        }
    }
}
