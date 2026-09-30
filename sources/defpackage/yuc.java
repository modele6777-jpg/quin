package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yuc implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fwc b;

    public /* synthetic */ yuc(fwc fwcVar, int i) {
        this.a = i;
        this.b = fwcVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int iNextIndex;
        aw2 aw2Var;
        bv7 bv7Var;
        bv7 bv7Var2;
        hkb hkbVar;
        int i;
        bv7 bv7Var3;
        bv7 bv7VarC;
        int[] iArr;
        x59 x59Var;
        int i2;
        int i3 = this.a;
        wef wefVar = wef.a;
        int i4 = 0;
        fwc fwcVar = this.b;
        switch (i3) {
            case 0:
                hl9 hl9Var = (hl9) fwcVar.Y.getValue();
                return new hl9(hl9Var != null ? hl9Var.a : 9205357640488583168L);
            case 1:
                hl9 hl9Var2 = (hl9) fwcVar.Z.getValue();
                return new hl9(hl9Var2 != null ? hl9Var2.a : 9205357640488583168L);
            case 2:
                fwcVar.m();
                return wefVar;
            case 3:
                fwc fwcVar2 = this.b;
                fwcVar2.q(true);
                fwcVar2.E0.setValue(null);
                fwcVar2.F0.setValue(null);
                fwcVar2.G0 = null;
                if (fwcVar2.H0 && fwcVar2.l()) {
                    mmb mmbVar = new mmb();
                    mmb mmbVar2 = new mmb();
                    lmb lmbVar = new lmb();
                    owc owcVar = fwcVar2.a;
                    ArrayList arrayListE = owcVar.e(fwcVar2.n());
                    ListIterator listIterator = arrayListE.listIterator(arrayListE.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            vuc vucVar = (vuc) owcVar.a().e(((x59) listIterator.previous()).a);
                            if (vucVar != null && vucVar.a.b != vucVar.b.b) {
                                iNextIndex = listIterator.nextIndex();
                            }
                        } else {
                            iNextIndex = -1;
                        }
                    }
                    if (iNextIndex != -1) {
                        int size = arrayListE.size();
                        int i5 = 0;
                        while (i5 < size) {
                            x59 x59Var2 = (x59) arrayListE.get(i5);
                            vuc vucVar2 = (vuc) owcVar.a().e(x59Var2.a);
                            if (vucVar2 != null) {
                                k00 k00VarE = x59Var2.e();
                                long jB = u3c.b(vucVar2.a.b, vucVar2.b.b);
                                boolean z = i5 >= iNextIndex;
                                long j = x59Var2.a;
                                if (z) {
                                    mmbVar.element = k00VarE;
                                    mmbVar2.element = new eue(jB);
                                    lmbVar.element = j;
                                }
                            } else {
                                i5++;
                            }
                        }
                    }
                    Object obj = mmbVar.element;
                    if (obj != null && mmbVar2.element != null && lmbVar.element != 0 && ((CharSequence) obj).length() > 0 && (aw2Var = fwcVar2.I0) != null) {
                        ynb.V(aw2Var, null, null, new ewc(fwcVar2, mmbVar, mmbVar2, lmbVar, null), 3);
                    }
                }
                fwcVar2.H0 = false;
                return wefVar;
            case 4:
                return fwcVar.z;
            case 5:
                hkb hkbVar2 = dj6.f;
                owc owcVar2 = fwcVar.a;
                fwcVar.X.getValue();
                if (fwcVar.j() != null && (bv7Var = fwcVar.z) != null && bv7Var.h()) {
                    ArrayList arrayListE2 = owcVar2.e(fwcVar.n());
                    ArrayList arrayList = new ArrayList(arrayListE2.size());
                    int size2 = arrayListE2.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        x59 x59Var3 = (x59) arrayListE2.get(i6);
                        vuc vucVar3 = (vuc) owcVar2.a().e(x59Var3.a);
                        iy9 iy9Var = vucVar3 != null ? new iy9(x59Var3, vucVar3) : null;
                        if (iy9Var != null) {
                            arrayList.add(iy9Var);
                        }
                    }
                    int size3 = arrayList.size();
                    List listI = arrayList;
                    if (size3 != 0 && size3 != 1) {
                        listI = arrayList;
                        listI = t72.I(s72.v0(arrayList), s72.F0(arrayList));
                    }
                    listI = arrayList;
                    if (!listI.isEmpty()) {
                        if (listI.isEmpty()) {
                            hkbVar = hkbVar2;
                            bv7Var2 = bv7Var;
                        } else {
                            int size4 = listI.size();
                            int i7 = 0;
                            float fMin = Float.POSITIVE_INFINITY;
                            float fMin2 = Float.POSITIVE_INFINITY;
                            float fMax = Float.NEGATIVE_INFINITY;
                            float fMax2 = Float.NEGATIVE_INFINITY;
                            while (i7 < size4) {
                                iy9 iy9Var2 = (iy9) listI.get(i7);
                                x59 x59Var4 = (x59) iy9Var2.a();
                                vuc vucVar4 = (vuc) iy9Var2.b();
                                int i8 = vucVar4.a.b;
                                int i9 = vucVar4.b.b;
                                if (i8 == i9 || (bv7VarC = x59Var4.c()) == null) {
                                    i = size4;
                                    bv7Var3 = bv7Var;
                                } else {
                                    int iMin = Math.min(i8, i9);
                                    int iMax = Math.max(i8, i9) - 1;
                                    if (iMin == iMax) {
                                        iArr = new int[1];
                                        iArr[i4] = iMin;
                                    } else {
                                        int[] iArr2 = new int[2];
                                        iArr2[i4] = iMin;
                                        iArr2[1] = iMax;
                                        iArr = iArr2;
                                    }
                                    int length = iArr.length;
                                    int i10 = i4;
                                    float fMin3 = Float.POSITIVE_INFINITY;
                                    float fMin4 = Float.POSITIVE_INFINITY;
                                    float fMax3 = Float.NEGATIVE_INFINITY;
                                    float fMax4 = Float.NEGATIVE_INFINITY;
                                    while (i10 < length) {
                                        int i11 = iArr[i10];
                                        int i12 = size4;
                                        ste steVar = (ste) x59Var4.c.invoke();
                                        hkb hkbVarB = hkb.e;
                                        if (steVar == null) {
                                            x59Var = x59Var4;
                                            i2 = length;
                                        } else {
                                            x59Var = x59Var4;
                                            int length2 = steVar.a.a.b.length();
                                            i2 = length;
                                            if (length2 >= 1) {
                                                hkbVarB = steVar.b(mh3.o(i11, 0, length2 - 1));
                                            }
                                        }
                                        hkb hkbVar3 = hkbVarB;
                                        fMin3 = Math.min(fMin3, hkbVar3.a);
                                        fMin4 = Math.min(fMin4, hkbVar3.b);
                                        fMax3 = Math.max(fMax3, hkbVar3.c);
                                        fMax4 = Math.max(fMax4, hkbVar3.d);
                                        i10++;
                                        size4 = i12;
                                        x59Var4 = x59Var;
                                        length = i2;
                                    }
                                    i = size4;
                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin3)) << 32) | (((long) Float.floatToRawIntBits(fMin4)) & 4294967295L);
                                    bv7Var3 = bv7Var;
                                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fMax3)) << 32) | (((long) Float.floatToRawIntBits(fMax4)) & 4294967295L);
                                    long jK = bv7Var3.K(bv7VarC, jFloatToRawIntBits);
                                    long jK2 = bv7Var3.K(bv7VarC, jFloatToRawIntBits2);
                                    fMin = Math.min(fMin, Float.intBitsToFloat((int) (jK >> 32)));
                                    fMin2 = Math.min(fMin2, Float.intBitsToFloat((int) (jK & 4294967295L)));
                                    fMax = Math.max(fMax, Float.intBitsToFloat((int) (jK2 >> 32)));
                                    fMax2 = Math.max(fMax2, Float.intBitsToFloat((int) (jK2 & 4294967295L)));
                                }
                                i7++;
                                bv7Var = bv7Var3;
                                size4 = i;
                                i4 = 0;
                            }
                            bv7Var2 = bv7Var;
                            hkbVar = new hkb(fMin, fMin2, fMax, fMax2);
                        }
                        if (!hkbVar.equals(hkbVar2)) {
                            hkb hkbVarG = dj6.Z(bv7Var2).g(hkbVar);
                            if (hkbVarG.c - hkbVarG.a >= 0.0f && hkbVarG.d - hkbVarG.b >= 0.0f) {
                                hkb hkbVarK = hkbVarG.k(bv7Var2.N(0L));
                                float f = hkbVarK.d;
                                gxc gxcVar = svc.a;
                                return hkb.b(hkbVarK, 0.0f, 0.0f, f + 100.0f, 7);
                            }
                        }
                    }
                }
                return null;
            case 6:
                return new mwc(null, fwcVar.a, new yuc(fwcVar, 4));
            case 7:
                fwcVar.e();
                if (fwcVar.k()) {
                    fwcVar.m();
                }
                return wefVar;
            case 8:
                return Boolean.valueOf((fwcVar.M0 && fwcVar.k()) ? false : true);
            default:
                owc owcVar3 = fwcVar.a;
                ArrayList arrayListE3 = owcVar3.e(fwcVar.n());
                if (!arrayListE3.isEmpty()) {
                    y69 y69Var = of8.a;
                    y69 y69Var2 = new y69();
                    int size5 = arrayListE3.size();
                    vuc vucVar5 = null;
                    vuc vucVar6 = null;
                    for (int i13 = 0; i13 < size5; i13++) {
                        x59 x59Var5 = (x59) arrayListE3.get(i13);
                        vuc vucVarD = x59Var5.d();
                        if (vucVarD != null) {
                            if (vucVar5 == null) {
                                vucVar5 = vucVarD;
                            }
                            long j2 = x59Var5.a;
                            int iC = y69Var2.c(j2);
                            Object[] objArr = y69Var2.c;
                            Object obj2 = objArr[iC];
                            y69Var2.b[iC] = j2;
                            objArr[iC] = vucVarD;
                            vucVar6 = vucVarD;
                        }
                    }
                    if (y69Var2.e != 0) {
                        if (vucVar5 != vucVar6) {
                            vucVar5.getClass();
                            uuc uucVar = vucVar5.a;
                            vucVar6.getClass();
                            vucVar5 = new vuc(uucVar, vucVar6.b, false);
                        }
                        owcVar3.k.setValue(y69Var2);
                        fwcVar.d.d(vucVar5);
                        fwcVar.G0 = null;
                        fo5.a(fwcVar.v);
                        fwcVar.q(true);
                    }
                }
                return wefVar;
        }
    }
}
