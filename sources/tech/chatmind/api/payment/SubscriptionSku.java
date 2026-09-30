package tech.chatmind.api.payment;

import defpackage.ag2;
import defpackage.an1;
import defpackage.ib8;
import defpackage.ks0;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.q7e;
import defpackage.r7e;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBa\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJZ\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u001b¨\u00066"}, d2 = {"Ltech/chatmind/api/payment/SubscriptionSku;", "", "", "planKey", "duration", "formattedPrice", "totalPrice", "priceSymbol", "formattedOriginPrice", "priceDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/payment/SubscriptionSku;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ltech/chatmind/api/payment/SubscriptionSku;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPlanKey", "getDuration", "getFormattedPrice", "getTotalPrice", "getPriceSymbol", "getFormattedOriginPrice", "getPriceDescription", "Companion", "q7e", "r7e", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class SubscriptionSku {
    public static final int $stable = 0;
    public static final r7e Companion = new r7e();
    private final String duration;
    private final String formattedOriginPrice;
    private final String formattedPrice;
    private final String planKey;
    private final String priceDescription;
    private final String priceSymbol;
    private final String totalPrice;

    public /* synthetic */ SubscriptionSku(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, xyc xycVar) {
        if (31 != (i & 31)) {
            an1.R(i, 31, q7e.a.e());
            throw null;
        }
        this.planKey = str;
        this.duration = str2;
        this.formattedPrice = str3;
        this.totalPrice = str4;
        this.priceSymbol = str5;
        if ((i & 32) == 0) {
            this.formattedOriginPrice = null;
        } else {
            this.formattedOriginPrice = str6;
        }
        if ((i & 64) == 0) {
            this.priceDescription = null;
        } else {
            this.priceDescription = str7;
        }
    }

    public static /* synthetic */ SubscriptionSku copy$default(SubscriptionSku subscriptionSku, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionSku.planKey;
        }
        if ((i & 2) != 0) {
            str2 = subscriptionSku.duration;
        }
        if ((i & 4) != 0) {
            str3 = subscriptionSku.formattedPrice;
        }
        if ((i & 8) != 0) {
            str4 = subscriptionSku.totalPrice;
        }
        if ((i & 16) != 0) {
            str5 = subscriptionSku.priceSymbol;
        }
        if ((i & 32) != 0) {
            str6 = subscriptionSku.formattedOriginPrice;
        }
        if ((i & 64) != 0) {
            str7 = subscriptionSku.priceDescription;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return subscriptionSku.copy(str, str2, str11, str4, str10, str8, str9);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(SubscriptionSku self, ag2 output, nyc serialDesc) {
        output.w(serialDesc, 0, self.planKey);
        output.w(serialDesc, 1, self.duration);
        output.w(serialDesc, 2, self.formattedPrice);
        output.w(serialDesc, 3, self.totalPrice);
        output.w(serialDesc, 4, self.priceSymbol);
        if (output.g(serialDesc) || self.formattedOriginPrice != null) {
            output.A(serialDesc, 5, p4e.a, self.formattedOriginPrice);
        }
        if (!output.g(serialDesc) && self.priceDescription == null) {
            return;
        }
        output.A(serialDesc, 6, p4e.a, self.priceDescription);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlanKey() {
        return this.planKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDuration() {
        return this.duration;
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

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPriceDescription() {
        return this.priceDescription;
    }

    public final SubscriptionSku copy(String planKey, String duration, String formattedPrice, String totalPrice, String priceSymbol, String formattedOriginPrice, String priceDescription) {
        planKey.getClass();
        duration.getClass();
        formattedPrice.getClass();
        totalPrice.getClass();
        priceSymbol.getClass();
        return new SubscriptionSku(planKey, duration, formattedPrice, totalPrice, priceSymbol, formattedOriginPrice, priceDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionSku)) {
            return false;
        }
        SubscriptionSku subscriptionSku = (SubscriptionSku) other;
        return pa7.t(this.planKey, subscriptionSku.planKey) && pa7.t(this.duration, subscriptionSku.duration) && pa7.t(this.formattedPrice, subscriptionSku.formattedPrice) && pa7.t(this.totalPrice, subscriptionSku.totalPrice) && pa7.t(this.priceSymbol, subscriptionSku.priceSymbol) && pa7.t(this.formattedOriginPrice, subscriptionSku.formattedOriginPrice) && pa7.t(this.priceDescription, subscriptionSku.priceDescription);
    }

    public final String getDuration() {
        return this.duration;
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

    public final String getPriceDescription() {
        return this.priceDescription;
    }

    public final String getPriceSymbol() {
        return this.priceSymbol;
    }

    public final String getTotalPrice() {
        return this.totalPrice;
    }

    public int hashCode() {
        int iC = ub3.c(ub3.c(ub3.c(ub3.c(this.planKey.hashCode() * 31, 31, this.duration), 31, this.formattedPrice), 31, this.totalPrice), 31, this.priceSymbol);
        String str = this.formattedOriginPrice;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.priceDescription;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.planKey;
        String str2 = this.duration;
        String str3 = this.formattedPrice;
        String str4 = this.totalPrice;
        String str5 = this.priceSymbol;
        String str6 = this.formattedOriginPrice;
        String str7 = this.priceDescription;
        StringBuilder sbO = ib8.o("SubscriptionSku(planKey=", str, ", duration=", str2, ", formattedPrice=");
        ub3.v(sbO, str3, ", totalPrice=", str4, ", priceSymbol=");
        ub3.v(sbO, str5, ", formattedOriginPrice=", str6, ", priceDescription=");
        return ks0.l(sbO, str7, ")");
    }

    public SubscriptionSku(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.planKey = str;
        this.duration = str2;
        this.formattedPrice = str3;
        this.totalPrice = str4;
        this.priceSymbol = str5;
        this.formattedOriginPrice = str6;
        this.priceDescription = str7;
    }

    public /* synthetic */ SubscriptionSku(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, rp3 rp3Var) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
