package defpackage;

import tech.chatmind.api.dailycard.model.DailyCardRequestBody;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y33 implements w56 {
    public static final y33 a;
    private static final nyc descriptor;

    static {
        y33 y33Var = new y33();
        a = y33Var;
        gia giaVar = new gia("tech.chatmind.api.dailycard.model.DailyCardRequestBody", y33Var, 4);
        giaVar.k("uid", false);
        giaVar.k("date", false);
        giaVar.k("action", true);
        giaVar.k("version", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        DailyCardRequestBody dailyCardRequestBody = (DailyCardRequestBody) obj;
        dailyCardRequestBody.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        DailyCardRequestBody.write$Self$Quin_core_base_api_release(dailyCardRequestBody, ag2VarC, nycVar);
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
        String str = null;
        String strO3 = null;
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
            } else if (iJ == 2) {
                str = (String) zf2VarC.y(nycVar, 2, p4e.a, str);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                strO3 = zf2VarC.o(nycVar, 3);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new DailyCardRequestBody(i, strO, strO2, str, strO3, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, t72.F(p4eVar), p4eVar};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
