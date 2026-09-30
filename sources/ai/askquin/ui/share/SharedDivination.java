package ai.askquin.ui.share;

import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import defpackage.ag2;
import defpackage.an1;
import defpackage.ccd;
import defpackage.dcd;
import defpackage.dd0;
import defpackage.ead;
import defpackage.eb3;
import defpackage.hx8;
import defpackage.ib8;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.rhe;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.wbd;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<=BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBs\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\u0006HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010'Jj\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001fJ\u0010\u0010+\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010#R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b7\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b8\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010'¨\u0006>"}, d2 = {"Lai/askquin/ui/share/SharedDivination;", "", "", "divinationId", "question", "content", "", "Ltech/chatmind/api/TarotCardChoice;", "cards", "extraCards", "Lai/askquin/ui/share/SharedConversationEntry;", "followUpEntries", "Lai/askquin/ui/draw/mixed/MixedDeckSnapshot;", "mixedDeck", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lai/askquin/ui/draw/mixed/MixedDeckSnapshot;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lai/askquin/ui/draw/mixed/MixedDeckSnapshot;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/share/SharedDivination;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "()Lai/askquin/ui/draw/mixed/MixedDeckSnapshot;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lai/askquin/ui/draw/mixed/MixedDeckSnapshot;)Lai/askquin/ui/share/SharedDivination;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDivinationId", "getQuestion", "getContent", "Ljava/util/List;", "getCards", "getExtraCards", "getFollowUpEntries", "Lai/askquin/ui/draw/mixed/MixedDeckSnapshot;", "getMixedDeck", "Companion", "ccd", "dcd", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class SharedDivination {
    private static final lw7[] $childSerializers;
    private final List<TarotCardChoice> cards;
    private final String content;
    private final String divinationId;
    private final List<TarotCardChoice> extraCards;
    private final List<SharedConversationEntry> followUpEntries;
    private final MixedDeckSnapshot mixedDeck;
    private final String question;
    public static final dcd Companion = new dcd();
    public static final int $stable = MixedDeckSnapshot.$stable;

    static {
        ead eadVar = new ead(9);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{null, null, null, eb3.N(z18Var, eadVar), eb3.N(z18Var, new ead(10)), eb3.N(z18Var, new ead(11)), null};
    }

    public /* synthetic */ SharedDivination(int i, String str, String str2, String str3, List list, List list2, List list3, MixedDeckSnapshot mixedDeckSnapshot, xyc xycVar) {
        if (15 != (i & 15)) {
            an1.R(i, 15, ccd.a.e());
            throw null;
        }
        this.divinationId = str;
        this.question = str2;
        this.content = str3;
        this.cards = list;
        int i2 = i & 16;
        pu4 pu4Var = pu4.a;
        if (i2 == 0) {
            this.extraCards = pu4Var;
        } else {
            this.extraCards = list2;
        }
        if ((i & 32) == 0) {
            this.followUpEntries = pu4Var;
        } else {
            this.followUpEntries = list3;
        }
        if ((i & 64) == 0) {
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
        return new dd0(rhe.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$1() {
        return new dd0(wbd.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SharedDivination copy$default(SharedDivination sharedDivination, String str, String str2, String str3, List list, List list2, List list3, MixedDeckSnapshot mixedDeckSnapshot, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sharedDivination.divinationId;
        }
        if ((i & 2) != 0) {
            str2 = sharedDivination.question;
        }
        if ((i & 4) != 0) {
            str3 = sharedDivination.content;
        }
        if ((i & 8) != 0) {
            list = sharedDivination.cards;
        }
        if ((i & 16) != 0) {
            list2 = sharedDivination.extraCards;
        }
        if ((i & 32) != 0) {
            list3 = sharedDivination.followUpEntries;
        }
        if ((i & 64) != 0) {
            mixedDeckSnapshot = sharedDivination.mixedDeck;
        }
        List list4 = list3;
        MixedDeckSnapshot mixedDeckSnapshot2 = mixedDeckSnapshot;
        List list5 = list2;
        String str4 = str3;
        return sharedDivination.copy(str, str2, str4, list, list5, list4, mixedDeckSnapshot2);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(SharedDivination self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.w(serialDesc, 0, self.divinationId);
        output.w(serialDesc, 1, self.question);
        output.w(serialDesc, 2, self.content);
        output.p(serialDesc, 3, (xn7) lw7VarArr[3].getValue(), self.cards);
        boolean zG = output.g(serialDesc);
        pu4 pu4Var = pu4.a;
        if (zG || !pa7.t(self.extraCards, pu4Var)) {
            output.p(serialDesc, 4, (xn7) lw7VarArr[4].getValue(), self.extraCards);
        }
        if (output.g(serialDesc) || !pa7.t(self.followUpEntries, pu4Var)) {
            output.p(serialDesc, 5, (xn7) lw7VarArr[5].getValue(), self.followUpEntries);
        }
        if (!output.g(serialDesc) && self.mixedDeck == null) {
            return;
        }
        output.A(serialDesc, 6, hx8.a, self.mixedDeck);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDivinationId() {
        return this.divinationId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    public final List<TarotCardChoice> component4() {
        return this.cards;
    }

    public final List<TarotCardChoice> component5() {
        return this.extraCards;
    }

    public final List<SharedConversationEntry> component6() {
        return this.followUpEntries;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final MixedDeckSnapshot getMixedDeck() {
        return this.mixedDeck;
    }

    public final SharedDivination copy(String divinationId, String question, String content, List<TarotCardChoice> cards, List<TarotCardChoice> extraCards, List<SharedConversationEntry> followUpEntries, MixedDeckSnapshot mixedDeck) {
        divinationId.getClass();
        question.getClass();
        content.getClass();
        cards.getClass();
        extraCards.getClass();
        followUpEntries.getClass();
        return new SharedDivination(divinationId, question, content, cards, extraCards, followUpEntries, mixedDeck);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharedDivination)) {
            return false;
        }
        SharedDivination sharedDivination = (SharedDivination) other;
        return pa7.t(this.divinationId, sharedDivination.divinationId) && pa7.t(this.question, sharedDivination.question) && pa7.t(this.content, sharedDivination.content) && pa7.t(this.cards, sharedDivination.cards) && pa7.t(this.extraCards, sharedDivination.extraCards) && pa7.t(this.followUpEntries, sharedDivination.followUpEntries) && pa7.t(this.mixedDeck, sharedDivination.mixedDeck);
    }

    public final List<TarotCardChoice> getCards() {
        return this.cards;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getDivinationId() {
        return this.divinationId;
    }

    public final List<TarotCardChoice> getExtraCards() {
        return this.extraCards;
    }

    public final List<SharedConversationEntry> getFollowUpEntries() {
        return this.followUpEntries;
    }

    public final MixedDeckSnapshot getMixedDeck() {
        return this.mixedDeck;
    }

    public final String getQuestion() {
        return this.question;
    }

    public int hashCode() {
        int iA = tec.a(tec.a(tec.a(ub3.c(ub3.c(this.divinationId.hashCode() * 31, 31, this.question), 31, this.content), 31, this.cards), 31, this.extraCards), 31, this.followUpEntries);
        MixedDeckSnapshot mixedDeckSnapshot = this.mixedDeck;
        return iA + (mixedDeckSnapshot == null ? 0 : mixedDeckSnapshot.hashCode());
    }

    public String toString() {
        String str = this.divinationId;
        String str2 = this.question;
        String str3 = this.content;
        List<TarotCardChoice> list = this.cards;
        List<TarotCardChoice> list2 = this.extraCards;
        List<SharedConversationEntry> list3 = this.followUpEntries;
        MixedDeckSnapshot mixedDeckSnapshot = this.mixedDeck;
        StringBuilder sbO = ib8.o("SharedDivination(divinationId=", str, ", question=", str2, ", content=");
        ib8.v(sbO, str3, ", cards=", list, ", extraCards=");
        sbO.append(list2);
        sbO.append(", followUpEntries=");
        sbO.append(list3);
        sbO.append(", mixedDeck=");
        sbO.append(mixedDeckSnapshot);
        sbO.append(")");
        return sbO.toString();
    }

    public SharedDivination(String str, String str2, String str3, List<TarotCardChoice> list, List<TarotCardChoice> list2, List<SharedConversationEntry> list3, MixedDeckSnapshot mixedDeckSnapshot) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.divinationId = str;
        this.question = str2;
        this.content = str3;
        this.cards = list;
        this.extraCards = list2;
        this.followUpEntries = list3;
        this.mixedDeck = mixedDeckSnapshot;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SharedDivination(String str, String str2, String str3, List list, List list2, List list3, MixedDeckSnapshot mixedDeckSnapshot, int i, rp3 rp3Var) {
        int i2 = i & 16;
        pu4 pu4Var = pu4.a;
        this(str, str2, str3, list, i2 != 0 ? pu4Var : list2, (i & 32) != 0 ? pu4Var : list3, (i & 64) != 0 ? null : mixedDeckSnapshot);
    }
}
