package ai.askquin.ui.annual;

import ai.askquin.ui.annual.model.AnnualActionFor;
import defpackage.ag2;
import defpackage.c77;
import defpackage.ev4;
import defpackage.gia;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.om3;
import defpackage.s8f;
import defpackage.t72;
import defpackage.w56;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.zf2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements w56 {
    public static final i a;
    private static final nyc descriptor;

    static {
        i iVar = new i();
        a = iVar;
        gia giaVar = new gia("ai.askquin.ui.annual.ResumeRoute.Drawing", iVar, 4);
        giaVar.k("actionFor", false);
        giaVar.k("resumeIndex", true);
        giaVar.k("drawnCards", true);
        giaVar.k("userInfo", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        ResumeRoute.Drawing drawing = (ResumeRoute.Drawing) obj;
        drawing.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ResumeRoute.Drawing.write$Self$Quin_conversation_gpRelease(drawing, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = ResumeRoute.Drawing.$childSerializers;
        boolean z = true;
        int i = 0;
        int iT = 0;
        AnnualActionFor annualActionFor = null;
        List list = null;
        ResumeRoute.UserInfoFilling userInfoFilling = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                annualActionFor = (AnnualActionFor) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), annualActionFor);
                i |= 1;
            } else if (iJ == 1) {
                iT = zf2VarC.t(nycVar, 1);
                i |= 2;
            } else if (iJ == 2) {
                list = (List) zf2VarC.s(nycVar, 2, (xn7) lw7VarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                userInfoFilling = (ResumeRoute.UserInfoFilling) zf2VarC.y(nycVar, 3, m.a, userInfoFilling);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new ResumeRoute.Drawing(i, annualActionFor, iT, list, userInfoFilling, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = ResumeRoute.Drawing.$childSerializers;
        return new xn7[]{lw7VarArr[0].getValue(), c77.a, lw7VarArr[2].getValue(), t72.F(m.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
