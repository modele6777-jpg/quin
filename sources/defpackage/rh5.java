package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rh5 implements g7g {
    public final int a;
    public final int b;
    public final int c;

    public rh5(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.g7g
    public final int a(sw3 sw3Var) {
        return this.b;
    }

    @Override // defpackage.g7g
    public final int b(sw3 sw3Var, cv7 cv7Var) {
        return this.c;
    }

    @Override // defpackage.g7g
    public final int c(sw3 sw3Var) {
        return 0;
    }

    @Override // defpackage.g7g
    public final int d(sw3 sw3Var, cv7 cv7Var) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh5)) {
            return false;
        }
        rh5 rh5Var = (rh5) obj;
        return this.a == rh5Var.a && this.b == rh5Var.b && this.c == rh5Var.c;
    }

    public final int hashCode() {
        return ((((this.a * 31) + this.b) * 31) + this.c) * 31;
    }

    public final String toString() {
        return tec.g(this.c, ", bottom=0)", ib8.n(this.a, this.b, "Insets(left=", ", top=", ", right="));
    }
}
