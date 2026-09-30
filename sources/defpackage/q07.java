package defpackage;

import tech.chatmind.api.payment.InAppSku;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q07 implements w56 {
    public static final q07 a;
    private static final nyc descriptor;

    static {
        q07 q07Var = new q07();
        a = q07Var;
        gia giaVar = new gia("tech.chatmind.api.payment.InAppSku", q07Var, 6);
        giaVar.k("planKey", false);
        giaVar.k("count", true);
        giaVar.k("formattedPrice", false);
        giaVar.k("totalPrice", false);
        giaVar.k("priceSymbol", false);
        giaVar.k("formattedOriginPrice", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        InAppSku inAppSku = (InAppSku) obj;
        inAppSku.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        InAppSku.write$Self$Quin_core_base_api_release(inAppSku, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        String strO = null;
        Integer num = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        String str = null;
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
                    num = (Integer) zf2VarC.y(nycVar, 1, c77.a, num);
                    i |= 2;
                    break;
                case 2:
                    strO2 = zf2VarC.o(nycVar, 2);
                    i |= 4;
                    break;
                case 3:
                    strO3 = zf2VarC.o(nycVar, 3);
                    i |= 8;
                    break;
                case 4:
                    strO4 = zf2VarC.o(nycVar, 4);
                    i |= 16;
                    break;
                case 5:
                    str = (String) zf2VarC.y(nycVar, 5, p4e.a, str);
                    i |= 32;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new InAppSku(i, strO, num, strO2, strO3, strO4, str, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, t72.F(c77.a), p4eVar, p4eVar, p4eVar, t72.F(p4eVar)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
