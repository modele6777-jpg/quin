package ai.askquin.ui.draw.photo.homepage;

import defpackage.ag2;
import defpackage.an1;
import defpackage.awd;
import defpackage.bwd;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.ond;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.pu4;
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
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ:\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u001c¨\u0006."}, d2 = {"Lai/askquin/ui/draw/photo/homepage/SpreadInfoInputRoute;", "", "", "Ltech/chatmind/api/TarotCardChoice;", "cards", "", "initialMeanings", "", "editIndex", "<init>", "(Ljava/util/List;Ljava/util/List;I)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;ILxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/draw/photo/homepage/SpreadInfoInputRoute;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "()I", "copy", "(Ljava/util/List;Ljava/util/List;I)Lai/askquin/ui/draw/photo/homepage/SpreadInfoInputRoute;", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCards", "getInitialMeanings", "I", "getEditIndex", "Companion", "awd", "bwd", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class SpreadInfoInputRoute {
    private static final lw7[] $childSerializers;
    public static final int $stable = 0;
    public static final bwd Companion = new bwd();
    private final List<TarotCardChoice> cards;
    private final int editIndex;
    private final List<String> initialMeanings;

    static {
        ond ondVar = new ond(5);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{eb3.N(z18Var, ondVar), eb3.N(z18Var, new ond(6)), null};
    }

    public /* synthetic */ SpreadInfoInputRoute(int i, List list, List list2, int i2, xyc xycVar) {
        if (1 != (i & 1)) {
            an1.R(i, 1, awd.a.e());
            throw null;
        }
        this.cards = list;
        if ((i & 2) == 0) {
            this.initialMeanings = pu4.a;
        } else {
            this.initialMeanings = list2;
        }
        if ((i & 4) == 0) {
            this.editIndex = -1;
        } else {
            this.editIndex = i2;
        }
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
    public static /* synthetic */ SpreadInfoInputRoute copy$default(SpreadInfoInputRoute spreadInfoInputRoute, List list, List list2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = spreadInfoInputRoute.cards;
        }
        if ((i2 & 2) != 0) {
            list2 = spreadInfoInputRoute.initialMeanings;
        }
        if ((i2 & 4) != 0) {
            i = spreadInfoInputRoute.editIndex;
        }
        return spreadInfoInputRoute.copy(list, list2, i);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(SpreadInfoInputRoute self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.p(serialDesc, 0, (xn7) lw7VarArr[0].getValue(), self.cards);
        if (output.g(serialDesc) || !pa7.t(self.initialMeanings, pu4.a)) {
            output.p(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.initialMeanings);
        }
        if (!output.g(serialDesc) && self.editIndex == -1) {
            return;
        }
        output.v(2, self.editIndex, serialDesc);
    }

    public final List<TarotCardChoice> component1() {
        return this.cards;
    }

    public final List<String> component2() {
        return this.initialMeanings;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEditIndex() {
        return this.editIndex;
    }

    public final SpreadInfoInputRoute copy(List<TarotCardChoice> cards, List<String> initialMeanings, int editIndex) {
        cards.getClass();
        initialMeanings.getClass();
        return new SpreadInfoInputRoute(cards, initialMeanings, editIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpreadInfoInputRoute)) {
            return false;
        }
        SpreadInfoInputRoute spreadInfoInputRoute = (SpreadInfoInputRoute) other;
        return pa7.t(this.cards, spreadInfoInputRoute.cards) && pa7.t(this.initialMeanings, spreadInfoInputRoute.initialMeanings) && this.editIndex == spreadInfoInputRoute.editIndex;
    }

    public final List<TarotCardChoice> getCards() {
        return this.cards;
    }

    public final int getEditIndex() {
        return this.editIndex;
    }

    public final List<String> getInitialMeanings() {
        return this.initialMeanings;
    }

    public int hashCode() {
        return Integer.hashCode(this.editIndex) + tec.a(this.cards.hashCode() * 31, 31, this.initialMeanings);
    }

    public String toString() {
        List<TarotCardChoice> list = this.cards;
        List<String> list2 = this.initialMeanings;
        int i = this.editIndex;
        StringBuilder sb = new StringBuilder("SpreadInfoInputRoute(cards=");
        sb.append(list);
        sb.append(", initialMeanings=");
        sb.append(list2);
        sb.append(", editIndex=");
        return tec.g(i, ")", sb);
    }

    public SpreadInfoInputRoute(List<TarotCardChoice> list, List<String> list2, int i) {
        list.getClass();
        list2.getClass();
        this.cards = list;
        this.initialMeanings = list2;
        this.editIndex = i;
    }

    public /* synthetic */ SpreadInfoInputRoute(List list, List list2, int i, int i2, rp3 rp3Var) {
        this(list, (i2 & 2) != 0 ? pu4.a : list2, (i2 & 4) != 0 ? -1 : i);
    }
}
