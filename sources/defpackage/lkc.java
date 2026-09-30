package defpackage;

import tech.chatmind.api.seasonal.model.SeasonalElementGuides;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lkc implements w56 {
    public static final lkc a;
    private static final nyc descriptor;

    static {
        lkc lkcVar = new lkc();
        a = lkcVar;
        gia giaVar = new gia("tech.chatmind.api.seasonal.model.SeasonalElementGuides", lkcVar, 4);
        giaVar.k("wands", true);
        giaVar.k("cups", true);
        giaVar.k("swords", true);
        giaVar.k("pentacles", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SeasonalElementGuides seasonalElementGuides = (SeasonalElementGuides) obj;
        seasonalElementGuides.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SeasonalElementGuides.write$Self$Quin_core_base_api_release(seasonalElementGuides, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                str = (String) zf2VarC.y(nycVar, 0, p4e.a, str);
                i |= 1;
            } else if (iJ == 1) {
                str2 = (String) zf2VarC.y(nycVar, 1, p4e.a, str2);
                i |= 2;
            } else if (iJ == 2) {
                str3 = (String) zf2VarC.y(nycVar, 2, p4e.a, str3);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                str4 = (String) zf2VarC.y(nycVar, 3, p4e.a, str4);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new SeasonalElementGuides(i, str, str2, str3, str4, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{t72.F(p4eVar), t72.F(p4eVar), t72.F(p4eVar), t72.F(p4eVar)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
