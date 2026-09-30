package ai.askquin.ui.draw.model;

import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import defpackage.ag2;
import defpackage.an1;
import defpackage.c77;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.g2a;
import defpackage.hx8;
import defpackage.lw7;
import defpackage.mm4;
import defpackage.nm4;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.rhe;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.v74;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267BG\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB_\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012JV\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÂ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b1\u0010!R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b2\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u0010%¨\u00068"}, d2 = {"Lai/askquin/ui/draw/model/DrawCardSaves;", "", "", "chatId", "", "Ltech/chatmind/api/PatternData;", "patterns", "Ltech/chatmind/api/TarotCardChoice;", "choices", "", "drawnIndexes", "Lai/askquin/ui/draw/mixed/MixedDeckSnapshot;", "mixedDeck", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lai/askquin/ui/draw/mixed/MixedDeckSnapshot;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lai/askquin/ui/draw/mixed/MixedDeckSnapshot;Lxyc;)V", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lai/askquin/ui/draw/mixed/MixedDeckSnapshot;)Lai/askquin/ui/draw/model/DrawCardSaves;", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/draw/model/DrawCardSaves;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "()Lai/askquin/ui/draw/mixed/MixedDeckSnapshot;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getChatId", "Ljava/util/List;", "getPatterns", "getChoices", "getDrawnIndexes", "Lai/askquin/ui/draw/mixed/MixedDeckSnapshot;", "getMixedDeck", "Companion", "nm4", "mm4", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class DrawCardSaves {
    private static final lw7[] $childSerializers;
    private final String chatId;
    private final List<TarotCardChoice> choices;
    private final List<Integer> drawnIndexes;
    private final MixedDeckSnapshot mixedDeck;
    private final List<PatternData> patterns;
    public static final nm4 Companion = new nm4();
    public static final int $stable = MixedDeckSnapshot.$stable;

    static {
        v74 v74Var = new v74(16);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{null, eb3.N(z18Var, v74Var), eb3.N(z18Var, new v74(17)), eb3.N(z18Var, new v74(18)), null};
    }

    public /* synthetic */ DrawCardSaves(int i, String str, List list, List list2, List list3, MixedDeckSnapshot mixedDeckSnapshot, xyc xycVar) {
        if (15 != (i & 15)) {
            an1.R(i, 15, mm4.a.e());
            throw null;
        }
        this.chatId = str;
        this.patterns = list;
        this.choices = list2;
        this.drawnIndexes = list3;
        if ((i & 16) == 0) {
            this.mixedDeck = null;
        } else {
            this.mixedDeck = mixedDeckSnapshot;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(g2a.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$0() {
        return new dd0(rhe.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$1() {
        return new dd0(c77.a, 0);
    }

    private final DrawCardSaves copy(String chatId, List<PatternData> patterns, List<TarotCardChoice> choices, List<Integer> drawnIndexes, MixedDeckSnapshot mixedDeck) {
        return new DrawCardSaves(chatId, patterns, choices, drawnIndexes, mixedDeck);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DrawCardSaves copy$default(DrawCardSaves drawCardSaves, String str, List list, List list2, List list3, MixedDeckSnapshot mixedDeckSnapshot, int i, Object obj) {
        if ((i & 1) != 0) {
            str = drawCardSaves.chatId;
        }
        if ((i & 2) != 0) {
            list = drawCardSaves.patterns;
        }
        if ((i & 4) != 0) {
            list2 = drawCardSaves.choices;
        }
        if ((i & 8) != 0) {
            list3 = drawCardSaves.drawnIndexes;
        }
        if ((i & 16) != 0) {
            mixedDeckSnapshot = drawCardSaves.mixedDeck;
        }
        MixedDeckSnapshot mixedDeckSnapshot2 = mixedDeckSnapshot;
        List list4 = list2;
        return drawCardSaves.copy(str, list, list4, list3, mixedDeckSnapshot2);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(DrawCardSaves self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.w(serialDesc, 0, self.chatId);
        output.p(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.patterns);
        output.p(serialDesc, 2, (xn7) lw7VarArr[2].getValue(), self.choices);
        output.p(serialDesc, 3, (xn7) lw7VarArr[3].getValue(), self.drawnIndexes);
        if (!output.g(serialDesc) && self.mixedDeck == null) {
            return;
        }
        output.A(serialDesc, 4, hx8.a, self.mixedDeck);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    public final List<PatternData> component2() {
        return this.patterns;
    }

    public final List<TarotCardChoice> component3() {
        return this.choices;
    }

    public final List<Integer> component4() {
        return this.drawnIndexes;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MixedDeckSnapshot getMixedDeck() {
        return this.mixedDeck;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawCardSaves)) {
            return false;
        }
        DrawCardSaves drawCardSaves = (DrawCardSaves) other;
        return pa7.t(this.chatId, drawCardSaves.chatId) && pa7.t(this.patterns, drawCardSaves.patterns) && pa7.t(this.choices, drawCardSaves.choices) && pa7.t(this.drawnIndexes, drawCardSaves.drawnIndexes) && pa7.t(this.mixedDeck, drawCardSaves.mixedDeck);
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final List<TarotCardChoice> getChoices() {
        return this.choices;
    }

    public final List<Integer> getDrawnIndexes() {
        return this.drawnIndexes;
    }

    public final MixedDeckSnapshot getMixedDeck() {
        return this.mixedDeck;
    }

    public final List<PatternData> getPatterns() {
        return this.patterns;
    }

    public int hashCode() {
        int iA = tec.a(tec.a(tec.a(this.chatId.hashCode() * 31, 31, this.patterns), 31, this.choices), 31, this.drawnIndexes);
        MixedDeckSnapshot mixedDeckSnapshot = this.mixedDeck;
        return iA + (mixedDeckSnapshot == null ? 0 : mixedDeckSnapshot.hashCode());
    }

    public String toString() {
        return "DrawCardSaves(chatId=" + this.chatId + ", patterns=" + this.patterns + ", choices=" + this.choices + ", drawnIndexes=" + this.drawnIndexes + ", mixedDeck=" + this.mixedDeck + ")";
    }

    public /* synthetic */ DrawCardSaves(String str, List list, List list2, List list3, MixedDeckSnapshot mixedDeckSnapshot, rp3 rp3Var) {
        this(str, list, list2, list3, mixedDeckSnapshot);
    }

    private DrawCardSaves(String str, List<PatternData> list, List<TarotCardChoice> list2, List<Integer> list3, MixedDeckSnapshot mixedDeckSnapshot) {
        this.chatId = str;
        this.patterns = list;
        this.choices = list2;
        this.drawnIndexes = list3;
        this.mixedDeck = mixedDeckSnapshot;
    }

    public /* synthetic */ DrawCardSaves(String str, List list, List list2, List list3, MixedDeckSnapshot mixedDeckSnapshot, int i, rp3 rp3Var) {
        this(str, list, list2, list3, (i & 16) != 0 ? null : mixedDeckSnapshot);
    }
}
