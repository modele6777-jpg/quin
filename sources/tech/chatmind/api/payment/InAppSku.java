package tech.chatmind.api.payment;

import defpackage.ag2;
import defpackage.an1;
import defpackage.c77;
import defpackage.ks0;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.q07;
import defpackage.r07;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJP\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b/\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b0\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b1\u0010\u001a¨\u00065"}, d2 = {"Ltech/chatmind/api/payment/InAppSku;", "", "", "planKey", "", "count", "formattedPrice", "totalPrice", "priceSymbol", "formattedOriginPrice", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/payment/InAppSku;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ltech/chatmind/api/payment/InAppSku;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPlanKey", "Ljava/lang/Integer;", "getCount", "getFormattedPrice", "getTotalPrice", "getPriceSymbol", "getFormattedOriginPrice", "Companion", "q07", "r07", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class InAppSku {
    public static final int $stable = 0;
    public static final r07 Companion = new r07();
    private final Integer count;
    private final String formattedOriginPrice;
    private final String formattedPrice;
    private final String planKey;
    private final String priceSymbol;
    private final String totalPrice;

    public /* synthetic */ InAppSku(int i, String str, Integer num, String str2, String str3, String str4, String str5, xyc xycVar) {
        if (29 != (i & 29)) {
            an1.R(i, 29, q07.a.e());
            throw null;
        }
        this.planKey = str;
        if ((i & 2) == 0) {
            this.count = null;
        } else {
            this.count = num;
        }
        this.formattedPrice = str2;
        this.totalPrice = str3;
        this.priceSymbol = str4;
        if ((i & 32) == 0) {
            this.formattedOriginPrice = null;
        } else {
            this.formattedOriginPrice = str5;
        }
    }

    public static /* synthetic */ InAppSku copy$default(InAppSku inAppSku, String str, Integer num, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inAppSku.planKey;
        }
        if ((i & 2) != 0) {
            num = inAppSku.count;
        }
        if ((i & 4) != 0) {
            str2 = inAppSku.formattedPrice;
        }
        if ((i & 8) != 0) {
            str3 = inAppSku.totalPrice;
        }
        if ((i & 16) != 0) {
            str4 = inAppSku.priceSymbol;
        }
        if ((i & 32) != 0) {
            str5 = inAppSku.formattedOriginPrice;
        }
        String str6 = str4;
        String str7 = str5;
        return inAppSku.copy(str, num, str2, str3, str6, str7);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(InAppSku self, ag2 output, nyc serialDesc) {
        output.w(serialDesc, 0, self.planKey);
        if (output.g(serialDesc) || self.count != null) {
            output.A(serialDesc, 1, c77.a, self.count);
        }
        output.w(serialDesc, 2, self.formattedPrice);
        output.w(serialDesc, 3, self.totalPrice);
        output.w(serialDesc, 4, self.priceSymbol);
        if (!output.g(serialDesc) && self.formattedOriginPrice == null) {
            return;
        }
        output.A(serialDesc, 5, p4e.a, self.formattedOriginPrice);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlanKey() {
        return this.planKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTotalPrice() {
        return this.totalPrice;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPriceSymbol() {
        return this.priceSymbol;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFormattedOriginPrice() {
        return this.formattedOriginPrice;
    }

    public final InAppSku copy(String planKey, Integer count, String formattedPrice, String totalPrice, String priceSymbol, String formattedOriginPrice) {
        planKey.getClass();
        formattedPrice.getClass();
        totalPrice.getClass();
        priceSymbol.getClass();
        return new InAppSku(planKey, count, formattedPrice, totalPrice, priceSymbol, formattedOriginPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InAppSku)) {
            return false;
        }
        InAppSku inAppSku = (InAppSku) other;
        return pa7.t(this.planKey, inAppSku.planKey) && pa7.t(this.count, inAppSku.count) && pa7.t(this.formattedPrice, inAppSku.formattedPrice) && pa7.t(this.totalPrice, inAppSku.totalPrice) && pa7.t(this.priceSymbol, inAppSku.priceSymbol) && pa7.t(this.formattedOriginPrice, inAppSku.formattedOriginPrice);
    }

    public final Integer getCount() {
        return this.count;
    }

    public final String getFormattedOriginPrice() {
        return this.formattedOriginPrice;
    }

    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    public final String getPlanKey() {
        return this.planKey;
    }

    public final String getPriceSymbol() {
        return this.priceSymbol;
    }

    public final String getTotalPrice() {
        return this.totalPrice;
    }

    public int hashCode() {
        int iHashCode = this.planKey.hashCode() * 31;
        Integer num = this.count;
        int iC = ub3.c(ub3.c(ub3.c((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.formattedPrice), 31, this.totalPrice), 31, this.priceSymbol);
        String str = this.formattedOriginPrice;
        return iC + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.planKey;
        Integer num = this.count;
        String str2 = this.formattedPrice;
        String str3 = this.totalPrice;
        String str4 = this.priceSymbol;
        String str5 = this.formattedOriginPrice;
        StringBuilder sb = new StringBuilder("InAppSku(planKey=");
        sb.append(str);
        sb.append(", count=");
        sb.append(num);
        sb.append(", formattedPrice=");
        ub3.v(sb, str2, ", totalPrice=", str3, ", priceSymbol=");
        return ks0.m(sb, str4, ", formattedOriginPrice=", str5, ")");
    }

    public InAppSku(String str, Integer num, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.planKey = str;
        this.count = num;
        this.formattedPrice = str2;
        this.totalPrice = str3;
        this.priceSymbol = str4;
        this.formattedOriginPrice = str5;
    }

    public /* synthetic */ InAppSku(String str, Integer num, String str2, String str3, String str4, String str5, int i, rp3 rp3Var) {
        this(str, (i & 2) != 0 ? null : num, str2, str3, str4, (i & 32) != 0 ? null : str5);
    }
}
