package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yy5 {
    public final long a;

    public static String a(long j) {
        return ks0.i(j, "Frame-");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yy5) {
            return this.a == ((yy5) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
