package tech.chatmind.api;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.an1;
import defpackage.d7e;
import defpackage.dx3;
import defpackage.e7e;
import defpackage.ib8;
import defpackage.nyc;
import defpackage.o8a;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<=BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBk\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%Jp\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010/\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b4\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b5\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b6\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b7\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b8\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010%¨\u0006>"}, d2 = {"Ltech/chatmind/api/SubscriptionData;", "", "", "subscriptionType", "nextBillingAt", "subscribedAt", "paymentType", "expiredAt", "renewAt", "plan", "Ltech/chatmind/api/Period;", "period", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltech/chatmind/api/Period;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltech/chatmind/api/Period;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/SubscriptionData;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Ltech/chatmind/api/Period;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltech/chatmind/api/Period;)Ltech/chatmind/api/SubscriptionData;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSubscriptionType", "getNextBillingAt", "getNextBillingAt$annotations", "()V", "getSubscribedAt", "getPaymentType", "getExpiredAt", "getRenewAt", "getPlan", "Ltech/chatmind/api/Period;", "getPeriod", "Companion", "d7e", "e7e", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class SubscriptionData {
    public static final int $stable = 0;
    public static final e7e Companion = new e7e();
    private final String expiredAt;
    private final String nextBillingAt;
    private final String paymentType;
    private final Period period;
    private final String plan;
    private final String renewAt;
    private final String subscribedAt;
    private final String subscriptionType;

    public /* synthetic */ SubscriptionData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Period period, xyc xycVar) {
        if (255 != (i & 255)) {
            an1.R(i, 255, d7e.a.e());
            throw null;
        }
        this.subscriptionType = str;
        this.nextBillingAt = str2;
        this.subscribedAt = str3;
        this.paymentType = str4;
        this.expiredAt = str5;
        this.renewAt = str6;
        this.plan = str7;
        this.period = period;
    }

    public static /* synthetic */ SubscriptionData copy$default(SubscriptionData subscriptionData, String str, String str2, String str3, String str4, String str5, String str6, String str7, Period period, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionData.subscriptionType;
        }
        if ((i & 2) != 0) {
            str2 = subscriptionData.nextBillingAt;
        }
        if ((i & 4) != 0) {
            str3 = subscriptionData.subscribedAt;
        }
        if ((i & 8) != 0) {
            str4 = subscriptionData.paymentType;
        }
        if ((i & 16) != 0) {
            str5 = subscriptionData.expiredAt;
        }
        if ((i & 32) != 0) {
            str6 = subscriptionData.renewAt;
        }
        if ((i & 64) != 0) {
            str7 = subscriptionData.plan;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            period = subscriptionData.period;
        }
        String str8 = str7;
        Period period2 = period;
        String str9 = str5;
        String str10 = str6;
        return subscriptionData.copy(str, str2, str3, str4, str9, str10, str8, period2);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(SubscriptionData self, ag2 output, nyc serialDesc) {
        p4e p4eVar = p4e.a;
        output.A(serialDesc, 0, p4eVar, self.subscriptionType);
        output.A(serialDesc, 1, p4eVar, self.nextBillingAt);
        output.A(serialDesc, 2, p4eVar, self.subscribedAt);
        output.A(serialDesc, 3, p4eVar, self.paymentType);
        output.A(serialDesc, 4, p4eVar, self.expiredAt);
        output.A(serialDesc, 5, p4eVar, self.renewAt);
        output.A(serialDesc, 6, p4eVar, self.plan);
        output.A(serialDesc, 7, o8a.a, self.period);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSubscriptionType() {
        return this.subscriptionType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNextBillingAt() {
        return this.nextBillingAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubscribedAt() {
        return this.subscribedAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPaymentType() {
        return this.paymentType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExpiredAt() {
        return this.expiredAt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRenewAt() {
        return this.renewAt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPlan() {
        return this.plan;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Period getPeriod() {
        return this.period;
    }

    public final SubscriptionData copy(String subscriptionType, String nextBillingAt, String subscribedAt, String paymentType, String expiredAt, String renewAt, String plan, Period period) {
        return new SubscriptionData(subscriptionType, nextBillingAt, subscribedAt, paymentType, expiredAt, renewAt, plan, period);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionData)) {
            return false;
        }
        SubscriptionData subscriptionData = (SubscriptionData) other;
        return pa7.t(this.subscriptionType, subscriptionData.subscriptionType) && pa7.t(this.nextBillingAt, subscriptionData.nextBillingAt) && pa7.t(this.subscribedAt, subscriptionData.subscribedAt) && pa7.t(this.paymentType, subscriptionData.paymentType) && pa7.t(this.expiredAt, subscriptionData.expiredAt) && pa7.t(this.renewAt, subscriptionData.renewAt) && pa7.t(this.plan, subscriptionData.plan) && pa7.t(this.period, subscriptionData.period);
    }

    public final String getExpiredAt() {
        return this.expiredAt;
    }

    public final String getNextBillingAt() {
        return this.nextBillingAt;
    }

    public final String getPaymentType() {
        return this.paymentType;
    }

    public final Period getPeriod() {
        return this.period;
    }

    public final String getPlan() {
        return this.plan;
    }

    public final String getRenewAt() {
        return this.renewAt;
    }

    public final String getSubscribedAt() {
        return this.subscribedAt;
    }

    public final String getSubscriptionType() {
        return this.subscriptionType;
    }

    public int hashCode() {
        String str = this.subscriptionType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nextBillingAt;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subscribedAt;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.paymentType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.expiredAt;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.renewAt;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.plan;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Period period = this.period;
        return iHashCode7 + (period != null ? period.hashCode() : 0);
    }

    public String toString() {
        String str = this.subscriptionType;
        String str2 = this.nextBillingAt;
        String str3 = this.subscribedAt;
        String str4 = this.paymentType;
        String str5 = this.expiredAt;
        String str6 = this.renewAt;
        String str7 = this.plan;
        Period period = this.period;
        StringBuilder sbO = ib8.o("SubscriptionData(subscriptionType=", str, ", nextBillingAt=", str2, ", subscribedAt=");
        ub3.v(sbO, str3, ", paymentType=", str4, ", expiredAt=");
        ub3.v(sbO, str5, ", renewAt=", str6, ", plan=");
        sbO.append(str7);
        sbO.append(", period=");
        sbO.append(period);
        sbO.append(")");
        return sbO.toString();
    }

    @dx3
    public static /* synthetic */ void getNextBillingAt$annotations() {
    }

    public SubscriptionData(String str, String str2, String str3, String str4, String str5, String str6, String str7, Period period) {
        this.subscriptionType = str;
        this.nextBillingAt = str2;
        this.subscribedAt = str3;
        this.paymentType = str4;
        this.expiredAt = str5;
        this.renewAt = str6;
        this.plan = str7;
        this.period = period;
    }
}
