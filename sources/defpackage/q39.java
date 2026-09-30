package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q39 implements qu8 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public q39(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q39.class == obj.getClass()) {
            q39 q39Var = (q39) obj;
            if (this.a == q39Var.a && this.b == q39Var.b && this.c == q39Var.c && this.d == q39Var.d && this.e == q39Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return kn2.O(this.e) + ((kn2.O(this.d) + ((kn2.O(this.c) + ((kn2.O(this.b) + ((kn2.O(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }
}
