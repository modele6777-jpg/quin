package defpackage;

import tech.chatmind.api.guestpass.GuestPassInfoResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tf6 implements w56 {
    public static final tf6 a;
    private static final nyc descriptor;

    static {
        tf6 tf6Var = new tf6();
        a = tf6Var;
        gia giaVar = new gia("tech.chatmind.api.guestpass.GuestPassInfoResponse", tf6Var, 6);
        giaVar.k("code", true);
        giaVar.k("shareUrl", true);
        giaVar.k("remaining", true);
        giaVar.k("totalGranted", true);
        giaVar.k("creditsPerPass", true);
        giaVar.k("validDays", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        GuestPassInfoResponse guestPassInfoResponse = (GuestPassInfoResponse) obj;
        guestPassInfoResponse.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        GuestPassInfoResponse.write$Self$Quin_core_base_api_release(guestPassInfoResponse, ag2VarC, nycVar);
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
        String strO = null;
        String strO2 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strO = zf2VarC.o(nycVar, 0);
                    i |= 1;
                    break;
                case 1:
                    strO2 = zf2VarC.o(nycVar, 1);
                    i |= 2;
                    break;
                case 2:
                    iT = zf2VarC.t(nycVar, 2);
                    i |= 4;
                    break;
                case 3:
                    iT2 = zf2VarC.t(nycVar, 3);
                    i |= 8;
                    break;
                case 4:
                    iT3 = zf2VarC.t(nycVar, 4);
                    i |= 16;
                    break;
                case 5:
                    iT4 = zf2VarC.t(nycVar, 5);
                    i |= 32;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new GuestPassInfoResponse(i, strO, strO2, iT, iT2, iT3, iT4, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        c77 c77Var = c77.a;
        return new xn7[]{p4eVar, p4eVar, c77Var, c77Var, c77Var, c77Var};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
