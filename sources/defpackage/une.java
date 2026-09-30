package defpackage;

import com.adjust.sdk.sig.r3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class une implements Appendable {
    public final vne a;
    public final f77 b;
    public final q0a c;
    public nue d;
    public boolean e;
    public k47 f;
    public long g;
    public eue v;
    public p89 w;
    public iy9 x;

    public une(vne vneVar, k47 k47Var, vne vneVar2, f77 f77Var, int i) {
        p89 p89Var = null;
        k47Var = (i & 2) != 0 ? null : k47Var;
        vneVar2 = (i & 4) != 0 ? vneVar : vneVar2;
        f77Var = (i & 8) != 0 ? null : f77Var;
        this.a = vneVar2;
        this.b = f77Var;
        q0a q0aVar = new q0a();
        q0aVar.a = vneVar;
        q0aVar.c = -1;
        q0aVar.d = -1;
        this.c = q0aVar;
        xse xseVar = vneVar.b;
        List list = vneVar.a;
        this.d = xseVar != null ? new nue(xseVar.a, 2) : null;
        this.f = k47Var != null ? new k47(k47Var) : null;
        this.g = vneVar.d;
        this.v = vneVar.e;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            j00[] j00VarArr = new j00[size];
            for (int i2 = 0; i2 < size; i2++) {
                j00VarArr[i2] = (j00) list.get(i2);
            }
            p89Var = new p89(size, j00VarArr);
        }
        this.w = p89Var;
    }

    public static void d(une uneVar, int i, int i2, CharSequence charSequence, int i3, boolean z, int i4) {
        if ((i4 & 16) != 0) {
            i3 = charSequence.length();
        }
        if ((i4 & 32) != 0) {
            z = false;
        }
        q0a q0aVar = uneVar.c;
        if (i > i2) {
            l37.a("Expected start=" + i + " <= end=" + i2);
        }
        if (i3 < 0) {
            l37.a("Expected textStart=0 <= textEnd=" + i3);
        }
        int iO = mh3.o(i, 0, q0aVar.length());
        int iO2 = mh3.o(i2, 0, q0aVar.length());
        int iO3 = mh3.o(0, 0, charSequence.length());
        int iO4 = mh3.o(i3, 0, charSequence.length());
        uneVar.b(iO, iO2, iO4 - iO3, z);
        uneVar.c.a(iO, iO2, charSequence, iO3, iO4);
        uneVar.g(null);
        uneVar.x = null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    public static vne i(une uneVar, long j, eue eueVar, int i) {
        List list;
        if ((i & 1) != 0) {
            j = uneVar.g;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            eueVar = uneVar.v;
        }
        eue eueVar2 = eueVar;
        p89 p89Var = uneVar.w;
        if (p89Var != null) {
            List listF = p89Var.f();
            if (((g79) listF).isEmpty()) {
                list = null;
            } else {
                list = listF;
            }
        } else {
            list = null;
        }
        return new vne(uneVar.c.toString(), j2, eueVar2, null, list, null, n3d.j(uneVar), 8);
    }

    public final k47 a() {
        k47 k47Var = this.f;
        if (k47Var != null) {
            return k47Var;
        }
        k47 k47Var2 = new k47((k47) null);
        this.f = k47Var2;
        return k47Var2;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            q0a q0aVar = this.c;
            b(q0aVar.length(), q0aVar.length(), charSequence.length(), false);
            q0aVar.a(q0aVar.length(), q0aVar.length(), charSequence, 0, charSequence.length());
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:302:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:303:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:309:0x04d5  */
    public final void b(int i, int i2, int i3, boolean z) {
        int i4;
        long j;
        int i5;
        int iJ;
        int iC;
        long jF;
        int iJ2;
        int i6;
        int iJ3;
        char c;
        k47 k47VarA = a();
        if (i != i2 || i3 != 0) {
            int iMin = Math.min(i, i2);
            int iMax = Math.max(i, i2);
            int i7 = i3 - (iMax - iMin);
            wv1 wv1Var = null;
            int i8 = 0;
            boolean z2 = false;
            while (true) {
                p89 p89Var = (p89) k47VarA.b;
                if (i8 >= p89Var.c) {
                    break;
                }
                wv1 wv1Var2 = (wv1) p89Var.a[i8];
                int i9 = wv1Var2.a;
                if ((iMin > i9 || i9 > iMax) && ((iMin > (i4 = wv1Var2.b) || i4 > iMax) && ((iMin > i4 || i9 > iMin) && (iMax > i4 || i9 > iMax)))) {
                    if (i9 > iMax && !z2) {
                        k47VarA.u(wv1Var, iMin, iMax, i7, z);
                        z2 = true;
                    }
                    if (z2) {
                        wv1Var2.a += i7;
                        wv1Var2.b += i7;
                    }
                    ((p89) k47VarA.c).b(wv1Var2);
                } else if (wv1Var == null) {
                    wv1Var = wv1Var2;
                } else {
                    wv1Var.b = wv1Var2.b;
                    wv1Var.d = wv1Var2.d;
                    wv1Var.e = wv1Var.e || wv1Var2.e;
                }
                i8++;
            }
            if (!z2) {
                k47VarA.u(wv1Var, iMin, iMax, i7, z);
            }
            p89 p89Var2 = (p89) k47VarA.b;
            k47VarA.b = (p89) k47VarA.c;
            k47VarA.c = p89Var2;
            p89Var2.g();
        }
        f77 f77Var = this.b;
        if (f77Var != null) {
            f77Var.i(i, i2, i3);
        }
        this.g = xdc.e(i, i2, i3, this.g);
        nue nueVar = this.d;
        if (nueVar != null) {
            p67 p67Var = nueVar.b;
            if (!nueVar.a) {
                l37.c("This buffer is immutable");
            }
            int i10 = p67Var.d;
            x69 x69Var = p67Var.b;
            int i11 = p67Var.e;
            if (i10 == i11) {
                return;
            }
            int i12 = i2 - i;
            int i13 = i3 - i12;
            char c2 = 2;
            if (i10 != i11 && nueVar.c() < i13) {
                int iC2 = (nueVar.c() - i13) + 1000;
                int i14 = nueVar.c;
                p69 p69VarO = p67Var.o();
                j = 2147483647L;
                int i15 = p67Var.d;
                if (i15 != i11 && p67Var.i(i15) >= i14 && p67Var.j(p67Var.d) <= Integer.MAX_VALUE) {
                    int iH = p67Var.d;
                    char c3 = 0;
                    while (iH != i11) {
                        if (c3 != 0) {
                            if (c3 == 1) {
                                if (p67Var.m(iH) <= Integer.MAX_VALUE && p67Var.g(iH) >= i14) {
                                    p69VarO.c(iH);
                                }
                                if (p67Var.l(iH) != i11 && p67Var.i(p67Var.l(iH)) >= i14 && p67Var.j(p67Var.l(iH)) <= Integer.MAX_VALUE) {
                                    iH = p67Var.l(iH);
                                    c3 = 0;
                                } else {
                                    c3 = 2;
                                }
                            } else if (c3 == c2) {
                                if (p67Var.k(iH) != i11) {
                                    c3 = iH == p67Var.h(p67Var.k(iH)) ? (char) 1 : (char) 2;
                                }
                                iH = p67Var.k(iH);
                            }
                        } else if (p67Var.h(iH) != i11 && p67Var.i(p67Var.h(iH)) >= i14) {
                            iH = p67Var.h(iH);
                            c3 = 0;
                        } else {
                            c3 = 1;
                        }
                        c2 = 2;
                    }
                }
                int i16 = p69VarO.b;
                int i17 = i14;
                int i18 = 0;
                int i19 = 0;
                while (i18 < i16) {
                    int iA = p69VarO.a(i18);
                    long jN = p67Var.n(iA);
                    int i20 = iC2;
                    int iJ4 = ok8.J(jN) > nueVar.c ? ok8.J(jN) + i20 : ok8.J(jN);
                    int i21 = (int) (jN & 2147483647L);
                    if (i21 > nueVar.c) {
                        i21 += i20;
                    }
                    long jF2 = ok8.F(iJ4, i21, ok8.H(jN), ok8.I(jN));
                    int iM = p67Var.m(iA);
                    x69Var.f(iA + 2, jF2);
                    p67Var.y(iA);
                    int iJ5 = ok8.J(jF2);
                    if (iJ5 >= ((int) (jF2 & 2147483647L))) {
                        p67Var.d(iA);
                        p67Var.e(iA);
                        c = 65535;
                    } else {
                        c = 65535;
                        if (iJ5 < i17 || iJ5 > Integer.MAX_VALUE || (iJ5 != iM && iM < i14)) {
                            p67Var.d(iA);
                            p69VarO.f(i19, p69VarO.a(i18));
                            i19++;
                        } else {
                            i17 = iJ5;
                        }
                    }
                    i18++;
                    iC2 = i20;
                }
                int i22 = iC2;
                for (int i23 = 0; i23 < i19; i23++) {
                    int iA2 = p69VarO.a(i23);
                    p67Var.s(iA2, 0);
                    p67Var.u(iA2, p67Var.n(iA2));
                    p67Var.t(iA2, i11);
                    p67Var.w(iA2, i11);
                    p67Var.a(iA2);
                }
                p69VarO.b = 0;
                p67Var.c();
                nueVar.d += i22;
            } else {
                j = 2147483647L;
            }
            int i24 = nueVar.c;
            if (i < i24 && i2 <= i24) {
                int i25 = i24 - i2;
                if (i25 != 0) {
                    int i26 = i24 - i25;
                    p69 p69VarO2 = p67Var.o();
                    int i27 = p67Var.d;
                    if (i27 != i11 && p67Var.i(i27) >= i26 && p67Var.j(p67Var.d) <= i24) {
                        int iK = p67Var.d;
                        loop3: while (true) {
                            char c4 = 0;
                            while (true) {
                                if (iK == i11) {
                                    break loop3;
                                }
                                if (c4 == 0) {
                                    if (p67Var.h(iK) != i11 && p67Var.i(p67Var.h(iK)) >= i26) {
                                        iK = p67Var.h(iK);
                                        break;
                                    }
                                    c4 = 1;
                                } else if (c4 == 1) {
                                    if (p67Var.m(iK) <= i24 && p67Var.g(iK) >= i26) {
                                        p69VarO2.c(iK);
                                    }
                                    if (p67Var.l(iK) != i11 && p67Var.i(p67Var.l(iK)) >= i26 && p67Var.j(p67Var.l(iK)) <= i24) {
                                        iK = p67Var.l(iK);
                                        break;
                                    }
                                    c4 = 2;
                                } else if (c4 == 2) {
                                    if (p67Var.k(iK) != i11) {
                                        c4 = iK == p67Var.h(p67Var.k(iK)) ? (char) 1 : (char) 2;
                                    }
                                    iK = p67Var.k(iK);
                                }
                            }
                        }
                    }
                    int i28 = i26;
                    int i29 = 0;
                    int i30 = 0;
                    for (int i31 = p69VarO2.b; i29 < i31; i31 = i6) {
                        int iA3 = p69VarO2.a(i29);
                        long jN2 = p67Var.n(iA3);
                        int i32 = i25;
                        if (ok8.J(jN2) == i26 && ok8.H(jN2)) {
                            iJ3 = ok8.J(jN2);
                            i6 = i31;
                        } else {
                            int i33 = nueVar.c;
                            i6 = i31;
                            int iJ6 = ok8.J(jN2);
                            iJ3 = (i26 > iJ6 || iJ6 > i33) ? ok8.J(jN2) : ok8.J(jN2) + nueVar.c();
                        }
                        int iC3 = (int) (jN2 & j);
                        if (iC3 != i26 || ok8.I(jN2)) {
                            int i34 = nueVar.c;
                            if (i26 <= iC3 && iC3 <= i34) {
                                iC3 += nueVar.c();
                            }
                        }
                        long jF3 = ok8.F(iJ3, iC3, ok8.H(jN2), ok8.I(jN2));
                        int iM2 = p67Var.m(iA3);
                        x69Var.f(iA3 + 2, jF3);
                        p67Var.y(iA3);
                        int iJ7 = ok8.J(jF3);
                        if (iJ7 >= ((int) (jF3 & j))) {
                            p67Var.d(iA3);
                            p67Var.e(iA3);
                        } else if (iJ7 < i28 || iJ7 > i24 || (iJ7 != iM2 && iM2 < i26)) {
                            p67Var.d(iA3);
                            p69VarO2.f(i30, p69VarO2.a(i29));
                            i30++;
                        } else {
                            i28 = iJ7;
                        }
                        i29++;
                        i25 = i32;
                    }
                    int i35 = i25;
                    for (int i36 = 0; i36 < i30; i36++) {
                        int iA4 = p69VarO2.a(i36);
                        p67Var.s(iA4, 0);
                        p67Var.u(iA4, p67Var.n(iA4));
                        p67Var.t(iA4, i11);
                        p67Var.w(iA4, i11);
                        p67Var.a(iA4);
                    }
                    p69VarO2.b = 0;
                    p67Var.c();
                    nueVar.c -= i35;
                    nueVar.d -= i35;
                }
                nueVar.b(i12);
            } else if (i >= i24 || i2 < i24) {
                int i37 = i - i24;
                if (i37 != 0) {
                    int i38 = nueVar.d;
                    int i39 = i38 + i37;
                    p69 p69VarO3 = p67Var.o();
                    int i40 = p67Var.d;
                    if (i40 != i11 && p67Var.i(i40) >= i38 && p67Var.j(p67Var.d) <= i39) {
                        int iK2 = p67Var.d;
                        loop7: while (true) {
                            char c5 = 0;
                            while (true) {
                                if (iK2 == i11) {
                                    break loop7;
                                }
                                if (c5 == 0) {
                                    if (p67Var.h(iK2) != i11 && p67Var.i(p67Var.h(iK2)) >= i38) {
                                        iK2 = p67Var.h(iK2);
                                        break;
                                    }
                                    c5 = 1;
                                } else if (c5 == 1) {
                                    if (p67Var.m(iK2) <= i39 && p67Var.g(iK2) >= i38) {
                                        p69VarO3.c(iK2);
                                    }
                                    if (p67Var.l(iK2) != i11 && p67Var.i(p67Var.l(iK2)) >= i38 && p67Var.j(p67Var.l(iK2)) <= i39) {
                                        iK2 = p67Var.l(iK2);
                                        break;
                                    }
                                    c5 = 2;
                                } else if (c5 == 2) {
                                    if (p67Var.k(iK2) != i11) {
                                        c5 = iK2 == p67Var.h(p67Var.k(iK2)) ? (char) 1 : (char) 2;
                                    }
                                    iK2 = p67Var.k(iK2);
                                }
                            }
                        }
                    }
                    int i41 = i38;
                    int i42 = 0;
                    int i43 = 0;
                    for (int i44 = p69VarO3.b; i42 < i44; i44 = i5) {
                        int iA5 = p69VarO3.a(i42);
                        long jN3 = p67Var.n(iA5);
                        int i45 = i37;
                        if (ok8.J(jN3) == i39 && ok8.H(jN3)) {
                            iJ = ok8.J(jN3) - nueVar.c();
                            i5 = i44;
                        } else {
                            int i46 = nueVar.d;
                            i5 = i44;
                            int iJ8 = ok8.J(jN3);
                            iJ = (i46 > iJ8 || iJ8 >= i39) ? ok8.J(jN3) : ok8.J(jN3) - nueVar.c();
                        }
                        int i47 = (int) (jN3 & j);
                        if (i47 != i39 || ok8.I(jN3)) {
                            if (nueVar.d <= i47 && i47 < i39) {
                                iC = nueVar.c();
                            }
                            jF = ok8.F(iJ, i47, ok8.H(jN3), ok8.I(jN3));
                            int iM3 = p67Var.m(iA5);
                            x69Var.f(iA5 + 2, jF);
                            p67Var.y(iA5);
                            iJ2 = ok8.J(jF);
                            if (iJ2 >= ((int) (jF & j))) {
                                p67Var.d(iA5);
                                p67Var.e(iA5);
                            } else if (iJ2 >= i41 || iJ2 > i39 || (iJ2 != iM3 && iM3 < i38)) {
                                p67Var.d(iA5);
                                p69VarO3.f(i43, p69VarO3.a(i42));
                                i43++;
                            } else {
                                i41 = iJ2;
                            }
                            i42++;
                            i37 = i45;
                        } else {
                            iC = nueVar.c();
                        }
                        i47 -= iC;
                        jF = ok8.F(iJ, i47, ok8.H(jN3), ok8.I(jN3));
                        int iM4 = p67Var.m(iA5);
                        x69Var.f(iA5 + 2, jF);
                        p67Var.y(iA5);
                        iJ2 = ok8.J(jF);
                        if (iJ2 >= ((int) (jF & j))) {
                            p67Var.d(iA5);
                            p67Var.e(iA5);
                        } else if (iJ2 >= i41) {
                            p67Var.d(iA5);
                            p69VarO3.f(i43, p69VarO3.a(i42));
                            i43++;
                        } else {
                            p67Var.d(iA5);
                            p69VarO3.f(i43, p69VarO3.a(i42));
                            i43++;
                        }
                        i42++;
                        i37 = i45;
                    }
                    int i48 = i37;
                    for (int i49 = 0; i49 < i43; i49++) {
                        int iA6 = p69VarO3.a(i49);
                        p67Var.s(iA6, 0);
                        p67Var.u(iA6, p67Var.n(iA6));
                        p67Var.t(iA6, i11);
                        p67Var.w(iA6, i11);
                        p67Var.a(iA6);
                    }
                    p69VarO3.b = 0;
                    p67Var.c();
                    nueVar.c += i48;
                    nueVar.d += i48;
                }
                nueVar.a(i12);
            } else {
                nueVar.b(i24 - i);
                nueVar.a(i2 - i24);
            }
            nueVar.c += i3;
        }
    }

    public final void c(int i, int i2, String str) {
        d(this, i, i2, str, str.length(), false, 32);
    }

    public final void e() {
        int length = this.c.length();
        vne vneVar = this.a;
        c(0, length, vneVar.c.toString());
        h(vneVar.d);
        a().v();
        xse xseVar = vneVar.b;
        nue nueVar = this.d;
        if (xseVar == null) {
            if (nueVar != null) {
                p67 p67Var = nueVar.b;
                p67Var.d = p67Var.e;
                x69 x69Var = p67Var.b;
                x69Var.e(4, x69Var.b);
                i79 i79Var = p67Var.a;
                i79Var.n(1, i79Var.b);
                p67Var.c = 0;
                return;
            }
            return;
        }
        if (nueVar == null) {
            nueVar = new nue((nue) null, 3);
            this.d = nueVar;
        }
        nue nueVar2 = xseVar.a;
        if (!nueVar.a) {
            l37.c("This buffer is immutable");
        }
        nueVar.c = nueVar2.c;
        nueVar.d = nueVar2.d;
        p67 p67Var2 = nueVar.b;
        p67 p67Var3 = nueVar2.b;
        i79 i79Var2 = p67Var2.a;
        x69 x69Var2 = p67Var2.b;
        if (p67Var3.d == p67Var3.e) {
            p67Var2.d = p67Var2.e;
            x69Var2.e(4, x69Var2.b);
            i79 i79Var3 = p67Var2.a;
            i79Var3.n(1, i79Var3.b);
            p67Var2.c = 0;
            return;
        }
        x69Var2.b = 0;
        x69Var2.b(0, p67Var3.b);
        i79Var2.k();
        i79Var2.i(p67Var3.a);
        p67Var2.d = p67Var3.d;
        p67Var2.c = p67Var3.c;
    }

    public final void f(int i, int i2, List list) {
        q0a q0aVar = this.c;
        if (i < 0 || i > q0aVar.length()) {
            r3.i(ks0.k("start (", i, ") offset is outside of text region ", q0aVar.length()));
            return;
        }
        if (i2 < 0 || i2 > q0aVar.length()) {
            r3.i(ks0.k("end (", i2, ") offset is outside of text region ", q0aVar.length()));
            return;
        }
        if (i >= i2) {
            qc0.j(ks0.k("Do not set reversed or empty range: ", i, " > ", i2));
            return;
        }
        g(new eue(u3c.b(i, i2)));
        p89 p89Var = this.w;
        if (p89Var != null) {
            p89Var.g();
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        if (this.w == null) {
            this.w = new p89(0, new j00[16]);
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            j00 j00Var = (j00) list.get(i3);
            p89 p89Var2 = this.w;
            if (p89Var2 != null) {
                p89Var2.b(j00.a(j00Var, null, j00Var.b + i, j00Var.c + i, 9));
            }
        }
    }

    public final void g(eue eueVar) {
        if (eueVar != null && !eue.d(eueVar.a)) {
            this.v = eueVar;
            return;
        }
        this.v = null;
        p89 p89Var = this.w;
        if (p89Var != null) {
            p89Var.g();
        }
    }

    public final void h(long j) {
        long jB = u3c.b(0, this.c.length());
        if (!eue.a(jB, j)) {
            l37.a("Expected " + eue.i(j) + " to be in " + eue.i(jB));
        }
        this.g = j;
        this.x = null;
    }

    public final String toString() {
        return this.c.toString();
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        q0a q0aVar = this.c;
        b(q0aVar.length(), q0aVar.length(), 1, false);
        int length = q0aVar.length();
        int length2 = q0aVar.length();
        String strValueOf = String.valueOf(c);
        q0aVar.a(length, length2, strValueOf, 0, strValueOf.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence != null) {
            q0a q0aVar = this.c;
            b(q0aVar.length(), q0aVar.length(), i2 - i, false);
            int length = q0aVar.length();
            int length2 = q0aVar.length();
            CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
            q0aVar.a(length, length2, charSequenceSubSequence, 0, charSequenceSubSequence.length());
        }
        return this;
    }
}
