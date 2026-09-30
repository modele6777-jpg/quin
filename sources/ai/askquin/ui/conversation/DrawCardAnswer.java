package ai.askquin.ui.conversation;

import defpackage.ag2;
import defpackage.an1;
import defpackage.c77;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.g2a;
import defpackage.jm4;
import defpackage.km4;
import defpackage.ks0;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.rhe;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.v74;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J@\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b*\u0010\u0019¨\u0006."}, d2 = {"Lai/askquin/ui/conversation/DrawCardAnswer;", "", "", "Ltech/chatmind/api/PatternData;", "patterns", "Ltech/chatmind/api/TarotCardChoice;", "ans", "", "drawnIndexes", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/conversation/DrawCardAnswer;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lai/askquin/ui/conversation/DrawCardAnswer;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPatterns", "getAns", "getDrawnIndexes", "Companion", "jm4", "km4", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class DrawCardAnswer {
    private static final lw7[] $childSerializers;
    public static final int $stable = 0;
    public static final km4 Companion = new km4();
    private final List<TarotCardChoice> ans;
    private final List<Integer> drawnIndexes;
    private final List<PatternData> patterns;

    static {
        v74 v74Var = new v74(11);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{eb3.N(z18Var, v74Var), eb3.N(z18Var, new v74(12)), eb3.N(z18Var, new v74(13))};
    }

    public /* synthetic */ DrawCardAnswer(int i, List list, List list2, List list3, xyc xycVar) {
        if (3 != (i & 3)) {
            an1.R(i, 3, jm4.a.e());
            throw null;
        }
        this.patterns = list;
        this.ans = list2;
        if ((i & 4) == 0) {
            this.drawnIndexes = pu4.a;
        } else {
            this.drawnIndexes = list3;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$1() {
        return new dd0(c77.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DrawCardAnswer copy$default(DrawCardAnswer drawCardAnswer, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = drawCardAnswer.patterns;
        }
        if ((i & 2) != 0) {
            list2 = drawCardAnswer.ans;
        }
        if ((i & 4) != 0) {
            list3 = drawCardAnswer.drawnIndexes;
        }
        return drawCardAnswer.copy(list, list2, list3);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(DrawCardAnswer self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.p(serialDesc, 0, (xn7) lw7VarArr[0].getValue(), self.patterns);
        output.p(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.ans);
        if (!output.g(serialDesc) && pa7.t(self.drawnIndexes, pu4.a)) {
            return;
        }
        output.p(serialDesc, 2, (xn7) lw7VarArr[2].getValue(), self.drawnIndexes);
    }

    public final List<PatternData> component1() {
        return this.patterns;
    }

    public final List<TarotCardChoice> component2() {
        return this.ans;
    }

    public final List<Integer> component3() {
        return this.drawnIndexes;
    }

    public final DrawCardAnswer copy(List<PatternData> patterns, List<TarotCardChoice> ans, List<Integer> drawnIndexes) {
        patterns.getClass();
        ans.getClass();
        drawnIndexes.getClass();
        return new DrawCardAnswer(patterns, ans, drawnIndexes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawCardAnswer)) {
            return false;
        }
        DrawCardAnswer drawCardAnswer = (DrawCardAnswer) other;
        return pa7.t(this.patterns, drawCardAnswer.patterns) && pa7.t(this.ans, drawCardAnswer.ans) && pa7.t(this.drawnIndexes, drawCardAnswer.drawnIndexes);
    }

    public final List<TarotCardChoice> getAns() {
        return this.ans;
    }

    public final List<Integer> getDrawnIndexes() {
        return this.drawnIndexes;
    }

    public final List<PatternData> getPatterns() {
        return this.patterns;
    }

    public int hashCode() {
        return this.drawnIndexes.hashCode() + tec.a(this.patterns.hashCode() * 31, 31, this.ans);
    }

    public String toString() {
        List<PatternData> list = this.patterns;
        List<TarotCardChoice> list2 = this.ans;
        List<Integer> list3 = this.drawnIndexes;
        StringBuilder sb = new StringBuilder("DrawCardAnswer(patterns=");
        sb.append(list);
        sb.append(", ans=");
        sb.append(list2);
        sb.append(", drawnIndexes=");
        return ks0.n(sb, list3, ")");
    }

    public DrawCardAnswer(List<PatternData> list, List<TarotCardChoice> list2, List<Integer> list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.patterns = list;
        this.ans = list2;
        this.drawnIndexes = list3;
    }

    public /* synthetic */ DrawCardAnswer(List list, List list2, List list3, int i, rp3 rp3Var) {
        this(list, list2, (i & 4) != 0 ? pu4.a : list3);
    }
}
