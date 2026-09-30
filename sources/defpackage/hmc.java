package defpackage;

import ai.askquin.ui.seasonal.SeasonalLoadingRoute;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hmc implements w56 {
    public static final hmc a;
    private static final nyc descriptor;

    static {
        hmc hmcVar = new hmc();
        a = hmcVar;
        gia giaVar = new gia("ai.askquin.ui.seasonal.SeasonalLoadingRoute", hmcVar, 4);
        giaVar.k("year", false);
        giaVar.k("solarTerm", false);
        giaVar.k("analyticsEnabled", false);
        giaVar.k("resume", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SeasonalLoadingRoute seasonalLoadingRoute = (SeasonalLoadingRoute) obj;
        seasonalLoadingRoute.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SeasonalLoadingRoute.write$Self$Quin_conversation_gpRelease(seasonalLoadingRoute, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        int iT = 0;
        boolean z2 = false;
        boolean z3 = false;
        String strO = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                iT = zf2VarC.t(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                strO = zf2VarC.o(nycVar, 1);
                i |= 2;
            } else if (iJ == 2) {
                z2 = zf2VarC.z(nycVar, 2);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                z3 = zf2VarC.z(nycVar, 3);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new SeasonalLoadingRoute(i, iT, strO, z2, z3, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        g11 g11Var = g11.a;
        return new xn7[]{c77.a, p4e.a, g11Var, g11Var};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
