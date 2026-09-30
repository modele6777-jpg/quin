package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ry9 {
    public String a;
    public mue b;
    public xp5 c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public long h;
    public sw3 i;
    public tt j;
    public boolean k;
    public long l;
    public sv8 m;
    public qy9 n;
    public cv7 o;
    public long p;
    public int q;
    public int r;
    public long s;

    public ry9(String str, mue mueVar, xp5 xp5Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = mueVar;
        this.c = xp5Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        int i4 = s37.b;
        this.h = s37.a;
        this.l = 0L;
        if (!(true & true)) {
            k37.a("width and height must be >= 0");
        }
        this.p = ll2.h(0, 0, 0, 0);
        this.q = -1;
        this.r = -1;
    }

    public static long f(ry9 ry9Var, long j, cv7 cv7Var) {
        mue mueVar = ry9Var.b;
        sv8 sv8Var = ry9Var.m;
        sw3 sw3Var = ry9Var.i;
        sw3Var.getClass();
        sv8 sv8VarC = m93.C(sv8Var, cv7Var, mueVar, sw3Var, ry9Var.c);
        ry9Var.m = sv8VarC;
        return sv8VarC.a(ry9Var.g, j);
    }

    public final int a(int i, cv7 cv7Var) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = ll2.a(0, i, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            jA = f(this, jA, cv7Var);
        }
        qy9 qy9VarE = e(cv7Var);
        long jM = y41.m(qy9VarE.i(), this.d, jA, this.e);
        boolean z = this.e;
        int i4 = this.d;
        int i5 = this.f;
        int iC = gdc.c(new tt((xt) qy9VarE, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jM).f);
        int i6 = kl2.i(jA);
        if (iC < i6) {
            iC = i6;
        }
        this.q = i;
        this.r = iC;
        return iC;
    }

    public final boolean b(long j, cv7 cv7Var) {
        qy9 qy9Var;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        long jF = this.g > 1 ? f(this, j, cv7Var) : j;
        tt ttVar = this.j;
        boolean z2 = false;
        if (ttVar != null && (qy9Var = this.n) != null && !qy9Var.e() && cv7Var == this.o && (kl2.b(jF, this.p) || (kl2.h(jF) == kl2.h(this.p) && kl2.j(jF) == kl2.j(this.p) && kl2.g(jF) >= ttVar.f && !ttVar.d.d))) {
            if (!kl2.b(jF, this.p)) {
                tt ttVar2 = this.j;
                ttVar2.getClass();
                long jD = ll2.d(jF, (((long) gdc.c(Math.min(ttVar2.a.w.c(), ttVar2.c()))) << 32) | (((long) gdc.c(ttVar2.f)) & 4294967295L));
                this.l = jD;
                if (this.d == 3 || (((int) (jD >> 32)) >= ttVar2.c() && ((int) (4294967295L & jD)) >= ttVar2.f)) {
                    z = false;
                }
                this.k = z;
                this.p = jF;
            }
            return false;
        }
        qy9 qy9VarE = e(cv7Var);
        long jM = y41.m(qy9VarE.i(), this.d, jF, this.e);
        boolean z3 = this.e;
        int i = this.d;
        int i2 = this.f;
        tt ttVar3 = new tt((xt) qy9VarE, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, jM);
        this.p = jF;
        int iC = gdc.c(ttVar3.c());
        float f = ttVar3.f;
        long jD2 = ll2.d(jF, (((long) gdc.c(f)) & 4294967295L) | (((long) iC) << 32));
        this.l = jD2;
        if (this.d != 3 && (((int) (jD2 >> 32)) < ttVar3.c() || ((int) (jD2 & 4294967295L)) < f)) {
            z2 = true;
        }
        this.k = z2;
        this.j = ttVar3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = ll2.h(0, 0, 0, 0);
        this.l = 0L;
        this.k = false;
    }

    public final void d(sw3 sw3Var) {
        long jA;
        sw3 sw3Var2 = this.i;
        if (sw3Var != null) {
            int i = s37.b;
            jA = s37.a(sw3Var.getDensity(), sw3Var.h0());
        } else {
            jA = s37.a;
        }
        if (sw3Var2 == null) {
            this.i = sw3Var;
            this.h = jA;
        } else if (sw3Var == null || this.h != jA) {
            this.i = sw3Var;
            this.h = jA;
            this.s = (this.s << 2) | 1;
            c();
        }
    }

    public final qy9 e(cv7 cv7Var) {
        qy9 xtVar = this.n;
        if (xtVar == null || cv7Var != this.o || xtVar.e()) {
            this.o = cv7Var;
            String str = this.a;
            mue mueVarK = a6c.k(this.b, cv7Var);
            sw3 sw3Var = this.i;
            sw3Var.getClass();
            xp5 xp5Var = this.c;
            boolean z = this.e;
            pu4 pu4Var = pu4.a;
            xtVar = new xt(str, mueVarK, pu4Var, pu4Var, xp5Var, sw3Var, z);
        }
        this.n = xtVar;
        return xtVar;
    }

    public final String toString() {
        return tec.h(this.s, ", constraints=$)", ib8.o("ParagraphLayoutCache(paragraph=", this.j != null ? "<paragraph>" : "null", ", lastDensity=", s37.b(this.h), ", history="));
    }
}
