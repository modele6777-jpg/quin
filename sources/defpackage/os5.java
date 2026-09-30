package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class os5 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;

    public os5(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = i10;
        this.k = i11;
        this.l = i12;
        this.m = i13;
        this.n = i14;
        this.o = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os5)) {
            return false;
        }
        os5 os5Var = (os5) obj;
        return this.a == os5Var.a && this.b == os5Var.b && this.c == os5Var.c && this.d == os5Var.d && this.e == os5Var.e && this.f == os5Var.f && this.g == os5Var.g && this.h == os5Var.h && this.i == os5Var.i && this.j == os5Var.j && this.k == os5Var.k && this.l == os5Var.l && this.m == os5Var.m && this.n == os5Var.n && this.o == os5Var.o;
    }

    public final int hashCode() {
        return Integer.hashCode(this.o) + ub3.b(this.n, ub3.b(this.m, ub3.b(this.l, ub3.b(this.k, ub3.b(this.j, ub3.b(this.i, ub3.b(this.h, ub3.b(this.g, ub3.b(this.f, ub3.b(this.e, ub3.b(this.d, ub3.b(this.c, ub3.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = ib8.n(this.a, this.b, "FourSeasonsArtwork(homeArtwork=", ", homeArtworkGreyscale=", ", introKv=");
        ub3.u(sbN, this.c, ", spreadLight=", this.d, ", spreadDark=");
        ub3.u(sbN, this.e, ", reportPreview1Light=", this.f, ", reportPreview1Dark=");
        ub3.u(sbN, this.g, ", reportPreview2Light=", this.h, ", reportPreview2Dark=");
        ub3.u(sbN, this.i, ", reportPreview3Light=", this.j, ", reportPreview3Dark=");
        ub3.u(sbN, this.k, ", shareThumbnail=", this.l, ", step1=");
        ub3.u(sbN, this.m, ", step2=", this.n, ", step3=");
        return tec.g(this.o, ")", sbN);
    }
}
