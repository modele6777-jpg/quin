package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ev7 {
    public final int a;
    public final int b;
    public final boolean c;

    public ev7(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev7)) {
            return false;
        }
        ev7 ev7Var = (ev7) obj;
        return this.a == ev7Var.a && this.b == ev7Var.b && this.c == ev7Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ub3.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return ub3.m(ib8.n(this.a, this.b, "BidiRun(start=", ", end=", ", isRtl="), this.c, ")");
    }
}
