package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u2c {
    public final String a;
    public final long b;
    public final int c;

    public u2c(int i, long j, String str) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2c)) {
            return false;
        }
        u2c u2cVar = (u2c) obj;
        return pa7.t(this.a, u2cVar.a) && this.b == u2cVar.b && this.c == u2cVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ib8.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ReviewRewardSnackbarExposure(id=" + this.a + ", exposedAtEpochMillis=" + this.b + ", attemptCount=" + this.c + ")";
    }
}
