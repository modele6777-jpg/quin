package defpackage;

import ai.askquin.datastore.model.InternalAnnualReportProgress;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u87 implements w56 {
    public static final u87 a;
    private static final nyc descriptor;

    static {
        u87 u87Var = new u87();
        a = u87Var;
        gia giaVar = new gia("ai.askquin.datastore.model.InternalAnnualReportProgress", u87Var, 2);
        giaVar.k("routeKey", true);
        giaVar.k("savedAt", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        InternalAnnualReportProgress internalAnnualReportProgress = (InternalAnnualReportProgress) obj;
        internalAnnualReportProgress.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        InternalAnnualReportProgress.write$Self$Quin_core_datastore_release(internalAnnualReportProgress, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        int i = 0;
        String strO = null;
        long jD = 0;
        boolean z = true;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                jD = zf2VarC.D(nycVar, 1);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new InternalAnnualReportProgress(i, strO, jD, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{p4e.a, eg8.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
