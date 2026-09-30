package defpackage;

import tech.chatmind.api.GuestPassPendingGrantResponse;
import tech.chatmind.api.GuestPassResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cg6 implements w56 {
    public static final cg6 a;
    private static final nyc descriptor;

    static {
        cg6 cg6Var = new cg6();
        a = cg6Var;
        gia giaVar = new gia("tech.chatmind.api.GuestPassResponse", cg6Var, 3);
        giaVar.k("remaining", true);
        giaVar.k("totalGranted", true);
        giaVar.k("pendingGrant", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        GuestPassResponse guestPassResponse = (GuestPassResponse) obj;
        guestPassResponse.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        GuestPassResponse.write$Self$Quin_core_base_api_release(guestPassResponse, ag2VarC, nycVar);
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
        GuestPassPendingGrantResponse guestPassPendingGrantResponse = null;
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
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                guestPassPendingGrantResponse = (GuestPassPendingGrantResponse) zf2VarC.y(nycVar, 2, xf6.a, guestPassPendingGrantResponse);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new GuestPassResponse(i, iT, iT2, guestPassPendingGrantResponse, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        xn7 xn7VarF = t72.F(xf6.a);
        c77 c77Var = c77.a;
        return new xn7[]{c77Var, c77Var, xn7VarF};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
