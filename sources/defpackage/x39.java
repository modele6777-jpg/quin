package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x39 {
    public final long a;
    public final long b;
    public final boolean c;

    public x39(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final x39 a(x39 x39Var) {
        return new x39(hl9.g(this.a, x39Var.a), Math.max(this.b, x39Var.b), this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x39)) {
            return false;
        }
        x39 x39Var = (x39) obj;
        return hl9.c(this.a, x39Var.a) && this.b == x39Var.b && this.c == x39Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ib8.b(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + hl9.i(this.a) + ", timeMillis=" + this.b + ", shouldApplyImmediately=" + this.c + ")";
    }
}
