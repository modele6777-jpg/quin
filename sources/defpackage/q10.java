package defpackage;

import ai.askquin.ui.annual.AnnualDrawingRoute;
import ai.askquin.ui.annual.model.AnnualActionFor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q10 implements w56 {
    public static final q10 a;
    private static final nyc descriptor;

    static {
        q10 q10Var = new q10();
        a = q10Var;
        gia giaVar = new gia("ai.askquin.ui.annual.AnnualDrawingRoute", q10Var, 2);
        giaVar.k("actionFor", false);
        giaVar.k("resumeFromIndex", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        AnnualDrawingRoute annualDrawingRoute = (AnnualDrawingRoute) obj;
        annualDrawingRoute.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        AnnualDrawingRoute.write$Self$Quin_conversation_gpRelease(annualDrawingRoute, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = AnnualDrawingRoute.$childSerializers;
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        int iT = 0;
        AnnualActionFor annualActionFor = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                annualActionFor = (AnnualActionFor) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), annualActionFor);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                iT = zf2VarC.t(nycVar, 1);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new AnnualDrawingRoute(i, annualActionFor, iT, xycVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{AnnualDrawingRoute.$childSerializers[0].getValue(), c77.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
