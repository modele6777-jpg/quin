package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wv1 {
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;

    public wv1(boolean z, int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv1)) {
            return false;
        }
        wv1 wv1Var = (wv1) obj;
        return this.a == wv1Var.a && this.b == wv1Var.b && this.c == wv1Var.c && this.d == wv1Var.d && this.e == wv1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ub3.b(this.d, ub3.b(this.c, ub3.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        boolean z = this.e;
        StringBuilder sbN = ib8.n(i, i2, "Change(preStart=", ", preEnd=", ", originalStart=");
        ub3.u(sbN, i3, ", originalEnd=", i4, ", isFromHardwareSource=");
        return ub3.m(sbN, z, ")");
    }
}
