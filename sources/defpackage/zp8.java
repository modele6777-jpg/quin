package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zp8 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public zp8(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final zp8 a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new zp8(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b(zp8 zp8Var) {
        if (zp8Var == null) {
            return false;
        }
        if (this == zp8Var) {
            return true;
        }
        return this.a.equals(zp8Var.a) && this.b == zp8Var.b && this.c == zp8Var.c && this.d == zp8Var.d;
    }

    public final boolean c() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp8)) {
            return false;
        }
        zp8 zp8Var = (zp8) obj;
        return b(zp8Var) && this.e == zp8Var.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public zp8(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public zp8(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public zp8(Object obj) {
        this(-1L, obj);
    }
}
