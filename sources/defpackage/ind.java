package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.skin.navigation.SkinNavigationRoute$AllCardBySkinRoute;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ind implements w56 {
    public static final ind a;
    private static final nyc descriptor;

    static {
        ind indVar = new ind();
        a = indVar;
        gia giaVar = new gia("ai.askquin.ui.skin.navigation.SkinNavigationRoute.AllCardBySkinRoute", indVar, 1);
        giaVar.k("tarotSkinIdentify", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SkinNavigationRoute$AllCardBySkinRoute skinNavigationRoute$AllCardBySkinRoute = (SkinNavigationRoute$AllCardBySkinRoute) obj;
        skinNavigationRoute$AllCardBySkinRoute.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ag2VarC.p(nycVar, 0, (xn7) SkinNavigationRoute$AllCardBySkinRoute.$childSerializers[0].getValue(), skinNavigationRoute$AllCardBySkinRoute.tarotSkinIdentify);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = SkinNavigationRoute$AllCardBySkinRoute.$childSerializers;
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        TarotSkinIdentify tarotSkinIdentify = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else {
                if (iJ != 0) {
                    s8f.f(iJ);
                    return null;
                }
                tarotSkinIdentify = (TarotSkinIdentify) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), tarotSkinIdentify);
                i = 1;
            }
        }
        zf2VarC.b(nycVar);
        return new SkinNavigationRoute$AllCardBySkinRoute(i, tarotSkinIdentify, xycVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{SkinNavigationRoute$AllCardBySkinRoute.$childSerializers[0].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
