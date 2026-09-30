package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jhb {
    public final String a;
    public final Boolean b;
    public final String c;
    public final String d;

    public jhb(String str, Boolean bool, String str2, String str3) {
        str.getClass();
        this.a = str;
        this.b = bool;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhb)) {
            return false;
        }
        jhb jhbVar = (jhb) obj;
        return pa7.t(this.a, jhbVar.a) && pa7.t(this.b, jhbVar.b) && pa7.t(this.c, jhbVar.c) && pa7.t(this.d, jhbVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReadingSpreadSelection(tier=");
        sb.append(this.a);
        sb.append(", isDefault=");
        sb.append(this.b);
        sb.append(", firstRecommendedTier=");
        return ks0.m(sb, this.c, ", suggestedTier=", this.d, ")");
    }
}
