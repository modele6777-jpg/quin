package defpackage;

import ai.askquin.ui.draw.photo.homepage.SpreadInfoInputRoute;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class awd implements w56 {
    public static final awd a;
    private static final nyc descriptor;

    static {
        awd awdVar = new awd();
        a = awdVar;
        gia giaVar = new gia("ai.askquin.ui.draw.photo.homepage.SpreadInfoInputRoute", awdVar, 3);
        giaVar.k("cards", false);
        giaVar.k("initialMeanings", true);
        giaVar.k("editIndex", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SpreadInfoInputRoute spreadInfoInputRoute = (SpreadInfoInputRoute) obj;
        spreadInfoInputRoute.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SpreadInfoInputRoute.write$Self$Quin_conversation_gpRelease(spreadInfoInputRoute, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = SpreadInfoInputRoute.$childSerializers;
        boolean z = true;
        int i = 0;
        int iT = 0;
        List list = null;
        List list2 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                list = (List) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), list);
                i |= 1;
            } else if (iJ == 1) {
                list2 = (List) zf2VarC.s(nycVar, 1, (xn7) lw7VarArr[1].getValue(), list2);
                i |= 2;
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                iT = zf2VarC.t(nycVar, 2);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new SpreadInfoInputRoute(i, list, list2, iT, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = SpreadInfoInputRoute.$childSerializers;
        return new xn7[]{lw7VarArr[0].getValue(), lw7VarArr[1].getValue(), c77.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
