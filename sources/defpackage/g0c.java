package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g0c implements sw3 {
    public boolean E0;
    public int F0;
    public long G0;
    public uu7 H0;
    public sw3 I0;
    public cv7 J0;
    public nqb K0;
    public c82 L0;
    public int M0;
    public vs9 N0;
    public float X;
    public long Y;
    public x4d Z;
    public int a;
    public float b = 1.0f;
    public float c = 1.0f;
    public float d = 1.0f;
    public float e;
    public float f;
    public float g;
    public long v;
    public long w;
    public float x;
    public float y;
    public float z;

    public g0c() {
        long j = oe6.a;
        this.v = j;
        this.w = j;
        this.X = 8.0f;
        this.Y = r2f.b;
        this.Z = g21.f;
        this.F0 = 0;
        this.G0 = 9205357640488583168L;
        this.H0 = uu7.a;
        this.I0 = g21.b();
        this.J0 = cv7.a;
        this.M0 = 3;
    }

    public final void C(long j) {
        long j2 = this.w;
        int i = y72.l;
        if (faf.a(j2, j)) {
            return;
        }
        this.a |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        this.w = j;
    }

    public final void D(long j) {
        if (r2f.a(this.Y, j)) {
            return;
        }
        this.a |= 4096;
        this.Y = j;
    }

    public final void E(float f) {
        if (this.e == f) {
            return;
        }
        this.a |= 8;
        this.e = f;
    }

    public final void G(float f) {
        if (this.f == f) {
            return;
        }
        this.a |= 16;
        this.f = f;
    }

    public final void a() {
        q(1.0f);
        r(1.0f);
        b(1.0f);
        E(0.0f);
        G(0.0f);
        v(0.0f);
        long j = oe6.a;
        c(j);
        C(j);
        l(0.0f);
        n(0.0f);
        p(0.0f);
        e(8.0f);
        D(r2f.b);
        w(g21.f);
        g(false);
        k(null);
        h(null);
        d(3);
        j(0);
        uu7 uu7Var = uu7.a;
        if (!pa7.t(this.H0, uu7Var)) {
            this.a |= 1048576;
            this.H0 = uu7Var;
        }
        this.G0 = 9205357640488583168L;
        this.N0 = null;
        this.a = 0;
    }

    public final void b(float f) {
        if (this.d == f) {
            return;
        }
        this.a |= 4;
        this.d = f;
    }

    public final void c(long j) {
        long j2 = this.v;
        int i = y72.l;
        if (faf.a(j2, j)) {
            return;
        }
        this.a |= 64;
        this.v = j;
    }

    public final void d(int i) {
        if (this.M0 == i) {
            return;
        }
        this.a |= 524288;
        this.M0 = i;
    }

    public final void e(float f) {
        if (this.X == f) {
            return;
        }
        this.a |= 2048;
        this.X = f;
    }

    public final void g(boolean z) {
        if (this.E0 != z) {
            this.a |= 16384;
            this.E0 = z;
        }
    }

    @Override // defpackage.sw3
    public final float getDensity() {
        return this.I0.getDensity();
    }

    public final void h(c82 c82Var) {
        if (pa7.t(this.L0, c82Var)) {
            return;
        }
        this.a |= 262144;
        this.L0 = c82Var;
    }

    @Override // defpackage.sw3
    public final float h0() {
        return this.I0.h0();
    }

    public final void j(int i) {
        if (this.F0 == i) {
            return;
        }
        this.a |= 32768;
        this.F0 = i;
    }

    public final void k(nqb nqbVar) {
        if (pa7.t(this.K0, nqbVar)) {
            return;
        }
        this.a |= 131072;
        this.K0 = nqbVar;
    }

    public final void l(float f) {
        if (this.x == f) {
            return;
        }
        this.a |= 256;
        this.x = f;
    }

    public final void n(float f) {
        if (this.y == f) {
            return;
        }
        this.a |= 512;
        this.y = f;
    }

    public final void p(float f) {
        if (this.z == f) {
            return;
        }
        this.a |= UserMetadata.MAX_ATTRIBUTE_SIZE;
        this.z = f;
    }

    public final void q(float f) {
        if (this.b == f) {
            return;
        }
        this.a |= 1;
        this.b = f;
    }

    public final void r(float f) {
        if (this.c == f) {
            return;
        }
        this.a |= 2;
        this.c = f;
    }

    public final void v(float f) {
        if (this.g == f) {
            return;
        }
        this.a |= 32;
        this.g = f;
    }

    public final void w(x4d x4dVar) {
        if (pa7.t(this.Z, x4dVar)) {
            return;
        }
        this.a |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
        this.Z = x4dVar;
    }
}
