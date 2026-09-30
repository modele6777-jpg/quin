package ai.askquin.ui.persistence.database;

import defpackage.ag2;
import defpackage.an1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.uhe;
import defpackage.x16;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)*B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J0\u0010\u001a\u001a\u00020\r2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0018R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b'\u0010\u0018¨\u0006+"}, d2 = {"ai/askquin/ui/persistence/database/TarotCardChoiceListConverter$PersistedSummaryCards", "", "", "Lai/askquin/ui/persistence/database/TarotCardChoiceListConverter$PersistedSummaryCard;", "originalCards", "extraCards", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lxyc;)V", "Lai/askquin/ui/persistence/database/TarotCardChoiceListConverter$PersistedSummaryCards;", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/persistence/database/TarotCardChoiceListConverter$PersistedSummaryCards;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lai/askquin/ui/persistence/database/TarotCardChoiceListConverter$PersistedSummaryCards;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getOriginalCards", "getExtraCards", "Companion", "ai/askquin/ui/persistence/database/c", "uhe", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
final /* data */ class TarotCardChoiceListConverter$PersistedSummaryCards {
    private static final lw7[] $childSerializers;
    public static final uhe Companion = new uhe();
    private final List<TarotCardChoiceListConverter$PersistedSummaryCard> extraCards;
    private final List<TarotCardChoiceListConverter$PersistedSummaryCard> originalCards;

    static {
        final int i = 0;
        x16 x16Var = new x16() { // from class: ai.askquin.ui.persistence.database.b
            @Override // defpackage.x16
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return TarotCardChoiceListConverter$PersistedSummaryCards._childSerializers$_anonymous_();
                    default:
                        return TarotCardChoiceListConverter$PersistedSummaryCards._childSerializers$_anonymous_$0();
                }
            }
        };
        z18 z18Var = z18.b;
        final int i2 = 1;
        $childSerializers = new lw7[]{eb3.N(z18Var, x16Var), eb3.N(z18Var, new x16() { // from class: ai.askquin.ui.persistence.database.b
            @Override // defpackage.x16
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return TarotCardChoiceListConverter$PersistedSummaryCards._childSerializers$_anonymous_();
                    default:
                        return TarotCardChoiceListConverter$PersistedSummaryCards._childSerializers$_anonymous_$0();
                }
            }
        })};
    }

    public /* synthetic */ TarotCardChoiceListConverter$PersistedSummaryCards(int i, List list, List list2, xyc xycVar) {
        if (1 != (i & 1)) {
            an1.R(i, 1, c.a.e());
            throw null;
        }
        this.originalCards = list;
        if ((i & 2) == 0) {
            this.extraCards = pu4.a;
        } else {
            this.extraCards = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(a.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$0() {
        return new dd0(a.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TarotCardChoiceListConverter$PersistedSummaryCards copy$default(TarotCardChoiceListConverter$PersistedSummaryCards tarotCardChoiceListConverter$PersistedSummaryCards, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tarotCardChoiceListConverter$PersistedSummaryCards.originalCards;
        }
        if ((i & 2) != 0) {
            list2 = tarotCardChoiceListConverter$PersistedSummaryCards.extraCards;
        }
        return tarotCardChoiceListConverter$PersistedSummaryCards.copy(list, list2);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(TarotCardChoiceListConverter$PersistedSummaryCards self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.p(serialDesc, 0, (xn7) lw7VarArr[0].getValue(), self.originalCards);
        if (!output.g(serialDesc) && pa7.t(self.extraCards, pu4.a)) {
            return;
        }
        output.p(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.extraCards);
    }

    public final List<TarotCardChoiceListConverter$PersistedSummaryCard> component1() {
        return this.originalCards;
    }

    public final List<TarotCardChoiceListConverter$PersistedSummaryCard> component2() {
        return this.extraCards;
    }

    public final TarotCardChoiceListConverter$PersistedSummaryCards copy(List<TarotCardChoiceListConverter$PersistedSummaryCard> originalCards, List<TarotCardChoiceListConverter$PersistedSummaryCard> extraCards) {
        originalCards.getClass();
        extraCards.getClass();
        return new TarotCardChoiceListConverter$PersistedSummaryCards(originalCards, extraCards);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TarotCardChoiceListConverter$PersistedSummaryCards)) {
            return false;
        }
        TarotCardChoiceListConverter$PersistedSummaryCards tarotCardChoiceListConverter$PersistedSummaryCards = (TarotCardChoiceListConverter$PersistedSummaryCards) other;
        return pa7.t(this.originalCards, tarotCardChoiceListConverter$PersistedSummaryCards.originalCards) && pa7.t(this.extraCards, tarotCardChoiceListConverter$PersistedSummaryCards.extraCards);
    }

    public final List<TarotCardChoiceListConverter$PersistedSummaryCard> getExtraCards() {
        return this.extraCards;
    }

    public final List<TarotCardChoiceListConverter$PersistedSummaryCard> getOriginalCards() {
        return this.originalCards;
    }

    public int hashCode() {
        return this.extraCards.hashCode() + (this.originalCards.hashCode() * 31);
    }

    public String toString() {
        return "PersistedSummaryCards(originalCards=" + this.originalCards + ", extraCards=" + this.extraCards + ")";
    }

    public TarotCardChoiceListConverter$PersistedSummaryCards(List<TarotCardChoiceListConverter$PersistedSummaryCard> list, List<TarotCardChoiceListConverter$PersistedSummaryCard> list2) {
        list.getClass();
        list2.getClass();
        this.originalCards = list;
        this.extraCards = list2;
    }

    public /* synthetic */ TarotCardChoiceListConverter$PersistedSummaryCards(List list, List list2, int i, rp3 rp3Var) {
        this(list, (i & 2) != 0 ? pu4.a : list2);
    }
}
