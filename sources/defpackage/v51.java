package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v51 {
    public static final bx9 a;
    public static final bx9 b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;

    static {
        float f2 = vfh.x;
        float f3 = vfh.y;
        a = new bx9(f2, 8.0f, f3, 8.0f);
        if (!((f3 >= 0.0f) & (16.0f >= 0.0f) & (8.0f >= 0.0f) & (8.0f >= 0.0f))) {
            g37.a("Padding must be non-negative");
        }
        b = new bx9(12.0f, 8.0f, 12.0f, 8.0f);
        if (!((16.0f >= 0.0f) & (12.0f >= 0.0f) & (8.0f >= 0.0f) & (8.0f >= 0.0f))) {
            g37.a("Padding must be non-negative");
        }
        c = 58.0f;
        d = 40.0f;
        e = 18.0f;
        f = k99.b;
    }

    public static u51 a(long j, long j2, long j3, long j4, l46 l46Var, int i) {
        if ((i & 1) != 0) {
            j = y72.k;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = y72.k;
        }
        long j6 = j2;
        if ((i & 4) != 0) {
            j3 = y72.k;
        }
        return c((m82) l46Var.k(o82.a)).a(j5, j6, j3, (i & 8) != 0 ? y72.k : j4);
    }

    public static u51 b(long j, long j2, l46 l46Var, int i) {
        u51 u51Var;
        long j3 = (i & 2) != 0 ? y72.k : j2;
        long j4 = y72.k;
        m82 m82Var = (m82) l46Var.k(o82.a);
        u51 u51Var2 = m82Var.X;
        if (u51Var2 == null) {
            u51 u51Var3 = new u51(o82.c(m82Var, an1.Y), o82.c(m82Var, an1.J0), y72.b(o82.c(m82Var, an1.Z), an1.E0), y72.b(o82.c(m82Var, an1.F0), an1.G0));
            m82Var.X = u51Var3;
            u51Var = u51Var3;
        } else {
            u51Var = u51Var2;
        }
        return u51Var.a(j, j3, j4, j4);
    }

    public static u51 c(m82 m82Var) {
        u51 u51Var = m82Var.W;
        if (u51Var != null) {
            return u51Var;
        }
        u51 u51Var2 = new u51(o82.c(m82Var, eb3.e), o82.c(m82Var, eb3.y), y72.b(o82.c(m82Var, eb3.f), eb3.g), y72.b(o82.c(m82Var, eb3.v), eb3.w));
        m82Var.W = u51Var2;
        return u51Var2;
    }

    public static u51 d(m82 m82Var) {
        u51 u51Var = m82Var.Y;
        if (u51Var != null) {
            return u51Var;
        }
        long j = y72.j;
        u51 u51Var2 = new u51(j, o82.c(m82Var, if9.m), j, y72.b(o82.c(m82Var, if9.k), if9.l));
        m82Var.Y = u51Var2;
        return u51Var2;
    }

    public static u51 e(m82 m82Var) {
        u51 u51Var = m82Var.Z;
        if (u51Var != null) {
            return u51Var;
        }
        long j = y72.j;
        u51 u51Var2 = new u51(j, o82.c(m82Var, n82.z), j, y72.b(o82.c(m82Var, i7h.I), i7h.J));
        m82Var.Z = u51Var2;
        return u51Var2;
    }

    public static q11 f(boolean z, l46 l46Var) {
        long jB;
        n82 n82Var = if9.n;
        float f2 = k99.c;
        if (z) {
            l46Var.f0(-112346942);
            jB = o82.d(n82Var, l46Var);
            l46Var.r(false);
        } else {
            l46Var.f0(-112259336);
            jB = y72.b(o82.d(n82Var, l46Var), 0.1f);
            l46Var.r(false);
        }
        return x57.b(jB, f2);
    }

    public static u51 g(long j, long j2, l46 l46Var, int i) {
        if ((i & 1) != 0) {
            j = y72.k;
        }
        long j3 = j;
        long j4 = y72.k;
        return d((m82) l46Var.k(o82.a)).a(j3, j2, j4, j4);
    }

    public static u51 h(long j, l46 l46Var) {
        long j2 = y72.k;
        return e((m82) l46Var.k(o82.a)).a(j2, j, j2, j2);
    }
}
