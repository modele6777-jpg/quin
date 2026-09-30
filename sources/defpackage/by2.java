package defpackage;

import tech.chatmind.api.payment.CreateSubscriptionResponse;
import tech.chatmind.api.payment.WechatPayParams2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class by2 implements w56 {
    public static final by2 a;
    private static final nyc descriptor;

    static {
        by2 by2Var = new by2();
        a = by2Var;
        gia giaVar = new gia("tech.chatmind.api.payment.CreateSubscriptionResponse", by2Var, 3);
        giaVar.k("outTradeNo", false);
        giaVar.k("contractId", false);
        giaVar.k("payParams", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        CreateSubscriptionResponse createSubscriptionResponse = (CreateSubscriptionResponse) obj;
        createSubscriptionResponse.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        CreateSubscriptionResponse.write$Self$Quin_core_base_api_release(createSubscriptionResponse, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        WechatPayParams2 wechatPayParams2 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                strO2 = zf2VarC.o(nycVar, 1);
                i |= 2;
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                wechatPayParams2 = (WechatPayParams2) zf2VarC.s(nycVar, 2, h2g.a, wechatPayParams2);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new CreateSubscriptionResponse(i, strO, strO2, wechatPayParams2, null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, h2g.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
