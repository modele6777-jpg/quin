package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wp8 {
    public final zp8 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public wp8(zp8 zp8Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        pa7.A(!z4 || z2);
        pa7.A(!z3 || z2);
        if (z && (z2 || z3 || z4)) {
            z5 = false;
        }
        pa7.A(z5);
        this.a = zp8Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final wp8 a(long j) {
        if (j == this.d) {
            return this;
        }
        return new wp8(this.a, this.b, this.c, j, this.e, this.f, this.g, this.h, this.i);
    }

    public final wp8 b(long j, long j2) {
        if (j == this.b && j2 == this.c) {
            return this;
        }
        return new wp8(this.a, j, j2, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wp8.class != obj.getClass()) {
            return false;
        }
        wp8 wp8Var = (wp8) obj;
        return this.b == wp8Var.b && this.d == wp8Var.d && this.e == wp8Var.e && this.f == wp8Var.f && this.g == wp8Var.g && this.h == wp8Var.h && this.i == wp8Var.i && this.a.equals(wp8Var.a);
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
