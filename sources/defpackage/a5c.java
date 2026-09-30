package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a5c {
    public final long a = y72.k;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5c)) {
            return false;
        }
        long j = ((a5c) obj).a;
        int i = y72.l;
        return faf.a(this.a, j);
    }

    public final int hashCode() {
        int i = y72.l;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) y72.h(this.a)) + ", rippleAlpha=null)";
    }
}
