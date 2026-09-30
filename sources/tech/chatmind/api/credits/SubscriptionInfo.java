package tech.chatmind.api.credits;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.an1;
import defpackage.drb;
import defpackage.dx3;
import defpackage.dzb;
import defpackage.ef8;
import defpackage.ezb;
import defpackage.hf8;
import defpackage.ib8;
import defpackage.k7e;
import defpackage.kv2;
import defpackage.l7e;
import defpackage.m7e;
import defpackage.nyc;
import defpackage.o7e;
import defpackage.o8a;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.u7e;
import defpackage.ub3;
import defpackage.xyc;
import defpackage.z7c;
import java.time.Instant;
import kotlin.Metadata;
import tech.chatmind.api.Period;
import tech.chatmind.api.PeriodUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HIB_\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBk\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0005\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u0018J\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\"J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010*Jp\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\"J\u0010\u0010.\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020\u00162\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102J'\u0010;\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b9\u0010:R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010<\u0012\u0004\b=\u0010>\u001a\u0004\b\u001f\u0010\"R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b?\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b@\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\bA\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\bB\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\bC\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\bD\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bF\u0010*¨\u0006J"}, d2 = {"Ltech/chatmind/api/credits/SubscriptionInfo;", "", "", "subscriptionType", "nextBillingAt", "subscribedAt", "paymentType", "expireAt", "renewAt", "plan", "Ltech/chatmind/api/Period;", "period", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltech/chatmind/api/Period;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltech/chatmind/api/Period;Lxyc;)V", "Ljava/time/Instant;", "expiredAt", "()Ljava/time/Instant;", "", "canPaymentTypeAutoRenewal", "()Z", "canEnableAutoRenewalByPureSigning", "Lo7e;", "getSubscriptionLevel", "()Lo7e;", "isPaymentTypeMatchedLocalPackage", "Lu7e;", "getSubscriptionType", "()Lu7e;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Ltech/chatmind/api/Period;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltech/chatmind/api/Period;)Ltech/chatmind/api/credits/SubscriptionInfo;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/credits/SubscriptionInfo;Lag2;Lnyc;)V", "write$Self", "Ljava/lang/String;", "getSubscriptionType$annotations", "()V", "getNextBillingAt", "getSubscribedAt", "getPaymentType", "getExpireAt", "getRenewAt", "getPlan", "Ltech/chatmind/api/Period;", "getPeriod", "Companion", "k7e", "l7e", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class SubscriptionInfo {
    private final String expireAt;
    private final String nextBillingAt;
    private final String paymentType;
    private final Period period;
    private final String plan;
    private final String renewAt;
    private final String subscribedAt;
    private final String subscriptionType;
    public static final l7e Companion = new l7e();
    public static final int $stable = Period.$stable;

    public /* synthetic */ SubscriptionInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Period period, xyc xycVar) {
        if (15 != (i & 15)) {
            an1.R(i, 15, k7e.a.e());
            throw null;
        }
        this.subscriptionType = str;
        this.nextBillingAt = str2;
        this.subscribedAt = str3;
        this.paymentType = str4;
        if ((i & 16) == 0) {
            this.expireAt = null;
        } else {
            this.expireAt = str5;
        }
        if ((i & 32) == 0) {
            this.renewAt = null;
        } else {
            this.renewAt = str6;
        }
        if ((i & 64) == 0) {
            this.plan = null;
        } else {
            this.plan = str7;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
            this.period = null;
        } else {
            this.period = period;
        }
    }

    public static /* synthetic */ SubscriptionInfo copy$default(SubscriptionInfo subscriptionInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, Period period, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionInfo.subscriptionType;
        }
        if ((i & 2) != 0) {
            str2 = subscriptionInfo.nextBillingAt;
        }
        if ((i & 4) != 0) {
            str3 = subscriptionInfo.subscribedAt;
        }
        if ((i & 8) != 0) {
            str4 = subscriptionInfo.paymentType;
        }
        if ((i & 16) != 0) {
            str5 = subscriptionInfo.expireAt;
        }
        if ((i & 32) != 0) {
            str6 = subscriptionInfo.renewAt;
        }
        if ((i & 64) != 0) {
            str7 = subscriptionInfo.plan;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            period = subscriptionInfo.period;
        }
        String str8 = str7;
        Period period2 = period;
        String str9 = str5;
        String str10 = str6;
        return subscriptionInfo.copy(str, str2, str3, str4, str9, str10, str8, period2);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(SubscriptionInfo self, ag2 output, nyc serialDesc) {
        p4e p4eVar = p4e.a;
        output.A(serialDesc, 0, p4eVar, self.subscriptionType);
        output.A(serialDesc, 1, p4eVar, self.nextBillingAt);
        output.A(serialDesc, 2, p4eVar, self.subscribedAt);
        output.A(serialDesc, 3, p4eVar, self.paymentType);
        if (output.g(serialDesc) || self.expireAt != null) {
            output.A(serialDesc, 4, p4eVar, self.expireAt);
        }
        if (output.g(serialDesc) || self.renewAt != null) {
            output.A(serialDesc, 5, p4eVar, self.renewAt);
        }
        if (output.g(serialDesc) || self.plan != null) {
            output.A(serialDesc, 6, p4eVar, self.plan);
        }
        if (!output.g(serialDesc) && self.period == null) {
            return;
        }
        output.A(serialDesc, 7, o8a.a, self.period);
    }

    public final boolean canEnableAutoRenewalByPureSigning() {
        return pa7.t(this.paymentType, "wechat-app-pay") || pa7.t(this.paymentType, "wechat");
    }

    public final boolean canPaymentTypeAutoRenewal() {
        String str = this.paymentType;
        return (str == null || pa7.t(str, "wechat-app-pay") || pa7.t(this.paymentType, "wechat-mini-program-pay")) ? false : true;
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
    public final String getExpireAt() {
        return this.expireAt;
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

    public final SubscriptionInfo copy(String subscriptionType, String nextBillingAt, String subscribedAt, String paymentType, String expireAt, String renewAt, String plan, Period period) {
        return new SubscriptionInfo(subscriptionType, nextBillingAt, subscribedAt, paymentType, expireAt, renewAt, plan, period);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionInfo)) {
            return false;
        }
        SubscriptionInfo subscriptionInfo = (SubscriptionInfo) other;
        return pa7.t(this.subscriptionType, subscriptionInfo.subscriptionType) && pa7.t(this.nextBillingAt, subscriptionInfo.nextBillingAt) && pa7.t(this.subscribedAt, subscriptionInfo.subscribedAt) && pa7.t(this.paymentType, subscriptionInfo.paymentType) && pa7.t(this.expireAt, subscriptionInfo.expireAt) && pa7.t(this.renewAt, subscriptionInfo.renewAt) && pa7.t(this.plan, subscriptionInfo.plan) && pa7.t(this.period, subscriptionInfo.period);
    }

    public final Instant expiredAt() {
        String str = this.expireAt;
        if (str == null) {
            return null;
        }
        try {
            return Instant.parse(str);
        } catch (Throwable th) {
            Throwable thA = ezb.a(new dzb(th));
            if (thA == null) {
                return null;
            }
            hf8.Q.getClass();
            kv2.A("Failed to parse date: ", this.expireAt, ef8.a("Quin.SubscriptionInfo"), thA);
            return null;
        }
    }

    public final String getExpireAt() {
        return this.expireAt;
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

    public final o7e getSubscriptionLevel() {
        String str = this.plan;
        if (str == null) {
            return null;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == 3710) {
            if (str.equals("v4")) {
                return o7e.d;
            }
            return null;
        }
        if (iHashCode == 107876) {
            if (str.equals("max")) {
                return o7e.c;
            }
            return null;
        }
        if (iHashCode == 111277) {
            if (str.equals("pro")) {
                return o7e.b;
            }
            return null;
        }
        if (iHashCode == 93508654 && str.equals("basic")) {
            return o7e.a;
        }
        return null;
    }

    /* JADX INFO: renamed from: getSubscriptionType, reason: collision with other method in class */
    public final u7e m35getSubscriptionType() {
        Period period;
        int i;
        hf8.Q.getClass();
        ef8.a("Quin.SubscriptionInfo").e("getSubscriptionType plan " + this.plan + ", period " + this.period + ", subscriptionType " + this.subscriptionType);
        if (this.plan == null || (period = this.period) == null) {
            String str = this.subscriptionType;
            if (str == null) {
                return null;
            }
            int iHashCode = str.hashCode();
            if (iHashCode == 3704893) {
                if (str.equals("year")) {
                    return u7e.c;
                }
                return null;
            }
            if (iHashCode == 104080000) {
                if (str.equals("month")) {
                    return u7e.b;
                }
                return null;
            }
            if (iHashCode == 651403948 && str.equals("quarter")) {
                return u7e.d;
            }
            return null;
        }
        PeriodUnit periodUnitG = drb.g(period);
        String str2 = this.plan;
        int iHashCode2 = str2.hashCode();
        if (iHashCode2 != 107876) {
            if (iHashCode2 != 111277) {
                if (iHashCode2 == 93508654 && str2.equals("basic")) {
                    i = periodUnitG != null ? m7e.a[periodUnitG.ordinal()] : -1;
                    if (i == 1) {
                        return u7e.z;
                    }
                    if (i == 2) {
                        return u7e.X;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return u7e.Y;
                }
            } else if (str2.equals("pro")) {
                i = periodUnitG != null ? m7e.a[periodUnitG.ordinal()] : -1;
                if (i == 1) {
                    return u7e.w;
                }
                if (i == 2) {
                    return u7e.x;
                }
                if (i != 3) {
                    return null;
                }
                return u7e.y;
            }
        } else if (str2.equals("max")) {
            i = periodUnitG != null ? m7e.a[periodUnitG.ordinal()] : -1;
            if (i == 1) {
                return u7e.f;
            }
            if (i == 2) {
                return u7e.g;
            }
            if (i != 3) {
                return null;
            }
            return u7e.v;
        }
        i = periodUnitG != null ? m7e.a[periodUnitG.ordinal()] : -1;
        if (i == 1) {
            return u7e.b;
        }
        if (i == 2) {
            return u7e.d;
        }
        if (i != 3) {
            return null;
        }
        return u7e.c;
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
        String str5 = this.expireAt;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.renewAt;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.plan;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Period period = this.period;
        return iHashCode7 + (period != null ? period.hashCode() : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r4.equals("wechat-app-pay") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r4.equals("wechat") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        defpackage.ca2.a.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (defpackage.ca2.c != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isPaymentTypeMatchedLocalPackage() {
        /*
            r4 = this;
            java.lang.String r4 = r4.paymentType
            r0 = 1
            if (r4 == 0) goto L47
            int r1 = r4.hashCode()
            r2 = -791770330(0xffffffffd0ce8b26, float:-2.7721806E10)
            r3 = 0
            if (r1 == r2) goto L33
            r2 = 184582428(0xb00811c, float:2.4749034E-32)
            if (r1 == r2) goto L23
            r2 = 1617727317(0x606c8f55, float:6.8183746E19)
            if (r1 == r2) goto L1a
            goto L3b
        L1a:
            java.lang.String r1 = "wechat-app-pay"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L3c
            goto L3b
        L23:
            java.lang.String r0 = "google-play-store"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L3b
            ca2 r4 = defpackage.ca2.a
            r4.getClass()
            boolean r4 = defpackage.ca2.c
            return r4
        L33:
            java.lang.String r1 = "wechat"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L3c
        L3b:
            return r3
        L3c:
            ca2 r4 = defpackage.ca2.a
            r4.getClass()
            boolean r4 = defpackage.ca2.c
            if (r4 != 0) goto L46
            return r0
        L46:
            return r3
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tech.chatmind.api.credits.SubscriptionInfo.isPaymentTypeMatchedLocalPackage():boolean");
    }

    public final Instant subscribedAt() {
        String str = this.subscribedAt;
        if (str == null) {
            return null;
        }
        try {
            return Instant.parse(str);
        } catch (Throwable th) {
            Throwable thA = ezb.a(new dzb(th));
            if (thA == null) {
                return null;
            }
            hf8.Q.getClass();
            kv2.A("Failed to parse date: ", this.subscribedAt, ef8.a("Quin.SubscriptionInfo"), thA);
            return null;
        }
    }

    public String toString() {
        String str = this.subscriptionType;
        String str2 = this.nextBillingAt;
        String str3 = this.subscribedAt;
        String str4 = this.paymentType;
        String str5 = this.expireAt;
        String str6 = this.renewAt;
        String str7 = this.plan;
        Period period = this.period;
        StringBuilder sbO = ib8.o("SubscriptionInfo(subscriptionType=", str, ", nextBillingAt=", str2, ", subscribedAt=");
        ub3.v(sbO, str3, ", paymentType=", str4, ", expireAt=");
        ub3.v(sbO, str5, ", renewAt=", str6, ", plan=");
        sbO.append(str7);
        sbO.append(", period=");
        sbO.append(period);
        sbO.append(")");
        return sbO.toString();
    }

    @dx3
    public static /* synthetic */ void getSubscriptionType$annotations() {
    }

    public SubscriptionInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, Period period) {
        this.subscriptionType = str;
        this.nextBillingAt = str2;
        this.subscribedAt = str3;
        this.paymentType = str4;
        this.expireAt = str5;
        this.renewAt = str6;
        this.plan = str7;
        this.period = period;
    }

    public /* synthetic */ SubscriptionInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, Period period, int i, rp3 rp3Var) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : period);
    }

    public final String getSubscriptionType() {
        return this.subscriptionType;
    }
}
