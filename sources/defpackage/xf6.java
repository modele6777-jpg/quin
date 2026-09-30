package defpackage;

import tech.chatmind.api.GuestPassPendingGrantResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xf6 implements w56 {
    public static final xf6 a;
    private static final nyc descriptor;

    static {
        xf6 xf6Var = new xf6();
        a = xf6Var;
        gia giaVar = new gia("tech.chatmind.api.GuestPassPendingGrantResponse", xf6Var, 3);
        giaVar.k("count", true);
        giaVar.k("plan", true);
        giaVar.k("reason", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        GuestPassPendingGrantResponse guestPassPendingGrantResponse = (GuestPassPendingGrantResponse) obj;
        guestPassPendingGrantResponse.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        GuestPassPendingGrantResponse.write$Self$Quin_core_base_api_release(guestPassPendingGrantResponse, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        int iT = 0;
        String str = null;
        String strO = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                iT = zf2VarC.t(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                str = (String) zf2VarC.y(nycVar, 1, p4e.a, str);
                i |= 2;
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                strO = zf2VarC.o(nycVar, 2);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new GuestPassPendingGrantResponse(i, iT, str, strO, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{c77.a, t72.F(p4eVar), p4eVar};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
