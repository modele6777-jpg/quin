package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u0d {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final gb3 e;
    public final String f;
    public final String g;

    public u0d(String str, String str2, int i, long j, gb3 gb3Var, String str3, String str4) {
        tec.x(str, str2, str4);
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = gb3Var;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0d)) {
            return false;
        }
        u0d u0dVar = (u0d) obj;
        return pa7.t(this.a, u0dVar.a) && pa7.t(this.b, u0dVar.b) && this.c == u0dVar.c && this.d == u0dVar.d && this.e.equals(u0dVar.e) && this.f.equals(u0dVar.f) && pa7.t(this.g, u0dVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ub3.c((this.e.hashCode() + ib8.b(ub3.b(this.c, ub3.c(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", eventTimestampUs=");
        sb.append(this.d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f);
        sb.append(", firebaseAuthenticationToken=");
        return ub3.l(sb, this.g, ')');
    }
}
