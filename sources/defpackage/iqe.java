package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iqe {
    public final k00 a;
    public final long b;
    public final ste c;
    public final sl9 d;
    public final due e;
    public long f;
    public final k00 g;
    public final zse h;
    public final tte i;

    public iqe(zse zseVar, sl9 sl9Var, tte tteVar, due dueVar) {
        k00 k00Var = zseVar.a;
        long j = zseVar.b;
        ste steVar = tteVar != null ? tteVar.a : null;
        this.a = k00Var;
        this.b = j;
        this.c = steVar;
        this.d = sl9Var;
        this.e = dueVar;
        this.f = j;
        this.g = k00Var;
        this.h = zseVar;
        this.i = tteVar;
    }

    public final List a(a26 a26Var) {
        if (!eue.d(this.f)) {
            return t72.I(new ba2("", 0), new a3d(eue.g(this.f), eue.g(this.f)));
        }
        vs4 vs4Var = (vs4) a26Var.d(this);
        if (vs4Var != null) {
            return t72.H(vs4Var);
        }
        return null;
    }

    public final Integer b() {
        ste steVar = this.c;
        if (steVar == null) {
            return null;
        }
        b59 b59Var = steVar.b;
        int iF = eue.f(this.f);
        sl9 sl9Var = this.d;
        return Integer.valueOf(sl9Var.j(b59Var.c(b59Var.d(sl9Var.v(iF)), true)));
    }

    public final Integer c() {
        ste steVar = this.c;
        if (steVar == null) {
            return null;
        }
        int iG = eue.g(this.f);
        sl9 sl9Var = this.d;
        return Integer.valueOf(sl9Var.j(steVar.j(steVar.b.d(sl9Var.v(iG)))));
    }

    public final Integer d() {
        int length;
        ste steVar = this.c;
        if (steVar == null) {
            return null;
        }
        int iR = r();
        while (true) {
            k00 k00Var = this.a;
            if (iR < k00Var.b.length()) {
                int length2 = this.g.b.length() - 1;
                if (iR <= length2) {
                    length2 = iR;
                }
                long jM = steVar.m(length2);
                int i = eue.c;
                int i2 = (int) (jM & 4294967295L);
                if (i2 > iR) {
                    length = this.d.j(i2);
                    break;
                }
                iR++;
            } else {
                length = k00Var.b.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int iJ;
        ste steVar = this.c;
        if (steVar == null) {
            return null;
        }
        for (int iR = r(); iR > 0; iR--) {
            int length = this.g.b.length() - 1;
            if (iR <= length) {
                length = iR;
            }
            long jM = steVar.m(length);
            int i = eue.c;
            int i2 = (int) (jM >> 32);
            if (i2 < iR) {
                iJ = this.d.j(i2);
                return Integer.valueOf(iJ);
            }
        }
        iJ = 0;
        return Integer.valueOf(iJ);
    }

    public final boolean f() {
        ste steVar = this.c;
        return (steVar != null ? steVar.k(r()) : null) != txb.b;
    }

    public final int g(ste steVar, int i) {
        int iR = r();
        due dueVar = this.e;
        if (dueVar.a == null) {
            dueVar.a = Float.valueOf(steVar.c(iR).a);
        }
        b59 b59Var = steVar.b;
        int iD = b59Var.d(iR) + i;
        if (iD < 0) {
            return 0;
        }
        if (iD >= b59Var.f) {
            return this.g.b.length();
        }
        float fB = b59Var.b(iD) - 1.0f;
        Float f = dueVar.a;
        f.getClass();
        float fFloatValue = f.floatValue();
        if ((f() && fFloatValue >= steVar.i(iD)) || (!f() && fFloatValue <= steVar.h(iD))) {
            return b59Var.c(iD, true);
        }
        return this.d.j(b59Var.g((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final int h(tte tteVar, int i) {
        hkb hkbVarM;
        bv7 bv7Var = tteVar.b;
        ste steVar = tteVar.a;
        if (bv7Var == null) {
            hkbVarM = hkb.e;
        } else {
            bv7 bv7Var2 = tteVar.c;
            hkbVarM = bv7Var2 != null ? bv7Var2.M(bv7Var, true) : null;
            if (hkbVarM == null) {
                hkbVarM = hkb.e;
            }
        }
        long j = this.h.b;
        int i2 = eue.c;
        sl9 sl9Var = this.d;
        hkb hkbVarC = steVar.c(sl9Var.v((int) (j & 4294967295L)));
        float f = hkbVarC.a;
        return sl9Var.j(steVar.b.g((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (hkbVarM.e() & 4294967295L)) * i) + hkbVarC.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
    }

    public final void i() {
        due dueVar = this.e;
        dueVar.a = null;
        k00 k00Var = this.g;
        if (k00Var.b.length() > 0) {
            if (f()) {
                k();
                return;
            }
            dueVar.a = null;
            if (k00Var.b.length() > 0) {
                String str = k00Var.b;
                long j = this.f;
                int i = eue.c;
                int iD = dec.d((int) (j & 4294967295L), str);
                if (iD != -1) {
                    q(iD, iD);
                }
            }
        }
    }

    public final void j() {
        this.e.a = null;
        k00 k00Var = this.g;
        String str = k00Var.b;
        String str2 = k00Var.b;
        if (str.length() > 0) {
            int iM = xdc.m(str2, eue.f(this.f));
            if (iM == eue.f(this.f) && iM != str2.length()) {
                iM = xdc.m(str2, iM + 1);
            }
            q(iM, iM);
        }
    }

    public final void k() {
        this.e.a = null;
        k00 k00Var = this.g;
        if (k00Var.b.length() > 0) {
            String str = k00Var.b;
            long j = this.f;
            int i = eue.c;
            int iE = dec.e((int) (j & 4294967295L), str);
            if (iE != -1) {
                q(iE, iE);
            }
        }
    }

    public final void l() {
        this.e.a = null;
        k00 k00Var = this.g;
        String str = k00Var.b;
        String str2 = k00Var.b;
        if (str.length() > 0) {
            int iN = xdc.n(str2, eue.g(this.f));
            if (iN == eue.g(this.f) && iN != 0) {
                iN = xdc.n(str2, iN - 1);
            }
            q(iN, iN);
        }
    }

    public final void m() {
        due dueVar = this.e;
        dueVar.a = null;
        k00 k00Var = this.g;
        if (k00Var.b.length() > 0) {
            if (!f()) {
                k();
                return;
            }
            dueVar.a = null;
            if (k00Var.b.length() > 0) {
                String str = k00Var.b;
                long j = this.f;
                int i = eue.c;
                int iD = dec.d((int) (j & 4294967295L), str);
                if (iD != -1) {
                    q(iD, iD);
                }
            }
        }
    }

    public final void n() {
        Integer numB;
        this.e.a = null;
        if (this.g.b.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        q(iIntValue, iIntValue);
    }

    public final void o() {
        Integer numC;
        this.e.a = null;
        if (this.g.b.length() <= 0 || (numC = c()) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        q(iIntValue, iIntValue);
    }

    public final void p() {
        if (this.g.b.length() > 0) {
            int i = eue.c;
            this.f = u3c.b((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void q(int i, int i2) {
        this.f = u3c.b(i, i2);
    }

    public final int r() {
        long j = this.f;
        int i = eue.c;
        return this.d.v((int) (j & 4294967295L));
    }
}
