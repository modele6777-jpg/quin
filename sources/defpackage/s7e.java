package defpackage;

import tech.chatmind.api.payment.ContractInfo;
import tech.chatmind.api.payment.SubscriptionStatusResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s7e implements w56 {
    public static final s7e a;
    private static final nyc descriptor;

    static {
        s7e s7eVar = new s7e();
        a = s7eVar;
        gia giaVar = new gia("tech.chatmind.api.payment.SubscriptionStatusResponse", s7eVar, 2);
        giaVar.k("hasActiveContract", false);
        giaVar.k("contract", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SubscriptionStatusResponse subscriptionStatusResponse = (SubscriptionStatusResponse) obj;
        subscriptionStatusResponse.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SubscriptionStatusResponse.write$Self$Quin_core_base_api_release(subscriptionStatusResponse, ag2VarC, nycVar);
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
        ContractInfo contractInfo = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                z2 = zf2VarC.z(nycVar, 0);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                contractInfo = (ContractInfo) zf2VarC.y(nycVar, 1, co2.a, contractInfo);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new SubscriptionStatusResponse(i, z2, contractInfo, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{g11.a, t72.F(co2.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
