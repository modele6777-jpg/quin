package tech.chatmind.api;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.c77;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.g11;
import defpackage.gmb;
import defpackage.ib8;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.vlb;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import defpackage.zib;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DEBw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B{\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0080\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u0010\u0010'\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010\u0017R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b9\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b:\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b=\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b@\u0010\u0017R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bB\u0010#¨\u0006F"}, d2 = {"Ltech/chatmind/api/RedeemResponse;", "", "", "type", "benefitType", "", "tarotIds", "spreadId", "", "grantCount", "expireDays", "Ltech/chatmind/api/RedeemPopup;", "popup", "redeemCode", "", "retryable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ltech/chatmind/api/RedeemPopup;Ljava/lang/String;Ljava/lang/Boolean;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ltech/chatmind/api/RedeemPopup;Ljava/lang/String;Ljava/lang/Boolean;Lxyc;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()Ljava/lang/Integer;", "component6", "component7", "()Ltech/chatmind/api/RedeemPopup;", "component8", "component9", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ltech/chatmind/api/RedeemPopup;Ljava/lang/String;Ljava/lang/Boolean;)Ltech/chatmind/api/RedeemResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/RedeemResponse;Lag2;Lnyc;)V", "write$Self", "Ljava/lang/String;", "getType", "getBenefitType", "Ljava/util/List;", "getTarotIds", "getSpreadId", "Ljava/lang/Integer;", "getGrantCount", "getExpireDays", "Ltech/chatmind/api/RedeemPopup;", "getPopup", "getRedeemCode", "Ljava/lang/Boolean;", "getRetryable", "Companion", "fmb", "gmb", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class RedeemResponse {
    public static final int $stable = 8;
    private final String benefitType;
    private final Integer expireDays;
    private final Integer grantCount;
    private final RedeemPopup popup;
    private final String redeemCode;
    private final Boolean retryable;
    private final String spreadId;
    private final List<String> tarotIds;
    private final String type;
    public static final gmb Companion = new gmb();
    private static final lw7[] $childSerializers = {null, null, eb3.N(z18.b, new zib(1)), null, null, null, null, null, null};

    public /* synthetic */ RedeemResponse(int i, String str, String str2, List list, String str3, Integer num, Integer num2, RedeemPopup redeemPopup, String str4, Boolean bool, xyc xycVar) {
        this.type = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.benefitType = null;
        } else {
            this.benefitType = str2;
        }
        if ((i & 4) == 0) {
            this.tarotIds = null;
        } else {
            this.tarotIds = list;
        }
        if ((i & 8) == 0) {
            this.spreadId = null;
        } else {
            this.spreadId = str3;
        }
        if ((i & 16) == 0) {
            this.grantCount = null;
        } else {
            this.grantCount = num;
        }
        if ((i & 32) == 0) {
            this.expireDays = null;
        } else {
            this.expireDays = num2;
        }
        if ((i & 64) == 0) {
            this.popup = null;
        } else {
            this.popup = redeemPopup;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
            this.redeemCode = null;
        } else {
            this.redeemCode = str4;
        }
        if ((i & 256) == 0) {
            this.retryable = null;
        } else {
            this.retryable = bool;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(p4e.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RedeemResponse copy$default(RedeemResponse redeemResponse, String str, String str2, List list, String str3, Integer num, Integer num2, RedeemPopup redeemPopup, String str4, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = redeemResponse.type;
        }
        if ((i & 2) != 0) {
            str2 = redeemResponse.benefitType;
        }
        if ((i & 4) != 0) {
            list = redeemResponse.tarotIds;
        }
        if ((i & 8) != 0) {
            str3 = redeemResponse.spreadId;
        }
        if ((i & 16) != 0) {
            num = redeemResponse.grantCount;
        }
        if ((i & 32) != 0) {
            num2 = redeemResponse.expireDays;
        }
        if ((i & 64) != 0) {
            redeemPopup = redeemResponse.popup;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            str4 = redeemResponse.redeemCode;
        }
        if ((i & 256) != 0) {
            bool = redeemResponse.retryable;
        }
        String str5 = str4;
        Boolean bool2 = bool;
        Integer num3 = num2;
        RedeemPopup redeemPopup2 = redeemPopup;
        Integer num4 = num;
        List list2 = list;
        return redeemResponse.copy(str, str2, list2, str3, num4, num3, redeemPopup2, str5, bool2);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(RedeemResponse self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        if (output.g(serialDesc) || !pa7.t(self.type, "")) {
            output.w(serialDesc, 0, self.type);
        }
        if (output.g(serialDesc) || self.benefitType != null) {
            output.A(serialDesc, 1, p4e.a, self.benefitType);
        }
        if (output.g(serialDesc) || self.tarotIds != null) {
            output.A(serialDesc, 2, (xn7) lw7VarArr[2].getValue(), self.tarotIds);
        }
        if (output.g(serialDesc) || self.spreadId != null) {
            output.A(serialDesc, 3, p4e.a, self.spreadId);
        }
        if (output.g(serialDesc) || self.grantCount != null) {
            output.A(serialDesc, 4, c77.a, self.grantCount);
        }
        if (output.g(serialDesc) || self.expireDays != null) {
            output.A(serialDesc, 5, c77.a, self.expireDays);
        }
        if (output.g(serialDesc) || self.popup != null) {
            output.A(serialDesc, 6, vlb.a, self.popup);
        }
        if (output.g(serialDesc) || self.redeemCode != null) {
            output.A(serialDesc, 7, p4e.a, self.redeemCode);
        }
        if (!output.g(serialDesc) && self.retryable == null) {
            return;
        }
        output.A(serialDesc, 8, g11.a, self.retryable);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBenefitType() {
        return this.benefitType;
    }

    public final List<String> component3() {
        return this.tarotIds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSpreadId() {
        return this.spreadId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getGrantCount() {
        return this.grantCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getExpireDays() {
        return this.expireDays;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final RedeemPopup getPopup() {
        return this.popup;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRedeemCode() {
        return this.redeemCode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getRetryable() {
        return this.retryable;
    }

    public final RedeemResponse copy(String type, String benefitType, List<String> tarotIds, String spreadId, Integer grantCount, Integer expireDays, RedeemPopup popup, String redeemCode, Boolean retryable) {
        type.getClass();
        return new RedeemResponse(type, benefitType, tarotIds, spreadId, grantCount, expireDays, popup, redeemCode, retryable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RedeemResponse)) {
            return false;
        }
        RedeemResponse redeemResponse = (RedeemResponse) other;
        return pa7.t(this.type, redeemResponse.type) && pa7.t(this.benefitType, redeemResponse.benefitType) && pa7.t(this.tarotIds, redeemResponse.tarotIds) && pa7.t(this.spreadId, redeemResponse.spreadId) && pa7.t(this.grantCount, redeemResponse.grantCount) && pa7.t(this.expireDays, redeemResponse.expireDays) && pa7.t(this.popup, redeemResponse.popup) && pa7.t(this.redeemCode, redeemResponse.redeemCode) && pa7.t(this.retryable, redeemResponse.retryable);
    }

    public final String getBenefitType() {
        return this.benefitType;
    }

    public final Integer getExpireDays() {
        return this.expireDays;
    }

    public final Integer getGrantCount() {
        return this.grantCount;
    }

    public final RedeemPopup getPopup() {
        return this.popup;
    }

    public final String getRedeemCode() {
        return this.redeemCode;
    }

    public final Boolean getRetryable() {
        return this.retryable;
    }

    public final String getSpreadId() {
        return this.spreadId;
    }

    public final List<String> getTarotIds() {
        return this.tarotIds;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.benefitType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.tarotIds;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.spreadId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.grantCount;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.expireDays;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        RedeemPopup redeemPopup = this.popup;
        int iHashCode7 = (iHashCode6 + (redeemPopup == null ? 0 : redeemPopup.hashCode())) * 31;
        String str3 = this.redeemCode;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.retryable;
        return iHashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.benefitType;
        List<String> list = this.tarotIds;
        String str3 = this.spreadId;
        Integer num = this.grantCount;
        Integer num2 = this.expireDays;
        RedeemPopup redeemPopup = this.popup;
        String str4 = this.redeemCode;
        Boolean bool = this.retryable;
        StringBuilder sbO = ib8.o("RedeemResponse(type=", str, ", benefitType=", str2, ", tarotIds=");
        sbO.append(list);
        sbO.append(", spreadId=");
        sbO.append(str3);
        sbO.append(", grantCount=");
        sbO.append(num);
        sbO.append(", expireDays=");
        sbO.append(num2);
        sbO.append(", popup=");
        sbO.append(redeemPopup);
        sbO.append(", redeemCode=");
        sbO.append(str4);
        sbO.append(", retryable=");
        sbO.append(bool);
        sbO.append(")");
        return sbO.toString();
    }

    public RedeemResponse() {
        this((String) null, (String) null, (List) null, (String) null, (Integer) null, (Integer) null, (RedeemPopup) null, (String) null, (Boolean) null, 511, (rp3) null);
    }

    public RedeemResponse(String str, String str2, List<String> list, String str3, Integer num, Integer num2, RedeemPopup redeemPopup, String str4, Boolean bool) {
        str.getClass();
        this.type = str;
        this.benefitType = str2;
        this.tarotIds = list;
        this.spreadId = str3;
        this.grantCount = num;
        this.expireDays = num2;
        this.popup = redeemPopup;
        this.redeemCode = str4;
        this.retryable = bool;
    }

    public /* synthetic */ RedeemResponse(String str, String str2, List list, String str3, Integer num, Integer num2, RedeemPopup redeemPopup, String str4, Boolean bool, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : redeemPopup, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : str4, (i & 256) != 0 ? null : bool);
    }
}
