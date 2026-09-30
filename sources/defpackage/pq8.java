package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pq8 {
    public static final pq8 b = new pq8("text/*");
    public static final pq8 c = new pq8("*/*");
    public final String a;

    public pq8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq8)) {
            return false;
        }
        return this.a.equals(((pq8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ib8.j("MediaType(representation='", this.a, "')");
    }
}
