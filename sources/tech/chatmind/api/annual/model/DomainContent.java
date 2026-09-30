package tech.chatmind.api.annual.model;

import defpackage.ag2;
import defpackage.an1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.gi4;
import defpackage.ib8;
import defpackage.ks0;
import defpackage.lg4;
import defpackage.lw7;
import defpackage.mg4;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.syc;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.v74;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJH\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001bR&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b2\u0010\u001b¨\u00066"}, d2 = {"Ltech/chatmind/api/annual/model/DomainContent;", "", "", "annualLuckItem", "annualSummary", "annualSummaryHighlight", "", "Ltech/chatmind/api/annual/model/DomainSummary;", "domainSummaries", "domainSummary", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/annual/model/DomainContent;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ltech/chatmind/api/annual/model/DomainContent;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAnnualLuckItem", "getAnnualSummary", "getAnnualSummaryHighlight", "Ljava/util/List;", "getDomainSummaries", "getDomainSummaries$annotations", "()V", "getDomainSummary", "Companion", "lg4", "mg4", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class DomainContent {
    public static final int $stable = 8;
    private final String annualLuckItem;
    private final String annualSummary;
    private final String annualSummaryHighlight;
    private final List<DomainSummary> domainSummaries;
    private final String domainSummary;
    public static final mg4 Companion = new mg4();
    private static final lw7[] $childSerializers = {null, null, null, eb3.N(z18.b, new v74(3)), null};

    public /* synthetic */ DomainContent(int i, String str, String str2, String str3, List list, String str4, xyc xycVar) {
        if (31 != (i & 31)) {
            an1.R(i, 31, lg4.a.e());
            throw null;
        }
        this.annualLuckItem = str;
        this.annualSummary = str2;
        this.annualSummaryHighlight = str3;
        this.domainSummaries = list;
        this.domainSummary = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(gi4.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DomainContent copy$default(DomainContent domainContent, String str, String str2, String str3, List list, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = domainContent.annualLuckItem;
        }
        if ((i & 2) != 0) {
            str2 = domainContent.annualSummary;
        }
        if ((i & 4) != 0) {
            str3 = domainContent.annualSummaryHighlight;
        }
        if ((i & 8) != 0) {
            list = domainContent.domainSummaries;
        }
        if ((i & 16) != 0) {
            str4 = domainContent.domainSummary;
        }
        String str5 = str4;
        String str6 = str3;
        return domainContent.copy(str, str2, str6, list, str5);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(DomainContent self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.w(serialDesc, 0, self.annualLuckItem);
        output.w(serialDesc, 1, self.annualSummary);
        output.w(serialDesc, 2, self.annualSummaryHighlight);
        output.p(serialDesc, 3, (xn7) lw7VarArr[3].getValue(), self.domainSummaries);
        output.w(serialDesc, 4, self.domainSummary);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAnnualLuckItem() {
        return this.annualLuckItem;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAnnualSummary() {
        return this.annualSummary;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAnnualSummaryHighlight() {
        return this.annualSummaryHighlight;
    }

    public final List<DomainSummary> component4() {
        return this.domainSummaries;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDomainSummary() {
        return this.domainSummary;
    }

    public final DomainContent copy(String annualLuckItem, String annualSummary, String annualSummaryHighlight, List<DomainSummary> domainSummaries, String domainSummary) {
        annualLuckItem.getClass();
        annualSummary.getClass();
        annualSummaryHighlight.getClass();
        domainSummaries.getClass();
        domainSummary.getClass();
        return new DomainContent(annualLuckItem, annualSummary, annualSummaryHighlight, domainSummaries, domainSummary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DomainContent)) {
            return false;
        }
        DomainContent domainContent = (DomainContent) other;
        return pa7.t(this.annualLuckItem, domainContent.annualLuckItem) && pa7.t(this.annualSummary, domainContent.annualSummary) && pa7.t(this.annualSummaryHighlight, domainContent.annualSummaryHighlight) && pa7.t(this.domainSummaries, domainContent.domainSummaries) && pa7.t(this.domainSummary, domainContent.domainSummary);
    }

    public final String getAnnualLuckItem() {
        return this.annualLuckItem;
    }

    public final String getAnnualSummary() {
        return this.annualSummary;
    }

    public final String getAnnualSummaryHighlight() {
        return this.annualSummaryHighlight;
    }

    public final List<DomainSummary> getDomainSummaries() {
        return this.domainSummaries;
    }

    public final String getDomainSummary() {
        return this.domainSummary;
    }

    public int hashCode() {
        return this.domainSummary.hashCode() + tec.a(ub3.c(ub3.c(this.annualLuckItem.hashCode() * 31, 31, this.annualSummary), 31, this.annualSummaryHighlight), 31, this.domainSummaries);
    }

    public String toString() {
        String str = this.annualLuckItem;
        String str2 = this.annualSummary;
        String str3 = this.annualSummaryHighlight;
        List<DomainSummary> list = this.domainSummaries;
        String str4 = this.domainSummary;
        StringBuilder sbO = ib8.o("DomainContent(annualLuckItem=", str, ", annualSummary=", str2, ", annualSummaryHighlight=");
        ib8.v(sbO, str3, ", domainSummaries=", list, ", domainSummary=");
        return ks0.l(sbO, str4, ")");
    }

    @syc("domainReports")
    public static /* synthetic */ void getDomainSummaries$annotations() {
    }

    public DomainContent(String str, String str2, String str3, List<DomainSummary> list, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        str4.getClass();
        this.annualLuckItem = str;
        this.annualSummary = str2;
        this.annualSummaryHighlight = str3;
        this.domainSummaries = list;
        this.domainSummary = str4;
    }
}
