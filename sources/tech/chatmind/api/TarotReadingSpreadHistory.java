package tech.chatmind.api;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.ib8;
import defpackage.ji;
import defpackage.lw7;
import defpackage.mie;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.qpf;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.wke;
import defpackage.x56;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002ABBm\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010Bq\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010 Jv\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010 J\u0010\u0010.\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b7\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b8\u0010 R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b?\u0010 ¨\u0006C"}, d2 = {"Ltech/chatmind/api/TarotReadingSpreadHistory;", "", "", "userSelectedSpreadId", "recommendSpreadId", "recommendSpreadReason", "spreadId", "", "Ltech/chatmind/api/GeneratedSpreadPosition;", "generatedSpread", "Ltech/chatmind/api/UserSelectedSpread;", "userSelectedSpread", "Ltech/chatmind/api/AiRecommendResponse;", "aiRecommendedSpreads", "createdTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ltech/chatmind/api/UserSelectedSpread;Ltech/chatmind/api/AiRecommendResponse;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ltech/chatmind/api/UserSelectedSpread;Ltech/chatmind/api/AiRecommendResponse;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/TarotReadingSpreadHistory;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "()Ltech/chatmind/api/UserSelectedSpread;", "component7", "()Ltech/chatmind/api/AiRecommendResponse;", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ltech/chatmind/api/UserSelectedSpread;Ltech/chatmind/api/AiRecommendResponse;Ljava/lang/String;)Ltech/chatmind/api/TarotReadingSpreadHistory;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUserSelectedSpreadId", "getRecommendSpreadId", "getRecommendSpreadReason", "getSpreadId", "Ljava/util/List;", "getGeneratedSpread", "Ltech/chatmind/api/UserSelectedSpread;", "getUserSelectedSpread", "Ltech/chatmind/api/AiRecommendResponse;", "getAiRecommendedSpreads", "getCreatedTime", "Companion", "vke", "wke", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class TarotReadingSpreadHistory {
    private final AiRecommendResponse aiRecommendedSpreads;
    private final String createdTime;
    private final List<GeneratedSpreadPosition> generatedSpread;
    private final String recommendSpreadId;
    private final String recommendSpreadReason;
    private final String spreadId;
    private final UserSelectedSpread userSelectedSpread;
    private final String userSelectedSpreadId;
    public static final wke Companion = new wke();
    public static final int $stable = AiRecommendResponse.$stable;
    private static final lw7[] $childSerializers = {null, null, null, null, eb3.N(z18.b, new mie(7)), null, null, null};

    public /* synthetic */ TarotReadingSpreadHistory(int i, String str, String str2, String str3, String str4, List list, UserSelectedSpread userSelectedSpread, AiRecommendResponse aiRecommendResponse, String str5, xyc xycVar) {
        if ((i & 1) == 0) {
            this.userSelectedSpreadId = null;
        } else {
            this.userSelectedSpreadId = str;
        }
        if ((i & 2) == 0) {
            this.recommendSpreadId = null;
        } else {
            this.recommendSpreadId = str2;
        }
        if ((i & 4) == 0) {
            this.recommendSpreadReason = null;
        } else {
            this.recommendSpreadReason = str3;
        }
        if ((i & 8) == 0) {
            this.spreadId = null;
        } else {
            this.spreadId = str4;
        }
        if ((i & 16) == 0) {
            this.generatedSpread = null;
        } else {
            this.generatedSpread = list;
        }
        if ((i & 32) == 0) {
            this.userSelectedSpread = null;
        } else {
            this.userSelectedSpread = userSelectedSpread;
        }
        if ((i & 64) == 0) {
            this.aiRecommendedSpreads = null;
        } else {
            this.aiRecommendedSpreads = aiRecommendResponse;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
            this.createdTime = null;
        } else {
            this.createdTime = str5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(x56.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TarotReadingSpreadHistory copy$default(TarotReadingSpreadHistory tarotReadingSpreadHistory, String str, String str2, String str3, String str4, List list, UserSelectedSpread userSelectedSpread, AiRecommendResponse aiRecommendResponse, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tarotReadingSpreadHistory.userSelectedSpreadId;
        }
        if ((i & 2) != 0) {
            str2 = tarotReadingSpreadHistory.recommendSpreadId;
        }
        if ((i & 4) != 0) {
            str3 = tarotReadingSpreadHistory.recommendSpreadReason;
        }
        if ((i & 8) != 0) {
            str4 = tarotReadingSpreadHistory.spreadId;
        }
        if ((i & 16) != 0) {
            list = tarotReadingSpreadHistory.generatedSpread;
        }
        if ((i & 32) != 0) {
            userSelectedSpread = tarotReadingSpreadHistory.userSelectedSpread;
        }
        if ((i & 64) != 0) {
            aiRecommendResponse = tarotReadingSpreadHistory.aiRecommendedSpreads;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            str5 = tarotReadingSpreadHistory.createdTime;
        }
        AiRecommendResponse aiRecommendResponse2 = aiRecommendResponse;
        String str6 = str5;
        List list2 = list;
        UserSelectedSpread userSelectedSpread2 = userSelectedSpread;
        return tarotReadingSpreadHistory.copy(str, str2, str3, str4, list2, userSelectedSpread2, aiRecommendResponse2, str6);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(TarotReadingSpreadHistory self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        if (output.g(serialDesc) || self.userSelectedSpreadId != null) {
            output.A(serialDesc, 0, p4e.a, self.userSelectedSpreadId);
        }
        if (output.g(serialDesc) || self.recommendSpreadId != null) {
            output.A(serialDesc, 1, p4e.a, self.recommendSpreadId);
        }
        if (output.g(serialDesc) || self.recommendSpreadReason != null) {
            output.A(serialDesc, 2, p4e.a, self.recommendSpreadReason);
        }
        if (output.g(serialDesc) || self.spreadId != null) {
            output.A(serialDesc, 3, p4e.a, self.spreadId);
        }
        if (output.g(serialDesc) || self.generatedSpread != null) {
            output.A(serialDesc, 4, (xn7) lw7VarArr[4].getValue(), self.generatedSpread);
        }
        if (output.g(serialDesc) || self.userSelectedSpread != null) {
            output.A(serialDesc, 5, qpf.a, self.userSelectedSpread);
        }
        if (output.g(serialDesc) || self.aiRecommendedSpreads != null) {
            output.A(serialDesc, 6, ji.a, self.aiRecommendedSpreads);
        }
        if (!output.g(serialDesc) && self.createdTime == null) {
            return;
        }
        output.A(serialDesc, 7, p4e.a, self.createdTime);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserSelectedSpreadId() {
        return this.userSelectedSpreadId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRecommendSpreadId() {
        return this.recommendSpreadId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRecommendSpreadReason() {
        return this.recommendSpreadReason;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSpreadId() {
        return this.spreadId;
    }

    public final List<GeneratedSpreadPosition> component5() {
        return this.generatedSpread;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final UserSelectedSpread getUserSelectedSpread() {
        return this.userSelectedSpread;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final AiRecommendResponse getAiRecommendedSpreads() {
        return this.aiRecommendedSpreads;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCreatedTime() {
        return this.createdTime;
    }

    public final TarotReadingSpreadHistory copy(String userSelectedSpreadId, String recommendSpreadId, String recommendSpreadReason, String spreadId, List<GeneratedSpreadPosition> generatedSpread, UserSelectedSpread userSelectedSpread, AiRecommendResponse aiRecommendedSpreads, String createdTime) {
        return new TarotReadingSpreadHistory(userSelectedSpreadId, recommendSpreadId, recommendSpreadReason, spreadId, generatedSpread, userSelectedSpread, aiRecommendedSpreads, createdTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TarotReadingSpreadHistory)) {
            return false;
        }
        TarotReadingSpreadHistory tarotReadingSpreadHistory = (TarotReadingSpreadHistory) other;
        return pa7.t(this.userSelectedSpreadId, tarotReadingSpreadHistory.userSelectedSpreadId) && pa7.t(this.recommendSpreadId, tarotReadingSpreadHistory.recommendSpreadId) && pa7.t(this.recommendSpreadReason, tarotReadingSpreadHistory.recommendSpreadReason) && pa7.t(this.spreadId, tarotReadingSpreadHistory.spreadId) && pa7.t(this.generatedSpread, tarotReadingSpreadHistory.generatedSpread) && pa7.t(this.userSelectedSpread, tarotReadingSpreadHistory.userSelectedSpread) && pa7.t(this.aiRecommendedSpreads, tarotReadingSpreadHistory.aiRecommendedSpreads) && pa7.t(this.createdTime, tarotReadingSpreadHistory.createdTime);
    }

    public final AiRecommendResponse getAiRecommendedSpreads() {
        return this.aiRecommendedSpreads;
    }

    public final String getCreatedTime() {
        return this.createdTime;
    }

    public final List<GeneratedSpreadPosition> getGeneratedSpread() {
        return this.generatedSpread;
    }

    public final String getRecommendSpreadId() {
        return this.recommendSpreadId;
    }

    public final String getRecommendSpreadReason() {
        return this.recommendSpreadReason;
    }

    public final String getSpreadId() {
        return this.spreadId;
    }

    public final UserSelectedSpread getUserSelectedSpread() {
        return this.userSelectedSpread;
    }

    public final String getUserSelectedSpreadId() {
        return this.userSelectedSpreadId;
    }

    public int hashCode() {
        String str = this.userSelectedSpreadId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.recommendSpreadId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.recommendSpreadReason;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.spreadId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<GeneratedSpreadPosition> list = this.generatedSpread;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        UserSelectedSpread userSelectedSpread = this.userSelectedSpread;
        int iHashCode6 = (iHashCode5 + (userSelectedSpread == null ? 0 : userSelectedSpread.hashCode())) * 31;
        AiRecommendResponse aiRecommendResponse = this.aiRecommendedSpreads;
        int iHashCode7 = (iHashCode6 + (aiRecommendResponse == null ? 0 : aiRecommendResponse.hashCode())) * 31;
        String str5 = this.createdTime;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.userSelectedSpreadId;
        String str2 = this.recommendSpreadId;
        String str3 = this.recommendSpreadReason;
        String str4 = this.spreadId;
        List<GeneratedSpreadPosition> list = this.generatedSpread;
        UserSelectedSpread userSelectedSpread = this.userSelectedSpread;
        AiRecommendResponse aiRecommendResponse = this.aiRecommendedSpreads;
        String str5 = this.createdTime;
        StringBuilder sbO = ib8.o("TarotReadingSpreadHistory(userSelectedSpreadId=", str, ", recommendSpreadId=", str2, ", recommendSpreadReason=");
        ub3.v(sbO, str3, ", spreadId=", str4, ", generatedSpread=");
        sbO.append(list);
        sbO.append(", userSelectedSpread=");
        sbO.append(userSelectedSpread);
        sbO.append(", aiRecommendedSpreads=");
        sbO.append(aiRecommendResponse);
        sbO.append(", createdTime=");
        sbO.append(str5);
        sbO.append(")");
        return sbO.toString();
    }

    public TarotReadingSpreadHistory() {
        this((String) null, (String) null, (String) null, (String) null, (List) null, (UserSelectedSpread) null, (AiRecommendResponse) null, (String) null, 255, (rp3) null);
    }

    public TarotReadingSpreadHistory(String str, String str2, String str3, String str4, List<GeneratedSpreadPosition> list, UserSelectedSpread userSelectedSpread, AiRecommendResponse aiRecommendResponse, String str5) {
        this.userSelectedSpreadId = str;
        this.recommendSpreadId = str2;
        this.recommendSpreadReason = str3;
        this.spreadId = str4;
        this.generatedSpread = list;
        this.userSelectedSpread = userSelectedSpread;
        this.aiRecommendedSpreads = aiRecommendResponse;
        this.createdTime = str5;
    }

    public /* synthetic */ TarotReadingSpreadHistory(String str, String str2, String str3, String str4, List list, UserSelectedSpread userSelectedSpread, AiRecommendResponse aiRecommendResponse, String str5, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : userSelectedSpread, (i & 64) != 0 ? null : aiRecommendResponse, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : str5);
    }
}
