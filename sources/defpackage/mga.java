package defpackage;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mga {
    public static final zp8 u = new zp8(new Object());
    public final gye a;
    public final zp8 b;
    public final long c;
    public final long d;
    public final int e;
    public final g45 f;
    public final boolean g;
    public final i1f h;
    public final r1f i;
    public final List j;
    public final zp8 k;
    public final boolean l;
    public final int m;
    public final int n;
    public final nga o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public mga(gye gyeVar, zp8 zp8Var, long j, long j2, int i, g45 g45Var, boolean z, i1f i1fVar, r1f r1fVar, List list, zp8 zp8Var2, boolean z2, int i2, int i3, nga ngaVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = gyeVar;
        this.b = zp8Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = g45Var;
        this.g = z;
        this.h = i1fVar;
        this.i = r1fVar;
        this.j = list;
        this.k = zp8Var2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = ngaVar;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.p = z3;
    }

    public static mga k(r1f r1fVar) {
        dye dyeVar = gye.a;
        i1f i1fVar = i1f.d;
        ey6 ey6Var = jy6.b;
        yob yobVar = yob.e;
        nga ngaVar = nga.d;
        zp8 zp8Var = u;
        return new mga(dyeVar, zp8Var, -9223372036854775807L, 0L, 1, null, false, i1fVar, r1fVar, yobVar, zp8Var, false, 1, 0, ngaVar, 0L, 0L, 0L, 0L, false);
    }

    public final mga a() {
        return new mga(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, l(), SystemClock.elapsedRealtime(), this.p);
    }

    public final mga b(boolean z) {
        return new mga(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final mga c(zp8 zp8Var) {
        return new mga(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, zp8Var, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final mga d(zp8 zp8Var, long j, long j2, long j3, long j4, i1f i1fVar, r1f r1fVar, List list) {
        return new mga(this.a, zp8Var, j2, j3, this.e, this.f, this.g, i1fVar, r1fVar, list, this.k, this.l, this.m, this.n, this.o, this.q, j4, j, SystemClock.elapsedRealtime(), this.p);
    }

    public final mga e(int i, int i2, boolean z) {
        return new mga(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final mga f(g45 g45Var) {
        return new mga(this.a, this.b, this.c, this.d, this.e, g45Var, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final mga g(nga ngaVar) {
        return new mga(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, ngaVar, this.q, this.r, this.s, this.t, this.p);
    }

    public final mga h(int i) {
        return new mga(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final mga i(boolean z) {
        return new mga(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z);
    }

    public final mga j(gye gyeVar) {
        return new mga(gyeVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final long l() {
        long j;
        long j2;
        if (!m()) {
            return this.s;
        }
        do {
            j = this.t;
            j2 = this.s;
        } while (j != this.t);
        return pqf.H(pqf.R(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.o.a)));
    }

    public final boolean m() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
