package defpackage;

import tech.chatmind.api.ClaimReadingsResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l12 implements w56 {
    public static final l12 a;
    private static final nyc descriptor;

    static {
        l12 l12Var = new l12();
        a = l12Var;
        gia giaVar = new gia("tech.chatmind.api.ClaimReadingsResponse", l12Var, 5);
        giaVar.k("total", true);
        giaVar.k("claimedCount", true);
        giaVar.k("skippedCount", true);
        giaVar.k("notFoundCount", true);
        giaVar.k("failedCount", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        ClaimReadingsResponse claimReadingsResponse = (ClaimReadingsResponse) obj;
        claimReadingsResponse.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ClaimReadingsResponse.write$Self$Quin_core_base_api_release(claimReadingsResponse, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        int iT = 0;
        int iT2 = 0;
        int iT3 = 0;
        int iT4 = 0;
        int iT5 = 0;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                iT = zf2VarC.t(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                iT2 = zf2VarC.t(nycVar, 1);
                i |= 2;
            } else if (iJ == 2) {
                iT3 = zf2VarC.t(nycVar, 2);
                i |= 4;
            } else if (iJ == 3) {
                iT4 = zf2VarC.t(nycVar, 3);
                i |= 8;
            } else {
                if (iJ != 4) {
                    s8f.f(iJ);
                    return null;
                }
                iT5 = zf2VarC.t(nycVar, 4);
                i |= 16;
            }
        }
        zf2VarC.b(nycVar);
        return new ClaimReadingsResponse(i, iT, iT2, iT3, iT4, iT5, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        c77 c77Var = c77.a;
        return new xn7[]{c77Var, c77Var, c77Var, c77Var, c77Var};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
