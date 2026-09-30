package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class o07 {
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final p07 e;

    public o07(String str, String str2, long j, String str3, p07 p07Var) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = p07Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o07)) {
            return false;
        }
        o07 o07Var = (o07) obj;
        return pa7.t(this.a, o07Var.a) && pa7.t(this.b, o07Var.b) && this.c == o07Var.c && pa7.t(this.d, o07Var.d) && this.e.equals(o07Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iB = ib8.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
        String str3 = this.d;
        return this.e.hashCode() + ((iB + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("InAppPurchaseDetail(token=", this.a, ", orderId=", this.b, ", purchaseTime=");
        sbO.append(this.c);
        sbO.append(", profileId=");
        sbO.append(this.d);
        sbO.append(", type=");
        sbO.append(this.e);
        sbO.append(")");
        return sbO.toString();
    }
}
