package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z6e implements bwa {
    public final transient Object a;
    private final String averageDailyPrice;
    private final String currencyCode;
    private final String formattedOriginPrice;
    private final String formattedPrice;
    private final String priceDescription;
    private final double priceNumber;
    private final String priceSymbol;
    private final String totalPrice;
    private final u7e type;

    public z6e(u7e u7eVar, String str, String str2, String str3, String str4, Object obj, String str5, String str6, double d, String str7, int i) {
        str5 = (i & 64) != 0 ? null : str5;
        str6 = (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : str6;
        d = (i & 256) != 0 ? 0.0d : d;
        str7 = (i & 512) != 0 ? "" : str7;
        u7eVar.getClass();
        this.type = u7eVar;
        this.formattedPrice = str;
        this.totalPrice = str2;
        this.averageDailyPrice = str3;
        this.priceSymbol = str4;
        this.a = obj;
        this.formattedOriginPrice = str5;
        this.priceDescription = str6;
        this.priceNumber = d;
        this.currencyCode = str7;
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
        if (!(obj instanceof z6e)) {
            return false;
        }
        z6e z6eVar = (z6e) obj;
        return this.type == z6eVar.type && pa7.t(this.formattedPrice, z6eVar.formattedPrice) && pa7.t(this.totalPrice, z6eVar.totalPrice) && pa7.t(this.averageDailyPrice, z6eVar.averageDailyPrice) && pa7.t(this.priceSymbol, z6eVar.priceSymbol) && this.a.equals(z6eVar.a) && pa7.t(this.formattedOriginPrice, z6eVar.formattedOriginPrice) && pa7.t(this.priceDescription, z6eVar.priceDescription) && Double.compare(this.priceNumber, z6eVar.priceNumber) == 0 && pa7.t(this.currencyCode, z6eVar.currencyCode);
    }

    @Override // defpackage.bwa
    public final Object f() {
        return this.a;
    }

    public final String g() {
        return this.totalPrice;
    }

    @Override // defpackage.bwa
    public final cwa getType() {
        return this.type;
    }

    public final u7e h() {
        return this.type;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + ub3.c(ub3.c(ub3.c(ub3.c(this.type.hashCode() * 31, 31, this.formattedPrice), 31, this.totalPrice), 31, this.averageDailyPrice), 31, this.priceSymbol)) * 31;
        String str = this.formattedOriginPrice;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.priceDescription;
        return this.currencyCode.hashCode() + ((Double.hashCode(this.priceNumber) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        u7e u7eVar = this.type;
        String str = this.formattedPrice;
        String str2 = this.totalPrice;
        String str3 = this.averageDailyPrice;
        String str4 = this.priceSymbol;
        String str5 = this.formattedOriginPrice;
        String str6 = this.priceDescription;
        double d = this.priceNumber;
        String str7 = this.currencyCode;
        StringBuilder sb = new StringBuilder("Subscription(type=");
        sb.append(u7eVar);
        sb.append(", formattedPrice=");
        sb.append(str);
        sb.append(", totalPrice=");
        ub3.v(sb, str2, ", averageDailyPrice=", str3, ", priceSymbol=");
        sb.append(str4);
        sb.append(", billFlowParams=");
        sb.append(this.a);
        sb.append(", formattedOriginPrice=");
        ub3.v(sb, str5, ", priceDescription=", str6, ", priceNumber=");
        sb.append(d);
        sb.append(", currencyCode=");
        sb.append(str7);
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.bwa
    public final String y() {
        return this.formattedPrice;
    }
}
