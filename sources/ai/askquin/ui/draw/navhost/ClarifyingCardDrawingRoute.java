package ai.askquin.ui.draw.navhost;

import defpackage.ag2;
import defpackage.an1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.ib8;
import defpackage.ks0;
import defpackage.lw7;
import defpackage.n12;
import defpackage.nyc;
import defpackage.o12;
import defpackage.pa7;
import defpackage.r02;
import defpackage.rhe;
import defpackage.tyc;
import defpackage.ub3;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002,-B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001c¨\u0006."}, d2 = {"Lai/askquin/ui/draw/navhost/ClarifyingCardDrawingRoute;", "", "", "requestMessageId", "label", "", "Ltech/chatmind/api/TarotCardChoice;", "excludedCards", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/draw/navhost/ClarifyingCardDrawingRoute;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lai/askquin/ui/draw/navhost/ClarifyingCardDrawingRoute;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRequestMessageId", "getLabel", "Ljava/util/List;", "getExcludedCards", "Companion", "n12", "o12", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class ClarifyingCardDrawingRoute {
    public static final int $stable = 8;
    private final List<TarotCardChoice> excludedCards;
    private final String label;
    private final String requestMessageId;
    public static final o12 Companion = new o12();
    private static final lw7[] $childSerializers = {null, null, eb3.N(z18.b, new r02(5))};

    public /* synthetic */ ClarifyingCardDrawingRoute(int i, String str, String str2, List list, xyc xycVar) {
        if (7 != (i & 7)) {
            an1.R(i, 7, n12.a.e());
            throw null;
        }
        this.requestMessageId = str;
        this.label = str2;
        this.excludedCards = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(rhe.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClarifyingCardDrawingRoute copy$default(ClarifyingCardDrawingRoute clarifyingCardDrawingRoute, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clarifyingCardDrawingRoute.requestMessageId;
        }
        if ((i & 2) != 0) {
            str2 = clarifyingCardDrawingRoute.label;
        }
        if ((i & 4) != 0) {
            list = clarifyingCardDrawingRoute.excludedCards;
        }
        return clarifyingCardDrawingRoute.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(ClarifyingCardDrawingRoute self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.w(serialDesc, 0, self.requestMessageId);
        output.w(serialDesc, 1, self.label);
        output.p(serialDesc, 2, (xn7) lw7VarArr[2].getValue(), self.excludedCards);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRequestMessageId() {
        return this.requestMessageId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final List<TarotCardChoice> component3() {
        return this.excludedCards;
    }

    public final ClarifyingCardDrawingRoute copy(String requestMessageId, String label, List<TarotCardChoice> excludedCards) {
        requestMessageId.getClass();
        label.getClass();
        excludedCards.getClass();
        return new ClarifyingCardDrawingRoute(requestMessageId, label, excludedCards);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClarifyingCardDrawingRoute)) {
            return false;
        }
        ClarifyingCardDrawingRoute clarifyingCardDrawingRoute = (ClarifyingCardDrawingRoute) other;
        return pa7.t(this.requestMessageId, clarifyingCardDrawingRoute.requestMessageId) && pa7.t(this.label, clarifyingCardDrawingRoute.label) && pa7.t(this.excludedCards, clarifyingCardDrawingRoute.excludedCards);
    }

    public final List<TarotCardChoice> getExcludedCards() {
        return this.excludedCards;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getRequestMessageId() {
        return this.requestMessageId;
    }

    public int hashCode() {
        return this.excludedCards.hashCode() + ub3.c(this.requestMessageId.hashCode() * 31, 31, this.label);
    }

    public String toString() {
        String str = this.requestMessageId;
        String str2 = this.label;
        return ks0.n(ib8.o("ClarifyingCardDrawingRoute(requestMessageId=", str, ", label=", str2, ", excludedCards="), this.excludedCards, ")");
    }

    public ClarifyingCardDrawingRoute(String str, String str2, List<TarotCardChoice> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.requestMessageId = str;
        this.label = str2;
        this.excludedCards = list;
    }
}
