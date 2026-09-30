package androidx.compose.foundation.layout;

import defpackage.j09;
import defpackage.j94;
import defpackage.jx0;
import defpackage.kx0;
import defpackage.lx0;
import defpackage.ndb;
import defpackage.pa7;
import defpackage.z8d;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final FillElement a;
    public static final FillElement b;
    public static final FillElement c;
    public static final d d;
    public static final d e;
    public static final d f;
    public static final d g;
    public static final d h;
    public static final d i;

    static {
        j94 j94Var = j94.b;
        a = new FillElement(j94Var, 1.0f);
        j94 j94Var2 = j94.a;
        b = new FillElement(j94Var2, 1.0f);
        j94 j94Var3 = j94.c;
        c = new FillElement(j94Var3, 1.0f);
        jx0 jx0Var = ndb.Z;
        int i2 = 19;
        d = new d(j94Var, false, new z8d(i2, jx0Var), jx0Var);
        jx0 jx0Var2 = ndb.Y;
        e = new d(j94Var, false, new z8d(i2, jx0Var2), jx0Var2);
        kx0 kx0Var = ndb.z;
        int i3 = 20;
        f = new d(j94Var2, false, new z8d(i3, kx0Var), kx0Var);
        kx0 kx0Var2 = ndb.y;
        g = new d(j94Var2, false, new z8d(i3, kx0Var2), kx0Var2);
        lx0 lx0Var = ndb.f;
        int i4 = 21;
        h = new d(j94Var3, false, new z8d(i4, lx0Var), lx0Var);
        lx0 lx0Var2 = ndb.b;
        i = new d(j94Var3, false, new z8d(i4, lx0Var2), lx0Var2);
    }

    public static final j09 a(j09 j09Var, float f2, float f3) {
        return j09Var.D(new c(f2, f3));
    }

    public static j09 b(float f2, float f3, j09 j09Var, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return a(j09Var, f2, f3);
    }

    public static final j09 c(j09 j09Var, float f2) {
        return j09Var.D(f2 == 1.0f ? a : new FillElement(j94.b, f2));
    }

    public static final j09 d(j09 j09Var, float f2) {
        return j09Var.D(new a(0.0f, f2, 0.0f, f2, 5, true));
    }

    public static final j09 e(j09 j09Var, float f2, float f3) {
        return j09Var.D(new a(0.0f, f2, 0.0f, f3, 5, true));
    }

    public static j09 f(float f2, float f3, j09 j09Var, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return e(j09Var, f2, f3);
    }

    public static final j09 g(j09 j09Var, float f2) {
        return j09Var.D(new a(0.0f, f2, 0.0f, f2, 5, false));
    }

    public static final j09 h(j09 j09Var, float f2) {
        return j09Var.D(new a(f2, f2, f2, f2, false));
    }

    public static final j09 i(j09 j09Var, float f2, float f3) {
        return j09Var.D(new a(f2, f3, f2, f3, false));
    }

    public static j09 j(float f2, float f3, float f4, float f5, int i2, j09 j09Var) {
        return j09Var.D(new a(f2, (i2 & 2) != 0 ? Float.NaN : f3, (i2 & 4) != 0 ? Float.NaN : f4, (i2 & 8) != 0 ? Float.NaN : f5, false));
    }

    public static final j09 k(j09 j09Var, float f2) {
        return j09Var.D(new a(f2, 0.0f, f2, 0.0f, 10, false));
    }

    public static final j09 l(j09 j09Var, float f2) {
        return j09Var.D(new a(f2, f2, f2, f2, true));
    }

    public static final j09 m(j09 j09Var, float f2, float f3) {
        return j09Var.D(new a(f2, f3, f2, f3, true));
    }

    public static final j09 n(j09 j09Var, float f2, float f3, float f4, float f5) {
        return j09Var.D(new a(f2, f3, f4, f5, true));
    }

    public static j09 o(j09 j09Var, float f2, float f3, float f4, int i2) {
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            f4 = Float.NaN;
        }
        return n(j09Var, f2, f3, f4, Float.NaN);
    }

    public static final j09 p(j09 j09Var, float f2) {
        return j09Var.D(new a(f2, 0.0f, f2, 0.0f, 10, true));
    }

    public static j09 q(float f2, float f3, j09 j09Var, int i2) {
        return j09Var.D(new a((i2 & 1) != 0 ? Float.NaN : f2, 0.0f, (i2 & 2) != 0 ? Float.NaN : f3, 0.0f, 10, true));
    }

    public static j09 r(j09 j09Var) {
        d dVar;
        kx0 kx0Var = ndb.z;
        if (pa7.t(kx0Var, kx0Var)) {
            dVar = f;
        } else if (pa7.t(kx0Var, ndb.y)) {
            dVar = g;
        } else {
            dVar = new d(j94.a, false, new z8d(20, kx0Var), kx0Var);
        }
        return j09Var.D(dVar);
    }

    public static j09 s(j09 j09Var, lx0 lx0Var, int i2) {
        d dVar;
        lx0 lx0Var2 = ndb.f;
        if ((i2 & 1) != 0) {
            lx0Var = lx0Var2;
        }
        if (lx0Var.equals(lx0Var2)) {
            dVar = h;
        } else if (lx0Var.equals(ndb.b)) {
            dVar = i;
        } else {
            dVar = new d(j94.c, false, new z8d(21, lx0Var), lx0Var);
        }
        return j09Var.D(dVar);
    }

    public static final j09 t(j09 j09Var, jx0 jx0Var, boolean z) {
        d dVar;
        if (jx0Var.equals(ndb.Z) && !z) {
            dVar = d;
        } else if (!jx0Var.equals(ndb.Y) || z) {
            dVar = new d(j94.b, z, new z8d(19, jx0Var), jx0Var);
        } else {
            dVar = e;
        }
        return j09Var.D(dVar);
    }

    public static j09 u(j09 j09Var, int i2) {
        return t(j09Var, ndb.Z, (i2 & 2) == 0);
    }
}
