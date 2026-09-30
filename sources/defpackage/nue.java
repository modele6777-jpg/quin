package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nue {
    public final boolean a;
    public final p67 b;
    public int c;
    public int d;

    public nue(nue nueVar, boolean z) {
        p67 p67Var;
        p67 p67Var2;
        this.a = z;
        if (nueVar == null || (p67Var2 = nueVar.b) == null) {
            p67Var = new p67(null);
        } else {
            p67Var2.b();
            p67Var = new p67(p67Var2);
        }
        this.b = p67Var;
        if (nueVar != null) {
            this.c = nueVar.c;
            this.d = nueVar.d;
        } else {
            this.c = 0;
            this.d = 1000;
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00df  */
    public final void a(int i) {
        int iJ;
        int i2;
        if (i == 0) {
            return;
        }
        int i3 = this.d;
        int i4 = i3 + i;
        p67 p67Var = this.b;
        p69 p69VarO = p67Var.o();
        int i5 = p67Var.e;
        int i6 = p67Var.d;
        if (i6 != i5 && p67Var.i(i6) >= i3 && p67Var.j(p67Var.d) <= i4) {
            int iK = p67Var.d;
            loop0: while (true) {
                char c = 0;
                while (true) {
                    if (iK == i5) {
                        break loop0;
                    }
                    if (c == 0) {
                        if (p67Var.h(iK) != i5 && p67Var.i(p67Var.h(iK)) >= i3) {
                            iK = p67Var.h(iK);
                            break;
                        }
                        c = 1;
                    } else if (c == 1) {
                        if (p67Var.m(iK) <= i4 && p67Var.g(iK) >= i3) {
                            p69VarO.c(iK);
                        }
                        if (p67Var.l(iK) != i5 && p67Var.i(p67Var.l(iK)) >= i3 && p67Var.j(p67Var.l(iK)) <= i4) {
                            iK = p67Var.l(iK);
                            break;
                        }
                        c = 2;
                    } else if (c == 2) {
                        if (p67Var.k(iK) != i5) {
                            c = iK == p67Var.h(p67Var.k(iK)) ? (char) 1 : (char) 2;
                        }
                        iK = p67Var.k(iK);
                    }
                }
            }
        }
        int i7 = p69VarO.b;
        int i8 = i3;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            int iA = p69VarO.a(i9);
            long jN = p67Var.n(iA);
            int iJ2 = ok8.J(jN);
            int i11 = this.d;
            if (iJ2 != i11) {
                int iJ3 = ok8.J(jN);
                if (i11 > iJ3 || iJ3 > i4) {
                    iJ = ok8.J(jN);
                } else if (ok8.H(jN)) {
                    iJ = this.c;
                } else {
                    iJ = i4;
                }
            } else {
                iJ = i4;
            }
            int i12 = i9;
            int i13 = (int) (jN & 2147483647L);
            int i14 = this.d;
            if (i13 == i14) {
                i13 = i4;
            } else if (i14 <= i13 && i13 <= i4) {
                if (ok8.I(jN)) {
                    i13 = i4;
                } else {
                    i13 = this.c;
                }
            }
            long jF = (iJ >= i13 || (iJ == this.c && i13 == i4)) ? ok8.F(iJ, iJ, false, false) : ok8.F(iJ, i13, ok8.H(jN), ok8.I(jN));
            int iM = p67Var.m(iA);
            p67Var.b.f(iA + 2, jF);
            p67Var.y(iA);
            int iJ4 = ok8.J(jF);
            if (iJ4 >= ((int) (jF & 2147483647L))) {
                p67Var.d(iA);
                p67Var.e(iA);
            } else {
                if (iJ4 < i8 || iJ4 > i4 || (iJ4 != iM && iM < i3)) {
                    p67Var.d(iA);
                    i2 = i12;
                    p69VarO.f(i10, p69VarO.a(i2));
                    i10++;
                } else {
                    i8 = iJ4;
                }
                i9 = i2 + 1;
            }
            i2 = i12;
            i9 = i2 + 1;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            int iA2 = p69VarO.a(i15);
            p67Var.s(iA2, 0);
            p67Var.u(iA2, p67Var.n(iA2));
            p67Var.t(iA2, i5);
            p67Var.w(iA2, i5);
            p67Var.a(iA2);
        }
        p69VarO.b = 0;
        p67Var.c();
        this.d += i;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e2  */
    public final void b(int i) {
        int iJ;
        int i2;
        if (i == 0) {
            return;
        }
        int i3 = this.c;
        int i4 = i3 - i;
        p67 p67Var = this.b;
        p69 p69VarO = p67Var.o();
        int i5 = p67Var.e;
        int i6 = p67Var.d;
        if (i6 != i5 && p67Var.i(i6) >= i4 && p67Var.j(p67Var.d) <= i3) {
            int iK = p67Var.d;
            loop0: while (true) {
                char c = 0;
                while (true) {
                    if (iK == i5) {
                        break loop0;
                    }
                    if (c == 0) {
                        if (p67Var.h(iK) != i5 && p67Var.i(p67Var.h(iK)) >= i4) {
                            iK = p67Var.h(iK);
                            break;
                        }
                        c = 1;
                    } else if (c == 1) {
                        if (p67Var.m(iK) <= i3 && p67Var.g(iK) >= i4) {
                            p69VarO.c(iK);
                        }
                        if (p67Var.l(iK) != i5 && p67Var.i(p67Var.l(iK)) >= i4 && p67Var.j(p67Var.l(iK)) <= i3) {
                            iK = p67Var.l(iK);
                            break;
                        }
                        c = 2;
                    } else if (c == 2) {
                        if (p67Var.k(iK) != i5) {
                            c = iK == p67Var.h(p67Var.k(iK)) ? (char) 1 : (char) 2;
                        }
                        iK = p67Var.k(iK);
                    }
                }
            }
        }
        int i7 = p69VarO.b;
        int i8 = i4;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            int iA = p69VarO.a(i9);
            long jN = p67Var.n(iA);
            int iJ2 = ok8.J(jN);
            int i11 = this.c;
            if (iJ2 != i11) {
                int iJ3 = ok8.J(jN);
                if (i4 > iJ3 || iJ3 >= i11) {
                    iJ = ok8.J(jN);
                } else if (ok8.H(jN)) {
                    iJ = i4;
                } else {
                    iJ = this.d;
                }
            } else {
                iJ = i4;
            }
            int i12 = i9;
            int i13 = (int) (jN & 2147483647L);
            int i14 = this.c;
            if (i13 == i14) {
                i13 = i4;
            } else if (i4 <= i13 && i13 < i14) {
                if (ok8.I(jN)) {
                    i13 = this.d;
                } else {
                    i13 = i4;
                }
            }
            long jF = (iJ >= i13 || (iJ == i4 && i13 == this.d)) ? ok8.F(iJ, iJ, false, false) : ok8.F(iJ, i13, ok8.H(jN), ok8.I(jN));
            int iM = p67Var.m(iA);
            p67Var.b.f(iA + 2, jF);
            p67Var.y(iA);
            int iJ4 = ok8.J(jF);
            if (iJ4 >= ((int) (jF & 2147483647L))) {
                p67Var.d(iA);
                p67Var.e(iA);
            } else {
                if (iJ4 < i8 || iJ4 > i3 || (iJ4 != iM && iM < i4)) {
                    p67Var.d(iA);
                    i2 = i12;
                    p69VarO.f(i10, p69VarO.a(i2));
                    i10++;
                } else {
                    i8 = iJ4;
                }
                i9 = i2 + 1;
            }
            i2 = i12;
            i9 = i2 + 1;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            int iA2 = p69VarO.a(i15);
            p67Var.s(iA2, 0);
            p67Var.u(iA2, p67Var.n(iA2));
            p67Var.t(iA2, i5);
            p67Var.w(iA2, i5);
            p67Var.a(iA2);
        }
        p69VarO.b = 0;
        p67Var.c();
        this.c -= i;
    }

    public final int c() {
        return this.d - this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nue)) {
            return false;
        }
        nue nueVar = (nue) obj;
        if (this.c == nueVar.c && this.d == nueVar.d) {
            return pa7.t(this.b, nueVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c) * 31) + this.d;
    }

    public /* synthetic */ nue(nue nueVar, int i) {
        this((i & 1) != 0 ? null : nueVar, true);
    }
}
