package tech.chatmind.api;

import defpackage.ag2;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.g2a;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.ond;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xn7;
import defpackage.xwd;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBY\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%JR\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b)\u0010%J\u001a\u0010+\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b1\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b2\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b\n\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u0010%¨\u00069"}, d2 = {"Ltech/chatmind/api/SpreadRecommendationResult;", "", "", "spreadId", "", "Ltech/chatmind/api/PatternData;", "patternData", "recommendSpreadReasonTitle", "recommendSpreadReasonDescription", "", "isSuggested", "", "usageCount", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZI)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZILxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/SpreadRecommendationResult;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "()Z", "component6", "()I", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZI)Ltech/chatmind/api/SpreadRecommendationResult;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSpreadId", "Ljava/util/List;", "getPatternData", "getRecommendSpreadReasonTitle", "getRecommendSpreadReasonDescription", "Z", "I", "getUsageCount", "Companion", "wwd", "xwd", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class SpreadRecommendationResult {
    public static final int $stable = 8;
    private final boolean isSuggested;
    private final List<PatternData> patternData;
    private final String recommendSpreadReasonDescription;
    private final String recommendSpreadReasonTitle;
    private final String spreadId;
    private final int usageCount;
    public static final xwd Companion = new xwd();
    private static final lw7[] $childSerializers = {null, eb3.N(z18.b, new ond(10)), null, null, null, null};

    public /* synthetic */ SpreadRecommendationResult(int i, String str, List list, String str2, String str3, boolean z, int i2, xyc xycVar) {
        if ((i & 1) == 0) {
            this.spreadId = "";
        } else {
            this.spreadId = str;
        }
        if ((i & 2) == 0) {
            this.patternData = pu4.a;
        } else {
            this.patternData = list;
        }
        if ((i & 4) == 0) {
            this.recommendSpreadReasonTitle = "";
        } else {
            this.recommendSpreadReasonTitle = str2;
        }
        if ((i & 8) == 0) {
            this.recommendSpreadReasonDescription = "";
        } else {
            this.recommendSpreadReasonDescription = str3;
        }
        if ((i & 16) == 0) {
            this.isSuggested = false;
        } else {
            this.isSuggested = z;
        }
        if ((i & 32) == 0) {
            this.usageCount = 0;
        } else {
            this.usageCount = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(g2a.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpreadRecommendationResult copy$default(SpreadRecommendationResult spreadRecommendationResult, String str, List list, String str2, String str3, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = spreadRecommendationResult.spreadId;
        }
        if ((i2 & 2) != 0) {
            list = spreadRecommendationResult.patternData;
        }
        if ((i2 & 4) != 0) {
            str2 = spreadRecommendationResult.recommendSpreadReasonTitle;
        }
        if ((i2 & 8) != 0) {
            str3 = spreadRecommendationResult.recommendSpreadReasonDescription;
        }
        if ((i2 & 16) != 0) {
            z = spreadRecommendationResult.isSuggested;
        }
        if ((i2 & 32) != 0) {
            i = spreadRecommendationResult.usageCount;
        }
        boolean z2 = z;
        int i3 = i;
        return spreadRecommendationResult.copy(str, list, str2, str3, z2, i3);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(SpreadRecommendationResult self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        if (output.g(serialDesc) || !pa7.t(self.spreadId, "")) {
            output.w(serialDesc, 0, self.spreadId);
        }
        if (output.g(serialDesc) || !pa7.t(self.patternData, pu4.a)) {
            output.p(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.patternData);
        }
        if (output.g(serialDesc) || !pa7.t(self.recommendSpreadReasonTitle, "")) {
            output.w(serialDesc, 2, self.recommendSpreadReasonTitle);
        }
        if (output.g(serialDesc) || !pa7.t(self.recommendSpreadReasonDescription, "")) {
            output.w(serialDesc, 3, self.recommendSpreadReasonDescription);
        }
        if (output.g(serialDesc) || self.isSuggested) {
            output.o(serialDesc, 4, self.isSuggested);
        }
        if (!output.g(serialDesc) && self.usageCount == 0) {
            return;
        }
        output.v(5, self.usageCount, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSpreadId() {
        return this.spreadId;
    }

    public final List<PatternData> component2() {
        return this.patternData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRecommendSpreadReasonTitle() {
        return this.recommendSpreadReasonTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRecommendSpreadReasonDescription() {
        return this.recommendSpreadReasonDescription;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsSuggested() {
        return this.isSuggested;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getUsageCount() {
        return this.usageCount;
    }

    public final SpreadRecommendationResult copy(String spreadId, List<PatternData> patternData, String recommendSpreadReasonTitle, String recommendSpreadReasonDescription, boolean isSuggested, int usageCount) {
        spreadId.getClass();
        patternData.getClass();
        recommendSpreadReasonTitle.getClass();
        recommendSpreadReasonDescription.getClass();
        return new SpreadRecommendationResult(spreadId, patternData, recommendSpreadReasonTitle, recommendSpreadReasonDescription, isSuggested, usageCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpreadRecommendationResult)) {
            return false;
        }
        SpreadRecommendationResult spreadRecommendationResult = (SpreadRecommendationResult) other;
        return pa7.t(this.spreadId, spreadRecommendationResult.spreadId) && pa7.t(this.patternData, spreadRecommendationResult.patternData) && pa7.t(this.recommendSpreadReasonTitle, spreadRecommendationResult.recommendSpreadReasonTitle) && pa7.t(this.recommendSpreadReasonDescription, spreadRecommendationResult.recommendSpreadReasonDescription) && this.isSuggested == spreadRecommendationResult.isSuggested && this.usageCount == spreadRecommendationResult.usageCount;
    }

    public final List<PatternData> getPatternData() {
        return this.patternData;
    }

    public final String getRecommendSpreadReasonDescription() {
        return this.recommendSpreadReasonDescription;
    }

    public final String getRecommendSpreadReasonTitle() {
        return this.recommendSpreadReasonTitle;
    }

    public final String getSpreadId() {
        return this.spreadId;
    }

    public final int getUsageCount() {
        return this.usageCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.usageCount) + ub3.d(ub3.c(ub3.c(tec.a(this.spreadId.hashCode() * 31, 31, this.patternData), 31, this.recommendSpreadReasonTitle), 31, this.recommendSpreadReasonDescription), 31, this.isSuggested);
    }

    public final boolean isSuggested() {
        return this.isSuggested;
    }

    public String toString() {
        String str = this.spreadId;
        List<PatternData> list = this.patternData;
        String str2 = this.recommendSpreadReasonTitle;
        String str3 = this.recommendSpreadReasonDescription;
        boolean z = this.isSuggested;
        int i = this.usageCount;
        StringBuilder sb = new StringBuilder("SpreadRecommendationResult(spreadId=");
        sb.append(str);
        sb.append(", patternData=");
        sb.append(list);
        sb.append(", recommendSpreadReasonTitle=");
        ub3.v(sb, str2, ", recommendSpreadReasonDescription=", str3, ", isSuggested=");
        sb.append(z);
        sb.append(", usageCount=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public SpreadRecommendationResult() {
        this((String) null, (List) null, (String) null, (String) null, false, 0, 63, (rp3) null);
    }

    public SpreadRecommendationResult(String str, List<PatternData> list, String str2, String str3, boolean z, int i) {
        str.getClass();
        list.getClass();
        str2.getClass();
        str3.getClass();
        this.spreadId = str;
        this.patternData = list;
        this.recommendSpreadReasonTitle = str2;
        this.recommendSpreadReasonDescription = str3;
        this.isSuggested = z;
        this.usageCount = i;
    }

    public /* synthetic */ SpreadRecommendationResult(String str, List list, String str2, String str3, boolean z, int i, int i2, rp3 rp3Var) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? pu4.a : list, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? 0 : i);
    }
}
