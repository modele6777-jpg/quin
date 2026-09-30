package ai.askquin.ui.annual;

import ai.askquin.ui.annual.model.AnnualActionFor;
import defpackage.ag2;
import defpackage.ev4;
import defpackage.gia;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.om3;
import defpackage.s8f;
import defpackage.w56;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.zf2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements w56 {
    public static final k a;
    private static final nyc descriptor;

    static {
        k kVar = new k();
        a = kVar;
        gia giaVar = new gia("ai.askquin.ui.annual.ResumeRoute.Generating", kVar, 1);
        giaVar.k("actionFor", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        ResumeRoute.Generating generating = (ResumeRoute.Generating) obj;
        generating.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ResumeRoute.Generating.write$Self$Quin_conversation_gpRelease(generating, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = ResumeRoute.Generating.$childSerializers;
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        AnnualActionFor annualActionFor = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else {
                if (iJ != 0) {
                    s8f.f(iJ);
                    return null;
                }
                annualActionFor = (AnnualActionFor) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), annualActionFor);
                i = 1;
            }
        }
        zf2VarC.b(nycVar);
        return new ResumeRoute.Generating(i, annualActionFor, xycVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{ResumeRoute.Generating.$childSerializers[0].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
