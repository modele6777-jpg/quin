package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.explore.skin.navigation.ExploreTarotRoute$Detail;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p65 implements w56 {
    public static final p65 a;
    private static final nyc descriptor;

    static {
        p65 p65Var = new p65();
        a = p65Var;
        gia giaVar = new gia("ai.askquin.ui.explore.skin.navigation.ExploreTarotRoute.Detail", p65Var, 4);
        giaVar.k("skin", false);
        giaVar.k("cardKey", false);
        giaVar.k("orientation", true);
        giaVar.k("themeColorArgb", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        ExploreTarotRoute$Detail exploreTarotRoute$Detail = (ExploreTarotRoute$Detail) obj;
        exploreTarotRoute$Detail.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ExploreTarotRoute$Detail.write$Self$Quin_conversation_gpRelease(exploreTarotRoute$Detail, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = ExploreTarotRoute$Detail.$childSerializers;
        boolean z = true;
        int i = 0;
        int iT = 0;
        int iT2 = 0;
        TarotSkinIdentify tarotSkinIdentify = null;
        String strO = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                tarotSkinIdentify = (TarotSkinIdentify) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), tarotSkinIdentify);
                i |= 1;
            } else if (iJ == 1) {
                strO = zf2VarC.o(nycVar, 1);
                i |= 2;
            } else if (iJ == 2) {
                iT = zf2VarC.t(nycVar, 2);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                iT2 = zf2VarC.t(nycVar, 3);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new ExploreTarotRoute$Detail(i, tarotSkinIdentify, strO, iT, iT2, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        c77 c77Var = c77.a;
        return new xn7[]{ExploreTarotRoute$Detail.$childSerializers[0].getValue(), p4e.a, c77Var, c77Var};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
