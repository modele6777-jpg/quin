package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s49 implements qu8 {
    public final long a;
    public final long b;
    public final long c;

    public s49(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s49)) {
            return false;
        }
        s49 s49Var = (s49) obj;
        return this.a == s49Var.a && this.b == s49Var.b && this.c == s49Var.c;
    }

    public final int hashCode() {
        return kn2.O(this.c) + ((kn2.O(this.b) + ((kn2.O(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }
}
