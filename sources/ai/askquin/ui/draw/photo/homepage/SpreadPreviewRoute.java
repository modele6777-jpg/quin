package ai.askquin.ui.draw.photo.homepage;

import defpackage.ag2;
import defpackage.an1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.ond;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.pwd;
import defpackage.qwd;
import defpackage.rhe;
import defpackage.tyc;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J0\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\u0018¨\u0006*"}, d2 = {"Lai/askquin/ui/draw/photo/homepage/SpreadPreviewRoute;", "", "", "Ltech/chatmind/api/TarotCardChoice;", "cards", "", "meanings", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/draw/photo/homepage/SpreadPreviewRoute;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lai/askquin/ui/draw/photo/homepage/SpreadPreviewRoute;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCards", "getMeanings", "Companion", "pwd", "qwd", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class SpreadPreviewRoute {
    private static final lw7[] $childSerializers;
    public static final int $stable = 0;
    public static final qwd Companion = new qwd();
    private final List<TarotCardChoice> cards;
    private final List<String> meanings;

    static {
        ond ondVar = new ond(8);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{eb3.N(z18Var, ondVar), eb3.N(z18Var, new ond(9))};
    }

    public /* synthetic */ SpreadPreviewRoute(int i, List list, List list2, xyc xycVar) {
        if (3 != (i & 3)) {
            an1.R(i, 3, pwd.a.e());
            throw null;
        }
        this.cards = list;
        this.meanings = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(rhe.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$0() {
        return new dd0(p4e.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpreadPreviewRoute copy$default(SpreadPreviewRoute spreadPreviewRoute, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = spreadPreviewRoute.cards;
        }
        if ((i & 2) != 0) {
            list2 = spreadPreviewRoute.meanings;
        }
        return spreadPreviewRoute.copy(list, list2);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(SpreadPreviewRoute self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.p(serialDesc, 0, (xn7) lw7VarArr[0].getValue(), self.cards);
        output.p(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.meanings);
    }

    public final List<TarotCardChoice> component1() {
        return this.cards;
    }

    public final List<String> component2() {
        return this.meanings;
    }

    public final SpreadPreviewRoute copy(List<TarotCardChoice> cards, List<String> meanings) {
        cards.getClass();
        meanings.getClass();
        return new SpreadPreviewRoute(cards, meanings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpreadPreviewRoute)) {
            return false;
        }
        SpreadPreviewRoute spreadPreviewRoute = (SpreadPreviewRoute) other;
        return pa7.t(this.cards, spreadPreviewRoute.cards) && pa7.t(this.meanings, spreadPreviewRoute.meanings);
    }

    public final List<TarotCardChoice> getCards() {
        return this.cards;
    }

    public final List<String> getMeanings() {
        return this.meanings;
    }

    public int hashCode() {
        return this.meanings.hashCode() + (this.cards.hashCode() * 31);
    }

    public String toString() {
        return "SpreadPreviewRoute(cards=" + this.cards + ", meanings=" + this.meanings + ")";
    }

    public SpreadPreviewRoute(List<TarotCardChoice> list, List<String> list2) {
        list.getClass();
        list2.getClass();
        this.cards = list;
        this.meanings = list2;
    }
}
