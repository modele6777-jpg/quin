package defpackage;

import ai.askquin.ui.personality.navigation.PersonalityRoutes$AnalysisQuestionRoute;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tba implements w56 {
    public static final tba a;
    private static final nyc descriptor;

    static {
        tba tbaVar = new tba();
        a = tbaVar;
        gia giaVar = new gia("ai.askquin.ui.personality.navigation.PersonalityRoutes.AnalysisQuestionRoute", tbaVar, 1);
        giaVar.k("testId", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        PersonalityRoutes$AnalysisQuestionRoute personalityRoutes$AnalysisQuestionRoute = (PersonalityRoutes$AnalysisQuestionRoute) obj;
        personalityRoutes$AnalysisQuestionRoute.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ag2VarC.w(nycVar, 0, personalityRoutes$AnalysisQuestionRoute.testId);
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
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else {
                if (iJ != 0) {
                    s8f.f(iJ);
                    return null;
                }
                strO = zf2VarC.o(nycVar, 0);
                i = 1;
            }
        }
        zf2VarC.b(nycVar);
        return new PersonalityRoutes$AnalysisQuestionRoute(i, strO, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{p4e.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
