package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x04 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;

    public x04(String str, int i, int i2, int i3) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x04)) {
            return false;
        }
        x04 x04Var = (x04) obj;
        return this.a == x04Var.a && this.b.equals(x04Var.b) && this.c == x04Var.c && this.d == x04Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ub3.b(this.c, ub3.c(Integer.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "DevPushTemplate(index=" + this.a + ", pushId=" + this.b + ", titleRes=" + this.c + ", bodyRes=" + this.d + ")";
    }
}
