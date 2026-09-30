package ai.askquin.ui.draw.mixed;

import ai.askquin.model.TarotSkinIdentify;
import defpackage.ag2;
import defpackage.an1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.fk8;
import defpackage.hx8;
import defpackage.ib8;
import defpackage.ix8;
import defpackage.lw7;
import defpackage.lx4;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.qh6;
import defpackage.rp3;
import defpackage.s72;
import defpackage.t72;
import defpackage.tec;
import defpackage.tyc;
import defpackage.v4e;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;<B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u001c\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b)\u0010*JJ\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010$J\u0010\u0010.\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b.\u0010*J\u001a\u00100\u001a\u00020 2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010$R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010&R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010*¨\u0006="}, d2 = {"Lai/askquin/ui/draw/mixed/MixedDeckSnapshot;", "", "", "readingId", "", "skinsByCard", "", "cardOrder", "", "version", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;I)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Ljava/util/List;ILxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/draw/mixed/MixedDeckSnapshot;Lag2;Lnyc;)V", "write$Self", "cardKey", "Lai/askquin/model/TarotSkinIdentify;", "skinFor", "(Ljava/lang/String;)Lai/askquin/model/TarotSkinIdentify;", "index", "skinAt", "(I)Lai/askquin/model/TarotSkinIdentify;", "", "isValid", "()Z", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "()Ljava/util/List;", "component4", "()I", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;I)Lai/askquin/ui/draw/mixed/MixedDeckSnapshot;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getReadingId", "Ljava/util/Map;", "getSkinsByCard", "Ljava/util/List;", "getCardOrder", "I", "getVersion", "Companion", "hx8", "ix8", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class MixedDeckSnapshot {
    private static final lw7[] $childSerializers;
    public static final int $stable = 0;
    public static final ix8 Companion = new ix8();
    private final List<String> cardOrder;
    private final String readingId;
    private final Map<String, String> skinsByCard;
    private final int version;

    static {
        fk8 fk8Var = new fk8(8);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{null, eb3.N(z18Var, fk8Var), eb3.N(z18Var, new fk8(9)), null};
    }

    public /* synthetic */ MixedDeckSnapshot(int i, String str, Map map, List list, int i2, xyc xycVar) {
        if (3 != (i & 3)) {
            an1.R(i, 3, hx8.a.e());
            throw null;
        }
        this.readingId = str;
        this.skinsByCard = map;
        if ((i & 4) == 0) {
            this.cardOrder = s72.j1(map.keySet());
        } else {
            this.cardOrder = list;
        }
        if ((i & 8) == 0) {
            this.version = 1;
        } else {
            this.version = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        p4e p4eVar = p4e.a;
        return new qh6(p4eVar, p4eVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$0() {
        return new dd0(p4e.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MixedDeckSnapshot copy$default(MixedDeckSnapshot mixedDeckSnapshot, String str, Map map, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = mixedDeckSnapshot.readingId;
        }
        if ((i2 & 2) != 0) {
            map = mixedDeckSnapshot.skinsByCard;
        }
        if ((i2 & 4) != 0) {
            list = mixedDeckSnapshot.cardOrder;
        }
        if ((i2 & 8) != 0) {
            i = mixedDeckSnapshot.version;
        }
        return mixedDeckSnapshot.copy(str, map, list, i);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(MixedDeckSnapshot self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.w(serialDesc, 0, self.readingId);
        output.p(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.skinsByCard);
        if (output.g(serialDesc) || !pa7.t(self.cardOrder, s72.j1(self.skinsByCard.keySet()))) {
            output.p(serialDesc, 2, (xn7) lw7VarArr[2].getValue(), self.cardOrder);
        }
        if (!output.g(serialDesc) && self.version == 1) {
            return;
        }
        output.v(3, self.version, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getReadingId() {
        return this.readingId;
    }

    public final Map<String, String> component2() {
        return this.skinsByCard;
    }

    public final List<String> component3() {
        return this.cardOrder;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public final MixedDeckSnapshot copy(String readingId, Map<String, String> skinsByCard, List<String> cardOrder, int version) {
        readingId.getClass();
        skinsByCard.getClass();
        cardOrder.getClass();
        return new MixedDeckSnapshot(readingId, skinsByCard, cardOrder, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MixedDeckSnapshot)) {
            return false;
        }
        MixedDeckSnapshot mixedDeckSnapshot = (MixedDeckSnapshot) other;
        return pa7.t(this.readingId, mixedDeckSnapshot.readingId) && pa7.t(this.skinsByCard, mixedDeckSnapshot.skinsByCard) && pa7.t(this.cardOrder, mixedDeckSnapshot.cardOrder) && this.version == mixedDeckSnapshot.version;
    }

    public final List<String> getCardOrder() {
        return this.cardOrder;
    }

    public final String getReadingId() {
        return this.readingId;
    }

    public final Map<String, String> getSkinsByCard() {
        return this.skinsByCard;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Integer.hashCode(this.version) + tec.a(ib8.c(this.skinsByCard, this.readingId.hashCode() * 31, 31), 31, this.cardOrder);
    }

    public final boolean isValid() {
        if (this.version != 1 || !s72.o1(this.cardOrder).equals(this.skinsByCard.keySet()) || this.cardOrder.size() != 78) {
            return false;
        }
        Set<String> setKeySet = this.skinsByCard.keySet();
        lx4 entries = TarotCardType.getEntries();
        ArrayList arrayList = new ArrayList(t72.u(entries, 10));
        Iterator<E> it = entries.iterator();
        while (it.hasNext()) {
            arrayList.add(((TarotCardType) it.next()).getCardKey());
        }
        if (!pa7.t(setKeySet, s72.o1(arrayList))) {
            return false;
        }
        Collection<String> collectionValues = this.skinsByCard.values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                if (v4e.Q((String) it2.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    public final TarotSkinIdentify skinAt(int index) {
        String str = (String) s72.y0(index, this.cardOrder);
        if (str != null) {
            return skinFor(str);
        }
        return null;
    }

    public final TarotSkinIdentify skinFor(String cardKey) {
        cardKey.getClass();
        String str = this.skinsByCard.get(cardKey);
        if (str != null) {
            if (this.version != 1) {
                str = null;
            }
            if (str != null) {
                return eb3.Q(str);
            }
        }
        return null;
    }

    public String toString() {
        return "MixedDeckSnapshot(readingId=" + this.readingId + ", skinsByCard=" + this.skinsByCard + ", cardOrder=" + this.cardOrder + ", version=" + this.version + ")";
    }

    public MixedDeckSnapshot(String str, Map<String, String> map, List<String> list, int i) {
        str.getClass();
        map.getClass();
        list.getClass();
        this.readingId = str;
        this.skinsByCard = map;
        this.cardOrder = list;
        this.version = i;
    }

    public /* synthetic */ MixedDeckSnapshot(String str, Map map, List list, int i, int i2, rp3 rp3Var) {
        this(str, map, (i2 & 4) != 0 ? s72.j1(map.keySet()) : list, (i2 & 8) != 0 ? 1 : i);
    }
}
