package defpackage;

import tech.chatmind.api.payment.WechatPayData;
import tech.chatmind.api.payment.WechatPayResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l2g implements w56 {
    public static final l2g a;
    private static final nyc descriptor;

    static {
        l2g l2gVar = new l2g();
        a = l2gVar;
        gia giaVar = new gia("tech.chatmind.api.payment.WechatPayResponse", l2gVar, 4);
        giaVar.k("errorCode", false);
        giaVar.k("success", false);
        giaVar.k("errorMessage", false);
        giaVar.k("data", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        WechatPayResponse wechatPayResponse = (WechatPayResponse) obj;
        wechatPayResponse.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        WechatPayResponse.write$Self$Quin_core_base_api_release(wechatPayResponse, ag2VarC, nycVar);
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
        WechatPayData wechatPayData = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                iT = zf2VarC.t(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                z2 = zf2VarC.z(nycVar, 1);
                i |= 2;
            } else if (iJ == 2) {
                strO = zf2VarC.o(nycVar, 2);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                wechatPayData = (WechatPayData) zf2VarC.s(nycVar, 3, d2g.a, wechatPayData);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new WechatPayResponse(i, iT, z2, strO, wechatPayData, null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{c77.a, g11.a, p4e.a, d2g.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
