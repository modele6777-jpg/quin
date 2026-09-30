package io.sentry;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class z4 implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(z4 z4Var) {
        return Long.compare(d(), z4Var.d());
    }

    public long b(z4 z4Var) {
        return d() - z4Var.d();
    }

    public long c(z4 z4Var) {
        return (z4Var == null || compareTo(z4Var) >= 0) ? d() : z4Var.d();
    }

    public abstract long d();
}
