package io.sentry.android.core.internal.util;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements Comparable {
    public final long a;
    public final long b;

    public m(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        m mVar = (m) obj;
        int iCompare = Long.compare(this.b, mVar.b);
        return iCompare != 0 ? iCompare : Long.compare(this.a, mVar.a);
    }
}
