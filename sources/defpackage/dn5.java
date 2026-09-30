package defpackage;

import com.adjust.sdk.sig.r3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dn5 implements w49, p7c {
    public final tc0 a;
    public final wc0 b;
    public final float c;
    public final b03 d;
    public final float e;
    public final int f;
    public final bn5 g;

    public dn5(tc0 tc0Var, wc0 wc0Var, float f, b03 b03Var, float f2, int i, bn5 bn5Var) {
        this.a = tc0Var;
        this.b = wc0Var;
        this.c = f;
        this.d = b03Var;
        this.e = f2;
        this.f = i;
        this.g = bn5Var;
    }

    public static int k(List list, int i, int i2, int i3, int i4, bn5 bn5Var) {
        long jA = o67.a(0, 0);
        if (!list.isEmpty()) {
            int i5 = Integer.MAX_VALUE;
            sq4 sq4Var = new sq4(i4, bn5Var, ll2.a(0, i, 0, Integer.MAX_VALUE), i2, i3);
            tn8 tn8Var = (tn8) s72.y0(0, list);
            int iV = tn8Var != null ? tn8Var.V(i) : 0;
            int iN = tn8Var != null ? tn8Var.n(iV) : 0;
            int i6 = 0;
            if (sq4Var.b(list.size() > 1, 0, o67.a(i, Integer.MAX_VALUE), tn8Var == null ? null : new o67(o67.a(iN, iV)), 0, 0, 0, false, false).b) {
                bn5Var.getClass();
                jA = jA;
            } else {
                int size = list.size();
                int i7 = i;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i10 < size) {
                    int i13 = i7 - iN;
                    i10++;
                    int iMax = Math.max(i9, iV);
                    tn8 tn8Var2 = (tn8) s72.y0(i10, list);
                    iV = tn8Var2 != null ? tn8Var2.V(i) : 0;
                    int iN2 = tn8Var2 != null ? tn8Var2.n(iV) + i2 : 0;
                    int i14 = i10 - i12;
                    int i15 = i8;
                    int i16 = iN2;
                    ym5 ym5VarB = sq4Var.b(i10 + 2 < list.size(), i14, o67.a(i13, i5), tn8Var2 == null ? null : new o67(o67.a(iN2, iV)), i15, i6, iMax, false, false);
                    if (ym5VarB.a) {
                        int i17 = iMax + i3 + i6;
                        sq4Var.a(ym5VarB, tn8Var2 != null, i15, i17, i13, i14);
                        int i18 = i16 - i2;
                        i8 = i15 + 1;
                        if (ym5VarB.b) {
                            i11 = i10;
                            i6 = i17;
                            break;
                        }
                        i7 = i;
                        i12 = i10;
                        iN = i18;
                        i6 = i17;
                        i9 = 0;
                    } else {
                        iN = i16;
                        i7 = i13;
                        i8 = i15;
                        i9 = iMax;
                    }
                    i11 = i10;
                    i5 = Integer.MAX_VALUE;
                }
                jA = o67.a(i6 - i3, i11);
            }
        }
        return (int) (jA >> 32);
    }

    @Override // defpackage.w49
    public final int a(ga7 ga7Var, List list, int i) {
        List list2 = (List) s72.y0(1, list);
        tn8 tn8Var = list2 != null ? (tn8) s72.x0(list2) : null;
        List list3 = (List) s72.y0(2, list);
        this.g.a(tn8Var, list3 != null ? (tn8) s72.x0(list3) : null, ll2.b(0, 0, 0, i, 7));
        List list4 = (List) s72.x0(list);
        if (list4 == null) {
            list4 = pu4.a;
        }
        int iD0 = ga7Var.D0(this.c);
        int size = list4.size();
        int i2 = 0;
        int iMax = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            int iQ = ((tn8) list4.get(i2)).q(i) + iD0;
            int i5 = i2 + 1;
            if (i5 - i3 == this.f || i5 == list4.size()) {
                iMax = Math.max(iMax, (i4 + iQ) - iD0);
                i3 = i2;
                i4 = 0;
            } else {
                i4 += iQ;
            }
            i2 = i5;
        }
        return iMax;
    }

    @Override // defpackage.w49
    public final yn8 b(zn8 zn8Var, List list, long j) {
        tn8 tn8Var;
        cea ceaVar;
        o67 o67Var;
        ym5 ym5Var;
        int i;
        int i2;
        char c;
        tn8 tn8Var2;
        tn8 tn8Var3;
        o67 o67Var2;
        cea ceaVar2;
        o67 o67Var3;
        ym5 ym5Var2;
        Integer numValueOf;
        long jA;
        long jA2;
        cea ceaVarV;
        int i3 = this.f;
        qu4 qu4Var = qu4.a;
        if (i3 != 0 && !((ArrayList) list).isEmpty()) {
            int iG = kl2.g(j);
            bn5 bn5Var = this.g;
            if (iG != 0) {
                List list2 = (List) s72.v0(list);
                if (list2.isEmpty()) {
                    return zn8Var.n0(0, 0, qu4Var, new hl4(21));
                }
                List list3 = (List) s72.y0(1, list);
                tn8 tn8Var4 = list3 != null ? (tn8) s72.x0(list3) : null;
                List list4 = (List) s72.y0(2, list);
                tn8 tn8Var5 = list4 != null ? (tn8) s72.x0(list4) : null;
                list2.size();
                bn5Var.getClass();
                hw7 hw7Var = hw7.a;
                long jB0 = kj0.B0(kj0.a0(10, kj0.Y(j, hw7Var)));
                if (tn8Var4 != null) {
                    if (o7c.s(o7c.r(tn8Var4)) == 0.0f) {
                        o7c.r(tn8Var4);
                        cea ceaVarV2 = tn8Var4.v(jB0);
                        ceaVarV2.Y();
                        ceaVarV2.X();
                        ceaVarV2.Y();
                        ceaVarV2.X();
                    } else {
                        tn8Var4.V(tn8Var4.n(Integer.MAX_VALUE));
                    }
                }
                if (tn8Var5 != null) {
                    if (o7c.s(o7c.r(tn8Var5)) == 0.0f) {
                        o7c.r(tn8Var5);
                        cea ceaVarV3 = tn8Var5.v(jB0);
                        ceaVarV3.Y();
                        ceaVarV3.X();
                        ceaVarV3.Y();
                        ceaVarV3.X();
                    } else {
                        tn8Var5.V(tn8Var5.n(Integer.MAX_VALUE));
                    }
                }
                Iterator it = list2.iterator();
                long jY = kj0.Y(j, hw7Var);
                p89 p89Var = new p89(0, new yn8[16]);
                int iH = kl2.h(jY);
                int iJ = kl2.j(jY);
                int iG2 = kl2.g(jY);
                q69 q69Var = v67.a;
                q69 q69Var2 = new q69();
                ArrayList arrayList = new ArrayList();
                int iCeil = (int) Math.ceil(zn8Var.p0(this.c));
                int iCeil2 = (int) Math.ceil(zn8Var.p0(this.e));
                long jA3 = ll2.a(0, iH, 0, iG2);
                long jB1 = kj0.B0(kj0.a0(14, jA3));
                if (it.hasNext()) {
                    try {
                        tn8Var = (tn8) it.next();
                    } catch (IndexOutOfBoundsException unused) {
                        tn8Var = null;
                    }
                } else {
                    tn8Var = null;
                }
                if (tn8Var != null) {
                    if (o7c.s(o7c.r(tn8Var)) == 0.0f) {
                        o7c.r(tn8Var);
                        ceaVarV = tn8Var.v(jB1);
                        jA2 = o67.a(ceaVarV.Y(), ceaVarV.X());
                    } else {
                        int iN = tn8Var.n(Integer.MAX_VALUE);
                        tn8 tn8Var6 = tn8Var;
                        jA2 = o67.a(iN, tn8Var6.V(iN));
                        tn8Var = tn8Var6;
                        ceaVarV = null;
                    }
                    o67Var = new o67(jA2);
                    ceaVar = ceaVarV;
                } else {
                    it = it;
                    ceaVar = null;
                    o67Var = null;
                }
                cea ceaVar3 = ceaVar;
                Integer numValueOf2 = o67Var != null ? Integer.valueOf((int) (o67Var.a >> 32)) : null;
                Integer numValueOf3 = o67Var != null ? Integer.valueOf((int) (o67Var.a & 4294967295L)) : null;
                int[] iArr = new int[16];
                int[] iArr2 = new int[16];
                tn8 tn8Var7 = tn8Var;
                r69 r69Var = new r69();
                int i4 = this.f;
                bn5 bn5Var2 = this.g;
                sq4 sq4Var = new sq4(i4, bn5Var2, jY, iCeil, iCeil2);
                o67 o67Var4 = o67Var;
                ym5 ym5VarB = sq4Var.b(it.hasNext(), 0, o67.a(iH, iG2), o67Var4, 0, 0, 0, false, false);
                if (ym5VarB.b) {
                    ym5Var = ym5VarB;
                    sq4Var.a(ym5Var, o67Var4 != null, -1, 0, iH, 0);
                } else {
                    ym5Var = ym5VarB;
                }
                int[] iArrCopyOf = iArr2;
                int i5 = iH;
                cea ceaVar4 = ceaVar3;
                Integer num = numValueOf2;
                tn8 tn8Var8 = tn8Var7;
                int[] iArrCopyOf2 = iArr;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = iJ;
                int i12 = iG2;
                r69 r69Var2 = r69Var;
                ym5 ym5Var3 = ym5Var;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (!ym5Var3.b && tn8Var8 != null) {
                    num.getClass();
                    int iIntValue = num.intValue();
                    numValueOf3.getClass();
                    int iIntValue2 = numValueOf3.intValue();
                    int i16 = i14;
                    int i17 = i15 + iIntValue;
                    int iMax = Math.max(i13, iIntValue2);
                    int i18 = i5 - iIntValue;
                    i6++;
                    bn5Var2.getClass();
                    arrayList.add(tn8Var8);
                    q69Var2.i(i6, ceaVar4);
                    tn8Var8.E();
                    int i19 = i6 - i8;
                    if (it.hasNext()) {
                        try {
                            tn8Var2 = (tn8) it.next();
                        } catch (IndexOutOfBoundsException unused2) {
                            tn8Var2 = null;
                        }
                        tn8Var3 = tn8Var2;
                    } else {
                        tn8Var3 = null;
                    }
                    if (tn8Var3 != null) {
                        if (o7c.s(o7c.r(tn8Var3)) == 0.0f) {
                            o7c.r(tn8Var3);
                            cea ceaVarV4 = tn8Var3.v(jB1);
                            jA = o67.a(ceaVarV4.Y(), ceaVarV4.X());
                            ceaVar2 = ceaVarV4;
                        } else {
                            int iN2 = tn8Var3.n(Integer.MAX_VALUE);
                            jA = o67.a(iN2, tn8Var3.V(iN2));
                            ceaVar2 = null;
                        }
                        o67Var2 = new o67(jA);
                    } else {
                        tn8Var3 = tn8Var3;
                        i6 = i6;
                        o67Var2 = null;
                        ceaVar2 = null;
                    }
                    Integer numValueOf4 = o67Var2 != null ? Integer.valueOf(((int) (o67Var2.a >> 32)) + iCeil) : null;
                    Integer numValueOf5 = o67Var2 != null ? Integer.valueOf((int) (o67Var2.a & 4294967295L)) : null;
                    boolean zHasNext = it.hasNext();
                    int i20 = i9;
                    long jA4 = o67.a(i18, i12);
                    if (o67Var2 == null) {
                        o67Var3 = null;
                    } else {
                        numValueOf4.getClass();
                        int iIntValue3 = numValueOf4.intValue();
                        numValueOf5.getClass();
                        o67Var3 = new o67(o67.a(iIntValue3, numValueOf5.intValue()));
                    }
                    ym5 ym5VarB2 = sq4Var.b(zHasNext, i19, jA4, o67Var3, i20, i10, iMax, false, false);
                    if (ym5VarB2.a) {
                        int iMin = Math.min(Math.max(i11, i17), iH);
                        int i21 = i10 + iMax;
                        ym5Var2 = ym5VarB2;
                        sq4Var.a(ym5Var2, o67Var2 != null, i20, i21, i18, i19);
                        int i22 = i16 + 1;
                        if (iArrCopyOf.length < i22) {
                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i22, (iArrCopyOf.length * 3) / 2));
                        }
                        iArrCopyOf[i16] = iMax;
                        i14 = i16 + 1;
                        i12 = (iG2 - i21) - iCeil2;
                        int i23 = i7 + 1;
                        if (iArrCopyOf2.length < i23) {
                            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, Math.max(i23, (iArrCopyOf2.length * 3) / 2));
                        }
                        iArrCopyOf2[i7] = i6;
                        i7++;
                        numValueOf = numValueOf4 != null ? Integer.valueOf(numValueOf4.intValue() - iCeil) : null;
                        i9 = i20 + 1;
                        i10 = i21 + iCeil2;
                        i11 = iMin;
                        i18 = iH;
                        i8 = i6;
                        i13 = 0;
                        i15 = 0;
                    } else {
                        ym5Var2 = ym5VarB2;
                        numValueOf = numValueOf4;
                        i9 = i20;
                        i13 = iMax;
                        i15 = i17;
                        i14 = i16;
                    }
                    numValueOf3 = numValueOf5;
                    tn8Var8 = tn8Var3;
                    ceaVar4 = ceaVar2;
                    i5 = i18;
                    num = numValueOf;
                    ym5Var3 = ym5Var2;
                }
                int i24 = i14;
                int size = arrayList.size();
                Object[] objArr = new cea[size];
                for (int i25 = 0; i25 < size; i25++) {
                    objArr[i25] = q69Var2.b(i25);
                }
                int[] iArr3 = new int[i7];
                int[] iArr4 = new int[i7];
                int iMax2 = i11;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                while (i26 < i7) {
                    int i29 = iArrCopyOf2[i26];
                    if (i26 < 0 || i26 >= (i2 = i24)) {
                        r3.i("Index must be between 0 and size");
                        return null;
                    }
                    int iG3 = iArrCopyOf[i26];
                    r69 r69Var3 = r69Var2;
                    if (r69Var3.c(i26)) {
                        c = 65535;
                    } else if (kl2.g(jA3) == Integer.MAX_VALUE) {
                        iG3 = Integer.MAX_VALUE;
                        c = 65535;
                    } else {
                        iG3 = kl2.g(jA3) - i28;
                        c = 65535;
                    }
                    int[] iArr5 = iArrCopyOf2;
                    r69Var2 = r69Var3;
                    int i30 = i7;
                    int i31 = i26;
                    yn8 yn8VarQ = q7c.q(this, iMax2, kl2.i(jA3), kl2.h(jA3), iG3, iCeil, zn8Var, arrayList, objArr, i27, i29, iArr3, i31);
                    int iD = yn8VarQ.d();
                    int iC = yn8VarQ.c();
                    iArr4[i31] = iC;
                    iMax2 = Math.max(iMax2, iD);
                    p89Var.b(yn8VarQ);
                    int i32 = i31 + 1;
                    i27 = i29;
                    i24 = i2;
                    i7 = i30;
                    iArrCopyOf = iArrCopyOf;
                    iArrCopyOf2 = iArr5;
                    i28 += iC;
                    i26 = i32;
                    objArr = objArr;
                }
                int i33 = i28;
                if (p89Var.c == 0) {
                    iMax2 = 0;
                    i = 0;
                } else {
                    i = i33;
                }
                wc0 wc0Var = this.b;
                int iD0 = ((p89Var.c - 1) * zn8Var.D0(wc0Var.f())) + i;
                int i34 = kl2.i(jY);
                int iG4 = kl2.g(jY);
                if (iD0 < i34) {
                    iD0 = i34;
                }
                if (iD0 <= iG4) {
                    iG4 = iD0;
                }
                wc0Var.w(zn8Var, iG4, iArr4, iArr3);
                int iJ2 = kl2.j(jY);
                int iH2 = kl2.h(jY);
                if (iMax2 < iJ2) {
                    iMax2 = iJ2;
                }
                if (iMax2 <= iH2) {
                    iH2 = iMax2;
                }
                return zn8Var.n0(iH2, iG4, qu4Var, new ot1(25, p89Var));
            }
            bn5Var.getClass();
        }
        return zn8Var.n0(0, 0, qu4Var, new hl4(20));
    }

    @Override // defpackage.w49
    public final int c(ga7 ga7Var, List list, int i) {
        int[] iArr;
        int i2;
        long jA;
        this = this;
        List list2 = (List) s72.y0(1, list);
        tn8 tn8Var = list2 != null ? (tn8) s72.x0(list2) : null;
        List list3 = (List) s72.y0(2, list);
        this.g.a(tn8Var, list3 != null ? (tn8) s72.x0(list3) : null, ll2.b(0, 0, 0, i, 7));
        List list4 = (List) s72.x0(list);
        if (list4 == null) {
            list4 = pu4.a;
        }
        int iD0 = ga7Var.D0(this.c);
        int iD1 = ga7Var.D0(this.e);
        long jA2 = o67.a(0, 0);
        if (list4.isEmpty()) {
            return 0;
        }
        int size = list4.size();
        int[] iArr2 = new int[size];
        int size2 = list4.size();
        int[] iArr3 = new int[size2];
        int size3 = list4.size();
        for (int i3 = 0; i3 < size3; i3++) {
            tn8 tn8Var2 = (tn8) list4.get(i3);
            int iN = tn8Var2.n(i);
            iArr2[i3] = iN;
            iArr3[i3] = tn8Var2.V(iN);
        }
        int size4 = list4.size();
        bn5 bn5Var = this.g;
        if (Integer.MAX_VALUE < size4) {
            bn5Var.getClass();
        }
        if (Integer.MAX_VALUE >= list4.size()) {
            bn5Var.getClass();
        }
        int iMin = Math.min(Integer.MAX_VALUE, list4.size());
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += iArr2[i5];
        }
        int size5 = ((list4.size() - 1) * iD0) + i4;
        if (size2 == 0) {
            s8f.c();
            return 0;
        }
        int i6 = iArr3[0];
        int i7 = size2 - 1;
        int i8 = 0;
        if (1 <= i7) {
            int i9 = i6;
            int i10 = 1;
            while (true) {
                int i11 = iArr3[i10];
                if (i9 < i11) {
                    i9 = i11;
                }
                if (i10 == i7) {
                    break;
                }
                i10++;
            }
            i6 = i9;
        }
        if (size == 0) {
            s8f.c();
            return 0;
        }
        int i12 = iArr2[0];
        int i13 = size - 1;
        if (1 <= i13) {
            int i14 = 1;
            while (true) {
                int i15 = iArr2[i14];
                if (i12 < i15) {
                    i12 = i15;
                }
                if (i14 == i13) {
                    break;
                }
                i14++;
            }
        }
        int i16 = size5;
        int i17 = i6;
        while (i12 <= i16 && i17 != i) {
            int i18 = (i12 + i16) / 2;
            if (list4.isEmpty()) {
                i2 = i16;
                list4 = list4;
                jA = jA2;
                iArr = iArr3;
            } else {
                int i19 = i8;
                iArr = iArr3;
                sq4 sq4Var = new sq4(this.f, bn5Var, ll2.a(i19, i18, i19, Integer.MAX_VALUE), iD0, iD1);
                tn8 tn8Var3 = (tn8) s72.y0(i19, list4);
                int i20 = tn8Var3 != null ? iArr[i19] : i19;
                int i21 = tn8Var3 != null ? iArr2[i19] : 0;
                i2 = i16;
                int i22 = 0;
                int i23 = 0;
                int iMax = 0;
                if (sq4Var.b(list4.size() > 1, 0, o67.a(i18, Integer.MAX_VALUE), tn8Var3 == null ? null : new o67(o67.a(i21, i20)), 0, 0, 0, false, false).b) {
                    bn5Var.getClass();
                    list4 = list4;
                    jA = jA2;
                } else {
                    int size6 = list4.size();
                    int i24 = i18;
                    int i25 = i21;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = i20;
                    int i29 = 0;
                    while (true) {
                        int i30 = iMax;
                        if (i27 >= size6) {
                            list4 = list4;
                            break;
                        }
                        int i31 = i24 - i25;
                        int i32 = size6;
                        int i33 = i27 + 1;
                        iMax = Math.max(i30, i28);
                        tn8 tn8Var4 = (tn8) s72.y0(i33, list4);
                        int i34 = tn8Var4 != null ? iArr[i33] : 0;
                        int i35 = tn8Var4 != null ? iArr2[i33] + iD0 : 0;
                        int i36 = i26;
                        int i37 = i33 - i36;
                        ym5 ym5VarB = sq4Var.b(i27 + 2 < list4.size(), i37, o67.a(i31, Integer.MAX_VALUE), tn8Var4 == null ? null : new o67(o67.a(i35, i34)), i22, i23, iMax, false, false);
                        if (ym5VarB.a) {
                            int i38 = iMax + iD1 + i23;
                            int i39 = i22;
                            sq4Var.a(ym5VarB, tn8Var4 != null, i39, i38, i31, i37);
                            int i40 = i35 - iD0;
                            i22 = i39 + 1;
                            if (ym5VarB.b) {
                                i23 = i38;
                                i29 = i33;
                                break;
                            }
                            i35 = i40;
                            i24 = i18;
                            i23 = i38;
                            i26 = i33;
                            iMax = 0;
                        } else {
                            i24 = i31;
                            i26 = i36;
                        }
                        list4 = list4;
                        i28 = i34;
                        size6 = i32;
                        i27 = i33;
                        i29 = i27;
                        i25 = i35;
                    }
                    jA = o67.a(i23 - iD1, i29);
                }
            }
            int i41 = (int) (jA >> 32);
            int i42 = (int) (jA & 4294967295L);
            if (i41 > i || i42 < iMin) {
                i12 = i18 + 1;
                if (i12 > i2) {
                    return i12;
                }
                i16 = i2;
            } else {
                if (i41 >= i) {
                    return i18;
                }
                i16 = i18 - 1;
            }
            size5 = i18;
            iArr3 = iArr;
            i8 = 0;
            i17 = i41;
            list4 = list4;
        }
        return size5;
    }

    @Override // defpackage.w49
    public final int d(ga7 ga7Var, List list, int i) {
        List list2 = (List) s72.y0(1, list);
        tn8 tn8Var = list2 != null ? (tn8) s72.x0(list2) : null;
        List list3 = (List) s72.y0(2, list);
        this.g.a(tn8Var, list3 != null ? (tn8) s72.x0(list3) : null, ll2.b(0, i, 0, 0, 13));
        List list4 = (List) s72.x0(list);
        if (list4 == null) {
            list4 = pu4.a;
        }
        return k(list4, i, ga7Var.D0(this.c), ga7Var.D0(this.e), this.f, this.g);
    }

    @Override // defpackage.w49
    public final int e(ga7 ga7Var, List list, int i) {
        List list2 = (List) s72.y0(1, list);
        tn8 tn8Var = list2 != null ? (tn8) s72.x0(list2) : null;
        List list3 = (List) s72.y0(2, list);
        this.g.a(tn8Var, list3 != null ? (tn8) s72.x0(list3) : null, ll2.b(0, i, 0, 0, 13));
        List list4 = (List) s72.x0(list);
        if (list4 == null) {
            list4 = pu4.a;
        }
        return k(list4, i, ga7Var.D0(this.c), ga7Var.D0(this.e), this.f, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn5)) {
            return false;
        }
        dn5 dn5Var = (dn5) obj;
        return this.a.equals(dn5Var.a) && this.b.equals(dn5Var.b) && yi4.b(this.c, dn5Var.c) && this.d.equals(dn5Var.d) && yi4.b(this.e, dn5Var.e) && this.f == dn5Var.f && pa7.t(this.g, dn5Var.g);
    }

    @Override // defpackage.p7c
    public final void f(int i, int[] iArr, int[] iArr2, zn8 zn8Var) {
        this.a.m(zn8Var, i, iArr, zn8Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.p7c
    public final long g(int i, int i2, int i3, boolean z) {
        t7c t7cVar = s7c.a;
        return !z ? ll2.a(i, i2, 0, i3) : pa7.S(i, i2, 0, i3);
    }

    @Override // defpackage.p7c
    public final yn8 h(final cea[] ceaVarArr, zn8 zn8Var, final int[] iArr, int i, final int i2, final int[] iArr2, final int i3, final int i4, final int i5) {
        final cv7 cv7Var = cv7.a;
        return zn8Var.n0(i, i2, qu4.a, new a26() { // from class: cn5
            @Override // defpackage.a26
            public final Object d(Object obj) {
                an1 an1Var;
                bea beaVar = (bea) obj;
                int[] iArr3 = iArr2;
                int i6 = iArr3 != null ? iArr3[i3] : 0;
                int i7 = i4;
                for (int i8 = i7; i8 < i5; i8++) {
                    cea ceaVar = ceaVarArr[i8];
                    ceaVar.getClass();
                    Object objE = ceaVar.E();
                    r7c r7cVar = objE instanceof r7c ? (r7c) objE : null;
                    if (r7cVar == null || (an1Var = r7cVar.c) == null) {
                        an1Var = this.d;
                    }
                    beaVar.g(ceaVar, iArr[i8 - i7], an1Var.j(i2, ceaVar.X(), cv7Var) + i6, 0.0f);
                }
                return wef.a;
            }
        });
    }

    public final int hashCode() {
        return this.g.hashCode() + ub3.b(Integer.MAX_VALUE, ub3.b(this.f, ub3.a(this.e, (this.d.Q0.hashCode() + ub3.a(this.c, (this.b.hashCode() + ((this.a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31)) * 31, 31), 31), 31);
    }

    @Override // defpackage.p7c
    public final int i(cea ceaVar) {
        return ceaVar.X();
    }

    @Override // defpackage.p7c
    public final int j(cea ceaVar) {
        return ceaVar.Y();
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.a + ", verticalArrangement=" + this.b + ", mainAxisSpacing=" + yi4.c(this.c) + ", crossAxisAlignment=" + this.d + ", crossAxisArrangementSpacing=" + yi4.c(this.e) + ", maxItemsInMainAxis=" + this.f + ", maxLines=2147483647, overflow=" + this.g + ")";
    }
}
