package defpackage;

import ai.askquin.ui.draw.navhost.CardPickerRoute;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hs1 implements w56 {
    public static final hs1 a;
    private static final nyc descriptor;

    static {
        hs1 hs1Var = new hs1();
        a = hs1Var;
        gia giaVar = new gia("ai.askquin.ui.draw.navhost.CardPickerRoute", hs1Var, 4);
        giaVar.k("limitation", false);
        giaVar.k("selectedTarotCards", false);
        giaVar.k("singleSelectMode", true);
        giaVar.k("targetSlotIndex", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        CardPickerRoute cardPickerRoute = (CardPickerRoute) obj;
        cardPickerRoute.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        CardPickerRoute.write$Self$Quin_conversation_gpRelease(cardPickerRoute, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = CardPickerRoute.$childSerializers;
        boolean z = true;
        int i = 0;
        int iT = 0;
        boolean z2 = false;
        int iT2 = 0;
        List list = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                iT = zf2VarC.t(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                list = (List) zf2VarC.s(nycVar, 1, (xn7) lw7VarArr[1].getValue(), list);
                i |= 2;
            } else if (iJ == 2) {
                z2 = zf2VarC.z(nycVar, 2);
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
        return new CardPickerRoute(i, iT, list, z2, iT2, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = CardPickerRoute.$childSerializers;
        c77 c77Var = c77.a;
        return new xn7[]{c77Var, lw7VarArr[1].getValue(), g11.a, c77Var};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
