package tech.chatmind.api;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.g11;
import defpackage.ib8;
import defpackage.lw7;
import defpackage.mie;
import defpackage.nyc;
import defpackage.oje;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002ABB}\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\u0081\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0017J\u0086\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u0010\u0010'\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b9\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b:\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b;\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b\n\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b\u000b\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b\f\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010!R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b?\u0010\u0017¨\u0006C"}, d2 = {"Ltech/chatmind/api/TarotReadingQuestionHistory;", "", "", "userQuestion", "confirmedQuestion", "", "userQuestionRecommendations", "additionalInfoQuestion", "suggestions", "", "isCanTarot", "isSuitable", "isAdditionalInfoNeeded", "needsRevision", "createdTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lxyc;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "()Z", "component7", "component8", "()Ljava/lang/Boolean;", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Ltech/chatmind/api/TarotReadingQuestionHistory;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/TarotReadingQuestionHistory;Lag2;Lnyc;)V", "write$Self", "Ljava/lang/String;", "getUserQuestion", "getConfirmedQuestion", "Ljava/util/List;", "getUserQuestionRecommendations", "getAdditionalInfoQuestion", "getSuggestions", "Z", "Ljava/lang/Boolean;", "getNeedsRevision", "getCreatedTime", "Companion", "nje", "oje", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class TarotReadingQuestionHistory {
    public static final int $stable = 8;
    private final String additionalInfoQuestion;
    private final String confirmedQuestion;
    private final String createdTime;
    private final Boolean isAdditionalInfoNeeded;
    private final boolean isCanTarot;
    private final boolean isSuitable;
    private final Boolean needsRevision;
    private final String suggestions;
    private final String userQuestion;
    private final List<String> userQuestionRecommendations;
    public static final oje Companion = new oje();
    private static final lw7[] $childSerializers = {null, null, eb3.N(z18.b, new mie(6)), null, null, null, null, null, null, null};

    public /* synthetic */ TarotReadingQuestionHistory(int i, String str, String str2, List list, String str3, String str4, boolean z, boolean z2, Boolean bool, Boolean bool2, String str5, xyc xycVar) {
        this.userQuestion = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.confirmedQuestion = null;
        } else {
            this.confirmedQuestion = str2;
        }
        if ((i & 4) == 0) {
            this.userQuestionRecommendations = pu4.a;
        } else {
            this.userQuestionRecommendations = list;
        }
        if ((i & 8) == 0) {
            this.additionalInfoQuestion = null;
        } else {
            this.additionalInfoQuestion = str3;
        }
        if ((i & 16) == 0) {
            this.suggestions = null;
        } else {
            this.suggestions = str4;
        }
        if ((i & 32) == 0) {
            this.isCanTarot = true;
        } else {
            this.isCanTarot = z;
        }
        if ((i & 64) == 0) {
            this.isSuitable = true;
        } else {
            this.isSuitable = z2;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
            this.isAdditionalInfoNeeded = null;
        } else {
            this.isAdditionalInfoNeeded = bool;
        }
        if ((i & 256) == 0) {
            this.needsRevision = null;
        } else {
            this.needsRevision = bool2;
        }
        if ((i & 512) == 0) {
            this.createdTime = null;
        } else {
            this.createdTime = str5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(p4e.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TarotReadingQuestionHistory copy$default(TarotReadingQuestionHistory tarotReadingQuestionHistory, String str, String str2, List list, String str3, String str4, boolean z, boolean z2, Boolean bool, Boolean bool2, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tarotReadingQuestionHistory.userQuestion;
        }
        if ((i & 2) != 0) {
            str2 = tarotReadingQuestionHistory.confirmedQuestion;
        }
        if ((i & 4) != 0) {
            list = tarotReadingQuestionHistory.userQuestionRecommendations;
        }
        if ((i & 8) != 0) {
            str3 = tarotReadingQuestionHistory.additionalInfoQuestion;
        }
        if ((i & 16) != 0) {
            str4 = tarotReadingQuestionHistory.suggestions;
        }
        if ((i & 32) != 0) {
            z = tarotReadingQuestionHistory.isCanTarot;
        }
        if ((i & 64) != 0) {
            z2 = tarotReadingQuestionHistory.isSuitable;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            bool = tarotReadingQuestionHistory.isAdditionalInfoNeeded;
        }
        if ((i & 256) != 0) {
            bool2 = tarotReadingQuestionHistory.needsRevision;
        }
        if ((i & 512) != 0) {
            str5 = tarotReadingQuestionHistory.createdTime;
        }
        Boolean bool3 = bool2;
        String str6 = str5;
        boolean z3 = z2;
        Boolean bool4 = bool;
        String str7 = str4;
        boolean z4 = z;
        return tarotReadingQuestionHistory.copy(str, str2, list, str3, str7, z4, z3, bool4, bool3, str6);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(TarotReadingQuestionHistory self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        if (output.g(serialDesc) || !pa7.t(self.userQuestion, "")) {
            output.w(serialDesc, 0, self.userQuestion);
        }
        if (output.g(serialDesc) || self.confirmedQuestion != null) {
            output.A(serialDesc, 1, p4e.a, self.confirmedQuestion);
        }
        if (output.g(serialDesc) || !pa7.t(self.userQuestionRecommendations, pu4.a)) {
            output.p(serialDesc, 2, (xn7) lw7VarArr[2].getValue(), self.userQuestionRecommendations);
        }
        if (output.g(serialDesc) || self.additionalInfoQuestion != null) {
            output.A(serialDesc, 3, p4e.a, self.additionalInfoQuestion);
        }
        if (output.g(serialDesc) || self.suggestions != null) {
            output.A(serialDesc, 4, p4e.a, self.suggestions);
        }
        if (output.g(serialDesc) || !self.isCanTarot) {
            output.o(serialDesc, 5, self.isCanTarot);
        }
        if (output.g(serialDesc) || !self.isSuitable) {
            output.o(serialDesc, 6, self.isSuitable);
        }
        if (output.g(serialDesc) || self.isAdditionalInfoNeeded != null) {
            output.A(serialDesc, 7, g11.a, self.isAdditionalInfoNeeded);
        }
        if (output.g(serialDesc) || self.needsRevision != null) {
            output.A(serialDesc, 8, g11.a, self.needsRevision);
        }
        if (!output.g(serialDesc) && self.createdTime == null) {
            return;
        }
        output.A(serialDesc, 9, p4e.a, self.createdTime);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserQuestion() {
        return this.userQuestion;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCreatedTime() {
        return this.createdTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConfirmedQuestion() {
        return this.confirmedQuestion;
    }

    public final List<String> component3() {
        return this.userQuestionRecommendations;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAdditionalInfoQuestion() {
        return this.additionalInfoQuestion;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSuggestions() {
        return this.suggestions;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsCanTarot() {
        return this.isCanTarot;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsSuitable() {
        return this.isSuitable;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getIsAdditionalInfoNeeded() {
        return this.isAdditionalInfoNeeded;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getNeedsRevision() {
        return this.needsRevision;
    }

    public final TarotReadingQuestionHistory copy(String userQuestion, String confirmedQuestion, List<String> userQuestionRecommendations, String additionalInfoQuestion, String suggestions, boolean isCanTarot, boolean isSuitable, Boolean isAdditionalInfoNeeded, Boolean needsRevision, String createdTime) {
        userQuestion.getClass();
        userQuestionRecommendations.getClass();
        return new TarotReadingQuestionHistory(userQuestion, confirmedQuestion, userQuestionRecommendations, additionalInfoQuestion, suggestions, isCanTarot, isSuitable, isAdditionalInfoNeeded, needsRevision, createdTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TarotReadingQuestionHistory)) {
            return false;
        }
        TarotReadingQuestionHistory tarotReadingQuestionHistory = (TarotReadingQuestionHistory) other;
        return pa7.t(this.userQuestion, tarotReadingQuestionHistory.userQuestion) && pa7.t(this.confirmedQuestion, tarotReadingQuestionHistory.confirmedQuestion) && pa7.t(this.userQuestionRecommendations, tarotReadingQuestionHistory.userQuestionRecommendations) && pa7.t(this.additionalInfoQuestion, tarotReadingQuestionHistory.additionalInfoQuestion) && pa7.t(this.suggestions, tarotReadingQuestionHistory.suggestions) && this.isCanTarot == tarotReadingQuestionHistory.isCanTarot && this.isSuitable == tarotReadingQuestionHistory.isSuitable && pa7.t(this.isAdditionalInfoNeeded, tarotReadingQuestionHistory.isAdditionalInfoNeeded) && pa7.t(this.needsRevision, tarotReadingQuestionHistory.needsRevision) && pa7.t(this.createdTime, tarotReadingQuestionHistory.createdTime);
    }

    public final String getAdditionalInfoQuestion() {
        return this.additionalInfoQuestion;
    }

    public final String getConfirmedQuestion() {
        return this.confirmedQuestion;
    }

    public final String getCreatedTime() {
        return this.createdTime;
    }

    public final Boolean getNeedsRevision() {
        return this.needsRevision;
    }

    public final String getSuggestions() {
        return this.suggestions;
    }

    public final String getUserQuestion() {
        return this.userQuestion;
    }

    public final List<String> getUserQuestionRecommendations() {
        return this.userQuestionRecommendations;
    }

    public int hashCode() {
        int iHashCode = this.userQuestion.hashCode() * 31;
        String str = this.confirmedQuestion;
        int iA = tec.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.userQuestionRecommendations);
        String str2 = this.additionalInfoQuestion;
        int iHashCode2 = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.suggestions;
        int iD = ub3.d(ub3.d((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.isCanTarot), 31, this.isSuitable);
        Boolean bool = this.isAdditionalInfoNeeded;
        int iHashCode3 = (iD + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.needsRevision;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.createdTime;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final Boolean isAdditionalInfoNeeded() {
        return this.isAdditionalInfoNeeded;
    }

    public final boolean isCanTarot() {
        return this.isCanTarot;
    }

    public final boolean isSuitable() {
        return this.isSuitable;
    }

    public String toString() {
        String str = this.userQuestion;
        String str2 = this.confirmedQuestion;
        List<String> list = this.userQuestionRecommendations;
        String str3 = this.additionalInfoQuestion;
        String str4 = this.suggestions;
        boolean z = this.isCanTarot;
        boolean z2 = this.isSuitable;
        Boolean bool = this.isAdditionalInfoNeeded;
        Boolean bool2 = this.needsRevision;
        String str5 = this.createdTime;
        StringBuilder sbO = ib8.o("TarotReadingQuestionHistory(userQuestion=", str, ", confirmedQuestion=", str2, ", userQuestionRecommendations=");
        sbO.append(list);
        sbO.append(", additionalInfoQuestion=");
        sbO.append(str3);
        sbO.append(", suggestions=");
        sbO.append(str4);
        sbO.append(", isCanTarot=");
        sbO.append(z);
        sbO.append(", isSuitable=");
        sbO.append(z2);
        sbO.append(", isAdditionalInfoNeeded=");
        sbO.append(bool);
        sbO.append(", needsRevision=");
        sbO.append(bool2);
        sbO.append(", createdTime=");
        sbO.append(str5);
        sbO.append(")");
        return sbO.toString();
    }

    public TarotReadingQuestionHistory() {
        this((String) null, (String) null, (List) null, (String) null, (String) null, false, false, (Boolean) null, (Boolean) null, (String) null, 1023, (rp3) null);
    }

    public TarotReadingQuestionHistory(String str, String str2, List<String> list, String str3, String str4, boolean z, boolean z2, Boolean bool, Boolean bool2, String str5) {
        str.getClass();
        list.getClass();
        this.userQuestion = str;
        this.confirmedQuestion = str2;
        this.userQuestionRecommendations = list;
        this.additionalInfoQuestion = str3;
        this.suggestions = str4;
        this.isCanTarot = z;
        this.isSuitable = z2;
        this.isAdditionalInfoNeeded = bool;
        this.needsRevision = bool2;
        this.createdTime = str5;
    }

    public /* synthetic */ TarotReadingQuestionHistory(String str, String str2, List list, String str3, String str4, boolean z, boolean z2, Boolean bool, Boolean bool2, String str5, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? pu4.a : list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? true : z, (i & 64) != 0 ? true : z2, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : bool, (i & 256) != 0 ? null : bool2, (i & 512) != 0 ? null : str5);
    }
}
