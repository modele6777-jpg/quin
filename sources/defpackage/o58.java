package defpackage;

import tech.chatmind.api.LimitedQuota;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o58 implements w56 {
    public static final o58 a;
    private static final nyc descriptor;

    static {
        o58 o58Var = new o58();
        a = o58Var;
        gia giaVar = new gia("tech.chatmind.api.LimitedQuota", o58Var, 6);
        giaVar.k("category", false);
        giaVar.k("totalCount", false);
        giaVar.k("usedCount", false);
        giaVar.k("expiredAt", false);
        giaVar.k("productName", false);
        giaVar.k("orderId", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        LimitedQuota limitedQuota = (LimitedQuota) obj;
        limitedQuota.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        LimitedQuota.write$Self$Quin_core_base_api_release(limitedQuota, ag2VarC, nycVar);
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
        String strO = null;
        String str = null;
        String strO2 = null;
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
                    iT2 = zf2VarC.t(nycVar, 2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) zf2VarC.y(nycVar, 3, p4e.a, str);
                    i |= 8;
                    break;
                case 4:
                    strO2 = zf2VarC.o(nycVar, 4);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) zf2VarC.y(nycVar, 5, p4e.a, str2);
                    i |= 32;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new LimitedQuota(i, strO, iT, iT2, str, strO2, str2, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        xn7 xn7VarF = t72.F(p4eVar);
        xn7 xn7VarF2 = t72.F(p4eVar);
        c77 c77Var = c77.a;
        return new xn7[]{p4eVar, c77Var, c77Var, xn7VarF, p4eVar, xn7VarF2};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
