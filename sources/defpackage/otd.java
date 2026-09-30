package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class otd implements nc5 {
    public final ax6 a;
    public final String b;
    public final zb3 c;

    public otd(ax6 ax6Var, String str, zb3 zb3Var) {
        this.a = ax6Var;
        this.b = str;
        this.c = zb3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otd)) {
            return false;
        }
        otd otdVar = (otd) obj;
        return pa7.t(this.a, otdVar.a) && pa7.t(this.b, otdVar.b) && this.c == otdVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.a + ", mimeType=" + this.b + ", dataSource=" + this.c + ")";
    }
}
