package ai.askquin.ui.draw.navhost;

import defpackage.ag2;
import defpackage.an1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.hs1;
import defpackage.is1;
import defpackage.jl0;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.rhe;
import defpackage.rp3;
import defpackage.tec;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0081\b\u0018\u0000 02\u00020\u0001:\u000212B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ>\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001aJ\u001a\u0010'\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b/\u0010\u001a¨\u00063"}, d2 = {"Lai/askquin/ui/draw/navhost/CardPickerRoute;", "", "", "limitation", "", "Ltech/chatmind/api/TarotCardChoice;", "selectedTarotCards", "", "singleSelectMode", "targetSlotIndex", "<init>", "(ILjava/util/List;ZI)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(IILjava/util/List;ZILxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/draw/navhost/CardPickerRoute;Lag2;Lnyc;)V", "write$Self", "component1", "()I", "component2", "()Ljava/util/List;", "component3", "()Z", "component4", "copy", "(ILjava/util/List;ZI)Lai/askquin/ui/draw/navhost/CardPickerRoute;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getLimitation", "Ljava/util/List;", "getSelectedTarotCards", "Z", "getSingleSelectMode", "getTargetSlotIndex", "Companion", "hs1", "is1", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class CardPickerRoute {
    public static final int $stable = 8;
    private final int limitation;
    private final List<TarotCardChoice> selectedTarotCards;
    private final boolean singleSelectMode;
    private final int targetSlotIndex;
    public static final is1 Companion = new is1();
    private static final lw7[] $childSerializers = {null, eb3.N(z18.b, new jl0(22)), null, null};

    public /* synthetic */ CardPickerRoute(int i, int i2, List list, boolean z, int i3, xyc xycVar) {
        if (3 != (i & 3)) {
            an1.R(i, 3, hs1.a.e());
            throw null;
        }
        this.limitation = i2;
        this.selectedTarotCards = list;
        if ((i & 4) == 0) {
            this.singleSelectMode = false;
        } else {
            this.singleSelectMode = z;
        }
        if ((i & 8) == 0) {
            this.targetSlotIndex = -1;
        } else {
            this.targetSlotIndex = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(rhe.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardPickerRoute copy$default(CardPickerRoute cardPickerRoute, int i, List list, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = cardPickerRoute.limitation;
        }
        if ((i3 & 2) != 0) {
            list = cardPickerRoute.selectedTarotCards;
        }
        if ((i3 & 4) != 0) {
            z = cardPickerRoute.singleSelectMode;
        }
        if ((i3 & 8) != 0) {
            i2 = cardPickerRoute.targetSlotIndex;
        }
        return cardPickerRoute.copy(i, list, z, i2);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(CardPickerRoute self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.v(0, self.limitation, serialDesc);
        output.p(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.selectedTarotCards);
        if (output.g(serialDesc) || self.singleSelectMode) {
            output.o(serialDesc, 2, self.singleSelectMode);
        }
        if (!output.g(serialDesc) && self.targetSlotIndex == -1) {
            return;
        }
        output.v(3, self.targetSlotIndex, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLimitation() {
        return this.limitation;
    }

    public final List<TarotCardChoice> component2() {
        return this.selectedTarotCards;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSingleSelectMode() {
        return this.singleSelectMode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTargetSlotIndex() {
        return this.targetSlotIndex;
    }

    public final CardPickerRoute copy(int limitation, List<TarotCardChoice> selectedTarotCards, boolean singleSelectMode, int targetSlotIndex) {
        selectedTarotCards.getClass();
        return new CardPickerRoute(limitation, selectedTarotCards, singleSelectMode, targetSlotIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardPickerRoute)) {
            return false;
        }
        CardPickerRoute cardPickerRoute = (CardPickerRoute) other;
        return this.limitation == cardPickerRoute.limitation && pa7.t(this.selectedTarotCards, cardPickerRoute.selectedTarotCards) && this.singleSelectMode == cardPickerRoute.singleSelectMode && this.targetSlotIndex == cardPickerRoute.targetSlotIndex;
    }

    public final int getLimitation() {
        return this.limitation;
    }

    public final List<TarotCardChoice> getSelectedTarotCards() {
        return this.selectedTarotCards;
    }

    public final boolean getSingleSelectMode() {
        return this.singleSelectMode;
    }

    public final int getTargetSlotIndex() {
        return this.targetSlotIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.targetSlotIndex) + ub3.d(tec.a(Integer.hashCode(this.limitation) * 31, 31, this.selectedTarotCards), 31, this.singleSelectMode);
    }

    public String toString() {
        return "CardPickerRoute(limitation=" + this.limitation + ", selectedTarotCards=" + this.selectedTarotCards + ", singleSelectMode=" + this.singleSelectMode + ", targetSlotIndex=" + this.targetSlotIndex + ")";
    }

    public CardPickerRoute(int i, List<TarotCardChoice> list, boolean z, int i2) {
        list.getClass();
        this.limitation = i;
        this.selectedTarotCards = list;
        this.singleSelectMode = z;
        this.targetSlotIndex = i2;
    }

    public /* synthetic */ CardPickerRoute(int i, List list, boolean z, int i2, int i3, rp3 rp3Var) {
        this(i, list, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? -1 : i2);
    }
}
