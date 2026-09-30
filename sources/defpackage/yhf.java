package defpackage;

import tech.chatmind.api.credits.UsageBillingBalance;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yhf implements w56 {
    public static final yhf a;
    private static final nyc descriptor;

    static {
        yhf yhfVar = new yhf();
        a = yhfVar;
        gia giaVar = new gia("tech.chatmind.api.credits.UsageBillingBalance", yhfVar, 7);
        giaVar.k("source", true);
        giaVar.k("remainingPercent", true);
        giaVar.k("inUse", true);
        giaVar.k("status", true);
        giaVar.k("resetType", true);
        giaVar.k("nextRefreshAt", true);
        giaVar.k("expireAt", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        UsageBillingBalance usageBillingBalance = (UsageBillingBalance) obj;
        usageBillingBalance.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        UsageBillingBalance.write$Self$Quin_core_base_api_release(usageBillingBalance, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        int iT = 0;
        boolean z2 = false;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String str = null;
        String str2 = null;
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
                    iT = zf2VarC.t(nycVar, 1);
                    i |= 2;
                    break;
                case 2:
                    z2 = zf2VarC.z(nycVar, 2);
                    i |= 4;
                    break;
                case 3:
                    strO2 = zf2VarC.o(nycVar, 3);
                    i |= 8;
                    break;
                case 4:
                    strO3 = zf2VarC.o(nycVar, 4);
                    i |= 16;
                    break;
                case 5:
                    str = (String) zf2VarC.y(nycVar, 5, p4e.a, str);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) zf2VarC.y(nycVar, 6, p4e.a, str2);
                    i |= 64;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new UsageBillingBalance(i, strO, iT, z2, strO2, strO3, str, str2, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, c77.a, g11.a, p4eVar, p4eVar, t72.F(p4eVar), t72.F(p4eVar)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
