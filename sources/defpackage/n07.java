package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n07 implements bwa {
    public final transient Object a;
    private final String currencyCode;
    private final String formattedOriginPrice;
    private final String formattedPrice;
    private final String priceDescription;
    private final double priceNumber;
    private final String priceSymbol;
    private final p07 type;

    public n07(p07 p07Var, String str, String str2, double d, String str3, Object obj, String str4, int i) {
        str2 = (i & 4) != 0 ? "" : str2;
        d = (i & 8) != 0 ? 0.0d : d;
        str3 = (i & 16) != 0 ? "" : str3;
        str4 = (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? "" : str4;
        str.getClass();
        obj.getClass();
        str4.getClass();
        this.type = p07Var;
        this.formattedPrice = str;
        this.formattedOriginPrice = str2;
        this.priceNumber = d;
        this.priceSymbol = str3;
        this.a = obj;
        this.priceDescription = null;
        this.currencyCode = str4;
    }

    public final String a() {
        return this.currencyCode;
    }

    public final String b() {
        return this.formattedOriginPrice;
    }

    public final String c() {
        return this.priceDescription;
    }

    public final double d() {
        return this.priceNumber;
    }

    public final String e() {
        return this.priceSymbol;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n07)) {
            return false;
        }
        n07 n07Var = (n07) obj;
        return pa7.t(this.type, n07Var.type) && pa7.t(this.formattedPrice, n07Var.formattedPrice) && pa7.t(this.formattedOriginPrice, n07Var.formattedOriginPrice) && Double.compare(this.priceNumber, n07Var.priceNumber) == 0 && pa7.t(this.priceSymbol, n07Var.priceSymbol) && pa7.t(this.a, n07Var.a) && pa7.t(this.priceDescription, n07Var.priceDescription) && pa7.t(this.currencyCode, n07Var.currencyCode);
    }

    @Override // defpackage.bwa
    public final Object f() {
        return this.a;
    }

    public final p07 g() {
        return this.type;
    }

    @Override // defpackage.bwa
    public final cwa getType() {
        return this.type;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + ub3.c((Double.hashCode(this.priceNumber) + ub3.c(ub3.c(this.type.hashCode() * 31, 31, this.formattedPrice), 31, this.formattedOriginPrice)) * 31, 31, this.priceSymbol)) * 31;
        String str = this.priceDescription;
        return this.currencyCode.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        p07 p07Var = this.type;
        String str = this.formattedPrice;
        String str2 = this.formattedOriginPrice;
        double d = this.priceNumber;
        String str3 = this.priceSymbol;
        String str4 = this.priceDescription;
        String str5 = this.currencyCode;
        StringBuilder sb = new StringBuilder("InAppPurchase(type=");
        sb.append(p07Var);
        sb.append(", formattedPrice=");
        sb.append(str);
        sb.append(", formattedOriginPrice=");
        sb.append(str2);
        sb.append(", priceNumber=");
        sb.append(d);
        sb.append(", priceSymbol=");
        sb.append(str3);
        sb.append(", billFlowParams=");
        sb.append(this.a);
        ub3.v(sb, ", priceDescription=", str4, ", currencyCode=", str5);
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.bwa
    public final String y() {
        return this.formattedPrice;
    }
}
