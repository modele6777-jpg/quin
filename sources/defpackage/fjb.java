package defpackage;

import tech.chatmind.api.RecommendQuestion;
import tech.chatmind.api.RecommendQuestionType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fjb implements w56 {
    public static final fjb a;
    private static final nyc descriptor;

    static {
        fjb fjbVar = new fjb();
        a = fjbVar;
        gia giaVar = new gia("tech.chatmind.api.RecommendQuestion", fjbVar, 2);
        giaVar.k("type", true);
        giaVar.k("text", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        RecommendQuestion recommendQuestion = (RecommendQuestion) obj;
        recommendQuestion.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        RecommendQuestion.write$Self$Quin_core_base_api_release(recommendQuestion, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        RecommendQuestionType recommendQuestionType = null;
        String strO = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                recommendQuestionType = (RecommendQuestionType) zf2VarC.s(nycVar, 0, ijb.a, recommendQuestionType);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                strO = zf2VarC.o(nycVar, 1);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new RecommendQuestion(i, recommendQuestionType, strO, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{ijb.a, p4e.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
