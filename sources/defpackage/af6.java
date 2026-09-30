package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class af6 {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof af6) {
            return this.a == ((af6) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return kv2.m("GridItemSpan(packedValue=", ")", this.a);
    }
}
