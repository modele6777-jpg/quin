package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tech.chatmind.api.RecommendQuestion;
import tech.chatmind.api.RecommendQuestionType;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gp5 {
    public static final fp5 j = new fp5();
    public static final List k = t72.I("new_not_started", "new_in_progress", "new_completed", "new_deleted", "extra_pending", "extra_skipping", "extra_drawing", "extra_failed", "extra_usage_blocked", "extra_ignored", "extra_interpreting", "extra_completed", "extra_stale", "input_hidden", "input_restored", "extra_wheel", "extra_result", "recommend_three", "recommend_two", "recommend_existing_follow_up");
    public static final TarotCardChoice l = new TarotCardChoice(TarotCardType.THE_MOON, false, (String) null, 4, (rp3) null);
    public static final List m = t72.I(new RecommendQuestion(RecommendQuestionType.CURRENT_STATE, "What is shaping the situation right now?"), new RecommendQuestion(RecommendQuestionType.WHATS_NEXT, "What is most likely to happen next?"), new RecommendQuestion(RecommendQuestionType.WHAT_TO_DO, "What action would help me most?"));
    public final List a;
    public final List b;
    public final boolean c;
    public final String d;
    public final Set e;
    public final Set f;
    public final Set g;
    public final Map h;
    public final Map i;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ gp5(List list, List list2, Set set, Map map, Map map2, int i) {
        List list3 = (i & 2) != 0 ? pu4.a : list2;
        boolean z = (i & 4) == 0;
        int i2 = i & 32;
        xu4 xu4Var = xu4.a;
        Set set2 = i2 != 0 ? xu4Var : set;
        int i3 = i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        qu4 qu4Var = qu4.a;
        this(list, list3, z, null, xu4Var, set2, xu4Var, i3 != 0 ? qu4Var : map, (i & 256) != 0 ? qu4Var : map2);
    }

    public static gp5 a(gp5 gp5Var, Set set, Set set2, int i) {
        List list = gp5Var.a;
        List list2 = gp5Var.b;
        boolean z = gp5Var.c;
        String str = (i & 8) != 0 ? gp5Var.d : "qa-child-reading";
        if ((i & 16) != 0) {
            set = gp5Var.e;
        }
        Set set3 = set;
        Set set4 = gp5Var.f;
        if ((i & 64) != 0) {
            set2 = gp5Var.g;
        }
        Set set5 = set2;
        Map map = gp5Var.h;
        Map map2 = gp5Var.i;
        list.getClass();
        list2.getClass();
        set3.getClass();
        set4.getClass();
        set5.getClass();
        map.getClass();
        map2.getClass();
        return new gp5(list, list2, z, str, set3, set4, set5, map, map2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp5)) {
            return false;
        }
        gp5 gp5Var = (gp5) obj;
        return pa7.t(this.a, gp5Var.a) && pa7.t(this.b, gp5Var.b) && this.c == gp5Var.c && pa7.t(this.d, gp5Var.d) && pa7.t(this.e, gp5Var.e) && pa7.t(this.f, gp5Var.f) && pa7.t(this.g, gp5Var.g) && pa7.t(this.h, gp5Var.h) && pa7.t(this.i, gp5Var.i);
    }

    public final int hashCode() {
        int iD = ub3.d(tec.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.i.hashCode() + ib8.c(this.h, (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "FollowUpQaFixture(messages=" + this.a + ", recommendedFollowUps=" + this.b + ", resetReadingHost=" + this.c + ", deletedChildReadingId=" + this.d + ", skipLoadingRequestIds=" + this.e + ", drawLoadingRequestIds=" + this.f + ", drawingRequestIds=" + this.g + ", failedDraws=" + this.h + ", pendingSelections=" + this.i + ")";
    }

    public gp5(List list, List list2, boolean z, String str, Set set, Set set2, Set set3, Map map, Map map2) {
        list2.getClass();
        set2.getClass();
        map.getClass();
        map2.getClass();
        this.a = list;
        this.b = list2;
        this.c = z;
        this.d = str;
        this.e = set;
        this.f = set2;
        this.g = set3;
        this.h = map;
        this.i = map2;
    }
}
