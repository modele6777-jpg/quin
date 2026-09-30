package tech.chatmind.api.personality;

import defpackage.ag2;
import defpackage.an1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.ib8;
import defpackage.ks0;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.ohe;
import defpackage.os2;
import defpackage.pa7;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xn7;
import defpackage.xw2;
import defpackage.xyc;
import defpackage.yw2;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJH\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b0\u0010\u001b¨\u00064"}, d2 = {"Ltech/chatmind/api/personality/CpSection;", "", "", "leadingTitle", "highlightTitle", "trailingTitle", "", "Ltech/chatmind/api/personality/TarotCard;", "tarotCards", "desc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/personality/CpSection;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ltech/chatmind/api/personality/CpSection;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLeadingTitle", "getHighlightTitle", "getTrailingTitle", "Ljava/util/List;", "getTarotCards", "getDesc", "Companion", "xw2", "yw2", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class CpSection {
    public static final int $stable = 8;
    private final String desc;
    private final String highlightTitle;
    private final String leadingTitle;
    private final List<TarotCard> tarotCards;
    private final String trailingTitle;
    public static final yw2 Companion = new yw2();
    private static final lw7[] $childSerializers = {null, null, null, eb3.N(z18.b, new os2(5)), null};

    public /* synthetic */ CpSection(int i, String str, String str2, String str3, List list, String str4, xyc xycVar) {
        if (31 != (i & 31)) {
            an1.R(i, 31, xw2.a.e());
            throw null;
        }
        this.leadingTitle = str;
        this.highlightTitle = str2;
        this.trailingTitle = str3;
        this.tarotCards = list;
        this.desc = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(ohe.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CpSection copy$default(CpSection cpSection, String str, String str2, String str3, List list, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cpSection.leadingTitle;
        }
        if ((i & 2) != 0) {
            str2 = cpSection.highlightTitle;
        }
        if ((i & 4) != 0) {
            str3 = cpSection.trailingTitle;
        }
        if ((i & 8) != 0) {
            list = cpSection.tarotCards;
        }
        if ((i & 16) != 0) {
            str4 = cpSection.desc;
        }
        String str5 = str4;
        String str6 = str3;
        return cpSection.copy(str, str2, str6, list, str5);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(CpSection self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.w(serialDesc, 0, self.leadingTitle);
        output.w(serialDesc, 1, self.highlightTitle);
        output.w(serialDesc, 2, self.trailingTitle);
        output.p(serialDesc, 3, (xn7) lw7VarArr[3].getValue(), self.tarotCards);
        output.w(serialDesc, 4, self.desc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLeadingTitle() {
        return this.leadingTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHighlightTitle() {
        return this.highlightTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTrailingTitle() {
        return this.trailingTitle;
    }

    public final List<TarotCard> component4() {
        return this.tarotCards;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    public final CpSection copy(String leadingTitle, String highlightTitle, String trailingTitle, List<TarotCard> tarotCards, String desc) {
        leadingTitle.getClass();
        highlightTitle.getClass();
        trailingTitle.getClass();
        tarotCards.getClass();
        desc.getClass();
        return new CpSection(leadingTitle, highlightTitle, trailingTitle, tarotCards, desc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CpSection)) {
            return false;
        }
        CpSection cpSection = (CpSection) other;
        return pa7.t(this.leadingTitle, cpSection.leadingTitle) && pa7.t(this.highlightTitle, cpSection.highlightTitle) && pa7.t(this.trailingTitle, cpSection.trailingTitle) && pa7.t(this.tarotCards, cpSection.tarotCards) && pa7.t(this.desc, cpSection.desc);
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getHighlightTitle() {
        return this.highlightTitle;
    }

    public final String getLeadingTitle() {
        return this.leadingTitle;
    }

    public final List<TarotCard> getTarotCards() {
        return this.tarotCards;
    }

    public final String getTrailingTitle() {
        return this.trailingTitle;
    }

    public int hashCode() {
        return this.desc.hashCode() + tec.a(ub3.c(ub3.c(this.leadingTitle.hashCode() * 31, 31, this.highlightTitle), 31, this.trailingTitle), 31, this.tarotCards);
    }

    public String toString() {
        String str = this.leadingTitle;
        String str2 = this.highlightTitle;
        String str3 = this.trailingTitle;
        List<TarotCard> list = this.tarotCards;
        String str4 = this.desc;
        StringBuilder sbO = ib8.o("CpSection(leadingTitle=", str, ", highlightTitle=", str2, ", trailingTitle=");
        ib8.v(sbO, str3, ", tarotCards=", list, ", desc=");
        return ks0.l(sbO, str4, ")");
    }

    public CpSection(String str, String str2, String str3, List<TarotCard> list, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        str4.getClass();
        this.leadingTitle = str;
        this.highlightTitle = str2;
        this.trailingTitle = str3;
        this.tarotCards = list;
        this.desc = str4;
    }
}
