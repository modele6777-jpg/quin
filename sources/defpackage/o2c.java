package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o2c {
    public final r0c a;
    public final long b;
    public final boolean c;

    public o2c(r0c r0cVar, long j, boolean z) {
        r0cVar.getClass();
        this.a = r0cVar;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2c)) {
            return false;
        }
        o2c o2cVar = (o2c) obj;
        return pa7.t(this.a, o2cVar.a) && this.b == o2cVar.b && this.c == o2cVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ib8.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ReviewRewardPromptOwnership(session=" + this.a + ", generation=" + this.b + ", isRewardPrompt=" + this.c + ")";
    }
}
