package defpackage;

import tech.chatmind.api.payment.WechatPayData;
import tech.chatmind.api.payment.WechatPayParams;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d2g implements w56 {
    public static final d2g a;
    private static final nyc descriptor;

    static {
        d2g d2gVar = new d2g();
        a = d2gVar;
        gia giaVar = new gia("tech.chatmind.api.payment.WechatPayData", d2gVar, 2);
        giaVar.k("outTradeNo", false);
        giaVar.k("payParams", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        WechatPayData wechatPayData = (WechatPayData) obj;
        wechatPayData.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        WechatPayData.write$Self$Quin_core_base_api_release(wechatPayData, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        String str = null;
        WechatPayParams wechatPayParams = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                str = (String) zf2VarC.y(nycVar, 0, p4e.a, str);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                wechatPayParams = (WechatPayParams) zf2VarC.y(nycVar, 1, f2g.a, wechatPayParams);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new WechatPayData(i, str, wechatPayParams, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{t72.F(p4e.a), t72.F(f2g.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
