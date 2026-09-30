package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
public final class n0d {
    public static final m0d Companion = new m0d();
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public /* synthetic */ n0d(int i, int i2, long j, String str, String str2) {
        if (15 != (i & 15)) {
            an1.R(i, 15, l0d.a.e());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0d)) {
            return false;
        }
        n0d n0dVar = (n0d) obj;
        return pa7.t(this.a, n0dVar.a) && pa7.t(this.b, n0dVar.b) && this.c == n0dVar.c && this.d == n0dVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ub3.b(this.c, ub3.c(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", sessionStartTimestampUs=" + this.d + ')';
    }

    public n0d(int i, long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }
}
