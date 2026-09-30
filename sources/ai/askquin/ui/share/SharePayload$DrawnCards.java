package ai.askquin.ui.share;

import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import defpackage.ag2;
import defpackage.an1;
import defpackage.dd0;
import defpackage.ead;
import defpackage.eb3;
import defpackage.fad;
import defpackage.g2a;
import defpackage.gad;
import defpackage.hx8;
import defpackage.iad;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rhe;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBY\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$JR\u0010%\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001eJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b3\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b4\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010$¨\u0006:"}, d2 = {"ai/askquin/ui/share/SharePayload$DrawnCards", "Liad;", "", "divinationId", "", "Ltech/chatmind/api/TarotCardChoice;", "cards", "Ltech/chatmind/api/PatternData;", "patternData", "skinType", "Lai/askquin/ui/draw/mixed/MixedDeckSnapshot;", "mixedDeck", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lai/askquin/ui/draw/mixed/MixedDeckSnapshot;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lai/askquin/ui/draw/mixed/MixedDeckSnapshot;Lxyc;)V", "Lai/askquin/ui/share/SharePayload$DrawnCards;", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/share/SharePayload$DrawnCards;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "()Lai/askquin/ui/draw/mixed/MixedDeckSnapshot;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lai/askquin/ui/draw/mixed/MixedDeckSnapshot;)Lai/askquin/ui/share/SharePayload$DrawnCards;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDivinationId", "Ljava/util/List;", "getCards", "getPatternData", "getSkinType", "Lai/askquin/ui/draw/mixed/MixedDeckSnapshot;", "getMixedDeck", "Companion", "fad", "gad", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class SharePayload$DrawnCards implements iad {
    private static final lw7[] $childSerializers;
    private final List<TarotCardChoice> cards;
    private final String divinationId;
    private final MixedDeckSnapshot mixedDeck;
    private final List<PatternData> patternData;
    private final String skinType;
    public static final gad Companion = new gad();
    public static final int $stable = MixedDeckSnapshot.$stable;

    static {
        ead eadVar = new ead(0);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{null, eb3.N(z18Var, eadVar), eb3.N(z18Var, new ead(1)), null, null};
    }

    public /* synthetic */ SharePayload$DrawnCards(int i, String str, List list, List list2, String str2, MixedDeckSnapshot mixedDeckSnapshot, xyc xycVar) {
        if (15 != (i & 15)) {
            an1.R(i, 15, fad.a.e());
            throw null;
        }
        this.divinationId = str;
        this.cards = list;
        this.patternData = list2;
        this.skinType = str2;
        if ((i & 16) == 0) {
            this.mixedDeck = null;
        } else {
            this.mixedDeck = mixedDeckSnapshot;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(rhe.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$0() {
        return new dd0(g2a.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SharePayload$DrawnCards copy$default(SharePayload$DrawnCards sharePayload$DrawnCards, String str, List list, List list2, String str2, MixedDeckSnapshot mixedDeckSnapshot, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sharePayload$DrawnCards.divinationId;
        }
        if ((i & 2) != 0) {
            list = sharePayload$DrawnCards.cards;
        }
        if ((i & 4) != 0) {
            list2 = sharePayload$DrawnCards.patternData;
        }
        if ((i & 8) != 0) {
            str2 = sharePayload$DrawnCards.skinType;
        }
        if ((i & 16) != 0) {
            mixedDeckSnapshot = sharePayload$DrawnCards.mixedDeck;
        }
        MixedDeckSnapshot mixedDeckSnapshot2 = mixedDeckSnapshot;
        List list3 = list2;
        return sharePayload$DrawnCards.copy(str, list, list3, str2, mixedDeckSnapshot2);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(SharePayload$DrawnCards self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.w(serialDesc, 0, self.divinationId);
        output.p(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.cards);
        output.p(serialDesc, 2, (xn7) lw7VarArr[2].getValue(), self.patternData);
        output.A(serialDesc, 3, p4e.a, self.skinType);
        if (!output.g(serialDesc) && self.mixedDeck == null) {
            return;
        }
        output.A(serialDesc, 4, hx8.a, self.mixedDeck);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDivinationId() {
        return this.divinationId;
    }

    public final List<TarotCardChoice> component2() {
        return this.cards;
    }

    public final List<PatternData> component3() {
        return this.patternData;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSkinType() {
        return this.skinType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MixedDeckSnapshot getMixedDeck() {
        return this.mixedDeck;
    }

    public final SharePayload$DrawnCards copy(String divinationId, List<TarotCardChoice> cards, List<PatternData> patternData, String skinType, MixedDeckSnapshot mixedDeck) {
        divinationId.getClass();
        cards.getClass();
        patternData.getClass();
        return new SharePayload$DrawnCards(divinationId, cards, patternData, skinType, mixedDeck);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharePayload$DrawnCards)) {
            return false;
        }
        SharePayload$DrawnCards sharePayload$DrawnCards = (SharePayload$DrawnCards) other;
        return pa7.t(this.divinationId, sharePayload$DrawnCards.divinationId) && pa7.t(this.cards, sharePayload$DrawnCards.cards) && pa7.t(this.patternData, sharePayload$DrawnCards.patternData) && pa7.t(this.skinType, sharePayload$DrawnCards.skinType) && pa7.t(this.mixedDeck, sharePayload$DrawnCards.mixedDeck);
    }

    public final List<TarotCardChoice> getCards() {
        return this.cards;
    }

    public final String getDivinationId() {
        return this.divinationId;
    }

    public final MixedDeckSnapshot getMixedDeck() {
        return this.mixedDeck;
    }

    public final List<PatternData> getPatternData() {
        return this.patternData;
    }

    public final String getSkinType() {
        return this.skinType;
    }

    public int hashCode() {
        int iA = tec.a(tec.a(this.divinationId.hashCode() * 31, 31, this.cards), 31, this.patternData);
        String str = this.skinType;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        MixedDeckSnapshot mixedDeckSnapshot = this.mixedDeck;
        return iHashCode + (mixedDeckSnapshot != null ? mixedDeckSnapshot.hashCode() : 0);
    }

    public String toString() {
        return "DrawnCards(divinationId=" + this.divinationId + ", cards=" + this.cards + ", patternData=" + this.patternData + ", skinType=" + this.skinType + ", mixedDeck=" + this.mixedDeck + ")";
    }

    public SharePayload$DrawnCards(String str, List<TarotCardChoice> list, List<PatternData> list2, String str2, MixedDeckSnapshot mixedDeckSnapshot) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.divinationId = str;
        this.cards = list;
        this.patternData = list2;
        this.skinType = str2;
        this.mixedDeck = mixedDeckSnapshot;
    }

    public /* synthetic */ SharePayload$DrawnCards(String str, List list, List list2, String str2, MixedDeckSnapshot mixedDeckSnapshot, int i, rp3 rp3Var) {
        this(str, list, list2, str2, (i & 16) != 0 ? null : mixedDeckSnapshot);
    }
}
