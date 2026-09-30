package defpackage;

import tech.chatmind.api.credits.GuestPassGrantPlan;
import tech.chatmind.api.credits.GuestPassGrantReason;
import tech.chatmind.api.credits.GuestPassPendingGrant;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vf6 implements w56 {
    public static final vf6 a;
    private static final nyc descriptor;

    static {
        vf6 vf6Var = new vf6();
        a = vf6Var;
        gia giaVar = new gia("tech.chatmind.api.credits.GuestPassPendingGrant", vf6Var, 3);
        giaVar.k("count", false);
        giaVar.k("plan", false);
        giaVar.k("reason", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        GuestPassPendingGrant guestPassPendingGrant = (GuestPassPendingGrant) obj;
        guestPassPendingGrant.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        GuestPassPendingGrant.write$Self$Quin_core_base_api_release(guestPassPendingGrant, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = GuestPassPendingGrant.$childSerializers;
        boolean z = true;
        int i = 0;
        int iT = 0;
        GuestPassGrantPlan guestPassGrantPlan = null;
        GuestPassGrantReason guestPassGrantReason = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                iT = zf2VarC.t(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                guestPassGrantPlan = (GuestPassGrantPlan) zf2VarC.y(nycVar, 1, (xn7) lw7VarArr[1].getValue(), guestPassGrantPlan);
                i |= 2;
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                guestPassGrantReason = (GuestPassGrantReason) zf2VarC.s(nycVar, 2, (xn7) lw7VarArr[2].getValue(), guestPassGrantReason);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new GuestPassPendingGrant(i, iT, guestPassGrantPlan, guestPassGrantReason, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = GuestPassPendingGrant.$childSerializers;
        return new xn7[]{c77.a, t72.F((xn7) lw7VarArr[1].getValue()), lw7VarArr[2].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
