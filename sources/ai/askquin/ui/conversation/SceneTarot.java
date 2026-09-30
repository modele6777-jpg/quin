package ai.askquin.ui.conversation;

import defpackage.ag2;
import defpackage.an1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.g2a;
import defpackage.ks0;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rhe;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.yec;
import defpackage.z18;
import defpackage.z7c;
import defpackage.zec;
import defpackage.zib;
import java.util.List;
import kotlin.Metadata;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBY\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJR\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001cJ\u0010\u0010%\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b/\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b0\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b1\u0010\u001c¨\u00065"}, d2 = {"Lai/askquin/ui/conversation/SceneTarot;", "", "", "pattern", "", "Ltech/chatmind/api/PatternData;", "patternData", "Ltech/chatmind/api/TarotCardChoice;", "choices", "spreadId", "sceneId", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/conversation/SceneTarot;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lai/askquin/ui/conversation/SceneTarot;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPattern", "Ljava/util/List;", "getPatternData", "getChoices", "getSpreadId", "getSceneId", "Companion", "yec", "zec", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class SceneTarot {
    private static final lw7[] $childSerializers;
    public static final int $stable = 0;
    public static final zec Companion = new zec();
    private final List<TarotCardChoice> choices;
    private final String pattern;
    private final List<PatternData> patternData;
    private final String sceneId;
    private final String spreadId;

    static {
        zib zibVar = new zib(28);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{null, eb3.N(z18Var, zibVar), eb3.N(z18Var, new zib(29)), null, null};
    }

    public /* synthetic */ SceneTarot(int i, String str, List list, List list2, String str2, String str3, xyc xycVar) {
        if (7 != (i & 7)) {
            an1.R(i, 7, yec.a.e());
            throw null;
        }
        this.pattern = str;
        this.patternData = list;
        this.choices = list2;
        if ((i & 8) == 0) {
            this.spreadId = null;
        } else {
            this.spreadId = str2;
        }
        if ((i & 16) == 0) {
            this.sceneId = null;
        } else {
            this.sceneId = str3;
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
    public static /* synthetic */ SceneTarot copy$default(SceneTarot sceneTarot, String str, List list, List list2, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sceneTarot.pattern;
        }
        if ((i & 2) != 0) {
            list = sceneTarot.patternData;
        }
        if ((i & 4) != 0) {
            list2 = sceneTarot.choices;
        }
        if ((i & 8) != 0) {
            str2 = sceneTarot.spreadId;
        }
        if ((i & 16) != 0) {
            str3 = sceneTarot.sceneId;
        }
        String str4 = str3;
        List list3 = list2;
        return sceneTarot.copy(str, list, list3, str2, str4);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(SceneTarot self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.w(serialDesc, 0, self.pattern);
        output.p(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.patternData);
        output.p(serialDesc, 2, (xn7) lw7VarArr[2].getValue(), self.choices);
        if (output.g(serialDesc) || self.spreadId != null) {
            output.A(serialDesc, 3, p4e.a, self.spreadId);
        }
        if (!output.g(serialDesc) && self.sceneId == null) {
            return;
        }
        output.A(serialDesc, 4, p4e.a, self.sceneId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPattern() {
        return this.pattern;
    }

    public final List<PatternData> component2() {
        return this.patternData;
    }

    public final List<TarotCardChoice> component3() {
        return this.choices;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSpreadId() {
        return this.spreadId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSceneId() {
        return this.sceneId;
    }

    public final SceneTarot copy(String pattern, List<PatternData> patternData, List<TarotCardChoice> choices, String spreadId, String sceneId) {
        pattern.getClass();
        patternData.getClass();
        choices.getClass();
        return new SceneTarot(pattern, patternData, choices, spreadId, sceneId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SceneTarot)) {
            return false;
        }
        SceneTarot sceneTarot = (SceneTarot) other;
        return pa7.t(this.pattern, sceneTarot.pattern) && pa7.t(this.patternData, sceneTarot.patternData) && pa7.t(this.choices, sceneTarot.choices) && pa7.t(this.spreadId, sceneTarot.spreadId) && pa7.t(this.sceneId, sceneTarot.sceneId);
    }

    public final List<TarotCardChoice> getChoices() {
        return this.choices;
    }

    public final String getPattern() {
        return this.pattern;
    }

    public final List<PatternData> getPatternData() {
        return this.patternData;
    }

    public final String getSceneId() {
        return this.sceneId;
    }

    public final String getSpreadId() {
        return this.spreadId;
    }

    public int hashCode() {
        int iA = tec.a(tec.a(this.pattern.hashCode() * 31, 31, this.patternData), 31, this.choices);
        String str = this.spreadId;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sceneId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.pattern;
        List<PatternData> list = this.patternData;
        List<TarotCardChoice> list2 = this.choices;
        String str2 = this.spreadId;
        String str3 = this.sceneId;
        StringBuilder sb = new StringBuilder("SceneTarot(pattern=");
        sb.append(str);
        sb.append(", patternData=");
        sb.append(list);
        sb.append(", choices=");
        sb.append(list2);
        sb.append(", spreadId=");
        sb.append(str2);
        sb.append(", sceneId=");
        return ks0.l(sb, str3, ")");
    }

    public SceneTarot(String str, List<PatternData> list, List<TarotCardChoice> list2, String str2, String str3) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.pattern = str;
        this.patternData = list;
        this.choices = list2;
        this.spreadId = str2;
        this.sceneId = str3;
    }

    public /* synthetic */ SceneTarot(String str, List list, List list2, String str2, String str3, int i, rp3 rp3Var) {
        this(str, list, list2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
