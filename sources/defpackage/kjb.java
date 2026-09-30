package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import tech.chatmind.api.RecommendQuestion;
import tech.chatmind.api.RecommendQuestionsResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kjb implements xn7 {
    public static final kjb a = new kjb();
    public static final dd0 b = t72.l(RecommendQuestion.Companion.serializer());
    public static final pyc c;

    static {
        nyc[] nycVarArr = new nyc[0];
        if (v4e.Q("RecommendQuestionsResponse")) {
            qc0.j("Blank serial names are prohibited");
            return;
        }
        q22 q22Var = new q22("RecommendQuestionsResponse");
        q22Var.a("questions", (zc0) b.c, (12 & 8) == 0);
        c = new pyc("RecommendQuestionsResponse", g5e.c, q22Var.c.size(), qd0.G0(nycVarArr), q22Var);
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        RecommendQuestionsResponse recommendQuestionsResponse = (RecommendQuestionsResponse) obj;
        recommendQuestionsResponse.getClass();
        sh7 sh7Var = (sh7) ev4Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        sh7Var.z(new ti7(linkedHashMap));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [pu4] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        RecommendQuestion recommendQuestion;
        jh7 jh7Var = (jh7) om3Var;
        nh7 nh7VarM = jh7Var.m();
        ?? r1 = 0;
        ?? r2 = 0;
        ?? r3 = 0;
        ti7 ti7Var = nh7VarM instanceof ti7 ? (ti7) nh7VarM : null;
        if (ti7Var == null) {
            return new RecommendQuestionsResponse(r3 == true ? 1 : 0, 1, r2 == true ? 1 : 0);
        }
        Object obj = ti7Var.get("questions");
        yg7 yg7Var = obj instanceof yg7 ? (yg7) obj : null;
        if (yg7Var != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = yg7Var.a.iterator();
            while (it.hasNext()) {
                try {
                    recommendQuestion = (RecommendQuestion) jh7Var.d().a(RecommendQuestion.Companion.serializer(), (nh7) it.next());
                } catch (yyc unused) {
                    recommendQuestion = null;
                }
                if (recommendQuestion != null) {
                    arrayList.add(recommendQuestion);
                }
            }
            r1 = arrayList;
        }
        if (r1 == 0) {
            r1 = pu4.a;
        }
        return new RecommendQuestionsResponse(r1);
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return c;
    }
}
