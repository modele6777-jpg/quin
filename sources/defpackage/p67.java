package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p67 {
    public final i79 a;
    public final x69 b;
    public int c;
    public int d;
    public final int e;
    public p69 f;

    public p67(p67 p67Var) {
        if (p67Var != null) {
            i79 i79Var = new i79(p67Var.a.b);
            i79Var.i(p67Var.a);
            this.a = i79Var;
            x69 x69Var = new x69(p67Var.b.b);
            x69Var.b(x69Var.b, p67Var.b);
            this.b = x69Var;
            this.e = p67Var.e;
            this.d = p67Var.d;
            this.c = p67Var.c;
            return;
        }
        i79 i79Var2 = new i79();
        this.a = i79Var2;
        x69 x69Var2 = new x69();
        this.b = x69Var2;
        long jF = ok8.F(Integer.MAX_VALUE, Integer.MIN_VALUE, false, false);
        int i = x69Var2.b;
        x69Var2.a(ok8.F(0, 0, false, false));
        x69Var2.a(0L);
        x69Var2.a(jF);
        x69Var2.a(jF);
        i79Var2.h(null);
        this.e = i;
        this.d = i;
        this.c = 0;
    }

    public final void a(int i) {
        int iH = this.d;
        int i2 = this.e;
        int i3 = i2;
        while (iH != i2) {
            i3 = iH;
            iH = m(i) <= m(iH) ? h(iH) : l(iH);
        }
        v(i, i3);
        if (i3 == i2) {
            this.d = i;
        } else if (m(i) <= m(i3)) {
            t(i3, i);
        } else {
            w(i3, i);
        }
        y(i3);
        while (i != this.d && f(k(i)) == 0) {
            int iK = k(k(i));
            if (k(i) == h(iK)) {
                int iL = l(iK);
                if (f(iL) == 0) {
                    s(iL, 1);
                    s(k(i), 1);
                    s(iK, 0);
                    i = iK;
                } else {
                    if (i == l(k(i))) {
                        i = k(i);
                        q(i);
                    }
                    s(k(i), 1);
                    s(iK, 0);
                    r(iK);
                }
            } else {
                int iH2 = h(iK);
                if (f(iH2) == 0) {
                    s(iH2, 1);
                    s(k(i), 1);
                    s(iK, 0);
                    i = iK;
                } else {
                    if (i == h(k(i))) {
                        i = k(i);
                        r(i);
                    }
                    s(k(i), 1);
                    s(iK, 0);
                    q(iK);
                }
            }
        }
        s(this.d, 1);
    }

    public final void b() {
        x69 x69Var;
        if (this.c == 0) {
            return;
        }
        p69 p69VarO = o();
        p69VarO.d(p());
        int iP = p();
        int i = 0;
        int i2 = 0;
        while (true) {
            x69Var = this.b;
            if (i >= iP) {
                break;
            }
            if (ok8.I(x69Var.d(i * 4))) {
                i2++;
            }
            p69VarO.c((i - i2) * 4);
            i++;
        }
        this.d = p69VarO.a(this.d / 4);
        int i3 = 4;
        int i4 = 4;
        while (true) {
            int i5 = x69Var.b;
            i79 i79Var = this.a;
            if (i3 >= i5) {
                x69Var.e(i4, i5);
                int i6 = i79Var.b;
                i79Var.n(i6 - this.c, i6);
                this.c = 0;
                p69VarO.b = 0;
                return;
            }
            long jD = x69Var.d(i3);
            if (ok8.I(jD)) {
                i3 += 4;
            } else {
                if (i4 != i3) {
                    x69Var.f(i4, (jD & (-2147483648L)) | ((long) p69VarO.a(((int) (2147483647L & jD)) / 4)));
                    long jD2 = x69Var.d(i3 + 1);
                    x69Var.f(i4 + 1, (((long) p69VarO.a(((int) (jD2 >> 32)) / 4)) << 32) | (((long) p69VarO.a(((int) (jD2 & 4294967295L)) / 4)) & 4294967295L));
                    x69Var.f(i4 + 2, x69Var.d(i3 + 2));
                    x69Var.f(i4 + 3, x69Var.d(i3 + 3));
                    i79Var.p(i4 / 4, i79Var.b(i3 / 4));
                } else {
                    x69Var.f(i4, (jD & (-2147483648L)) | ((long) p69VarO.a(((int) (2147483647L & jD)) / 4)));
                    long jD3 = x69Var.d(i3 + 1);
                    x69Var.f(i4 + 1, (((long) p69VarO.a(((int) (jD3 >> 32)) / 4)) << 32) | (((long) p69VarO.a(((int) (jD3 & 4294967295L)) / 4)) & 4294967295L));
                }
                i3 += 4;
                i4 += 4;
            }
        }
    }

    public final void c() {
        if (p() <= 64 || this.c < p() / 2) {
            return;
        }
        b();
    }

    public final void d(int i) {
        int iK;
        int iH;
        int iK2;
        int iF = f(i);
        int iH2 = h(i);
        int i2 = this.e;
        if (iH2 == i2) {
            iH = l(i);
            iK = k(i);
            x(i, l(i));
            y(iK);
            y(i2);
        } else if (l(i) == i2) {
            iH = h(i);
            iK = k(i);
            x(i, h(i));
            y(iK);
            y(i2);
        } else {
            int iL = l(i);
            while (h(iL) != i2) {
                iL = h(iL);
            }
            int iF2 = f(iL);
            int iL2 = l(iL);
            if (k(iL) == i) {
                iK = iL;
            } else {
                iK = k(iL);
                x(iL, l(iL));
                w(iL, l(i));
                v(l(iL), iL);
            }
            t(iL, h(i));
            v(h(iL), iL);
            s(iL, f(i));
            u(iL, this.b.d(i + 3));
            x(i, iL);
            y(iK);
            y(iL);
            iF = iF2;
            iH = iL2;
        }
        if (iF == 1) {
            while (iH != this.d && f(iH) == 1) {
                if (iH == h(iK)) {
                    int iL3 = l(iK);
                    if (f(iL3) == 0) {
                        s(iL3, 1);
                        s(iK, 0);
                        q(iK);
                        iL3 = l(iK);
                    }
                    if (f(h(iL3)) == 1 && f(l(iL3)) == 1) {
                        s(iL3, 0);
                        iK2 = k(iK);
                        iH = iK;
                        iK = iK2;
                    } else {
                        if (f(l(iL3)) == 1) {
                            s(h(iL3), 1);
                            s(iL3, 0);
                            r(iL3);
                            iL3 = l(iK);
                        }
                        s(iL3, f(iK));
                        s(iK, 1);
                        s(l(iL3), 1);
                        q(iK);
                        iH = this.d;
                    }
                } else {
                    int iH3 = h(iK);
                    if (f(iH3) == 0) {
                        s(iH3, 1);
                        s(iK, 0);
                        r(iK);
                        iH3 = h(iK);
                    }
                    if (f(l(iH3)) == 1 && f(h(iH3)) == 1) {
                        s(iH3, 0);
                        iK2 = k(iK);
                        iH = iK;
                        iK = iK2;
                    } else {
                        if (f(h(iH3)) == 1) {
                            s(l(iH3), 1);
                            s(iH3, 0);
                            q(iH3);
                            iH3 = h(iK);
                        }
                        s(iH3, f(iK));
                        s(iK, 1);
                        s(h(iH3), 1);
                        r(iK);
                        iH = this.d;
                    }
                }
            }
            s(iH, 1);
        }
    }

    public final void e(int i) {
        x69 x69Var = this.b;
        x69Var.f(i, x69Var.d(i) | 2147483648L);
        this.c++;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p67)) {
            return false;
        }
        int i = this.d + 3;
        x69 x69Var = this.b;
        long jD = x69Var.d(i);
        p67 p67Var = (p67) obj;
        x69 x69Var2 = p67Var.b;
        if (jD != x69Var2.d(p67Var.d + 3) || p() - this.c != p67Var.p() - p67Var.c) {
            return false;
        }
        int i2 = 4;
        int i3 = 4;
        while (i2 < x69Var.b && i3 < x69Var2.b) {
            if (ok8.I(x69Var.d(i2))) {
                i2 += 4;
            } else {
                if (!ok8.I(x69Var2.d(i3))) {
                    if (x69Var.d(i2 + 2) != x69Var2.d(i3 + 2)) {
                        return false;
                    }
                    if (!pa7.t(this.a.b(i2 / 4), p67Var.a.b(i3 / 4))) {
                        return false;
                    }
                    i2 += 4;
                }
                i3 += 4;
            }
        }
        return true;
    }

    public final int f(int i) {
        return !ok8.H(this.b.d(i)) ? 1 : 0;
    }

    public final int g(int i) {
        return (int) (n(i) & 2147483647L);
    }

    public final int h(int i) {
        return (int) (this.b.d(i + 1) >> 32);
    }

    public final int hashCode() {
        int i = 4;
        int iHashCode = 0;
        while (true) {
            x69 x69Var = this.b;
            if (i >= x69Var.b) {
                return iHashCode;
            }
            if (!ok8.I(x69Var.d(i))) {
                int iG = (g(i) + ((m(i) + (iHashCode * 31)) * 31)) * 31;
                Object objB = this.a.b(i / 4);
                iHashCode = iG + (objB != null ? objB.hashCode() : 0);
            }
            i += 4;
        }
    }

    public final int i(int i) {
        return (int) (this.b.d(i + 3) & 2147483647L);
    }

    public final int j(int i) {
        return ok8.J(this.b.d(i + 3));
    }

    public final int k(int i) {
        return (int) (this.b.d(i) & 2147483647L);
    }

    public final int l(int i) {
        return (int) (this.b.d(i + 1) & 4294967295L);
    }

    public final int m(int i) {
        return ok8.J(n(i));
    }

    public final long n(int i) {
        return this.b.d(i + 2);
    }

    public final p69 o() {
        p69 p69Var = this.f;
        if (p69Var != null) {
            return p69Var;
        }
        p69 p69Var2 = new p69();
        this.f = p69Var2;
        return p69Var2;
    }

    public final int p() {
        return this.b.b / 4;
    }

    public final void q(int i) {
        int iL = l(i);
        w(i, h(iL));
        int iH = h(iL);
        int i2 = this.e;
        if (iH != i2) {
            v(h(iL), i);
        }
        v(iL, k(i));
        if (k(i) == i2) {
            this.d = iL;
        } else if (h(k(i)) == i) {
            t(k(i), iL);
        } else {
            w(k(i), iL);
        }
        t(iL, i);
        v(i, iL);
        y(i);
        y(k(i));
    }

    public final void r(int i) {
        int iH = h(i);
        t(i, l(iH));
        int iL = l(iH);
        int i2 = this.e;
        if (iL != i2) {
            v(l(iH), i);
        }
        v(iH, k(i));
        if (k(i) == i2) {
            this.d = iH;
        } else if (l(k(i)) == i) {
            w(k(i), iH);
        } else {
            t(k(i), iH);
        }
        w(iH, i);
        v(i, iH);
        y(i);
        y(k(i));
    }

    public final void s(int i, int i2) {
        x69 x69Var = this.b;
        long jD = x69Var.d(i);
        x69Var.f(i, i2 == 0 ? jD | Long.MIN_VALUE : jD & Long.MAX_VALUE);
    }

    public final void t(int i, int i2) {
        int i3 = i + 1;
        x69 x69Var = this.b;
        x69Var.f(i3, (((long) ((int) (x69Var.d(i3) & 4294967295L))) & 4294967295L) | (((long) i2) << 32));
    }

    public final void u(int i, long j) {
        this.b.f(i + 3, j);
    }

    public final void v(int i, int i2) {
        x69 x69Var = this.b;
        x69Var.f(i, (x69Var.d(i) & (-2147483648L)) | ((long) i2));
    }

    public final void w(int i, int i2) {
        int i3 = i + 1;
        x69 x69Var = this.b;
        x69Var.f(i3, (((long) ((int) (x69Var.d(i3) >> 32))) << 32) | (((long) i2) & 4294967295L));
    }

    public final void x(int i, int i2) {
        if (i == i2) {
            return;
        }
        int iK = k(i);
        int i3 = this.e;
        if (iK == i3) {
            this.d = i2;
        } else if (i == h(k(i))) {
            t(k(i), i2);
        } else {
            w(k(i), i2);
        }
        if (i2 == i3) {
            return;
        }
        v(i2, k(i));
    }

    public final void y(int i) {
        while (i != this.e) {
            long jD = this.b.d(i + 3);
            int iMin = Math.min(m(i), Math.min(j(h(i)), j(l(i))));
            int iMax = Math.max(g(i), Math.max(i(h(i)), i(l(i))));
            if (ok8.J(jD) == iMin && ((int) (jD & 2147483647L)) == iMax) {
                return;
            }
            u(i, ok8.F(iMin, iMax, false, false));
            i = k(i);
        }
    }
}
