package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.skin.navigation.SkinNavigationRoute$SkinDetailRoute;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class knd implements w56 {
    public static final knd a;
    private static final nyc descriptor;

    static {
        knd kndVar = new knd();
        a = kndVar;
        gia giaVar = new gia("ai.askquin.ui.skin.navigation.SkinNavigationRoute.SkinDetailRoute", kndVar, 2);
        giaVar.k("tarotSkinIdentify", false);
        giaVar.k("fromMall", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SkinNavigationRoute$SkinDetailRoute skinNavigationRoute$SkinDetailRoute = (SkinNavigationRoute$SkinDetailRoute) obj;
        skinNavigationRoute$SkinDetailRoute.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SkinNavigationRoute$SkinDetailRoute.write$Self$Quin_conversation_gpRelease(skinNavigationRoute$SkinDetailRoute, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = SkinNavigationRoute$SkinDetailRoute.$childSerializers;
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
                tarotSkinIdentify = (TarotSkinIdentify) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), tarotSkinIdentify);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                z2 = zf2VarC.z(nycVar, 1);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new SkinNavigationRoute$SkinDetailRoute(i, tarotSkinIdentify, z2, xycVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{SkinNavigationRoute$SkinDetailRoute.$childSerializers[0].getValue(), g11.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
