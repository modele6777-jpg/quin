package defpackage;

import ai.askquin.ui.fourseasons.FourSeasonsEntry;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rs5 implements w56 {
    public static final rs5 a;
    private static final nyc descriptor;

    static {
        rs5 rs5Var = new rs5();
        a = rs5Var;
        gia giaVar = new gia("ai.askquin.ui.fourseasons.FourSeasonsEntry", rs5Var, 3);
        giaVar.k("year", false);
        giaVar.k("solarTerm", false);
        giaVar.k("source", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        FourSeasonsEntry fourSeasonsEntry = (FourSeasonsEntry) obj;
        fourSeasonsEntry.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        FourSeasonsEntry.write$Self$Quin_conversation_gpRelease(fourSeasonsEntry, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        int iT = 0;
        String strO = null;
        String strO2 = null;
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
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                strO2 = zf2VarC.o(nycVar, 2);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new FourSeasonsEntry(i, iT, strO, strO2, null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{c77.a, p4eVar, p4eVar};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
