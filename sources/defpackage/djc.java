package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class djc {
    public final kkc a;
    public final qhe b;
    public final String c;
    public final String d;

    public djc(kkc kkcVar, qhe qheVar, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = kkcVar;
        this.b = qheVar;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djc)) {
            return false;
        }
        djc djcVar = (djc) obj;
        return this.a == djcVar.a && this.b.equals(djcVar.b) && pa7.t(this.c, djcVar.c) && pa7.t(this.d, djcVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ub3.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeasonalCardReadingUi(element=");
        sb.append(this.a);
        sb.append(", card=");
        sb.append(this.b);
        sb.append(", cardName=");
        return ks0.m(sb, this.c, ", content=", this.d, ")");
    }
}
