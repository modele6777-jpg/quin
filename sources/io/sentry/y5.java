package io.sentry;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y5 extends z4 {
    public final long a;
    public final long b;

    public y5() {
        this(System.currentTimeMillis(), System.nanoTime());
    }

    @Override // io.sentry.z4, java.lang.Comparable
    /* JADX INFO: renamed from: a */
    public final int compareTo(z4 z4Var) {
        if (!(z4Var instanceof y5)) {
            return super.compareTo(z4Var);
        }
        y5 y5Var = (y5) z4Var;
        long j = y5Var.a;
        long j2 = this.a;
        return j2 == j ? Long.compare(this.b, y5Var.b) : Long.compare(j2, j);
    }

    @Override // io.sentry.z4
    public final long b(z4 z4Var) {
        return z4Var instanceof y5 ? this.b - ((y5) z4Var).b : super.b(z4Var);
    }

    @Override // io.sentry.z4
    public final long c(z4 z4Var) {
        if (!(z4Var instanceof y5)) {
            return super.c(z4Var);
        }
        y5 y5Var = (y5) z4Var;
        long j = y5Var.b;
        int iCompareTo = compareTo(z4Var);
        long j2 = this.b;
        if (iCompareTo < 0) {
            return d() + (j - j2);
        }
        return y5Var.d() + (j2 - j);
    }

    @Override // io.sentry.z4
    public final long d() {
        return this.a * 1000000;
    }

    public y5(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
