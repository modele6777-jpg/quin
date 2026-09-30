package defpackage;

import java.util.List;
import tech.chatmind.api.UsageBillingDailyLimitResponse;
import tech.chatmind.api.UsageBillingResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gif implements w56 {
    public static final gif a;
    private static final nyc descriptor;

    static {
        gif gifVar = new gif();
        a = gifVar;
        gia giaVar = new gia("tech.chatmind.api.UsageBillingResponse", gifVar, 4);
        giaVar.k("enabled", true);
        giaVar.k("canFollowUp", true);
        giaVar.k("balances", true);
        giaVar.k("dailyLimit", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        UsageBillingResponse usageBillingResponse = (UsageBillingResponse) obj;
        usageBillingResponse.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        UsageBillingResponse.write$Self$Quin_core_base_api_release(usageBillingResponse, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = UsageBillingResponse.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        List list = null;
        UsageBillingDailyLimitResponse usageBillingDailyLimitResponse = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                z2 = zf2VarC.z(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                z3 = zf2VarC.z(nycVar, 1);
                i |= 2;
            } else if (iJ == 2) {
                list = (List) zf2VarC.s(nycVar, 2, (xn7) lw7VarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                usageBillingDailyLimitResponse = (UsageBillingDailyLimitResponse) zf2VarC.y(nycVar, 3, eif.a, usageBillingDailyLimitResponse);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new UsageBillingResponse(i, z2, z3, list, usageBillingDailyLimitResponse, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = UsageBillingResponse.$childSerializers;
        g11 g11Var = g11.a;
        return new xn7[]{g11Var, g11Var, lw7VarArr[2].getValue(), t72.F(eif.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
