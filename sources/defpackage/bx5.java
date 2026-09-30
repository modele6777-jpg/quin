package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bx5 {
    public static final yv5 a = new yv5(abg.d(4287731733L), abg.d(4290034246L), abg.d(4286350093L), abg.d(4290165824L), abg.d(4290625682L), abg.d(4282993205L), abg.d(4292927951L), abg.d(4280624668L), abg.d(4281348385L), abg.c(647075861), abg.c(1302439498), abg.c(1306518192), abg.c(1297372730));
    public static final yv5 b = new yv5(abg.d(4288179221L), abg.d(4290417478L), abg.d(4286798861L), abg.d(4290417478L), abg.d(4290818194L), abg.d(4284370995L), abg.d(4292991951L), abg.d(4280689436L), abg.d(4280689436L), abg.c(647523349), abg.c(1304073030), abg.c(1306710448), abg.c(1298026547));
    public static final pr4 c = new pr4(1, new mz4(26));
    public static final long d = abg.d(4293585404L);
    public static final long e = abg.d(4280032297L);

    public static final void a(mic micVar, dd2 dd2Var, l46 l46Var, int i) {
        int i2;
        l46 l46Var2;
        micVar.getClass();
        l46Var.h0(1349346583);
        if ((i & 6) == 0) {
            i2 = (l46Var.e(micVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(dd2Var) ? 32 : 16;
        }
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            boolean zS = g21.S(l46Var);
            l46Var2 = l46Var;
            o7c.a(!zS, !zS ? l8b.b : l8b.c, af1.b0(672632169, new o14(20, micVar, dd2Var), l46Var), l46Var2, 384, 0);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gc(micVar, dd2Var, i, 22);
        }
    }

    public static final yv5 b(l46 l46Var) {
        return (yv5) l46Var.k(c);
    }

    public static final u51 c(l46 l46Var) {
        long j = b(l46Var).a;
        bx9 bx9Var = v51.a;
        return v51.a(j, eze.a(l46Var).b.A(l46Var), y72.b(j, 0.38f), y72.b(eze.a(l46Var).b.A(l46Var), 0.38f), l46Var, 0);
    }

    public static final long d(l46 l46Var) {
        if (g21.S(l46Var)) {
            l46Var.f0(612003943);
            long j = b(l46Var).c;
            l46Var.r(false);
            return j;
        }
        l46Var.f0(612005415);
        long j2 = b(l46Var).b;
        l46Var.r(false);
        return j2;
    }

    public static final long e(l46 l46Var) {
        boolean z;
        if (pa7.t(b(l46Var), b)) {
            l46Var.f0(-456356662);
            z = !g21.S(l46Var);
            l46Var.r(false);
        } else {
            l46Var.f0(-1262153397);
            l46Var.r(false);
            z = false;
        }
        if (z) {
            l46Var.f0(-1262137396);
            l46Var.r(false);
            return abg.c(268435455);
        }
        l46Var.f0(-1262104381);
        long j = ((e8b) l46Var.k(l8b.a)).f;
        l46Var.r(false);
        return j;
    }

    public static final long f(l46 l46Var) {
        return g21.S(l46Var) ? abg.d(3103784959L) : abg.c(352321535);
    }

    public static final long g(l46 l46Var) {
        if (pa7.t(b(l46Var), b)) {
            l46Var.f0(-1233928984);
            long j = ((e8b) l46Var.k(l8b.a)).e;
            l46Var.r(false);
            return j;
        }
        l46Var.f0(-1233928086);
        long j2 = ((e8b) l46Var.k(l8b.a)).a;
        l46Var.r(false);
        return j2;
    }
}
