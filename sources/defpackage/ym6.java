package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ym6 {
    public final bn6 a;
    public final long b;

    public ym6() {
        this.a = bn6.a;
        this.b = 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym6)) {
            return false;
        }
        ym6 ym6Var = (ym6) obj;
        return this.a == ym6Var.a && this.b == ym6Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Request(presentation=" + this.a + ", delayMillis=" + this.b + ")";
    }

    public ym6(bn6 bn6Var, long j) {
        this.a = bn6Var;
        this.b = j;
    }
}
