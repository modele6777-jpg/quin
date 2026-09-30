package ai.askquin.ui.share;

import defpackage.ag2;
import defpackage.an1;
import defpackage.dd0;
import defpackage.ead;
import defpackage.eb3;
import defpackage.ks0;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.rhe;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.wbd;
import defpackage.xbd;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ4\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00061"}, d2 = {"Lai/askquin/ui/share/SharedConversationEntry;", "", "Lai/askquin/ui/share/SharedConversationEntryType;", "type", "", "text", "", "Ltech/chatmind/api/TarotCardChoice;", "cards", "<init>", "(Lai/askquin/ui/share/SharedConversationEntryType;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILai/askquin/ui/share/SharedConversationEntryType;Ljava/lang/String;Ljava/util/List;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/share/SharedConversationEntry;Lag2;Lnyc;)V", "write$Self", "component1", "()Lai/askquin/ui/share/SharedConversationEntryType;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "copy", "(Lai/askquin/ui/share/SharedConversationEntryType;Ljava/lang/String;Ljava/util/List;)Lai/askquin/ui/share/SharedConversationEntry;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lai/askquin/ui/share/SharedConversationEntryType;", "getType", "Ljava/lang/String;", "getText", "Ljava/util/List;", "getCards", "Companion", "wbd", "xbd", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class SharedConversationEntry {
    private static final lw7[] $childSerializers;
    public static final int $stable = 8;
    public static final xbd Companion = new xbd();
    private final List<TarotCardChoice> cards;
    private final String text;
    private final SharedConversationEntryType type;

    static {
        ead eadVar = new ead(6);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{eb3.N(z18Var, eadVar), null, eb3.N(z18Var, new ead(7))};
    }

    public /* synthetic */ SharedConversationEntry(int i, SharedConversationEntryType sharedConversationEntryType, String str, List list, xyc xycVar) {
        if (3 != (i & 3)) {
            an1.R(i, 3, wbd.a.e());
            throw null;
        }
        this.type = sharedConversationEntryType;
        this.text = str;
        if ((i & 4) == 0) {
            this.cards = pu4.a;
        } else {
            this.cards = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return SharedConversationEntryType.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$0() {
        return new dd0(rhe.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SharedConversationEntry copy$default(SharedConversationEntry sharedConversationEntry, SharedConversationEntryType sharedConversationEntryType, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            sharedConversationEntryType = sharedConversationEntry.type;
        }
        if ((i & 2) != 0) {
            str = sharedConversationEntry.text;
        }
        if ((i & 4) != 0) {
            list = sharedConversationEntry.cards;
        }
        return sharedConversationEntry.copy(sharedConversationEntryType, str, list);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(SharedConversationEntry self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.p(serialDesc, 0, (xn7) lw7VarArr[0].getValue(), self.type);
        output.w(serialDesc, 1, self.text);
        if (!output.g(serialDesc) && pa7.t(self.cards, pu4.a)) {
            return;
        }
        output.p(serialDesc, 2, (xn7) lw7VarArr[2].getValue(), self.cards);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SharedConversationEntryType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final List<TarotCardChoice> component3() {
        return this.cards;
    }

    public final SharedConversationEntry copy(SharedConversationEntryType type, String text, List<TarotCardChoice> cards) {
        type.getClass();
        text.getClass();
        cards.getClass();
        return new SharedConversationEntry(type, text, cards);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharedConversationEntry)) {
            return false;
        }
        SharedConversationEntry sharedConversationEntry = (SharedConversationEntry) other;
        return this.type == sharedConversationEntry.type && pa7.t(this.text, sharedConversationEntry.text) && pa7.t(this.cards, sharedConversationEntry.cards);
    }

    public final List<TarotCardChoice> getCards() {
        return this.cards;
    }

    public final String getText() {
        return this.text;
    }

    public final SharedConversationEntryType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.cards.hashCode() + ub3.c(this.type.hashCode() * 31, 31, this.text);
    }

    public String toString() {
        SharedConversationEntryType sharedConversationEntryType = this.type;
        String str = this.text;
        List<TarotCardChoice> list = this.cards;
        StringBuilder sb = new StringBuilder("SharedConversationEntry(type=");
        sb.append(sharedConversationEntryType);
        sb.append(", text=");
        sb.append(str);
        sb.append(", cards=");
        return ks0.n(sb, list, ")");
    }

    public SharedConversationEntry(SharedConversationEntryType sharedConversationEntryType, String str, List<TarotCardChoice> list) {
        sharedConversationEntryType.getClass();
        str.getClass();
        list.getClass();
        this.type = sharedConversationEntryType;
        this.text = str;
        this.cards = list;
    }

    public /* synthetic */ SharedConversationEntry(SharedConversationEntryType sharedConversationEntryType, String str, List list, int i, rp3 rp3Var) {
        this(sharedConversationEntryType, str, (i & 4) != 0 ? pu4.a : list);
    }
}
