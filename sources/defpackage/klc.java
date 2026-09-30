package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class klc {
    public final String a;
    public final String b;
    public final boolean c;

    public klc(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klc)) {
            return false;
        }
        klc klcVar = (klc) obj;
        return this.a.equals(klcVar.a) && pa7.t(this.b, klcVar.b) && this.c == klcVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return ub3.m(ib8.o("SeasonalFollowUpUi(question=", this.a, ", answer=", this.b, ", isReady="), this.c, ")");
    }
}
