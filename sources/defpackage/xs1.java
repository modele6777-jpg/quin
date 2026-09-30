package defpackage;

import ai.askquin.ui.draw.photo.homepage.CardPositionConfig;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xs1 implements w56 {
    public static final xs1 a;
    private static final nyc descriptor;

    static {
        xs1 xs1Var = new xs1();
        a = xs1Var;
        gia giaVar = new gia("ai.askquin.ui.draw.photo.homepage.CardPositionConfig", xs1Var, 6);
        giaVar.k("x", false);
        giaVar.k("y", false);
        giaVar.k("width", false);
        giaVar.k("height", false);
        giaVar.k("rotation", true);
        giaVar.k("zIndex", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        CardPositionConfig cardPositionConfig = (CardPositionConfig) obj;
        cardPositionConfig.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        CardPositionConfig.write$Self$Quin_conversation_gpRelease(cardPositionConfig, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        int i = 0;
        float fI = 0.0f;
        float fI2 = 0.0f;
        float fI3 = 0.0f;
        float fI4 = 0.0f;
        float fI5 = 0.0f;
        Integer num = null;
        boolean z = true;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    break;
                case 0:
                    fI = zf2VarC.i(nycVar, 0);
                    i |= 1;
                    break;
                case 1:
                    fI2 = zf2VarC.i(nycVar, 1);
                    i |= 2;
                    break;
                case 2:
                    fI3 = zf2VarC.i(nycVar, 2);
                    i |= 4;
                    break;
                case 3:
                    fI4 = zf2VarC.i(nycVar, 3);
                    i |= 8;
                    break;
                case 4:
                    fI5 = zf2VarC.i(nycVar, 4);
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) zf2VarC.y(nycVar, 5, c77.a, num);
                    i |= 32;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new CardPositionConfig(i, fI, fI2, fI3, fI4, fI5, num, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        xn7 xn7VarF = t72.F(c77.a);
        rj5 rj5Var = rj5.a;
        return new xn7[]{rj5Var, rj5Var, rj5Var, rj5Var, rj5Var, xn7VarF};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
