package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.skin.navigation.SkinNavigationRoute$SkinMallRoute;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pnd implements w56 {
    public static final pnd a;
    private static final nyc descriptor;

    static {
        pnd pndVar = new pnd();
        a = pndVar;
        gia giaVar = new gia("ai.askquin.ui.skin.navigation.SkinNavigationRoute.SkinMallRoute", pndVar, 2);
        giaVar.k("isPurchased", true);
        giaVar.k("tarotSkinIdentify", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SkinNavigationRoute$SkinMallRoute skinNavigationRoute$SkinMallRoute = (SkinNavigationRoute$SkinMallRoute) obj;
        skinNavigationRoute$SkinMallRoute.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SkinNavigationRoute$SkinMallRoute.write$Self$Quin_conversation_gpRelease(skinNavigationRoute$SkinMallRoute, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = SkinNavigationRoute$SkinMallRoute.$childSerializers;
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        TarotSkinIdentify tarotSkinIdentify = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                z2 = zf2VarC.z(nycVar, 0);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                tarotSkinIdentify = (TarotSkinIdentify) zf2VarC.y(nycVar, 1, (xn7) lw7VarArr[1].getValue(), tarotSkinIdentify);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new SkinNavigationRoute$SkinMallRoute(i, z2, tarotSkinIdentify, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{g11.a, t72.F((xn7) SkinNavigationRoute$SkinMallRoute.$childSerializers[1].getValue())};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
