package defpackage;

import tech.chatmind.api.credits.GuestPassBalance;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nf6 implements w56 {
    public static final nf6 a;
    private static final nyc descriptor;

    static {
        nf6 nf6Var = new nf6();
        a = nf6Var;
        gia giaVar = new gia("tech.chatmind.api.credits.GuestPassBalance", nf6Var, 2);
        giaVar.k("remaining", true);
        giaVar.k("totalGranted", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        GuestPassBalance guestPassBalance = (GuestPassBalance) obj;
        guestPassBalance.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        GuestPassBalance.write$Self$Quin_core_base_api_release(guestPassBalance, ag2VarC, nycVar);
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
        while (true) {
            xyc xycVar = null;
            if (!z) {
                zf2VarC.b(nycVar);
                return new GuestPassBalance(i, iT, iT2, xycVar);
            }
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                iT = zf2VarC.t(nycVar, 0);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                iT2 = zf2VarC.t(nycVar, 1);
                i |= 2;
            }
        }
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        c77 c77Var = c77.a;
        return new xn7[]{c77Var, c77Var};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
