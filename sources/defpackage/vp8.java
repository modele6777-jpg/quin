package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vp8 {
    public final nm8 a;
    public final Object b;
    public final occ[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public wp8 g;
    public final boolean[] h;
    public final boolean[] i;
    public final hu0[] j;
    public final au3 k;
    public final nq8 l;
    public vp8 m;
    public i1f n;
    public r1f o;
    public long p;

    public vp8(hu0[] hu0VarArr, long j, au3 au3Var, ta0 ta0Var, nq8 nq8Var, wp8 wp8Var, r1f r1fVar) {
        this.j = hu0VarArr;
        this.p = j;
        this.k = au3Var;
        this.l = nq8Var;
        zp8 zp8Var = wp8Var.a;
        Object obj = zp8Var.a;
        this.b = obj;
        this.g = wp8Var;
        this.n = i1f.d;
        this.o = r1fVar;
        this.c = new occ[hu0VarArr.length];
        this.h = new boolean[hu0VarArr.length];
        this.i = new boolean[hu0VarArr.length];
        long j2 = wp8Var.b;
        nq8Var.getClass();
        int i = eia.k;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        zp8 zp8VarA = zp8Var.a(pair.second);
        mq8 mq8Var = (mq8) nq8Var.e.get(obj2);
        mq8Var.getClass();
        nq8Var.h.add(mq8Var);
        lq8 lq8Var = (lq8) nq8Var.g.get(mq8Var);
        if (lq8Var != null) {
            lq8Var.a.d(lq8Var.b);
        }
        mq8Var.c.add(zp8VarA);
        nm8 nm8VarB = mq8Var.a.a(zp8VarA, ta0Var, j2);
        nq8Var.d.put(nm8VarB, mq8Var);
        nq8Var.c();
        this.a = nm8VarB;
    }

    public final long a(r1f r1fVar, long j, boolean z, boolean[] zArr) {
        boolean[] zArr2;
        hu0[] hu0VarArr;
        boolean[] zArr3;
        occ[] occVarArr;
        n55[] n55VarArr = (n55[]) r1fVar.c;
        int i = 0;
        while (true) {
            int i2 = r1fVar.a;
            zArr2 = this.i;
            boolean z2 = true;
            if (i >= i2) {
                break;
            }
            if (z || !r1fVar.o(this.o, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i3 = 0;
        while (true) {
            hu0VarArr = this.j;
            int length = hu0VarArr.length;
            zArr3 = zArr2;
            occVarArr = this.c;
            if (i3 >= length) {
                break;
            }
            if (hu0VarArr[i3].b == -2) {
                occVarArr[i3] = null;
            }
            i3++;
            zArr2 = zArr3;
        }
        b();
        this.o = r1fVar;
        c();
        long jB = this.a.b(n55VarArr, zArr3, occVarArr, zArr, j);
        for (int i4 = 0; i4 < hu0VarArr.length; i4++) {
            if (hu0VarArr[i4].b == -2 && this.o.p(i4)) {
                occVarArr[i4] = new uu4();
            }
        }
        this.f = false;
        for (int i5 = 0; i5 < occVarArr.length; i5++) {
            if (occVarArr[i5] != null) {
                pa7.J(r1fVar.p(i5));
                if (hu0VarArr[i5].b != -2) {
                    this.f = true;
                }
            } else {
                pa7.J(n55VarArr[i5] == null);
            }
        }
        return jB;
    }

    public final void b() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            r1f r1fVar = this.o;
            if (i >= r1fVar.a) {
                return;
            }
            boolean zP = r1fVar.p(i);
            n55 n55Var = ((n55[]) this.o.c)[i];
            if (zP && n55Var != null) {
                n55Var.f();
            }
            i++;
        }
    }

    public final void c() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            r1f r1fVar = this.o;
            if (i >= r1fVar.a) {
                return;
            }
            boolean zP = r1fVar.p(i);
            n55 n55Var = ((n55[]) this.o.c)[i];
            if (zP && n55Var != null) {
                n55Var.a();
            }
            i++;
        }
    }

    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long jP = this.f ? this.a.p() : Long.MIN_VALUE;
        return jP == Long.MIN_VALUE ? this.g.e : jP;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    public final void f(float f, gye gyeVar, boolean z) {
        this.e = true;
        this.n = this.a.m();
        r1f r1fVarJ = j(f, gyeVar, z);
        wp8 wp8Var = this.g;
        long jMax = wp8Var.b;
        long j = wp8Var.e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jA = a(r1fVarJ, jMax, false, new boolean[this.j.length]);
        long j2 = this.p;
        wp8 wp8Var2 = this.g;
        this.p = (wp8Var2.b - jA) + j2;
        this.g = wp8Var2.b(jA, wp8Var2.c);
    }

    public final boolean g() {
        if (this.e) {
            return !this.f || this.a.p() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.e) {
            return g() || d() - this.g.b >= -9223372036854775807L;
        }
        return false;
    }

    public final void i() {
        b();
        nq8 nq8Var = this.l;
        nm8 nm8Var = this.a;
        try {
            IdentityHashMap identityHashMap = nq8Var.d;
            mq8 mq8Var = (mq8) identityHashMap.remove(nm8Var);
            mq8Var.getClass();
            mq8Var.a.m(nm8Var);
            mq8Var.c.remove(nm8Var.a);
            if (!identityHashMap.isEmpty()) {
                nq8Var.c();
            }
            nq8Var.d(mq8Var);
        } catch (RuntimeException e) {
            xo1.y("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x02e2  */
    public final r1f j(float f, gye gyeVar, boolean z) {
        String str;
        yob yobVarG;
        yob yobVarS;
        zf zfVar;
        int i;
        int[] iArr;
        int i2;
        int i3;
        int[] iArr2;
        String languageTag;
        CaptioningManager captioningManager;
        Locale locale;
        Pair pairK;
        final boolean z2;
        Context context;
        int[] iArr3;
        final au3 au3Var = this.k;
        hu0[] hu0VarArr = this.j;
        i1f i1fVar = this.n;
        au3Var.getClass();
        int i4 = 1;
        int[] iArr4 = new int[hu0VarArr.length + 1];
        int length = hu0VarArr.length + 1;
        h1f[][] h1fVarArr = new h1f[length][];
        int[][][] iArr5 = new int[hu0VarArr.length + 1][][];
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = i1fVar.a;
            h1fVarArr[i5] = new h1f[i6];
            iArr5[i5] = new int[i6][];
        }
        int length2 = hu0VarArr.length;
        final int[] iArr6 = new int[length2];
        for (int i7 = 0; i7 < length2; i7++) {
            iArr6[i7] = hu0VarArr[i7].E();
        }
        int i8 = 0;
        while (i8 < i1fVar.a) {
            h1f h1fVarA = i1fVar.a(i8);
            int i9 = h1fVarA.c == 5 ? i4 : 0;
            int length3 = hu0VarArr.length;
            int i10 = i4;
            int i11 = 0;
            int i12 = 0;
            while (i11 < hu0VarArr.length) {
                hu0 hu0Var = hu0VarArr[i11];
                i1f i1fVar2 = i1fVar;
                int[] iArr7 = iArr4;
                int i13 = i4;
                int iMax = 0;
                for (int i14 = 0; i14 < h1fVarA.a; i14++) {
                    iMax = Math.max(iMax, hu0Var.D(h1fVarA.d[i14]) & 7);
                }
                int i15 = iArr7[i11] == 0 ? i13 : 0;
                if (iMax > i12 || (iMax == i12 && i9 != 0 && i10 == 0 && i15 != 0)) {
                    i12 = iMax;
                    i10 = i15;
                    length3 = i11;
                }
                i11++;
                i4 = i13;
                i1fVar = i1fVar2;
                iArr4 = iArr7;
            }
            i1f i1fVar3 = i1fVar;
            int[] iArr8 = iArr4;
            int i16 = i4;
            if (length3 == hu0VarArr.length) {
                iArr3 = new int[h1fVarA.a];
            } else {
                hu0 hu0Var2 = hu0VarArr[length3];
                int[] iArr9 = new int[h1fVarA.a];
                for (int i17 = 0; i17 < h1fVarA.a; i17++) {
                    iArr9[i17] = hu0Var2.D(h1fVarA.d[i17]);
                }
                iArr3 = iArr9;
            }
            int i18 = iArr8[length3];
            h1fVarArr[length3][i18] = h1fVarA;
            iArr5[length3][i18] = iArr3;
            iArr8[length3] = i18 + 1;
            i8++;
            i4 = i16;
            i1fVar = i1fVar3;
            iArr4 = iArr8;
        }
        int[] iArr10 = iArr4;
        int i19 = i4;
        i1f[] i1fVarArr = new i1f[hu0VarArr.length];
        String[] strArr = new String[hu0VarArr.length];
        int[] iArr11 = new int[hu0VarArr.length];
        for (int i20 = 0; i20 < hu0VarArr.length; i20++) {
            int i21 = iArr10[i20];
            i1fVarArr[i20] = new i1f((h1f[]) pqf.J(i21, h1fVarArr[i20]));
            iArr5[i20] = (int[][]) pqf.J(i21, iArr5[i20]);
            strArr[i20] = hu0VarArr[i20].k();
            iArr11[i20] = hu0VarArr[i20].b;
        }
        zl8 zl8Var = new zl8(iArr11, i1fVarArr, iArr6, iArr5, new i1f((h1f[]) pqf.J(iArr10[hu0VarArr.length], h1fVarArr[hu0VarArr.length])));
        au3Var.g = Thread.currentThread();
        Boolean boolValueOf = au3Var.j;
        if (boolValueOf == null && (context = au3Var.c) != null) {
            boolValueOf = Boolean.valueOf(pqf.G(context));
            au3Var.j = boolValueOf;
        }
        if (au3Var.f.B && Build.VERSION.SDK_INT >= 32 && au3Var.h == null) {
            au3Var.h = new iud(au3Var.c, new j1(26, au3Var), boolValueOf);
        }
        int i22 = zl8Var.a;
        m55[] m55VarArr = new m55[i22];
        au3.c(zl8Var, au3Var.f, m55VarArr);
        au3.a(zl8Var, au3Var.f, m55VarArr);
        au3.b(zl8Var, au3Var.f, m55VarArr);
        final vt3 vt3Var = au3Var.f;
        Context context2 = au3Var.c;
        int i23 = zl8Var.a;
        Pair pairE = au3.e(m55VarArr, i19);
        if (pairE == null) {
            int i24 = 0;
            while (true) {
                if (i24 >= i23) {
                    z2 = false;
                    break;
                }
                if (2 == iArr11[i24] && i1fVarArr[i24].a > 0) {
                    z2 = true;
                    break;
                }
                i24++;
            }
            pairE = au3.k(1, zl8Var, iArr5, new xt3() { // from class: qt3
                @Override // defpackage.xt3
                public final yob k(int i25, h1f h1fVar, int[] iArr12) {
                    au3 au3Var2 = au3Var;
                    au3Var2.getClass();
                    vt3 vt3Var2 = vt3Var;
                    pt3 pt3Var = new pt3(au3Var2, vt3Var2);
                    int i26 = iArr6[i25];
                    dy6 dy6VarM = jy6.m();
                    for (int i27 = 0; i27 < h1fVar.a; i27++) {
                        dy6VarM.b(new rt3(i25, h1fVar, i27, vt3Var2, iArr12[i27], z2, pt3Var, i26));
                    }
                    return dy6VarM.g();
                }
            }, new qu(10));
            if (pairE != null) {
                m55VarArr[((Integer) pairE.second).intValue()] = (m55) pairE.first;
            }
        }
        if (pairE == null) {
            str = null;
        } else {
            m55 m55Var = (m55) pairE.first;
            str = m55Var.a.d[m55Var.b[0]].d;
        }
        Pair pairE2 = au3.e(m55VarArr, 2);
        Pair pairE3 = au3.e(m55VarArr, 4);
        if (pairE2 == null && pairE3 == null) {
            vt3Var.q.getClass();
            Pair pairK2 = au3.k(2, zl8Var, iArr5, new wy2(vt3Var, str, iArr6, (!vt3Var.g || context2 == null) ? null : pqf.r(context2)), new qu(9));
            if (pairK2 == null) {
                vt3Var.q.getClass();
                pairK = au3.k(4, zl8Var, iArr5, new jv2(24, vt3Var), new qu(8));
            } else {
                pairK = null;
            }
            if (pairK != null) {
                m55VarArr[((Integer) pairK.second).intValue()] = (m55) pairK.first;
            } else if (pairK2 != null) {
                m55VarArr[((Integer) pairK2.second).intValue()] = (m55) pairK2.first;
            }
        }
        int i25 = 3;
        if (au3.e(m55VarArr, 3) == null) {
            vt3Var.q.getClass();
            if (!vt3Var.t || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                languageTag = null;
            } else {
                String str2 = pqf.a;
                languageTag = locale.toLanguageTag();
            }
            Pair pairK3 = au3.k(3, zl8Var, iArr5, new gi2(vt3Var, str, languageTag, i25), new qu(11));
            if (pairK3 != null) {
                m55VarArr[((Integer) pairK3.second).intValue()] = (m55) pairK3.first;
            }
        }
        vt3Var.q.getClass();
        int i26 = ry6.c;
        py6 py6Var = new py6(4);
        int iF = hu0.f(0, 0, 0, 0);
        int i27 = 0;
        while (i27 < i22) {
            m55 m55Var2 = m55VarArr[i27];
            if (m55Var2 != null) {
                h1f h1fVar = m55Var2.a;
                if (vt3Var.F.get(i27)) {
                    i3 = i27;
                } else {
                    i3 = i27;
                    if (!vt3Var.w.contains(Integer.valueOf(h1fVar.c))) {
                        py6Var.a(h1fVar.b);
                        int i28 = 0;
                        while (true) {
                            int[] iArr12 = m55Var2.b;
                            iArr2 = iArr11;
                            if (i28 < iArr12.length) {
                                String str3 = h1fVar.d[iArr12[i28]].n;
                                if (str3 != null) {
                                    py6Var.b(str3);
                                }
                                i28++;
                                iArr11 = iArr2;
                            }
                        }
                    }
                }
                iArr2 = iArr11;
            } else {
                i3 = i27;
                iArr2 = iArr11;
            }
            i27 = i3 + 1;
            iArr11 = iArr2;
        }
        int[] iArr13 = iArr11;
        ry6 ry6VarH = py6Var.h();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i29 = 0;
        while (i29 < i23) {
            if (iArr13[i29] != 5) {
                i2 = i29;
            } else {
                i1f i1fVar4 = i1fVarArr[i29];
                i2 = i29;
                int i30 = 0;
                while (i30 < i1fVar4.a) {
                    h1f h1fVarA2 = i1fVar4.a(i30);
                    arrayList.add(h1fVarA2);
                    i1f[] i1fVarArr2 = i1fVarArr;
                    int[] iArr14 = (int[]) iArr5[i2][i30].clone();
                    int[][][] iArr15 = iArr5;
                    i1f i1fVar5 = i1fVar4;
                    for (int i31 = 0; i31 < iArr14.length; i31++) {
                        String str4 = h1fVarA2.d[i31].n;
                        if (str4 != null && !ry6VarH.contains(str4)) {
                            iArr14[i31] = iF;
                        }
                    }
                    arrayList2.add(iArr14);
                    i30++;
                    iArr5 = iArr15;
                    i1fVarArr = i1fVarArr2;
                    i1fVar4 = i1fVar5;
                }
            }
            i29 = i2 + 1;
            iArr5 = iArr5;
            i1fVarArr = i1fVarArr;
        }
        i1f[] i1fVarArr3 = i1fVarArr;
        int[][][] iArr16 = iArr5;
        int size = arrayList.size();
        h1f[] h1fVarArr2 = new h1f[size];
        pa7.J(arrayList.size() == size);
        arrayList.toArray(h1fVarArr2);
        i1f i1fVar6 = new i1f(h1fVarArr2);
        int size2 = arrayList2.size();
        int[][] iArr17 = new int[size2][];
        pa7.J(arrayList2.size() == size2);
        arrayList2.toArray(iArr17);
        for (int i32 = 0; i32 < i23; i32++) {
            if (iArr13[i32] == 5) {
                m55 m55VarJ = au3.j(i1fVar6, iArr17, vt3Var);
                m55VarArr[i32] = m55VarJ;
                if (m55VarJ == null) {
                    break;
                }
                int iIndexOf = i1fVar6.b.indexOf(m55VarJ.a);
                Arrays.fill(iArr17[iIndexOf >= 0 ? iIndexOf : -1], iF);
            }
        }
        for (int i33 = 0; i33 < i23; i33++) {
            int i34 = iArr13[i33];
            if (i34 != 2 && i34 != 1) {
                if (i34 != 3 && i34 != 4) {
                    if (i34 != 5 && m55VarArr[i33] == null) {
                        m55VarArr[i33] = au3.j(i1fVarArr3[i33], iArr16[i33], vt3Var);
                    }
                }
            }
        }
        au3.c(zl8Var, au3Var.f, m55VarArr);
        au3.a(zl8Var, au3Var.f, m55VarArr);
        au3.b(zl8Var, au3Var.f, m55VarArr);
        qfc qfcVar = au3Var.d;
        au3Var.b.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (m55 m55Var3 : m55VarArr) {
            if (m55Var3 == null || m55Var3.b.length <= 1) {
                arrayList3.add(null);
            } else {
                dy6 dy6VarM = jy6.m();
                dy6VarM.b(new yf(0L, 0L));
                arrayList3.add(dy6VarM);
            }
        }
        int length4 = m55VarArr.length;
        long[][] jArr = new long[length4][];
        for (int i35 = 0; i35 < m55VarArr.length; i35++) {
            m55 m55Var4 = m55VarArr[i35];
            if (m55Var4 == null) {
                jArr[i35] = new long[0];
            } else {
                int[] iArr18 = m55Var4.b;
                jArr[i35] = new long[iArr18.length];
                for (int i36 = 0; i36 < iArr18.length; i36++) {
                    long j = m55Var4.a.d[iArr18[i36]].k;
                    long[] jArr2 = jArr[i35];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i36] = j;
                }
                Arrays.sort(jArr[i35]);
            }
        }
        int[] iArr19 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i37 = 0; i37 < length4; i37++) {
            long[] jArr4 = jArr[i37];
            jArr3[i37] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        zf.m(arrayList3, jArr3);
        ynb.D(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(ba9.a);
        b69 b69Var = new b69();
        c69 c69Var = new c69();
        pa7.A(treeMap.isEmpty());
        c69Var.d = treeMap;
        c69Var.f = b69Var;
        int i38 = 0;
        loop19: while (true) {
            if (i38 >= length4) {
                int[] iArr20 = iArr19;
                Collection k3Var = c69Var.b;
                if (k3Var == null) {
                    k3Var = new k3(0, c69Var);
                    c69Var.b = k3Var;
                }
                jy6 jy6VarO = jy6.o(k3Var);
                for (int i39 = 0; i39 < jy6VarO.size(); i39++) {
                    int iIntValue = ((Integer) jy6VarO.get(i39)).intValue();
                    int i40 = iArr20[iIntValue] + 1;
                    iArr20[iIntValue] = i40;
                    jArr3[iIntValue] = jArr[iIntValue][i40];
                    zf.m(arrayList3, jArr3);
                }
                for (int i41 = 0; i41 < m55VarArr.length; i41++) {
                    if (arrayList3.get(i41) != null) {
                        jArr3[i41] = jArr3[i41] * 2;
                    }
                }
                zf.m(arrayList3, jArr3);
                dy6 dy6VarM2 = jy6.m();
                for (int i42 = 0; i42 < arrayList3.size(); i42++) {
                    dy6 dy6Var = (dy6) arrayList3.get(i42);
                    dy6VarM2.b(dy6Var == null ? yob.e : dy6Var.g());
                }
                yobVarG = dy6VarM2.g();
                break;
            }
            long[] jArr5 = jArr[i38];
            if (jArr5.length <= 1) {
                i = length4;
                iArr = iArr19;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                int i43 = 0;
                while (true) {
                    long[] jArr6 = jArr[i38];
                    i = length4;
                    double dLog = 0.0d;
                    if (i43 >= jArr6.length) {
                        break;
                    }
                    int[] iArr21 = iArr19;
                    long j2 = jArr6[i43];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i43] = dLog;
                    i43++;
                    length4 = i;
                    iArr19 = iArr21;
                }
                iArr = iArr19;
                int i44 = length5 - 1;
                double d = dArr[i44] - dArr[0];
                int i45 = 0;
                while (i45 < i44) {
                    double d2 = dArr[i45];
                    i45++;
                    Double dValueOf = Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i45]) * 0.5d) - dArr[0]) / d);
                    double d3 = d;
                    Integer numValueOf = Integer.valueOf(i38);
                    Collection collection = (Collection) c69Var.d.get(dValueOf);
                    if (collection == null) {
                        List list = (List) c69Var.f.get();
                        if (!list.add(numValueOf)) {
                            qc0.i("New Collection violated the Collection spec");
                            yobVarG = null;
                            break loop19;
                        }
                        c69Var.e++;
                        c69Var.d.put(dValueOf, list);
                    } else if (collection.add(numValueOf)) {
                        c69Var.e++;
                    }
                    d = d3;
                }
            }
            i38++;
            length4 = i;
            iArr19 = iArr;
        }
        n55[] n55VarArr = new n55[m55VarArr.length];
        for (int i46 = 0; i46 < m55VarArr.length; i46++) {
            m55 m55Var5 = m55VarArr[i46];
            if (m55Var5 != null) {
                int[] iArr22 = m55Var5.b;
                if (iArr22.length != 0) {
                    int length6 = iArr22.length;
                    h1f h1fVar2 = m55Var5.a;
                    if (length6 == 1) {
                        zfVar = new zf(1, h1fVar2, new int[]{iArr22[0]});
                    } else {
                        jy6 jy6Var = (jy6) yobVarG.get(i46);
                        zf zfVar2 = new zf(0, h1fVar2, iArr22);
                        jy6.o(jy6Var);
                        zfVar = zfVar2;
                    }
                    n55VarArr[i46] = zfVar;
                }
            }
        }
        frb[] frbVarArr = new frb[i22];
        for (int i47 = 0; i47 < i22; i47++) {
            frbVarArr[i47] = (au3Var.f.F.get(i47) || au3Var.f.w.contains(Integer.valueOf(zl8Var.b[i47])) || (zl8Var.b[i47] != -2 && n55VarArr[i47] == null)) ? null : frb.c;
        }
        au3Var.f.getClass();
        au3Var.f.q.getClass();
        Pair pairCreate = Pair.create(frbVarArr, n55VarArr);
        n55[] n55VarArr2 = (n55[]) pairCreate.second;
        int length7 = n55VarArr2.length;
        List[] listArr = new List[length7];
        for (int i48 = 0; i48 < n55VarArr2.length; i48++) {
            n55 n55Var = n55VarArr2[i48];
            if (n55Var != null) {
                yobVarS = jy6.s(n55Var);
            } else {
                ey6 ey6Var = jy6.b;
                yobVarS = yob.e;
            }
            listArr[i48] = yobVarS;
        }
        dy6 dy6Var2 = new dy6(4);
        int i49 = 0;
        while (true) {
            int i50 = zl8Var.a;
            i1f[] i1fVarArr4 = zl8Var.c;
            if (i49 >= i50) {
                break;
            }
            i1f i1fVar7 = i1fVarArr4[i49];
            int i51 = 0;
            while (i51 < i1fVar7.a) {
                h1f h1fVarA3 = i1fVar7.a(i51);
                int i52 = i1fVarArr4[i49].a(i51).a;
                int[] iArr23 = new int[i52];
                int i53 = 0;
                int i54 = 0;
                while (i53 < i52) {
                    List[] listArr2 = listArr;
                    if ((zl8Var.e[i49][i51][i53] & 7) == 4) {
                        iArr23[i54] = i53;
                        i54++;
                    }
                    i53++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] iArrCopyOf = Arrays.copyOf(iArr23, i54);
                i1f i1fVar8 = i1fVar7;
                int iMin = 16;
                String str5 = null;
                int i55 = 0;
                boolean z3 = false;
                int i56 = 0;
                while (i55 < iArrCopyOf.length) {
                    int[] iArr24 = iArrCopyOf;
                    String str6 = i1fVarArr4[i49].a(i51).d[iArrCopyOf[i55]].p;
                    int i57 = i56 + 1;
                    if (i56 == 0) {
                        str5 = str6;
                    } else {
                        z3 = (!Objects.equals(str5, str6)) | z3;
                    }
                    iMin = Math.min(iMin, zl8Var.e[i49][i51][i55] & 24);
                    i55++;
                    i56 = i57;
                    iArrCopyOf = iArr24;
                }
                if (z3) {
                    iMin = Math.min(iMin, zl8Var.d[i49]);
                }
                boolean z4 = iMin != 0;
                int i58 = h1fVarA3.a;
                int[] iArr25 = new int[i58];
                boolean[] zArr = new boolean[i58];
                int i59 = 0;
                while (i59 < h1fVarA3.a) {
                    iArr25[i59] = zl8Var.e[i49][i51][i59] & 7;
                    boolean z5 = false;
                    int i60 = 0;
                    while (i60 < length7) {
                        List list2 = listArr3[i60];
                        int i61 = length7;
                        i1f[] i1fVarArr5 = i1fVarArr4;
                        int i62 = 0;
                        while (i62 < list2.size()) {
                            n55 n55Var2 = (n55) list2.get(i62);
                            int i63 = i62;
                            if (n55Var2.b().equals(h1fVarA3) && n55Var2.l(i59) != -1) {
                                z5 = true;
                                break;
                            }
                            i62 = i63 + 1;
                        }
                        i60++;
                        length7 = i61;
                        i1fVarArr4 = i1fVarArr5;
                    }
                    zArr[i59] = z5;
                    i59++;
                    i1fVarArr4 = i1fVarArr4;
                }
                dy6Var2.b(new e2f(h1fVarA3, z4, iArr25, zArr));
                i51++;
                listArr = listArr3;
                i1fVar7 = i1fVar8;
                length7 = length7;
                i1fVarArr4 = i1fVarArr4;
            }
            i49++;
        }
        i1f i1fVar9 = zl8Var.f;
        for (int i64 = 0; i64 < i1fVar9.a; i64++) {
            h1f h1fVarA4 = i1fVar9.a(i64);
            int[] iArr26 = new int[h1fVarA4.a];
            Arrays.fill(iArr26, 0);
            dy6Var2.b(new e2f(h1fVarA4, false, iArr26, new boolean[h1fVarA4.a]));
        }
        r1f r1fVar = new r1f((frb[]) pairCreate.first, (n55[]) pairCreate.second, new f2f(dy6Var2.g()), zl8Var);
        for (int i65 = 0; i65 < r1fVar.a; i65++) {
            boolean zP = r1fVar.p(i65);
            n55[] n55VarArr3 = (n55[]) r1fVar.c;
            if (zP) {
                pa7.J(n55VarArr3[i65] != null || this.j[i65].b == -2);
            } else {
                pa7.J(n55VarArr3[i65] == null);
            }
        }
        for (n55 n55Var3 : (n55[]) r1fVar.c) {
            if (n55Var3 != null) {
                n55Var3.i(f);
                n55Var3.c(z);
            }
        }
        return r1fVar;
    }
}
