package tech.chatmind.api.annual.model;

import defpackage.ag2;
import defpackage.an1;
import defpackage.bie;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.k19;
import defpackage.lg4;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.p10;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.syc;
import defpackage.tyc;
import defpackage.u30;
import defpackage.ub3;
import defpackage.v30;
import defpackage.vnf;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;
import tech.chatmind.api.common.model.TarotCardRequestBody;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002ABBQ\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBc\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(Jb\u0010)\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b+\u0010\"J\u0010\u0010,\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u0010\u001fR\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010\"R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00107\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010$R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010;\u0012\u0004\b=\u0010:\u001a\u0004\b<\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010(¨\u0006C"}, d2 = {"Ltech/chatmind/api/annual/model/AnnualLuckResponse;", "", "", "Ltech/chatmind/api/common/model/TarotCardRequestBody;", "domainsCards", "monthlyCards", "", "status", "Ltech/chatmind/api/annual/model/MonthlyContent;", "monthlyContent", "Ltech/chatmind/api/annual/model/DomainContent;", "domainContent", "Ltech/chatmind/api/annual/model/UserPostContent;", "user", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ltech/chatmind/api/annual/model/MonthlyContent;Ltech/chatmind/api/annual/model/DomainContent;Ltech/chatmind/api/annual/model/UserPostContent;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ltech/chatmind/api/annual/model/MonthlyContent;Ltech/chatmind/api/annual/model/DomainContent;Ltech/chatmind/api/annual/model/UserPostContent;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/annual/model/AnnualLuckResponse;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Ltech/chatmind/api/annual/model/MonthlyContent;", "component5", "()Ltech/chatmind/api/annual/model/DomainContent;", "component6", "()Ltech/chatmind/api/annual/model/UserPostContent;", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ltech/chatmind/api/annual/model/MonthlyContent;Ltech/chatmind/api/annual/model/DomainContent;Ltech/chatmind/api/annual/model/UserPostContent;)Ltech/chatmind/api/annual/model/AnnualLuckResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getDomainsCards", "getMonthlyCards", "Ljava/lang/String;", "getStatus", "Ltech/chatmind/api/annual/model/MonthlyContent;", "getMonthlyContent", "getMonthlyContent$annotations", "()V", "Ltech/chatmind/api/annual/model/DomainContent;", "getDomainContent", "getDomainContent$annotations", "Ltech/chatmind/api/annual/model/UserPostContent;", "getUser", "Companion", "u30", "v30", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class AnnualLuckResponse {
    private static final lw7[] $childSerializers;
    private final DomainContent domainContent;
    private final List<TarotCardRequestBody> domainsCards;
    private final List<TarotCardRequestBody> monthlyCards;
    private final MonthlyContent monthlyContent;
    private final String status;
    private final UserPostContent user;
    public static final v30 Companion = new v30();
    public static final int $stable = (UserPostContent.$stable | DomainContent.$stable) | MonthlyContent.$stable;

    static {
        p10 p10Var = new p10(7);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{eb3.N(z18Var, p10Var), eb3.N(z18Var, new p10(8)), null, null, null, null};
    }

    public /* synthetic */ AnnualLuckResponse(int i, List list, List list2, String str, MonthlyContent monthlyContent, DomainContent domainContent, UserPostContent userPostContent, xyc xycVar) {
        if (39 != (i & 39)) {
            an1.R(i, 39, u30.a.e());
            throw null;
        }
        this.domainsCards = list;
        this.monthlyCards = list2;
        this.status = str;
        if ((i & 8) == 0) {
            this.monthlyContent = null;
        } else {
            this.monthlyContent = monthlyContent;
        }
        if ((i & 16) == 0) {
            this.domainContent = null;
        } else {
            this.domainContent = domainContent;
        }
        this.user = userPostContent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(bie.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$0() {
        return new dd0(bie.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnnualLuckResponse copy$default(AnnualLuckResponse annualLuckResponse, List list, List list2, String str, MonthlyContent monthlyContent, DomainContent domainContent, UserPostContent userPostContent, int i, Object obj) {
        if ((i & 1) != 0) {
            list = annualLuckResponse.domainsCards;
        }
        if ((i & 2) != 0) {
            list2 = annualLuckResponse.monthlyCards;
        }
        if ((i & 4) != 0) {
            str = annualLuckResponse.status;
        }
        if ((i & 8) != 0) {
            monthlyContent = annualLuckResponse.monthlyContent;
        }
        if ((i & 16) != 0) {
            domainContent = annualLuckResponse.domainContent;
        }
        if ((i & 32) != 0) {
            userPostContent = annualLuckResponse.user;
        }
        DomainContent domainContent2 = domainContent;
        UserPostContent userPostContent2 = userPostContent;
        return annualLuckResponse.copy(list, list2, str, monthlyContent, domainContent2, userPostContent2);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(AnnualLuckResponse self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.A(serialDesc, 0, (xn7) lw7VarArr[0].getValue(), self.domainsCards);
        output.A(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.monthlyCards);
        output.w(serialDesc, 2, self.status);
        if (output.g(serialDesc) || self.monthlyContent != null) {
            output.A(serialDesc, 3, k19.a, self.monthlyContent);
        }
        if (output.g(serialDesc) || self.domainContent != null) {
            output.A(serialDesc, 4, lg4.a, self.domainContent);
        }
        output.A(serialDesc, 5, vnf.a, self.user);
    }

    public final List<TarotCardRequestBody> component1() {
        return this.domainsCards;
    }

    public final List<TarotCardRequestBody> component2() {
        return this.monthlyCards;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MonthlyContent getMonthlyContent() {
        return this.monthlyContent;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DomainContent getDomainContent() {
        return this.domainContent;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final UserPostContent getUser() {
        return this.user;
    }

    public final AnnualLuckResponse copy(List<TarotCardRequestBody> domainsCards, List<TarotCardRequestBody> monthlyCards, String status, MonthlyContent monthlyContent, DomainContent domainContent, UserPostContent user) {
        status.getClass();
        return new AnnualLuckResponse(domainsCards, monthlyCards, status, monthlyContent, domainContent, user);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnnualLuckResponse)) {
            return false;
        }
        AnnualLuckResponse annualLuckResponse = (AnnualLuckResponse) other;
        return pa7.t(this.domainsCards, annualLuckResponse.domainsCards) && pa7.t(this.monthlyCards, annualLuckResponse.monthlyCards) && pa7.t(this.status, annualLuckResponse.status) && pa7.t(this.monthlyContent, annualLuckResponse.monthlyContent) && pa7.t(this.domainContent, annualLuckResponse.domainContent) && pa7.t(this.user, annualLuckResponse.user);
    }

    public final DomainContent getDomainContent() {
        return this.domainContent;
    }

    public final List<TarotCardRequestBody> getDomainsCards() {
        return this.domainsCards;
    }

    public final List<TarotCardRequestBody> getMonthlyCards() {
        return this.monthlyCards;
    }

    public final MonthlyContent getMonthlyContent() {
        return this.monthlyContent;
    }

    public final String getStatus() {
        return this.status;
    }

    public final UserPostContent getUser() {
        return this.user;
    }

    public int hashCode() {
        List<TarotCardRequestBody> list = this.domainsCards;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TarotCardRequestBody> list2 = this.monthlyCards;
        int iC = ub3.c((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.status);
        MonthlyContent monthlyContent = this.monthlyContent;
        int iHashCode2 = (iC + (monthlyContent == null ? 0 : monthlyContent.hashCode())) * 31;
        DomainContent domainContent = this.domainContent;
        int iHashCode3 = (iHashCode2 + (domainContent == null ? 0 : domainContent.hashCode())) * 31;
        UserPostContent userPostContent = this.user;
        return iHashCode3 + (userPostContent != null ? userPostContent.hashCode() : 0);
    }

    public String toString() {
        return "AnnualLuckResponse(domainsCards=" + this.domainsCards + ", monthlyCards=" + this.monthlyCards + ", status=" + this.status + ", monthlyContent=" + this.monthlyContent + ", domainContent=" + this.domainContent + ", user=" + this.user + ")";
    }

    @syc("step2")
    public static /* synthetic */ void getDomainContent$annotations() {
    }

    @syc("step1")
    public static /* synthetic */ void getMonthlyContent$annotations() {
    }

    public AnnualLuckResponse(List<TarotCardRequestBody> list, List<TarotCardRequestBody> list2, String str, MonthlyContent monthlyContent, DomainContent domainContent, UserPostContent userPostContent) {
        str.getClass();
        this.domainsCards = list;
        this.monthlyCards = list2;
        this.status = str;
        this.monthlyContent = monthlyContent;
        this.domainContent = domainContent;
        this.user = userPostContent;
    }

    public /* synthetic */ AnnualLuckResponse(List list, List list2, String str, MonthlyContent monthlyContent, DomainContent domainContent, UserPostContent userPostContent, int i, rp3 rp3Var) {
        this(list, list2, str, (i & 8) != 0 ? null : monthlyContent, (i & 16) != 0 ? null : domainContent, userPostContent);
    }
}
