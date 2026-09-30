package ai.askquin.ui.persistence.query;

import defpackage.ag2;
import defpackage.an1;
import defpackage.k6a;
import defpackage.l6a;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.rhe;
import defpackage.tec;
import defpackage.tyc;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u001cJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001c¨\u0006."}, d2 = {"Lai/askquin/ui/persistence/query/PendingClarifyingCardSubmission;", "", "", "requestMessageId", "Ltech/chatmind/api/TarotCardChoice;", "card", "", "wheelIndex", "<init>", "(Ljava/lang/String;Ltech/chatmind/api/TarotCardChoice;I)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ltech/chatmind/api/TarotCardChoice;ILxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/persistence/query/PendingClarifyingCardSubmission;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ltech/chatmind/api/TarotCardChoice;", "component3", "()I", "copy", "(Ljava/lang/String;Ltech/chatmind/api/TarotCardChoice;I)Lai/askquin/ui/persistence/query/PendingClarifyingCardSubmission;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRequestMessageId", "Ltech/chatmind/api/TarotCardChoice;", "getCard", "I", "getWheelIndex", "Companion", "k6a", "l6a", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class PendingClarifyingCardSubmission {
    public static final int $stable = 0;
    public static final l6a Companion = new l6a();
    private final TarotCardChoice card;
    private final String requestMessageId;
    private final int wheelIndex;

    public /* synthetic */ PendingClarifyingCardSubmission(int i, String str, TarotCardChoice tarotCardChoice, int i2, xyc xycVar) {
        if (7 != (i & 7)) {
            an1.R(i, 7, k6a.a.e());
            throw null;
        }
        this.requestMessageId = str;
        this.card = tarotCardChoice;
        this.wheelIndex = i2;
    }

    public static /* synthetic */ PendingClarifyingCardSubmission copy$default(PendingClarifyingCardSubmission pendingClarifyingCardSubmission, String str, TarotCardChoice tarotCardChoice, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = pendingClarifyingCardSubmission.requestMessageId;
        }
        if ((i2 & 2) != 0) {
            tarotCardChoice = pendingClarifyingCardSubmission.card;
        }
        if ((i2 & 4) != 0) {
            i = pendingClarifyingCardSubmission.wheelIndex;
        }
        return pendingClarifyingCardSubmission.copy(str, tarotCardChoice, i);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(PendingClarifyingCardSubmission self, ag2 output, nyc serialDesc) {
        output.w(serialDesc, 0, self.requestMessageId);
        output.p(serialDesc, 1, rhe.a, self.card);
        output.v(2, self.wheelIndex, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRequestMessageId() {
        return this.requestMessageId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TarotCardChoice getCard() {
        return this.card;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWheelIndex() {
        return this.wheelIndex;
    }

    public final PendingClarifyingCardSubmission copy(String requestMessageId, TarotCardChoice card, int wheelIndex) {
        requestMessageId.getClass();
        card.getClass();
        return new PendingClarifyingCardSubmission(requestMessageId, card, wheelIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PendingClarifyingCardSubmission)) {
            return false;
        }
        PendingClarifyingCardSubmission pendingClarifyingCardSubmission = (PendingClarifyingCardSubmission) other;
        return pa7.t(this.requestMessageId, pendingClarifyingCardSubmission.requestMessageId) && pa7.t(this.card, pendingClarifyingCardSubmission.card) && this.wheelIndex == pendingClarifyingCardSubmission.wheelIndex;
    }

    public final TarotCardChoice getCard() {
        return this.card;
    }

    public final String getRequestMessageId() {
        return this.requestMessageId;
    }

    public final int getWheelIndex() {
        return this.wheelIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.wheelIndex) + ((this.card.hashCode() + (this.requestMessageId.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.requestMessageId;
        TarotCardChoice tarotCardChoice = this.card;
        int i = this.wheelIndex;
        StringBuilder sb = new StringBuilder("PendingClarifyingCardSubmission(requestMessageId=");
        sb.append(str);
        sb.append(", card=");
        sb.append(tarotCardChoice);
        sb.append(", wheelIndex=");
        return tec.g(i, ")", sb);
    }

    public PendingClarifyingCardSubmission(String str, TarotCardChoice tarotCardChoice, int i) {
        str.getClass();
        tarotCardChoice.getClass();
        this.requestMessageId = str;
        this.card = tarotCardChoice;
        this.wheelIndex = i;
    }
}
