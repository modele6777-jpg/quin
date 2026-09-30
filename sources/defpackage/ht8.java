package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ht8 implements ot8, mh6 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;

    public ht8(String str, String str2, boolean z, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht8)) {
            return false;
        }
        ht8 ht8Var = (ht8) obj;
        return pa7.t(this.a, ht8Var.a) && pa7.t(this.b, ht8Var.b) && this.c == ht8Var.c && pa7.t(this.d, ht8Var.d) && pa7.t(this.e, ht8Var.e);
    }

    @Override // defpackage.mh6
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iD = ub3.d(ub3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("ClarifyingCardRequest(id=", this.a, ", label=", this.b, ", ignored=");
        sbO.append(this.c);
        sbO.append(", drawMessageId=");
        sbO.append(this.d);
        sbO.append(", interpretationMessageId=");
        return ks0.l(sbO, this.e, ")");
    }
}
