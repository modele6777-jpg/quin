package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ps5 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public ps5(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps5)) {
            return false;
        }
        ps5 ps5Var = (ps5) obj;
        return this.a == ps5Var.a && this.b == ps5Var.b && this.c == ps5Var.c && this.d == ps5Var.d && this.e == ps5Var.e && this.f == ps5Var.f && this.g == ps5Var.g && this.h == ps5Var.h && this.i == ps5Var.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + ub3.b(this.h, ub3.b(this.g, ub3.b(this.f, ub3.b(this.e, ub3.b(this.d, ub3.b(this.c, ub3.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = ib8.n(this.a, this.b, "FourSeasonsCtaCopy(subscribeUnlock=", ", subscribeDesc=", ", earlyBird=");
        ub3.u(sbN, this.c, ", earlyBirdOrigin=", this.d, ", unlockedLocked=");
        ub3.u(sbN, this.e, ", remind=", this.f, ", ended=");
        ub3.u(sbN, this.g, ", endedPurchasedHint=", this.h, ", endedUnpurchasedHint=");
        return tec.g(this.i, ")", sbN);
    }
}
