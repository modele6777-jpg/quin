package defpackage;

import ai.askquin.ui.quickdecision.QuickDecisionDetailRoute;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o6b implements w56 {
    public static final o6b a;
    private static final nyc descriptor;

    static {
        o6b o6bVar = new o6b();
        a = o6bVar;
        gia giaVar = new gia("ai.askquin.ui.quickdecision.QuickDecisionDetailRoute", o6bVar, 2);
        giaVar.k("id", false);
        giaVar.k("source", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        QuickDecisionDetailRoute quickDecisionDetailRoute = (QuickDecisionDetailRoute) obj;
        quickDecisionDetailRoute.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        QuickDecisionDetailRoute.write$Self$Quin_conversation_gpRelease(quickDecisionDetailRoute, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        int i = 0;
        long jD = 0;
        String str = null;
        boolean z = true;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                jD = zf2VarC.D(nycVar, 0);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                str = (String) zf2VarC.y(nycVar, 1, p4e.a, str);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new QuickDecisionDetailRoute(i, jD, str, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{eg8.a, t72.F(p4e.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
