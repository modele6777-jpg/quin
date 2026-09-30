package defpackage;

import tech.chatmind.api.events.model.ExploreBanner;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u55 implements w56 {
    public static final u55 a;
    private static final nyc descriptor;

    static {
        u55 u55Var = new u55();
        a = u55Var;
        gia giaVar = new gia("tech.chatmind.api.events.model.ExploreBanner", u55Var, 4);
        giaVar.k("title", true);
        giaVar.k("iconUrl", true);
        giaVar.k("link", true);
        giaVar.k("openInBrowser", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        ExploreBanner exploreBanner = (ExploreBanner) obj;
        exploreBanner.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ExploreBanner.write$Self$Quin_core_base_api_release(exploreBanner, ag2VarC, nycVar);
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
        String strO3 = null;
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
            } else if (iJ == 2) {
                strO3 = zf2VarC.o(nycVar, 2);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                z2 = zf2VarC.z(nycVar, 3);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new ExploreBanner(i, strO, strO2, strO3, z2, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, p4eVar, g11.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
