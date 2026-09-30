package defpackage;

import tech.chatmind.api.personality.model.PersonalityAnalysisQuestion;
import tech.chatmind.api.personality.model.UserDecision;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kaa implements w56 {
    public static final kaa a;
    private static final nyc descriptor;

    static {
        kaa kaaVar = new kaa();
        a = kaaVar;
        gia giaVar = new gia("tech.chatmind.api.personality.model.PersonalityAnalysisQuestion", kaaVar, 2);
        giaVar.k("question", false);
        giaVar.k("userDecision", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        PersonalityAnalysisQuestion personalityAnalysisQuestion = (PersonalityAnalysisQuestion) obj;
        personalityAnalysisQuestion.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        PersonalityAnalysisQuestion.write$Self$Quin_core_base_api_release(personalityAnalysisQuestion, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        String strO = null;
        UserDecision userDecision = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                userDecision = (UserDecision) zf2VarC.y(nycVar, 1, smf.a, userDecision);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new PersonalityAnalysisQuestion(i, strO, userDecision, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{p4e.a, t72.F(smf.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
