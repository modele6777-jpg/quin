package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nwc {
    public final z2f a;
    public final ste b;
    public final boolean c;
    public final boolean d;
    public final float e;
    public final jqe f;
    public final vne g;
    public final rwc h;
    public long i;
    public q2g j;
    public final String k;

    public nwc(z2f z2fVar, ste steVar, boolean z, boolean z2, float f, jqe jqeVar) {
        this.a = z2fVar;
        this.b = steVar;
        this.c = z;
        this.d = z2;
        this.e = f;
        this.f = jqeVar;
        ird irdVarJ = iqf.j();
        a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
        ird irdVarL = iqf.l(irdVarJ);
        try {
            vne vneVarD = z2fVar.d();
            this.g = vneVarD;
            this.h = (rwc) z2fVar.e.getValue();
            iqf.p(irdVarJ, irdVarL, a26VarE);
            this.i = vneVarD.d;
            this.k = vneVarD.c.toString();
        } catch (Throwable th) {
            iqf.p(irdVarJ, irdVarL, a26VarE);
            throw th;
        }
    }

    public final void a() {
        if (this.k.length() > 0) {
            vne vneVar = this.g;
            boolean zD = eue.d(vneVar.d);
            z2f z2fVar = this.a;
            if (zD) {
                z2f.i(z2fVar, "", u3c.b((int) (vneVar.d >> 32), (int) (this.i & 4294967295L)), !this.c, this.d, 4);
            } else {
                z2fVar.c(this.d);
            }
            this.i = this.a.d().d;
            this.j = q2g.a;
        }
    }

    public final boolean b() {
        ste steVar = this.b;
        if (steVar == null) {
            return true;
        }
        long j = this.i;
        int i = eue.c;
        return steVar.k((int) (j & 4294967295L)) == txb.a;
    }

    public final int c(ste steVar, int i) {
        long j = this.i;
        int i2 = eue.c;
        int i3 = (int) (j & 4294967295L);
        jqe jqeVar = this.f;
        if (Float.isNaN(jqeVar.a)) {
            jqeVar.a = steVar.c(i3).a;
        }
        b59 b59Var = steVar.b;
        int iD = b59Var.d(i3) + i;
        if (iD < 0) {
            return Integer.MIN_VALUE;
        }
        if (iD >= b59Var.f) {
            return Integer.MAX_VALUE;
        }
        float fB = b59Var.b(iD) - 1.0f;
        float f = jqeVar.a;
        if ((b() && f >= steVar.i(iD)) || (!b() && f <= steVar.h(iD))) {
            return b59Var.c(iD, true);
        }
        return b59Var.g((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L));
    }

    public final int d(int i) {
        long j = this.g.d;
        int i2 = eue.c;
        int i3 = (int) (j & 4294967295L);
        ste steVar = this.b;
        if (steVar != null) {
            b59 b59Var = steVar.b;
            float f = this.e;
            if (!Float.isNaN(f)) {
                hkb hkbVarJ = steVar.c(i3).j(0.0f, f * i);
                float f2 = hkbVarJ.d;
                float f3 = hkbVarJ.b;
                float fB = b59Var.b(b59Var.e(f3));
                if (Math.abs(f3 - fB) > Math.abs(f2 - fB)) {
                    return b59Var.g(hkbVarJ.f());
                }
                return b59Var.g((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(hkbVarJ.a) << 32));
            }
        }
        return i3;
    }

    public final void e() {
        ste steVar = this.b;
        int iC = steVar != null ? c(steVar, 1) : Integer.MAX_VALUE;
        if (iC == Integer.MAX_VALUE) {
            this.f.a = Float.NaN;
        }
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = eue.c;
            int i2 = (int) (j & 4294967295L);
            int length = str.length();
            if (iC > length) {
                iC = length;
            }
            long jF = q3c.f(iC, i2, this.a);
            int i3 = (int) (jF >> 32);
            q2g q2gVarE = qk2.E(jF);
            if (i3 != i2 || !eue.d(this.i)) {
                this.i = u3c.b(i3, i3);
            }
            if (q2gVarE != null) {
                this.j = q2gVarE;
            }
        }
    }

    public final void f() {
        if (this.k.length() > 0) {
            long j = this.i;
            int i = eue.c;
            int i2 = (int) (j & 4294967295L);
            long jF = q3c.f(d(1), i2, this.a);
            int i3 = (int) (jF >> 32);
            q2g q2gVarE = qk2.E(jF);
            if (i3 != i2 || !eue.d(this.i)) {
                this.i = u3c.b(i3, i3);
            }
            if (q2gVarE != null) {
                this.j = q2gVarE;
            }
        }
    }

    public final void g() {
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = eue.c;
            int i2 = (int) (j & 4294967295L);
            long jF = q3c.f(dec.d(i2, str), i2, this.a);
            int i3 = (int) (jF >> 32);
            q2g q2gVarE = qk2.E(jF);
            if (i3 != i2 || !eue.d(this.i)) {
                this.i = u3c.b(i3, i3);
            }
            if (q2gVarE != null) {
                this.j = q2gVarE;
            }
        }
    }

    public final void h() {
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = (int) (4294967295L & j);
            int iM = xdc.m(str, eue.f(j));
            if (iM == eue.f(this.i) && iM != str.length()) {
                iM = xdc.m(str, iM + 1);
            }
            long jF = q3c.f(iM, i, this.a);
            int i2 = (int) (jF >> 32);
            q2g q2gVarE = qk2.E(jF);
            if (i2 != i || !eue.d(this.i)) {
                this.i = u3c.b(i2, i2);
            }
            if (q2gVarE != null) {
                this.j = q2gVarE;
            }
        }
    }

    public final void i() {
        int length;
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = eue.c;
            int i2 = (int) (j & 4294967295L);
            ste steVar = this.b;
            if (steVar != null) {
                int i3 = i2;
                while (true) {
                    vne vneVar = this.g;
                    if (i3 < vneVar.c.length()) {
                        int length2 = str.length() - 1;
                        if (i3 <= length2) {
                            length2 = i3;
                        }
                        long jM = steVar.m(length2);
                        int i4 = eue.c;
                        int i5 = (int) (jM & 4294967295L);
                        if (i5 > i3) {
                            length = i5;
                            break;
                        }
                        i3++;
                    } else {
                        length = vneVar.c.length();
                        break;
                    }
                }
            } else {
                length = str.length();
            }
            long jF = q3c.f(length, i2, this.a);
            int i6 = (int) (jF >> 32);
            q2g q2gVarE = qk2.E(jF);
            if (i6 != i2 || !eue.d(this.i)) {
                this.i = u3c.b(i6, i6);
            }
            if (q2gVarE != null) {
                this.j = q2gVarE;
            }
        }
    }

    public final void j() {
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = eue.c;
            int i2 = (int) (j & 4294967295L);
            long jF = q3c.f(dec.e(i2, str), i2, this.a);
            int i3 = (int) (jF >> 32);
            q2g q2gVarE = qk2.E(jF);
            if (i3 != i2 || !eue.d(this.i)) {
                this.i = u3c.b(i3, i3);
            }
            if (q2gVarE != null) {
                this.j = q2gVarE;
            }
        }
    }

    public final void k() {
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = (int) (4294967295L & j);
            int iN = xdc.n(str, eue.g(j));
            if (iN == eue.g(this.i) && iN != 0) {
                iN = xdc.n(str, iN - 1);
            }
            long jF = q3c.f(iN, i, this.a);
            int i2 = (int) (jF >> 32);
            q2g q2gVarE = qk2.E(jF);
            if (i2 != i || !eue.d(this.i)) {
                this.i = u3c.b(i2, i2);
            }
            if (q2gVarE != null) {
                this.j = q2gVarE;
            }
        }
    }

    public final void l() {
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = eue.c;
            int i2 = (int) (j & 4294967295L);
            int i3 = 0;
            ste steVar = this.b;
            if (steVar != null) {
                for (int i4 = i2; i4 > 0; i4--) {
                    int length = str.length() - 1;
                    if (i4 <= length) {
                        length = i4;
                    }
                    long jM = steVar.m(length);
                    int i5 = eue.c;
                    int i6 = (int) (jM >> 32);
                    if (i6 < i4) {
                        i3 = i6;
                        break;
                    }
                }
            }
            long jF = q3c.f(i3, i2, this.a);
            int i7 = (int) (jF >> 32);
            q2g q2gVarE = qk2.E(jF);
            if (i7 != i2 || !eue.d(this.i)) {
                this.i = u3c.b(i7, i7);
            }
            if (q2gVarE != null) {
                this.j = q2gVarE;
            }
        }
    }

    public final void m() {
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = eue.c;
            int i2 = (int) (j & 4294967295L);
            long jF = q3c.f(str.length(), i2, this.a);
            int i3 = (int) (jF >> 32);
            q2g q2gVarE = qk2.E(jF);
            if (i3 != i2 || !eue.d(this.i)) {
                this.i = u3c.b(i3, i3);
            }
            if (q2gVarE != null) {
                this.j = q2gVarE;
            }
        }
    }

    public final void n() {
        this.f.a = Float.NaN;
        if (this.k.length() > 0) {
            long j = this.i;
            int i = eue.c;
            int i2 = (int) (j & 4294967295L);
            long jF = q3c.f(0, i2, this.a);
            int i3 = (int) (jF >> 32);
            q2g q2gVarE = qk2.E(jF);
            if (i3 != i2 || !eue.d(this.i)) {
                this.i = u3c.b(i3, i3);
            }
            if (q2gVarE != null) {
                this.j = q2gVarE;
            }
        }
    }

    public final void o() {
        int length;
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = eue.c;
            int i2 = (int) (4294967295L & j);
            ste steVar = this.b;
            if (steVar != null) {
                b59 b59Var = steVar.b;
                length = b59Var.c(b59Var.d(eue.f(j)), true);
            } else {
                length = str.length();
            }
            long jF = q3c.f(length, i2, this.a);
            int i3 = (int) (jF >> 32);
            q2g q2gVarE = qk2.E(jF);
            if (i3 != i2 || !eue.d(this.i)) {
                this.i = u3c.b(i3, i3);
            }
            if (q2gVarE != null) {
                this.j = q2gVarE;
            }
        }
    }

    public final void p() {
        int iJ;
        this.f.a = Float.NaN;
        if (this.k.length() > 0) {
            long j = this.i;
            int i = eue.c;
            int i2 = (int) (4294967295L & j);
            ste steVar = this.b;
            if (steVar != null) {
                iJ = steVar.j(steVar.b.d(eue.g(j)));
            } else {
                iJ = 0;
            }
            long jF = q3c.f(iJ, i2, this.a);
            int i3 = (int) (jF >> 32);
            q2g q2gVarE = qk2.E(jF);
            if (i3 != i2 || !eue.d(this.i)) {
                this.i = u3c.b(i3, i3);
            }
            if (q2gVarE != null) {
                this.j = q2gVarE;
            }
        }
    }

    public final void q() {
        ste steVar = this.b;
        int iC = steVar != null ? c(steVar, -1) : Integer.MIN_VALUE;
        if (iC == Integer.MIN_VALUE) {
            this.f.a = Float.NaN;
        }
        if (this.k.length() > 0) {
            long j = this.i;
            int i = eue.c;
            int i2 = (int) (j & 4294967295L);
            if (iC < 0) {
                iC = 0;
            }
            long jF = q3c.f(iC, i2, this.a);
            int i3 = (int) (jF >> 32);
            q2g q2gVarE = qk2.E(jF);
            if (i3 != i2 || !eue.d(this.i)) {
                this.i = u3c.b(i3, i3);
            }
            if (q2gVarE != null) {
                this.j = q2gVarE;
            }
        }
    }

    public final void r() {
        if (this.k.length() > 0) {
            long j = this.i;
            int i = eue.c;
            int i2 = (int) (j & 4294967295L);
            long jF = q3c.f(d(-1), i2, this.a);
            int i3 = (int) (jF >> 32);
            q2g q2gVarE = qk2.E(jF);
            if (i3 != i2 || !eue.d(this.i)) {
                this.i = u3c.b(i3, i3);
            }
            if (q2gVarE != null) {
                this.j = q2gVarE;
            }
        }
    }

    public final void s() {
        if (this.k.length() > 0) {
            long j = this.g.d;
            int i = eue.c;
            this.i = u3c.b((int) (j >> 32), (int) (this.i & 4294967295L));
        }
    }
}
