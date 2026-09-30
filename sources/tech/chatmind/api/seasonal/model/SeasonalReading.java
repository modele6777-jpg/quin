package tech.chatmind.api.seasonal.model;

import defpackage.ag2;
import defpackage.coc;
import defpackage.dd0;
import defpackage.doc;
import defpackage.eb3;
import defpackage.kgc;
import defpackage.lkc;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B/\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00061"}, d2 = {"Ltech/chatmind/api/seasonal/model/SeasonalReading;", "", "", "Ltech/chatmind/api/seasonal/model/SeasonalReadingCard;", "cards", "", "summary", "Ltech/chatmind/api/seasonal/model/SeasonalElementGuides;", "elementGuides", "<init>", "(Ljava/util/List;Ljava/lang/String;Ltech/chatmind/api/seasonal/model/SeasonalElementGuides;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ltech/chatmind/api/seasonal/model/SeasonalElementGuides;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/seasonal/model/SeasonalReading;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Ltech/chatmind/api/seasonal/model/SeasonalElementGuides;", "copy", "(Ljava/util/List;Ljava/lang/String;Ltech/chatmind/api/seasonal/model/SeasonalElementGuides;)Ltech/chatmind/api/seasonal/model/SeasonalReading;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCards", "Ljava/lang/String;", "getSummary", "Ltech/chatmind/api/seasonal/model/SeasonalElementGuides;", "getElementGuides", "Companion", "boc", "coc", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class SeasonalReading {
    public static final int $stable = 8;
    private final List<SeasonalReadingCard> cards;
    private final SeasonalElementGuides elementGuides;
    private final String summary;
    public static final coc Companion = new coc();
    private static final lw7[] $childSerializers = {eb3.N(z18.b, new kgc(21)), null, null};

    public /* synthetic */ SeasonalReading(int i, List list, String str, SeasonalElementGuides seasonalElementGuides, xyc xycVar) {
        this.cards = (i & 1) == 0 ? pu4.a : list;
        if ((i & 2) == 0) {
            this.summary = null;
        } else {
            this.summary = str;
        }
        if ((i & 4) == 0) {
            this.elementGuides = null;
        } else {
            this.elementGuides = seasonalElementGuides;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(doc.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SeasonalReading copy$default(SeasonalReading seasonalReading, List list, String str, SeasonalElementGuides seasonalElementGuides, int i, Object obj) {
        if ((i & 1) != 0) {
            list = seasonalReading.cards;
        }
        if ((i & 2) != 0) {
            str = seasonalReading.summary;
        }
        if ((i & 4) != 0) {
            seasonalElementGuides = seasonalReading.elementGuides;
        }
        return seasonalReading.copy(list, str, seasonalElementGuides);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(SeasonalReading self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        if (output.g(serialDesc) || !pa7.t(self.cards, pu4.a)) {
            output.p(serialDesc, 0, (xn7) lw7VarArr[0].getValue(), self.cards);
        }
        if (output.g(serialDesc) || self.summary != null) {
            output.A(serialDesc, 1, p4e.a, self.summary);
        }
        if (!output.g(serialDesc) && self.elementGuides == null) {
            return;
        }
        output.A(serialDesc, 2, lkc.a, self.elementGuides);
    }

    public final List<SeasonalReadingCard> component1() {
        return this.cards;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SeasonalElementGuides getElementGuides() {
        return this.elementGuides;
    }

    public final SeasonalReading copy(List<SeasonalReadingCard> cards, String summary, SeasonalElementGuides elementGuides) {
        cards.getClass();
        return new SeasonalReading(cards, summary, elementGuides);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeasonalReading)) {
            return false;
        }
        SeasonalReading seasonalReading = (SeasonalReading) other;
        return pa7.t(this.cards, seasonalReading.cards) && pa7.t(this.summary, seasonalReading.summary) && pa7.t(this.elementGuides, seasonalReading.elementGuides);
    }

    public final List<SeasonalReadingCard> getCards() {
        return this.cards;
    }

    public final SeasonalElementGuides getElementGuides() {
        return this.elementGuides;
    }

    public final String getSummary() {
        return this.summary;
    }

    public int hashCode() {
        int iHashCode = this.cards.hashCode() * 31;
        String str = this.summary;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SeasonalElementGuides seasonalElementGuides = this.elementGuides;
        return iHashCode2 + (seasonalElementGuides != null ? seasonalElementGuides.hashCode() : 0);
    }

    public String toString() {
        return "SeasonalReading(cards=" + this.cards + ", summary=" + this.summary + ", elementGuides=" + this.elementGuides + ")";
    }

    public SeasonalReading() {
        this((List) null, (String) null, (SeasonalElementGuides) null, 7, (rp3) null);
    }

    public SeasonalReading(List<SeasonalReadingCard> list, String str, SeasonalElementGuides seasonalElementGuides) {
        list.getClass();
        this.cards = list;
        this.summary = str;
        this.elementGuides = seasonalElementGuides;
    }

    public /* synthetic */ SeasonalReading(List list, String str, SeasonalElementGuides seasonalElementGuides, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? pu4.a : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : seasonalElementGuides);
    }
}
