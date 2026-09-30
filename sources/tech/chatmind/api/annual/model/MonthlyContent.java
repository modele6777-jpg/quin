package tech.chatmind.api.annual.model;

import defpackage.ag2;
import defpackage.an1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.fk8;
import defpackage.k19;
import defpackage.ks0;
import defpackage.l19;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.x29;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ4\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b*\u0010\u001b¨\u0006."}, d2 = {"Ltech/chatmind/api/annual/model/MonthlyContent;", "", "", "Ltech/chatmind/api/annual/model/MonthlySummary;", "monthlyReports", "", "scoreTrendSummary", "summary", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/annual/model/MonthlyContent;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ltech/chatmind/api/annual/model/MonthlyContent;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getMonthlyReports", "Ljava/lang/String;", "getScoreTrendSummary", "getSummary", "Companion", "k19", "l19", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class MonthlyContent {
    public static final int $stable = 8;
    private final List<MonthlySummary> monthlyReports;
    private final String scoreTrendSummary;
    private final String summary;
    public static final l19 Companion = new l19();
    private static final lw7[] $childSerializers = {eb3.N(z18.b, new fk8(13)), null, null};

    public /* synthetic */ MonthlyContent(int i, List list, String str, String str2, xyc xycVar) {
        if (7 != (i & 7)) {
            an1.R(i, 7, k19.a.e());
            throw null;
        }
        this.monthlyReports = list;
        this.scoreTrendSummary = str;
        this.summary = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(x29.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MonthlyContent copy$default(MonthlyContent monthlyContent, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = monthlyContent.monthlyReports;
        }
        if ((i & 2) != 0) {
            str = monthlyContent.scoreTrendSummary;
        }
        if ((i & 4) != 0) {
            str2 = monthlyContent.summary;
        }
        return monthlyContent.copy(list, str, str2);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(MonthlyContent self, ag2 output, nyc serialDesc) {
        output.p(serialDesc, 0, (xn7) $childSerializers[0].getValue(), self.monthlyReports);
        output.w(serialDesc, 1, self.scoreTrendSummary);
        output.w(serialDesc, 2, self.summary);
    }

    public final List<MonthlySummary> component1() {
        return this.monthlyReports;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getScoreTrendSummary() {
        return this.scoreTrendSummary;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    public final MonthlyContent copy(List<MonthlySummary> monthlyReports, String scoreTrendSummary, String summary) {
        monthlyReports.getClass();
        scoreTrendSummary.getClass();
        summary.getClass();
        return new MonthlyContent(monthlyReports, scoreTrendSummary, summary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MonthlyContent)) {
            return false;
        }
        MonthlyContent monthlyContent = (MonthlyContent) other;
        return pa7.t(this.monthlyReports, monthlyContent.monthlyReports) && pa7.t(this.scoreTrendSummary, monthlyContent.scoreTrendSummary) && pa7.t(this.summary, monthlyContent.summary);
    }

    public final List<MonthlySummary> getMonthlyReports() {
        return this.monthlyReports;
    }

    public final String getScoreTrendSummary() {
        return this.scoreTrendSummary;
    }

    public final String getSummary() {
        return this.summary;
    }

    public int hashCode() {
        return this.summary.hashCode() + ub3.c(this.monthlyReports.hashCode() * 31, 31, this.scoreTrendSummary);
    }

    public String toString() {
        List<MonthlySummary> list = this.monthlyReports;
        String str = this.scoreTrendSummary;
        String str2 = this.summary;
        StringBuilder sb = new StringBuilder("MonthlyContent(monthlyReports=");
        sb.append(list);
        sb.append(", scoreTrendSummary=");
        sb.append(str);
        sb.append(", summary=");
        return ks0.l(sb, str2, ")");
    }

    public MonthlyContent(List<MonthlySummary> list, String str, String str2) {
        list.getClass();
        str.getClass();
        str2.getClass();
        this.monthlyReports = list;
        this.scoreTrendSummary = str;
        this.summary = str2;
    }
}
