package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k7c {
    public final Object a;
    public final long b;

    public k7c(Object obj) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        obj.getClass();
        this.a = obj;
        this.b = jCurrentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7c)) {
            return false;
        }
        k7c k7cVar = (k7c) obj;
        return pa7.t(this.a, k7cVar.a) && this.b == k7cVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RouteRequest(route=" + this.a + ", time=" + this.b + ")";
    }
}
