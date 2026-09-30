package ai.askquin.ui.persistence.serialization;

import defpackage.ag2;
import defpackage.an1;
import defpackage.cm4;
import defpackage.dd0;
import defpackage.dm4;
import defpackage.eb3;
import defpackage.g2a;
import defpackage.ib8;
import defpackage.ks0;
import defpackage.l2;
import defpackage.lw7;
import defpackage.mx4;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rhe;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.vyc;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.time.Instant;
import java.util.List;
import kotlin.Metadata;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\r\b\u0083\b\u0018\u0000 52\u00020\u0001:\u000267BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBY\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJR\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001fJ\u0010\u0010(\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\"R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b3\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b4\u0010\u001f¨\u00068"}, d2 = {"Lai/askquin/ui/persistence/serialization/SerializableDrawBeforeQuestion;", "", "", "origin", "spreadId", "", "Ltech/chatmind/api/PatternData;", "patternData", "Ltech/chatmind/api/TarotCardChoice;", "cards", "completedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/persistence/serialization/SerializableDrawBeforeQuestion;Lag2;Lnyc;)V", "write$Self", "Lcm4;", "toOrigin", "()Lcm4;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lai/askquin/ui/persistence/serialization/SerializableDrawBeforeQuestion;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrigin", "getSpreadId", "Ljava/util/List;", "getPatternData", "getCards", "getCompletedAt", "Companion", "ai/askquin/ui/persistence/serialization/t", "vyc", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
final /* data */ class SerializableDrawBeforeQuestion {
    private static final lw7[] $childSerializers;
    public static final vyc Companion = new vyc();
    private final List<TarotCardChoice> cards;
    private final String completedAt;
    private final String origin;
    private final List<PatternData> patternData;
    private final String spreadId;

    static {
        b bVar = new b(5);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{null, null, eb3.N(z18Var, bVar), eb3.N(z18Var, new b(6)), null};
    }

    public /* synthetic */ SerializableDrawBeforeQuestion(int i, String str, String str2, List list, List list2, String str3, xyc xycVar) {
        if (12 != (i & 12)) {
            an1.R(i, 12, t.a.e());
            throw null;
        }
        this.origin = (i & 1) == 0 ? "Unknown" : str;
        if ((i & 2) == 0) {
            this.spreadId = null;
        } else {
            this.spreadId = str2;
        }
        this.patternData = list;
        this.cards = list2;
        if ((i & 16) == 0) {
            this.completedAt = null;
        } else {
            this.completedAt = str3;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SerializableDrawBeforeQuestion copy$default(SerializableDrawBeforeQuestion serializableDrawBeforeQuestion, String str, String str2, List list, List list2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serializableDrawBeforeQuestion.origin;
        }
        if ((i & 2) != 0) {
            str2 = serializableDrawBeforeQuestion.spreadId;
        }
        if ((i & 4) != 0) {
            list = serializableDrawBeforeQuestion.patternData;
        }
        if ((i & 8) != 0) {
            list2 = serializableDrawBeforeQuestion.cards;
        }
        if ((i & 16) != 0) {
            str3 = serializableDrawBeforeQuestion.completedAt;
        }
        String str4 = str3;
        List list3 = list;
        return serializableDrawBeforeQuestion.copy(str, str2, list3, list2, str4);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(SerializableDrawBeforeQuestion self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        if (output.g(serialDesc) || !pa7.t(self.origin, "Unknown")) {
            output.w(serialDesc, 0, self.origin);
        }
        if (output.g(serialDesc) || self.spreadId != null) {
            output.A(serialDesc, 1, p4e.a, self.spreadId);
        }
        output.p(serialDesc, 2, (xn7) lw7VarArr[2].getValue(), self.patternData);
        output.p(serialDesc, 3, (xn7) lw7VarArr[3].getValue(), self.cards);
        if (!output.g(serialDesc) && self.completedAt == null) {
            return;
        }
        output.A(serialDesc, 4, p4e.a, self.completedAt);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSpreadId() {
        return this.spreadId;
    }

    public final List<PatternData> component3() {
        return this.patternData;
    }

    public final List<TarotCardChoice> component4() {
        return this.cards;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCompletedAt() {
        return this.completedAt;
    }

    public final SerializableDrawBeforeQuestion copy(String origin, String spreadId, List<PatternData> patternData, List<TarotCardChoice> cards, String completedAt) {
        origin.getClass();
        patternData.getClass();
        cards.getClass();
        return new SerializableDrawBeforeQuestion(origin, spreadId, patternData, cards, completedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SerializableDrawBeforeQuestion)) {
            return false;
        }
        SerializableDrawBeforeQuestion serializableDrawBeforeQuestion = (SerializableDrawBeforeQuestion) other;
        return pa7.t(this.origin, serializableDrawBeforeQuestion.origin) && pa7.t(this.spreadId, serializableDrawBeforeQuestion.spreadId) && pa7.t(this.patternData, serializableDrawBeforeQuestion.patternData) && pa7.t(this.cards, serializableDrawBeforeQuestion.cards) && pa7.t(this.completedAt, serializableDrawBeforeQuestion.completedAt);
    }

    public final List<TarotCardChoice> getCards() {
        return this.cards;
    }

    public final String getCompletedAt() {
        return this.completedAt;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final List<PatternData> getPatternData() {
        return this.patternData;
    }

    public final String getSpreadId() {
        return this.spreadId;
    }

    public int hashCode() {
        int iHashCode = this.origin.hashCode() * 31;
        String str = this.spreadId;
        int iA = tec.a(tec.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.patternData), 31, this.cards);
        String str2 = this.completedAt;
        return iA + (str2 != null ? str2.hashCode() : 0);
    }

    public final cm4 toOrigin() {
        Object next;
        mx4 mx4Var = dm4.e;
        mx4Var.getClass();
        l2 l2Var = new l2(0, mx4Var);
        do {
            if (!l2Var.hasNext()) {
                next = null;
                break;
            }
            next = l2Var.next();
        } while (!pa7.t(((dm4) next).name(), this.origin));
        dm4 dm4Var = (dm4) next;
        if (dm4Var == null) {
            dm4Var = dm4.c;
        }
        dm4 dm4Var2 = dm4Var;
        String str = this.spreadId;
        List<PatternData> list = this.patternData;
        List<TarotCardChoice> list2 = this.cards;
        String str2 = this.completedAt;
        return new cm4(dm4Var2, str, list, list2, str2 != null ? Instant.parse(str2) : null);
    }

    public String toString() {
        String str = this.origin;
        String str2 = this.spreadId;
        List<PatternData> list = this.patternData;
        List<TarotCardChoice> list2 = this.cards;
        String str3 = this.completedAt;
        StringBuilder sbO = ib8.o("SerializableDrawBeforeQuestion(origin=", str, ", spreadId=", str2, ", patternData=");
        sbO.append(list);
        sbO.append(", cards=");
        sbO.append(list2);
        sbO.append(", completedAt=");
        return ks0.l(sbO, str3, ")");
    }

    public SerializableDrawBeforeQuestion(String str, String str2, List<PatternData> list, List<TarotCardChoice> list2, String str3) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.origin = str;
        this.spreadId = str2;
        this.patternData = list;
        this.cards = list2;
        this.completedAt = str3;
    }

    public /* synthetic */ SerializableDrawBeforeQuestion(String str, String str2, List list, List list2, String str3, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? "Unknown" : str, (i & 2) != 0 ? null : str2, list, list2, (i & 16) != 0 ? null : str3);
    }
}
