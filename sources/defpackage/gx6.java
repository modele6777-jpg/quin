package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gx6 {
    public static int k;
    public static final y25 l = new y25(7);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final lsf f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public gx6(String str, float f, float f2, float f3, float f4, lsf lsfVar, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = lsfVar;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx6)) {
            return false;
        }
        gx6 gx6Var = (gx6) obj;
        if (!pa7.t(this.a, gx6Var.a) || !yi4.b(this.b, gx6Var.b) || !yi4.b(this.c, gx6Var.c) || this.d != gx6Var.d || this.e != gx6Var.e || !this.f.equals(gx6Var.f)) {
            return false;
        }
        long j = gx6Var.g;
        int i = y72.l;
        return faf.a(this.g, j) && this.h == gx6Var.h && this.i == gx6Var.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ub3.a(this.e, ub3.a(this.d, ub3.a(this.c, ub3.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = y72.l;
        return Boolean.hashCode(this.i) + ub3.b(this.h, ib8.b(iHashCode, 31, this.g), 31);
    }
}
