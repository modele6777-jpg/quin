package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.skin.navigation.SkinNavigationRoute$SkinGraphEntryRoute;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mnd implements w56 {
    public static final mnd a;
    private static final nyc descriptor;

    static {
        mnd mndVar = new mnd();
        a = mndVar;
        gia giaVar = new gia("ai.askquin.ui.skin.navigation.SkinNavigationRoute.SkinGraphEntryRoute", mndVar, 3);
        giaVar.k("fromDeckSelection", true);
        giaVar.k("fromDailyFortune", true);
        giaVar.k("tarotSkinIdentify", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SkinNavigationRoute$SkinGraphEntryRoute skinNavigationRoute$SkinGraphEntryRoute = (SkinNavigationRoute$SkinGraphEntryRoute) obj;
        skinNavigationRoute$SkinGraphEntryRoute.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SkinNavigationRoute$SkinGraphEntryRoute.write$Self$Quin_conversation_gpRelease(skinNavigationRoute$SkinGraphEntryRoute, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = SkinNavigationRoute$SkinGraphEntryRoute.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        TarotSkinIdentify tarotSkinIdentify = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                z2 = zf2VarC.z(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                z3 = zf2VarC.z(nycVar, 1);
                i |= 2;
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                tarotSkinIdentify = (TarotSkinIdentify) zf2VarC.y(nycVar, 2, (xn7) lw7VarArr[2].getValue(), tarotSkinIdentify);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new SkinNavigationRoute$SkinGraphEntryRoute(i, z2, z3, tarotSkinIdentify, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        xn7 xn7VarF = t72.F((xn7) SkinNavigationRoute$SkinGraphEntryRoute.$childSerializers[2].getValue());
        g11 g11Var = g11.a;
        return new xn7[]{g11Var, g11Var, xn7VarF};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
