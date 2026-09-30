package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r0c {
    public final String a;
    public final long b;

    public r0c(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0c)) {
            return false;
        }
        r0c r0cVar = (r0c) obj;
        return pa7.t(this.a, r0cVar.a) && this.b == r0cVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReviewRewardAccountSession(accountId=" + this.a + ", generation=" + this.b + ")";
    }
}
