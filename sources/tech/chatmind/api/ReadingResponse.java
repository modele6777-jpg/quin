package tech.chatmind.api;

import defpackage.ag2;
import defpackage.an1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.i7b;
import defpackage.ib8;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.pgb;
import defpackage.qgb;
import defpackage.rp3;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rB_\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJb\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b(\u0010!J\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b\u0003\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b\u0004\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b\u0005\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b1\u0010!R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010$R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b4\u0010\u001d¨\u00068"}, d2 = {"Ltech/chatmind/api/ReadingResponse;", "", "", "isCanTarot", "isSuitable", "isAdditionalInfoNeeded", "", "additionalInfoQuestion", "suggestions", "", "userQuestionRecommendations", "needsRevision", "<init>", "(ZZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(IZZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/ReadingResponse;Lag2;Lnyc;)V", "write$Self", "component1", "()Z", "component2", "component3", "component4", "()Ljava/lang/String;", "component5", "component6", "()Ljava/util/List;", "component7", "copy", "(ZZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Z)Ltech/chatmind/api/ReadingResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/String;", "getAdditionalInfoQuestion", "getSuggestions", "Ljava/util/List;", "getUserQuestionRecommendations", "getNeedsRevision", "Companion", "pgb", "qgb", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class ReadingResponse {
    public static final int $stable = 8;
    private final String additionalInfoQuestion;
    private final boolean isAdditionalInfoNeeded;
    private final boolean isCanTarot;
    private final boolean isSuitable;
    private final boolean needsRevision;
    private final String suggestions;
    private final List<String> userQuestionRecommendations;
    public static final qgb Companion = new qgb();
    private static final lw7[] $childSerializers = {null, null, null, null, null, eb3.N(z18.b, new i7b(21)), null};

    public /* synthetic */ ReadingResponse(int i, boolean z, boolean z2, boolean z3, String str, String str2, List list, boolean z4, xyc xycVar) {
        if (63 != (i & 63)) {
            an1.R(i, 63, pgb.a.e());
            throw null;
        }
        this.isCanTarot = z;
        this.isSuitable = z2;
        this.isAdditionalInfoNeeded = z3;
        this.additionalInfoQuestion = str;
        this.suggestions = str2;
        this.userQuestionRecommendations = list;
        if ((i & 64) == 0) {
            this.needsRevision = false;
        } else {
            this.needsRevision = z4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(p4e.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReadingResponse copy$default(ReadingResponse readingResponse, boolean z, boolean z2, boolean z3, String str, String str2, List list, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = readingResponse.isCanTarot;
        }
        if ((i & 2) != 0) {
            z2 = readingResponse.isSuitable;
        }
        if ((i & 4) != 0) {
            z3 = readingResponse.isAdditionalInfoNeeded;
        }
        if ((i & 8) != 0) {
            str = readingResponse.additionalInfoQuestion;
        }
        if ((i & 16) != 0) {
            str2 = readingResponse.suggestions;
        }
        if ((i & 32) != 0) {
            list = readingResponse.userQuestionRecommendations;
        }
        if ((i & 64) != 0) {
            z4 = readingResponse.needsRevision;
        }
        List list2 = list;
        boolean z5 = z4;
        String str3 = str2;
        boolean z6 = z3;
        return readingResponse.copy(z, z2, z6, str, str3, list2, z5);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(ReadingResponse self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.o(serialDesc, 0, self.isCanTarot);
        output.o(serialDesc, 1, self.isSuitable);
        output.o(serialDesc, 2, self.isAdditionalInfoNeeded);
        p4e p4eVar = p4e.a;
        output.A(serialDesc, 3, p4eVar, self.additionalInfoQuestion);
        output.A(serialDesc, 4, p4eVar, self.suggestions);
        output.A(serialDesc, 5, (xn7) lw7VarArr[5].getValue(), self.userQuestionRecommendations);
        if (output.g(serialDesc) || self.needsRevision) {
            output.o(serialDesc, 6, self.needsRevision);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsCanTarot() {
        return this.isCanTarot;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsSuitable() {
        return this.isSuitable;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsAdditionalInfoNeeded() {
        return this.isAdditionalInfoNeeded;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAdditionalInfoQuestion() {
        return this.additionalInfoQuestion;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSuggestions() {
        return this.suggestions;
    }

    public final List<String> component6() {
        return this.userQuestionRecommendations;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getNeedsRevision() {
        return this.needsRevision;
    }

    public final ReadingResponse copy(boolean isCanTarot, boolean isSuitable, boolean isAdditionalInfoNeeded, String additionalInfoQuestion, String suggestions, List<String> userQuestionRecommendations, boolean needsRevision) {
        return new ReadingResponse(isCanTarot, isSuitable, isAdditionalInfoNeeded, additionalInfoQuestion, suggestions, userQuestionRecommendations, needsRevision);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadingResponse)) {
            return false;
        }
        ReadingResponse readingResponse = (ReadingResponse) other;
        return this.isCanTarot == readingResponse.isCanTarot && this.isSuitable == readingResponse.isSuitable && this.isAdditionalInfoNeeded == readingResponse.isAdditionalInfoNeeded && pa7.t(this.additionalInfoQuestion, readingResponse.additionalInfoQuestion) && pa7.t(this.suggestions, readingResponse.suggestions) && pa7.t(this.userQuestionRecommendations, readingResponse.userQuestionRecommendations) && this.needsRevision == readingResponse.needsRevision;
    }

    public final String getAdditionalInfoQuestion() {
        return this.additionalInfoQuestion;
    }

    public final boolean getNeedsRevision() {
        return this.needsRevision;
    }

    public final String getSuggestions() {
        return this.suggestions;
    }

    public final List<String> getUserQuestionRecommendations() {
        return this.userQuestionRecommendations;
    }

    public int hashCode() {
        int iD = ub3.d(ub3.d(Boolean.hashCode(this.isCanTarot) * 31, 31, this.isSuitable), 31, this.isAdditionalInfoNeeded);
        String str = this.additionalInfoQuestion;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.suggestions;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.userQuestionRecommendations;
        return Boolean.hashCode(this.needsRevision) + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final boolean isAdditionalInfoNeeded() {
        return this.isAdditionalInfoNeeded;
    }

    public final boolean isCanTarot() {
        return this.isCanTarot;
    }

    public final boolean isSuitable() {
        return this.isSuitable;
    }

    public String toString() {
        boolean z = this.isCanTarot;
        boolean z2 = this.isSuitable;
        boolean z3 = this.isAdditionalInfoNeeded;
        String str = this.additionalInfoQuestion;
        String str2 = this.suggestions;
        List<String> list = this.userQuestionRecommendations;
        boolean z4 = this.needsRevision;
        StringBuilder sbP = ib8.p("ReadingResponse(isCanTarot=", ", isSuitable=", ", isAdditionalInfoNeeded=", z, z2);
        sbP.append(z3);
        sbP.append(", additionalInfoQuestion=");
        sbP.append(str);
        sbP.append(", suggestions=");
        ib8.v(sbP, str2, ", userQuestionRecommendations=", list, ", needsRevision=");
        return ub3.m(sbP, z4, ")");
    }

    public ReadingResponse(boolean z, boolean z2, boolean z3, String str, String str2, List<String> list, boolean z4) {
        this.isCanTarot = z;
        this.isSuitable = z2;
        this.isAdditionalInfoNeeded = z3;
        this.additionalInfoQuestion = str;
        this.suggestions = str2;
        this.userQuestionRecommendations = list;
        this.needsRevision = z4;
    }

    public /* synthetic */ ReadingResponse(boolean z, boolean z2, boolean z3, String str, String str2, List list, boolean z4, int i, rp3 rp3Var) {
        this(z, z2, z3, str, str2, list, (i & 64) != 0 ? false : z4);
    }
}
