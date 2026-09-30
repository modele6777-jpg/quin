package defpackage;

import ai.askquin.ui.draw.photo.homepage.CardLayoutConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hr1 implements w56 {
    public static final hr1 a;
    private static final nyc descriptor;

    static {
        hr1 hr1Var = new hr1();
        a = hr1Var;
        gia giaVar = new gia("ai.askquin.ui.draw.photo.homepage.CardLayoutConfig", hr1Var, 4);
        giaVar.k("cardCount", false);
        giaVar.k("containerWidth", false);
        giaVar.k("containerHeight", false);
        giaVar.k("positions", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        CardLayoutConfig cardLayoutConfig = (CardLayoutConfig) obj;
        cardLayoutConfig.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        CardLayoutConfig.write$Self$Quin_conversation_gpRelease(cardLayoutConfig, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = CardLayoutConfig.$childSerializers;
        int i = 0;
        int iT = 0;
        float fI = 0.0f;
        float fI2 = 0.0f;
        List list = null;
        boolean z = true;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                iT = zf2VarC.t(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                fI = zf2VarC.i(nycVar, 1);
                i |= 2;
            } else if (iJ == 2) {
                fI2 = zf2VarC.i(nycVar, 2);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                list = (List) zf2VarC.s(nycVar, 3, (xn7) lw7VarArr[3].getValue(), list);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new CardLayoutConfig(i, iT, fI, fI2, list, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = CardLayoutConfig.$childSerializers;
        rj5 rj5Var = rj5.a;
        return new xn7[]{c77.a, rj5Var, rj5Var, lw7VarArr[3].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
