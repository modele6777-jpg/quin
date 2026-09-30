package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class we6 {
    public static final /* synthetic */ int a = 0;

    static {
        int i = y72.l;
        int i2 = y72.l;
    }

    public static final q11 a(q11 q11Var, l46 l46Var, int i) {
        if ((i & 1) != 0) {
            q11Var = null;
        }
        if (!e(l46Var)) {
            l46Var.f0(232290393);
            l46Var.r(false);
            return q11Var == null ? x57.b(y72.j, 0.0f) : q11Var;
        }
        l46Var.f0(-1516529248);
        q11 q11VarB = x57.b(eze.a(l46Var).b.x(l46Var), 1.0f);
        l46Var.r(false);
        return q11VarB;
    }

    public static final ar5 b(l46 l46Var) {
        ar5 ar5Var = ar5.c;
        int iOrdinal = ((e8b) l46Var.k(l8b.a)).C.ordinal();
        if (iOrdinal == 0) {
            return ar5Var;
        }
        if (iOrdinal == 1) {
            return ar5.d;
        }
        ap.c();
        return null;
    }

    public static final long c(long j, long j2, l46 l46Var) {
        return e(l46Var) ? j : j2;
    }

    public static final float d(float f, float f2, l46 l46Var) {
        return e(l46Var) ? f : f2;
    }

    public static final boolean e(l46 l46Var) {
        return k8b.f((e8b) l46Var.k(l8b.a));
    }

    public static final x4d f(x4d x4dVar, l46 l46Var) {
        x4dVar.getClass();
        return e(l46Var) ? g21.f : x4dVar;
    }

    public static final float g(float f, l46 l46Var) {
        if (e(l46Var)) {
            return 0.0f;
        }
        return f;
    }
}
