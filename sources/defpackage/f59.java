package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f59 {
    public k00 a;
    public xp5 b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public List g;
    public co0 h;
    public sv8 i;
    public long j;
    public sw3 k;
    public mue l;
    public a82 m;
    public cv7 n;
    public ste o;
    public int p;
    public int q;
    public e59 r;
    public long s;

    public f59(k00 k00Var, mue mueVar, xp5 xp5Var, int i, boolean z, int i2, int i3, List list, co0 co0Var) {
        this.a = k00Var;
        this.b = xp5Var;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.h = co0Var;
        int i4 = s37.b;
        this.j = s37.a;
        this.l = mueVar;
        this.p = -1;
        this.q = -1;
    }

    public final int a(int i, cv7 cv7Var) {
        int i2 = this.p;
        int i3 = this.q;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = ll2.a(0, i, 0, Integer.MAX_VALUE);
        if (this.f > 1) {
            jA = h(jA, cv7Var);
        }
        int iC = gdc.c(b(jA, cv7Var).e);
        int i4 = kl2.i(jA);
        if (iC < i4) {
            iC = i4;
        }
        this.p = i;
        this.q = iC;
        return iC;
    }

    public final b59 b(long j, cv7 cv7Var) {
        a82 a82VarE = e(cv7Var);
        long jM = y41.m(a82VarE.i(), this.c, j, this.d);
        boolean z = this.d;
        int i = this.c;
        int i2 = this.e;
        return new b59(a82VarE, jM, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }

    public final boolean c(long j, cv7 cv7Var) {
        this.s = (this.s << 2) | 3;
        long jH = this.f > 1 ? h(j, cv7Var) : j;
        ste steVar = this.o;
        if (steVar != null) {
            b59 b59Var = steVar.b;
            rte rteVar = steVar.a;
            if (!b59Var.a.e()) {
                cv7 cv7Var2 = rteVar.h;
                long j2 = rteVar.j;
                if (cv7Var == cv7Var2 && (kl2.b(jH, j2) || (kl2.h(jH) == kl2.h(j2) && kl2.j(jH) == kl2.j(j2) && kl2.g(jH) >= b59Var.e && !b59Var.c))) {
                    ste steVar2 = this.o;
                    steVar2.getClass();
                    if (kl2.b(jH, steVar2.a.j)) {
                        return false;
                    }
                    ste steVar3 = this.o;
                    steVar3.getClass();
                    this.o = g(cv7Var, jH, steVar3.b);
                    return true;
                }
            }
        }
        co0 co0Var = this.h;
        if (co0Var != null) {
            this.n = cv7Var;
            long j3 = this.l.a.b;
            e59 e59Var = this.r;
            if (e59Var == null) {
                e59Var = new e59(this);
                this.r = e59Var;
            }
            float fQ0 = e59Var.Q0(co0Var.c);
            float fQ1 = e59Var.Q0(co0Var.a);
            float fQ2 = e59Var.Q0(co0Var.b);
            float f = 2.0f;
            float f2 = (fQ1 + fQ2) / 2.0f;
            float f3 = fQ2;
            float f4 = fQ1;
            while (f3 - f4 >= fQ0) {
                float f5 = f;
                float f6 = f3;
                if (co0.a(e59Var.a(j, e59Var.S(f2)))) {
                    f3 = f2;
                } else {
                    f4 = f2;
                    f3 = f6;
                }
                f2 = (f4 + f3) / f5;
                f = f5;
            }
            float fFloor = (((float) Math.floor((f4 - fQ1) / fQ0)) * fQ0) + fQ1;
            float f7 = fQ0 + fFloor;
            if (f7 <= fQ2 && !co0.a(e59Var.a(j, e59Var.S(f7)))) {
                fFloor = f7;
            }
            long jS = e59Var.S(fFloor);
            if (wue.d(jS)) {
                jS = g59.a(j3, jS);
            }
            long j4 = jS;
            e59 e59Var2 = this.r;
            if (e59Var2 == null) {
                e59Var2 = new e59(this);
                this.r = e59Var2;
            }
            ste steVar4 = e59Var2.a;
            if (steVar4 != null) {
                rte rteVar2 = steVar4.a;
                if (wue.a(j4, rteVar2.b.a.b) && rteVar2.f == this.c) {
                    this.o = steVar4;
                    return true;
                }
            }
            f(mue.a(this.l, 0L, j4, null, null, 0L, null, 0, 0L, null, null, 16777213));
        }
        this.o = g(cv7Var, jH, b(jH, cv7Var));
        return true;
    }

    public final void d(sw3 sw3Var) {
        long jA;
        sw3 sw3Var2 = this.k;
        if (sw3Var != null) {
            int i = s37.b;
            jA = s37.a(sw3Var.getDensity(), sw3Var.h0());
        } else {
            jA = s37.a;
        }
        if (sw3Var2 == null) {
            this.k = sw3Var;
            this.j = jA;
            return;
        }
        if (sw3Var == null || this.j != jA) {
            this.k = sw3Var;
            this.j = jA;
            this.s = (this.s << 2) | 1;
            this.m = null;
            this.o = null;
            this.q = -1;
            this.p = -1;
            this.r = null;
        }
    }

    public final a82 e(cv7 cv7Var) {
        a82 a82Var = this.m;
        if (a82Var == null || cv7Var != this.n || a82Var.e()) {
            this.n = cv7Var;
            k00 k00Var = this.a;
            mue mueVarK = a6c.k(this.l, cv7Var);
            sw3 sw3Var = this.k;
            sw3Var.getClass();
            xp5 xp5Var = this.b;
            List list = this.g;
            if (list == null) {
                list = pu4.a;
            }
            a82Var = new a82(k00Var, sw3Var, xp5Var, mueVarK, list, this.d);
        }
        this.m = a82Var;
        return a82Var;
    }

    public final void f(mue mueVar) {
        boolean zD = mueVar.d(this.l);
        this.l = mueVar;
        if (zD) {
            return;
        }
        this.s <<= 2;
        this.m = null;
        this.o = null;
        this.q = -1;
        this.p = -1;
    }

    public final ste g(cv7 cv7Var, long j, b59 b59Var) {
        float fMin = Math.min(b59Var.a.i(), b59Var.d);
        k00 k00Var = this.a;
        mue mueVar = this.l;
        List list = this.g;
        if (list == null) {
            list = pu4.a;
        }
        int i = this.e;
        boolean z = this.d;
        int i2 = this.c;
        sw3 sw3Var = this.k;
        sw3Var.getClass();
        return new ste(new rte(k00Var, mueVar, list, i, z, i2, sw3Var, cv7Var, this.b, j), b59Var, ll2.d(j, (((long) gdc.c(fMin)) << 32) | (((long) gdc.c(b59Var.e)) & 4294967295L)));
    }

    public final long h(long j, cv7 cv7Var) {
        sv8 sv8Var = this.i;
        mue mueVar = this.l;
        sw3 sw3Var = this.k;
        sw3Var.getClass();
        sv8 sv8VarC = m93.C(sv8Var, cv7Var, mueVar, sw3Var, this.b);
        this.i = sv8VarC;
        return sv8VarC.a(this.f, j);
    }

    public final String toString() {
        String str = this.o != null ? "<TextLayoutResult>" : "null";
        String strB = s37.b(this.j);
        long j = this.s;
        ste steVar = this.o;
        Object kl2Var = steVar != null ? new kl2(steVar.a.j) : "null";
        StringBuilder sbO = ib8.o("MultiParagraphLayoutCache(textLayoutResult=", str, ", lastDensity=", strB, ", history=");
        sbO.append(j);
        sbO.append(", constraints=");
        sbO.append(kl2Var);
        sbO.append(")");
        return sbO.toString();
    }
}
