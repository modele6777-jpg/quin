package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hrc {
    public final zqc a;
    public final long b;

    public hrc(zqc zqcVar, long j) {
        this.a = zqcVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hrc)) {
            return false;
        }
        hrc hrcVar = (hrc) obj;
        return this.a.equals(hrcVar.a) && this.b == hrcVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SessionToken(key=" + this.a + ", generation=" + this.b + ")";
    }
}
