package ai.askquin.ui.router;

import defpackage.ag2;
import defpackage.c77;
import defpackage.ev4;
import defpackage.g11;
import defpackage.gia;
import defpackage.nyc;
import defpackage.om3;
import defpackage.p4e;
import defpackage.s8f;
import defpackage.w56;
import defpackage.xn7;
import defpackage.zf2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements w56 {
    public static final l a;
    private static final nyc descriptor;

    static {
        l lVar = new l();
        a = lVar;
        gia giaVar = new gia("ai.askquin.ui.router.AppRoute.StoryRoute", lVar, 4);
        giaVar.k("sid", false);
        giaVar.k("title", false);
        giaVar.k("likes", false);
        giaVar.k("hasLiked", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        AppRoute.StoryRoute storyRoute = (AppRoute.StoryRoute) obj;
        storyRoute.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        AppRoute.StoryRoute.write$Self$Quin_conversation_gpRelease(storyRoute, ag2VarC, nycVar);
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
            } else if (iJ == 2) {
                iT = zf2VarC.t(nycVar, 2);
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
        return new AppRoute.StoryRoute(i, strO, strO2, iT, z2, null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, c77.a, g11.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
