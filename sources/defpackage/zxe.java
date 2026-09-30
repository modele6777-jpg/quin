package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zxe implements Comparable {
    public final long a;

    public static long a(long j) {
        return (1 | (j - 1)) == Long.MAX_VALUE ? ar4.j(qk2.F(j)) : qk2.M(a19.a(), j);
    }

    public static final long b(long j, long j2) {
        int i = a19.b;
        if (((j2 - 1) | 1) != Long.MAX_VALUE) {
            return (1 | (j - 1)) == Long.MAX_VALUE ? qk2.F(j) : qk2.M(j, j2);
        }
        if (j != j2) {
            return ar4.j(qk2.F(j2));
        }
        qfc qfcVar = ar4.b;
        return 0L;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zxe zxeVar = (zxe) obj;
        zxeVar.getClass();
        return ar4.c(b(this.a, zxeVar.a), 0L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zxe) {
            return this.a == ((zxe) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.a + ')';
    }
}
