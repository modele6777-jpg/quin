package defpackage;

import tech.chatmind.api.personality.ReportData;
import tech.chatmind.api.personality.ReportServerData;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lsb implements w56 {
    public static final lsb a;
    private static final nyc descriptor;

    static {
        lsb lsbVar = new lsb();
        a = lsbVar;
        gia giaVar = new gia("tech.chatmind.api.personality.ReportServerData", lsbVar, 2);
        giaVar.k("report", false);
        giaVar.k("isLocked", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        ReportServerData reportServerData = (ReportServerData) obj;
        reportServerData.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ReportServerData.write$Self$Quin_core_base_api_release(reportServerData, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        ReportData reportData = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                reportData = (ReportData) zf2VarC.s(nycVar, 0, wrb.a, reportData);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                z2 = zf2VarC.z(nycVar, 1);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new ReportServerData(i, reportData, z2, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{wrb.a, g11.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
