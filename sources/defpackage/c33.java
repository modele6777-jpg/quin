package defpackage;

import ai.askquin.ui.dailycard.DailyCardDrawRoute;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c33 implements w56 {
    public static final c33 a;
    private static final nyc descriptor;

    static {
        c33 c33Var = new c33();
        a = c33Var;
        gia giaVar = new gia("ai.askquin.ui.dailycard.DailyCardDrawRoute", c33Var, 3);
        giaVar.k("date", false);
        giaVar.k("segmentId", false);
        giaVar.k("isTomorrow", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        DailyCardDrawRoute dailyCardDrawRoute = (DailyCardDrawRoute) obj;
        dailyCardDrawRoute.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        DailyCardDrawRoute.write$Self$Quin_conversation_gpRelease(dailyCardDrawRoute, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String strO = null;
        String strO2 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                strO2 = zf2VarC.o(nycVar, 1);
                i |= 2;
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                z2 = zf2VarC.z(nycVar, 2);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new DailyCardDrawRoute(i, strO, strO2, z2, null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, g11.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
