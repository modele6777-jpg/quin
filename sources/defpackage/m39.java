package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m39 {
    public final long a;

    public /* synthetic */ m39(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m39) {
            return this.a == ((m39) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return kv2.m("IndirectPointerEventData(packedValue=", ")", this.a);
    }
}
