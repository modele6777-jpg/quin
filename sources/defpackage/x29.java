package defpackage;

import tech.chatmind.api.annual.model.MonthlySummary;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x29 implements w56 {
    public static final x29 a;
    private static final nyc descriptor;

    static {
        x29 x29Var = new x29();
        a = x29Var;
        gia giaVar = new gia("tech.chatmind.api.annual.model.MonthlySummary", x29Var, 3);
        giaVar.k("content", false);
        giaVar.k("highlight", false);
        giaVar.k("score", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        MonthlySummary monthlySummary = (MonthlySummary) obj;
        monthlySummary.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        MonthlySummary.write$Self$Quin_core_base_api_release(monthlySummary, ag2VarC, nycVar);
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
                iT = zf2VarC.t(nycVar, 2);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new MonthlySummary(i, strO, strO2, iT, null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, c77.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
