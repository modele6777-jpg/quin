package ai.askquin.ui.persistence.database;

import defpackage.ag2;
import defpackage.an1;
import defpackage.ks0;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.the;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xyc;
import defpackage.z7c;
import java.util.Iterator;
import kotlin.Metadata;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u000201B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ>\u0010\"\u001a\u00020\u000f2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b\u0005\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b-\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b.\u0010\u001d¨\u00062"}, d2 = {"ai/askquin/ui/persistence/database/TarotCardChoiceListConverter$PersistedSummaryCard", "", "", "card", "", "isReversed", "tarotCardDesc", "skin", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lxyc;)V", "Lai/askquin/ui/persistence/database/TarotCardChoiceListConverter$PersistedSummaryCard;", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/persistence/database/TarotCardChoiceListConverter$PersistedSummaryCard;Lag2;Lnyc;)V", "write$Self", "Ltech/chatmind/api/TarotCardChoice;", "toChoice", "()Ltech/chatmind/api/TarotCardChoice;", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lai/askquin/ui/persistence/database/TarotCardChoiceListConverter$PersistedSummaryCard;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCard", "Z", "getTarotCardDesc", "getSkin", "Companion", "the", "ai/askquin/ui/persistence/database/a", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
final /* data */ class TarotCardChoiceListConverter$PersistedSummaryCard {
    public static final the Companion = new the();
    private final String card;
    private final boolean isReversed;
    private final String skin;
    private final String tarotCardDesc;

    public /* synthetic */ TarotCardChoiceListConverter$PersistedSummaryCard(int i, String str, boolean z, String str2, String str3, xyc xycVar) {
        if (2 != (i & 2)) {
            an1.R(i, 2, a.a.e());
            throw null;
        }
        if ((i & 1) == 0) {
            this.card = null;
        } else {
            this.card = str;
        }
        this.isReversed = z;
        if ((i & 4) == 0) {
            this.tarotCardDesc = null;
        } else {
            this.tarotCardDesc = str2;
        }
        if ((i & 8) == 0) {
            this.skin = null;
        } else {
            this.skin = str3;
        }
    }

    public static /* synthetic */ TarotCardChoiceListConverter$PersistedSummaryCard copy$default(TarotCardChoiceListConverter$PersistedSummaryCard tarotCardChoiceListConverter$PersistedSummaryCard, String str, boolean z, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tarotCardChoiceListConverter$PersistedSummaryCard.card;
        }
        if ((i & 2) != 0) {
            z = tarotCardChoiceListConverter$PersistedSummaryCard.isReversed;
        }
        if ((i & 4) != 0) {
            str2 = tarotCardChoiceListConverter$PersistedSummaryCard.tarotCardDesc;
        }
        if ((i & 8) != 0) {
            str3 = tarotCardChoiceListConverter$PersistedSummaryCard.skin;
        }
        return tarotCardChoiceListConverter$PersistedSummaryCard.copy(str, z, str2, str3);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(TarotCardChoiceListConverter$PersistedSummaryCard self, ag2 output, nyc serialDesc) {
        if (output.g(serialDesc) || self.card != null) {
            output.A(serialDesc, 0, p4e.a, self.card);
        }
        output.o(serialDesc, 1, self.isReversed);
        if (output.g(serialDesc) || self.tarotCardDesc != null) {
            output.A(serialDesc, 2, p4e.a, self.tarotCardDesc);
        }
        if (!output.g(serialDesc) && self.skin == null) {
            return;
        }
        output.A(serialDesc, 3, p4e.a, self.skin);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCard() {
        return this.card;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsReversed() {
        return this.isReversed;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTarotCardDesc() {
        return this.tarotCardDesc;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSkin() {
        return this.skin;
    }

    public final TarotCardChoiceListConverter$PersistedSummaryCard copy(String card, boolean isReversed, String tarotCardDesc, String skin) {
        return new TarotCardChoiceListConverter$PersistedSummaryCard(card, isReversed, tarotCardDesc, skin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TarotCardChoiceListConverter$PersistedSummaryCard)) {
            return false;
        }
        TarotCardChoiceListConverter$PersistedSummaryCard tarotCardChoiceListConverter$PersistedSummaryCard = (TarotCardChoiceListConverter$PersistedSummaryCard) other;
        return pa7.t(this.card, tarotCardChoiceListConverter$PersistedSummaryCard.card) && this.isReversed == tarotCardChoiceListConverter$PersistedSummaryCard.isReversed && pa7.t(this.tarotCardDesc, tarotCardChoiceListConverter$PersistedSummaryCard.tarotCardDesc) && pa7.t(this.skin, tarotCardChoiceListConverter$PersistedSummaryCard.skin);
    }

    public final String getCard() {
        return this.card;
    }

    public final String getSkin() {
        return this.skin;
    }

    public final String getTarotCardDesc() {
        return this.tarotCardDesc;
    }

    public int hashCode() {
        String str = this.card;
        int iD = ub3.d((str == null ? 0 : str.hashCode()) * 31, 31, this.isReversed);
        String str2 = this.tarotCardDesc;
        int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.skin;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isReversed() {
        return this.isReversed;
    }

    public final TarotCardChoice toChoice() {
        Object next;
        Iterator<E> it = TarotCardType.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!pa7.t(((TarotCardType) next).name(), this.card));
        TarotCardType tarotCardType = (TarotCardType) next;
        if (tarotCardType != null) {
            return new TarotCardChoice(tarotCardType, this.isReversed, this.tarotCardDesc);
        }
        return null;
    }

    public String toString() {
        String str = this.card;
        boolean z = this.isReversed;
        String str2 = this.tarotCardDesc;
        String str3 = this.skin;
        StringBuilder sb = new StringBuilder("PersistedSummaryCard(card=");
        sb.append(str);
        sb.append(", isReversed=");
        sb.append(z);
        sb.append(", tarotCardDesc=");
        return ks0.m(sb, str2, ", skin=", str3, ")");
    }

    public TarotCardChoiceListConverter$PersistedSummaryCard(String str, boolean z, String str2, String str3) {
        this.card = str;
        this.isReversed = z;
        this.tarotCardDesc = str2;
        this.skin = str3;
    }

    public /* synthetic */ TarotCardChoiceListConverter$PersistedSummaryCard(String str, boolean z, String str2, String str3, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? null : str, z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
