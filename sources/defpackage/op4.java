package defpackage;

import ai.askquin.ui.draw.photo.homepage.DrawnCardsConfirmRoute;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class op4 implements w56 {
    public static final op4 a;
    private static final nyc descriptor;

    static {
        op4 op4Var = new op4();
        a = op4Var;
        gia giaVar = new gia("ai.askquin.ui.draw.photo.homepage.DrawnCardsConfirmRoute", op4Var, 2);
        giaVar.k("cards", false);
        giaVar.k("meanings", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        DrawnCardsConfirmRoute drawnCardsConfirmRoute = (DrawnCardsConfirmRoute) obj;
        drawnCardsConfirmRoute.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        DrawnCardsConfirmRoute.write$Self$Quin_conversation_gpRelease(drawnCardsConfirmRoute, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = DrawnCardsConfirmRoute.$childSerializers;
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                list = (List) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                list2 = (List) zf2VarC.s(nycVar, 1, (xn7) lw7VarArr[1].getValue(), list2);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new DrawnCardsConfirmRoute(i, list, list2, xycVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = DrawnCardsConfirmRoute.$childSerializers;
        return new xn7[]{lw7VarArr[0].getValue(), lw7VarArr[1].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
