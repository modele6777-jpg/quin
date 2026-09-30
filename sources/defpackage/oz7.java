package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oz7 {
    public final w79 a;
    public os b;
    public int c;
    public final x79 d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public oa4 j;

    public oz7() {
        long[] jArr = jec.a;
        this.a = new w79();
        x79 x79Var = mec.a;
        this.d = new x79();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
    }

    public static void c(vz7 vz7Var, int i, mz7 mz7Var, boolean z) {
        int i2 = 0;
        long jM = vz7Var.m(0);
        long jA = z ? w67.a(0, i, 1, jM) : w67.a(i, 0, 2, jM);
        kz7[] kz7VarArr = mz7Var.a;
        int length = kz7VarArr.length;
        int i3 = 0;
        while (i2 < length) {
            kz7 kz7Var = kz7VarArr[i2];
            int i4 = i3 + 1;
            if (kz7Var != null) {
                kz7Var.l = w67.d(jA, w67.c(vz7Var.m(i3), jM));
            }
            i2++;
            i3 = i4;
        }
    }

    public static int h(int[] iArr, vz7 vz7Var, boolean z) {
        int iN = vz7Var.n();
        int iB = vz7Var.b() + iN;
        int iMax = 0;
        while (iN < iB) {
            int iH = b21.H(vz7Var, z) + iArr[iN];
            iArr[iN] = iH;
            iMax = Math.max(iMax, iH);
            iN++;
        }
        return iMax;
    }

    public final kz7 a(int i, Object obj) {
        mz7 mz7Var = (mz7) this.a.g(obj);
        if (mz7Var != null) {
            return mz7Var.a[i];
        }
        return null;
    }

    public final long b() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            kz7 kz7Var = (kz7) arrayList.get(i);
            ke6 ke6Var = kz7Var.o;
            if (ke6Var != null) {
                int iMax = Math.max((int) (jMax >> 32), ((int) (kz7Var.l >> 32)) + ((int) (ke6Var.u >> 32)));
                jMax = (((long) Math.max((int) (jMax & 4294967295L), ((int) (kz7Var.l & 4294967295L)) + ((int) (ke6Var.u & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32);
            }
        }
        return jMax;
    }

    /* JADX WARN: Code duplicated, block: B:175:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:210:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:257:0x00d4 A[EDGE_INSN: B:257:0x00d4->B:49:0x00d4 BREAK  A[LOOP:2: B:35:0x0094->B:47:0x00cd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00cd A[LOOP:2: B:35:0x0094->B:47:0x00cd, LOOP_END] */
    /* JADX WARN: Type inference failed for: r12v17, types: [dw2, pv2, xn2] */
    public final void d(int i, int i2, int i3, ArrayList arrayList, os osVar, m4 m4Var, boolean z, boolean z2, int i4, boolean z3, int i5, int i6, aw2 aw2Var, ie6 ie6Var) {
        w79 w79Var;
        long j;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        x79 x79Var;
        ArrayList arrayList5;
        int[] iArr;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        os osVar2;
        int[] iArr2;
        int i7;
        os osVar3;
        int i8;
        ArrayList arrayList9;
        x79 x79Var2;
        ArrayList arrayList10;
        int[] iArr3;
        int i9;
        ArrayList arrayList11;
        ArrayList arrayList12;
        os osVar4;
        ArrayList arrayList13;
        int i10;
        ArrayList arrayList14;
        int i11;
        int i12;
        ArrayList arrayList15;
        ArrayList arrayList16;
        vz7 vz7Var;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        w79 w79Var2;
        long j2;
        boolean z4;
        long j3;
        int i18;
        int i19;
        long j4;
        ArrayList arrayList17 = arrayList;
        int i20 = i4;
        os osVar5 = this.b;
        this.b = osVar;
        int size = arrayList17.size();
        int i21 = 0;
        loop0: while (true) {
            w79Var = this.a;
            if (i21 >= size) {
                if (!w79Var.i()) {
                    break;
                }
                e();
                return;
            }
            vz7 vz7Var2 = (vz7) arrayList17.get(i21);
            int size2 = vz7Var2.k().size();
            for (int i22 = 0; i22 < size2; i22++) {
                Object objE = ((cea) vz7Var2.k().get(i22)).E();
                if ((objE instanceof ty7 ? (ty7) objE : null) != null) {
                    break loop0;
                }
            }
            i21++;
        }
        int i23 = this.c;
        vz7 vz7Var3 = (vz7) s72.x0(arrayList17);
        this.c = vz7Var3 != null ? vz7Var3.getIndex() : 0;
        long j5 = z ? ((long) i) & 4294967295L : ((long) i) << 32;
        boolean z5 = z2 || !z3;
        Object[] objArr = w79Var.b;
        long[] jArr = w79Var.a;
        int length = jArr.length - 2;
        x79 x79Var3 = this.d;
        if (length >= 0) {
            int i24 = 0;
            while (true) {
                long j6 = jArr[i24];
                j = j5;
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i25 = 8 - ((~(i24 - length)) >>> 31);
                    for (int i26 = 0; i26 < i25; i26++) {
                        if ((j6 & 255) < 128) {
                            x79Var3.e(objArr[(i24 << 3) + i26]);
                        }
                        j6 >>= 8;
                    }
                    if (i25 != 8) {
                        break;
                    }
                    if (i24 != length) {
                        break;
                    }
                    i24++;
                    j5 = j;
                } else if (i24 != length) {
                    break;
                    break;
                } else {
                    i24++;
                    j5 = j;
                }
            }
        } else {
            j = j5;
        }
        int size3 = arrayList17.size();
        int i27 = 0;
        while (true) {
            arrayList2 = this.i;
            arrayList3 = this.f;
            arrayList4 = this.e;
            if (i27 >= size3) {
                break;
            }
            vz7 vz7Var4 = (vz7) arrayList17.get(i27);
            x79Var3.m(vz7Var4.getKey());
            int size4 = vz7Var4.k().size();
            int i28 = 0;
            while (true) {
                if (i28 >= size4) {
                    i16 = size3;
                    i17 = i27;
                    w79Var2 = w79Var;
                    j2 = j;
                    i23 = i23;
                    f(vz7Var4.getKey());
                    break;
                }
                i16 = size3;
                Object objE2 = ((cea) vz7Var4.k().get(i28)).E();
                i17 = i27;
                if ((objE2 instanceof ty7 ? (ty7) objE2 : null) != null) {
                    mz7 mz7Var = (mz7) w79Var.g(vz7Var4.getKey());
                    int iH = osVar5 != null ? osVar5.h(vz7Var4.getKey()) : -1;
                    boolean z6 = iH == -1 && osVar5 != null;
                    if (mz7Var != null) {
                        z4 = z;
                        w79Var2 = w79Var;
                        j3 = j;
                        if (z5) {
                            ArrayList arrayList18 = arrayList2;
                            mz7.b(mz7Var, vz7Var4, aw2Var, ie6Var, i5, i6, z4);
                            kz7[] kz7VarArr = mz7Var.a;
                            int length2 = kz7VarArr.length;
                            int i29 = 0;
                            while (i29 < length2) {
                                kz7 kz7Var = kz7VarArr[i29];
                                if (kz7Var != null) {
                                    long j7 = j3;
                                    i19 = length2;
                                    i18 = i29;
                                    if (w67.b(kz7Var.l, 9223372034707292159L)) {
                                        j4 = j7;
                                    } else {
                                        j4 = j7;
                                        kz7Var.l = w67.d(kz7Var.l, j4);
                                    }
                                } else {
                                    i18 = i29;
                                    i19 = length2;
                                    j4 = j3;
                                }
                                long j8 = j4;
                                length2 = i19;
                                j3 = j8;
                                i29 = i18 + 1;
                            }
                            j2 = j3;
                            if (z6) {
                                for (kz7 kz7Var2 : mz7Var.a) {
                                    if (kz7Var2 != null) {
                                        if (kz7Var2.b()) {
                                            arrayList18.remove(kz7Var2);
                                            oa4 oa4Var = this.j;
                                            if (oa4Var != null) {
                                                qn4.G(oa4Var);
                                            }
                                        }
                                        kz7Var2.a();
                                    }
                                }
                            }
                            g(vz7Var4, false);
                        }
                        break;
                    }
                    mz7 mz7Var2 = new mz7(this);
                    z4 = z;
                    ArrayList arrayList19 = arrayList3;
                    w79Var2 = w79Var;
                    ArrayList arrayList20 = arrayList4;
                    j3 = j;
                    mz7.b(mz7Var2, vz7Var4, aw2Var, ie6Var, i5, i6, z4);
                    w79Var2.m(vz7Var4.getKey(), mz7Var2);
                    if (vz7Var4.getIndex() == iH || iH == -1) {
                        long jM = vz7Var4.m(0);
                        c(vz7Var4, (int) (z4 ? jM & 4294967295L : jM >> 32), mz7Var2, z4);
                        if (z6) {
                            for (kz7 kz7Var3 : mz7Var2.a) {
                                if (kz7Var3 != null) {
                                    kz7Var3.a();
                                }
                            }
                        }
                    } else if (iH < i23) {
                        arrayList20.add(vz7Var4);
                    } else {
                        arrayList19.add(vz7Var4);
                    }
                    j2 = j3;
                    break;
                    break;
                }
                i28++;
                arrayList3 = arrayList3;
                arrayList2 = arrayList2;
                i23 = i23;
                j = j;
                w79Var = w79Var;
                arrayList4 = arrayList4;
                size3 = i16;
                i27 = i17;
            }
            i27 = i17 + 1;
            arrayList17 = arrayList;
            i23 = i23;
            j = j2;
            w79Var = w79Var2;
            size3 = i16;
        }
        ArrayList arrayList21 = arrayList2;
        w79 w79Var3 = w79Var;
        ArrayList arrayList22 = arrayList4;
        int i30 = 2;
        kz7 kz7Var4 = null;
        int[] iArr4 = new int[i20];
        if (z5 && osVar5 != null) {
            if (arrayList22.isEmpty()) {
                i15 = 0;
            } else {
                if (arrayList22.size() > 1) {
                    w72.f0(arrayList22, new nz7(osVar5, i30));
                }
                int size5 = arrayList22.size();
                for (int i31 = 0; i31 < size5; i31++) {
                    vz7 vz7Var5 = (vz7) arrayList22.get(i31);
                    int iH2 = i5 - h(iArr4, vz7Var5, z);
                    Object objG = w79Var3.g(vz7Var5.getKey());
                    objG.getClass();
                    c(vz7Var5, iH2, (mz7) objG, z);
                    g(vz7Var5, false);
                }
                i15 = 0;
                Arrays.fill(iArr4, 0, i20, 0);
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 1) {
                    w72.f0(arrayList3, new nz7(osVar5, i15));
                }
                int size6 = arrayList3.size();
                for (int i32 = 0; i32 < size6; i32++) {
                    vz7 vz7Var6 = (vz7) arrayList3.get(i32);
                    int iH3 = (h(iArr4, vz7Var6, z) + i6) - b21.H(vz7Var6, z);
                    Object objG2 = w79Var3.g(vz7Var6.getKey());
                    objG2.getClass();
                    c(vz7Var6, iH3, (mz7) objG2, z);
                    g(vz7Var6, false);
                }
                Arrays.fill(iArr4, 0, i20, 0);
            }
        }
        Object[] objArr2 = x79Var3.b;
        long[] jArr2 = x79Var3.a;
        int length3 = jArr2.length - 2;
        ArrayList arrayList23 = this.h;
        ArrayList arrayList24 = this.g;
        if (length3 >= 0) {
            ArrayList arrayList25 = arrayList3;
            int i33 = 0;
            while (true) {
                long j9 = jArr2[i33];
                long[] jArr3 = jArr2;
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i34 = 8 - ((~(i33 - length3)) >>> 31);
                    long j10 = j9;
                    int i35 = 0;
                    while (i35 < i34) {
                        if ((j10 & 255) < 128) {
                            Object obj = objArr2[(i33 << 3) + i35];
                            mz7 mz7Var3 = (mz7) w79Var3.g(obj);
                            if (mz7Var3 == null) {
                                x79Var2 = x79Var3;
                                arrayList10 = arrayList22;
                                iArr3 = iArr4;
                                i9 = i35;
                                arrayList11 = arrayList23;
                                arrayList12 = arrayList24;
                                osVar4 = osVar5;
                                arrayList13 = arrayList25;
                                i10 = i33;
                                arrayList14 = arrayList21;
                                i11 = i34;
                            } else {
                                x79Var2 = x79Var3;
                                arrayList10 = arrayList22;
                                int iH4 = osVar.h(obj);
                                i9 = i35;
                                int iMin = Math.min(i20, mz7Var3.e);
                                mz7Var3.e = iMin;
                                int i36 = i34;
                                mz7Var3.d = Math.min(i20 - iMin, mz7Var3.d);
                                if (iH4 == -1) {
                                    kz7[] kz7VarArr2 = mz7Var3.a;
                                    int length4 = kz7VarArr2.length;
                                    int i37 = 0;
                                    boolean z7 = false;
                                    int i38 = 0;
                                    while (i37 < length4) {
                                        kz7[] kz7VarArr3 = kz7VarArr2;
                                        kz7 kz7Var5 = kz7VarArr3[i37];
                                        int i39 = i38 + 1;
                                        if (kz7Var5 != null) {
                                            if (kz7Var5.b()) {
                                                i13 = i37;
                                                i14 = length4;
                                                i33 = i33;
                                                arrayList23 = arrayList23;
                                                arrayList24 = arrayList24;
                                            } else {
                                                i13 = i37;
                                                if (((Boolean) kz7Var5.k.getValue()).booleanValue()) {
                                                    kz7Var5.c();
                                                    mz7Var3.a[i38] = kz7Var4;
                                                    arrayList21.remove(kz7Var5);
                                                    oa4 oa4Var2 = this.j;
                                                    if (oa4Var2 != null) {
                                                        qn4.G(oa4Var2);
                                                    }
                                                } else {
                                                    ke6 ke6Var = kz7Var5.o;
                                                    i14 = length4;
                                                    if (ke6Var != null) {
                                                        ze5 ze5Var = kz7Var5.f;
                                                        if (!kz7Var5.b() && ze5Var != null) {
                                                            kz7Var5.j.setValue(Boolean.TRUE);
                                                            ?? r12 = kz7Var4;
                                                            ynb.V(kz7Var5.a, r12, r12, new ez7(kz7Var5, ze5Var, ke6Var, r12), 3);
                                                        }
                                                    }
                                                    if (kz7Var5.b()) {
                                                        arrayList21.add(kz7Var5);
                                                        oa4 oa4Var3 = this.j;
                                                        if (oa4Var3 != null) {
                                                            qn4.G(oa4Var3);
                                                        }
                                                        kz7Var4 = null;
                                                    } else {
                                                        kz7Var5.c();
                                                        kz7Var4 = null;
                                                        mz7Var3.a[i38] = null;
                                                    }
                                                }
                                                i37 = i13 + 1;
                                                kz7VarArr2 = kz7VarArr3;
                                                i38 = i39;
                                                length4 = i14;
                                                i33 = i33;
                                                arrayList23 = arrayList23;
                                                arrayList24 = arrayList24;
                                            }
                                            z7 = true;
                                            i37 = i13 + 1;
                                            kz7VarArr2 = kz7VarArr3;
                                            i38 = i39;
                                            length4 = i14;
                                            i33 = i33;
                                            arrayList23 = arrayList23;
                                            arrayList24 = arrayList24;
                                        } else {
                                            i13 = i37;
                                        }
                                        i14 = length4;
                                        i33 = i33;
                                        arrayList23 = arrayList23;
                                        arrayList24 = arrayList24;
                                        i37 = i13 + 1;
                                        kz7VarArr2 = kz7VarArr3;
                                        i38 = i39;
                                        length4 = i14;
                                        i33 = i33;
                                        arrayList23 = arrayList23;
                                        arrayList24 = arrayList24;
                                    }
                                    i12 = i33;
                                    arrayList15 = arrayList23;
                                    arrayList16 = arrayList24;
                                    if (!z7) {
                                        f(obj);
                                    }
                                } else {
                                    i12 = i33;
                                    arrayList15 = arrayList23;
                                    arrayList16 = arrayList24;
                                    kl2 kl2Var = mz7Var3.b;
                                    kl2Var.getClass();
                                    vz7 vz7VarQ0 = m4Var.q0(iH4, mz7Var3.d, mz7Var3.e, kl2Var.a);
                                    vz7VarQ0.p();
                                    kz7[] kz7VarArr4 = mz7Var3.a;
                                    int length5 = kz7VarArr4.length;
                                    int i40 = 0;
                                    while (true) {
                                        if (i40 >= length5) {
                                            vz7Var = vz7VarQ0;
                                            if (osVar5 != null && iH4 == osVar5.h(obj)) {
                                                f(obj);
                                            }
                                        } else {
                                            kz7 kz7Var6 = kz7VarArr4[i40];
                                            if (kz7Var6 != null) {
                                                vz7Var = vz7VarQ0;
                                                if (((Boolean) kz7Var6.h.getValue()).booleanValue()) {
                                                }
                                            } else {
                                                vz7Var = vz7VarQ0;
                                            }
                                            i40++;
                                            vz7VarQ0 = vz7Var;
                                        }
                                        iArr3 = iArr4;
                                        osVar4 = osVar5;
                                        arrayList13 = arrayList25;
                                        vz7 vz7Var7 = vz7Var;
                                        i10 = i12;
                                        arrayList11 = arrayList15;
                                        arrayList12 = arrayList16;
                                        arrayList14 = arrayList21;
                                        i11 = i36;
                                        mz7Var3.a(vz7Var7, aw2Var, ie6Var, i5, i6, mz7Var3.c);
                                        if (iH4 < this.c) {
                                            arrayList12.add(vz7Var7);
                                        } else {
                                            arrayList11.add(vz7Var7);
                                        }
                                    }
                                }
                                iArr3 = iArr4;
                                osVar4 = osVar5;
                                arrayList13 = arrayList25;
                                i10 = i12;
                                arrayList11 = arrayList15;
                                arrayList12 = arrayList16;
                                arrayList14 = arrayList21;
                                i11 = i36;
                            }
                        } else {
                            x79Var2 = x79Var3;
                            arrayList10 = arrayList22;
                            iArr3 = iArr4;
                            i9 = i35;
                            arrayList11 = arrayList23;
                            arrayList12 = arrayList24;
                            osVar4 = osVar5;
                            arrayList13 = arrayList25;
                            i10 = i33;
                            arrayList14 = arrayList21;
                            i11 = i34;
                        }
                        j10 >>= 8;
                        i20 = i4;
                        arrayList23 = arrayList11;
                        arrayList24 = arrayList12;
                        i35 = i9 + 1;
                        i33 = i10;
                        i34 = i11;
                        osVar5 = osVar4;
                        arrayList21 = arrayList14;
                        x79Var3 = x79Var2;
                        arrayList25 = arrayList13;
                        iArr4 = iArr3;
                        arrayList22 = arrayList10;
                    }
                    x79Var = x79Var3;
                    arrayList5 = arrayList22;
                    iArr = iArr4;
                    arrayList7 = arrayList23;
                    arrayList8 = arrayList24;
                    osVar3 = osVar5;
                    arrayList6 = arrayList25;
                    osVar2 = osVar;
                    i8 = i33;
                    arrayList9 = arrayList21;
                    if (i34 != 8) {
                        break;
                    }
                } else {
                    x79Var = x79Var3;
                    arrayList5 = arrayList22;
                    iArr = iArr4;
                    arrayList7 = arrayList23;
                    arrayList8 = arrayList24;
                    osVar3 = osVar5;
                    arrayList6 = arrayList25;
                    osVar2 = osVar;
                    i8 = i33;
                    arrayList9 = arrayList21;
                }
                if (i8 == length3) {
                    break;
                }
                i33 = i8 + 1;
                i20 = i4;
                arrayList23 = arrayList7;
                arrayList24 = arrayList8;
                osVar5 = osVar3;
                jArr2 = jArr3;
                arrayList21 = arrayList9;
                x79Var3 = x79Var;
                arrayList25 = arrayList6;
                iArr4 = iArr;
                arrayList22 = arrayList5;
            }
        } else {
            x79Var = x79Var3;
            arrayList5 = arrayList22;
            iArr = iArr4;
            arrayList6 = arrayList3;
            arrayList7 = arrayList23;
            arrayList8 = arrayList24;
            osVar2 = osVar;
        }
        if (arrayList8.isEmpty()) {
            iArr2 = iArr;
        } else {
            if (arrayList8.size() > 1) {
                w72.f0(arrayList8, new nz7(osVar2, 3));
            }
            int size7 = arrayList8.size();
            int i41 = 0;
            while (i41 < size7) {
                vz7 vz7Var8 = (vz7) arrayList8.get(i41);
                Object objG3 = w79Var3.g(vz7Var8.getKey());
                objG3.getClass();
                mz7 mz7Var4 = (mz7) objG3;
                int[] iArr5 = iArr;
                int iH5 = h(iArr5, vz7Var8, z);
                if (z2) {
                    long jM2 = ((vz7) s72.v0(arrayList)).m(0);
                    i7 = (int) (z ? jM2 & 4294967295L : jM2 >> 32);
                } else {
                    i7 = mz7Var4.f;
                }
                vz7Var8.g(i7 - iH5, mz7Var4.c, i2, i3);
                if (z5) {
                    g(vz7Var8, true);
                }
                i41++;
                iArr = iArr5;
            }
            iArr2 = iArr;
            Arrays.fill(iArr2, 0, i4, 0);
        }
        if (!arrayList7.isEmpty()) {
            int i42 = 1;
            if (arrayList7.size() > 1) {
                w72.f0(arrayList7, new nz7(osVar2, i42));
            }
            int size8 = arrayList7.size();
            for (int i43 = 0; i43 < size8; i43++) {
                vz7 vz7Var9 = (vz7) arrayList7.get(i43);
                Object objG4 = w79Var3.g(vz7Var9.getKey());
                objG4.getClass();
                mz7 mz7Var5 = (mz7) objG4;
                vz7Var9.g((mz7Var5.g - b21.H(vz7Var9, z)) + h(iArr2, vz7Var9, z), mz7Var5.c, i2, i3);
                if (z5) {
                    g(vz7Var9, true);
                }
            }
        }
        Collections.reverse(arrayList8);
        arrayList.addAll(0, arrayList8);
        arrayList.addAll(arrayList7);
        arrayList5.clear();
        arrayList6.clear();
        arrayList8.clear();
        arrayList7.clear();
        x79Var.f();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[LOOP:0: B:7:0x0013->B:22:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[EDGE_INSN: B:26:0x005a->B:23:0x005a BREAK  A[LOOP:0: B:7:0x0013->B:22:0x0057], SYNTHETIC] */
    public final void e() {
        w79 w79Var = this.a;
        if (w79Var.j()) {
            Object[] objArr = w79Var.c;
            long[] jArr = w79Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                for (kz7 kz7Var : ((mz7) objArr[(i << 3) + i3]).a) {
                                    if (kz7Var != null) {
                                        kz7Var.c();
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            w79Var.a();
        }
    }

    public final void f(Object obj) {
        mz7 mz7Var = (mz7) this.a.k(obj);
        if (mz7Var != null) {
            for (kz7 kz7Var : mz7Var.a) {
                if (kz7Var != null) {
                    kz7Var.c();
                }
            }
        }
    }

    public final void g(vz7 vz7Var, boolean z) {
        Object objG = this.a.g(vz7Var.getKey());
        objG.getClass();
        kz7[] kz7VarArr = ((mz7) objG).a;
        int length = kz7VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            kz7 kz7Var = kz7VarArr[i];
            int i3 = i2 + 1;
            if (kz7Var != null) {
                long jM = vz7Var.m(i2);
                long j = kz7Var.l;
                if (!w67.b(j, 9223372034707292159L) && !w67.b(j, jM)) {
                    long jC = w67.c(jM, j);
                    ze5 ze5Var = kz7Var.e;
                    if (ze5Var != null) {
                        long jC2 = w67.c(((w67) kz7Var.r.getValue()).a, jC);
                        kz7Var.d(jC2);
                        kz7Var.h.setValue(Boolean.TRUE);
                        kz7Var.g = z;
                        ynb.V(kz7Var.a, null, null, new fz7(kz7Var, ze5Var, jC2, null), 3);
                    }
                }
                kz7Var.l = jM;
            }
            i++;
            i2 = i3;
        }
    }
}
