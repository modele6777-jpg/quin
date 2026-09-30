package defpackage;

import tech.chatmind.api.payment.WechatPayParams2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h2g implements w56 {
    public static final h2g a;
    private static final nyc descriptor;

    static {
        h2g h2gVar = new h2g();
        a = h2gVar;
        gia giaVar = new gia("tech.chatmind.api.payment.WechatPayParams2", h2gVar, 6);
        giaVar.k("noncestr", false);
        giaVar.k("timestamp", false);
        giaVar.k("package", false);
        giaVar.k("sign", false);
        giaVar.k("prepayid", false);
        giaVar.k("signType", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        WechatPayParams2 wechatPayParams2 = (WechatPayParams2) obj;
        wechatPayParams2.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        WechatPayParams2.write$Self$Quin_core_base_api_release(wechatPayParams2, ag2VarC, nycVar);
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
        String strO3 = null;
        String strO4 = null;
        String strO5 = null;
        String strO6 = null;
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
                    strO3 = zf2VarC.o(nycVar, 2);
                    i |= 4;
                    break;
                case 3:
                    strO4 = zf2VarC.o(nycVar, 3);
                    i |= 8;
                    break;
                case 4:
                    strO5 = zf2VarC.o(nycVar, 4);
                    i |= 16;
                    break;
                case 5:
                    strO6 = zf2VarC.o(nycVar, 5);
                    i |= 32;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new WechatPayParams2(i, strO, strO2, strO3, strO4, strO5, strO6, null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, p4eVar, p4eVar, p4eVar, p4eVar};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
