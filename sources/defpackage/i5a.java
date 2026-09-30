package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i5a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final String h;

    public i5a(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6, int i) {
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 16) != 0 ? null : str4;
        str5 = (i & 32) != 0 ? null : str5;
        z = (i & 64) != 0 ? false : z;
        z2 = (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? false : z2;
        str6 = (i & 256) != 0 ? null : str6;
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = z2;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5a)) {
            return false;
        }
        i5a i5aVar = (i5a) obj;
        return pa7.t(this.a, i5aVar.a) && pa7.t(this.b, i5aVar.b) && pa7.t(this.c, i5aVar.c) && pa7.t(this.d, i5aVar.d) && pa7.t(this.e, i5aVar.e) && this.f == i5aVar.f && this.g == i5aVar.g && pa7.t(this.h, i5aVar.h);
    }

    public final int hashCode() {
        int iC = ub3.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 961;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iD = ub3.d(ub3.d((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f), 31, this.g);
        String str4 = this.h;
        return iD + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("PaywallSkuCard(title=", this.a, ", price=", this.b, ", perReadPrice=");
        ub3.v(sbO, this.c, ", priceSuffix=null, priceSubtitle=", this.d, ", cornerLabel=");
        sbO.append(this.e);
        sbO.append(", isSelected=");
        sbO.append(this.f);
        sbO.append(", isDisabled=");
        sbO.append(this.g);
        sbO.append(", disabledLabel=");
        sbO.append(this.h);
        sbO.append(")");
        return sbO.toString();
    }
}
