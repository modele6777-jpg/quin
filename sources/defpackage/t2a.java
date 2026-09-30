package defpackage;

import tech.chatmind.api.PayAsYouGo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t2a implements w56 {
    public static final t2a a;
    private static final nyc descriptor;

    static {
        t2a t2aVar = new t2a();
        a = t2aVar;
        gia giaVar = new gia("tech.chatmind.api.PayAsYouGo", t2aVar, 3);
        giaVar.k("testReportCount", false);
        giaVar.k("seasonalReadingCount", true);
        giaVar.k("seasonalReadingUnlocked", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        PayAsYouGo payAsYouGo = (PayAsYouGo) obj;
        payAsYouGo.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        PayAsYouGo.write$Self$Quin_core_base_api_release(payAsYouGo, ag2VarC, nycVar);
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
        Boolean bool = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                iT = zf2VarC.t(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                iT2 = zf2VarC.t(nycVar, 1);
                i |= 2;
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                bool = (Boolean) zf2VarC.y(nycVar, 2, g11.a, bool);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new PayAsYouGo(i, iT, iT2, bool, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        xn7 xn7VarF = t72.F(g11.a);
        c77 c77Var = c77.a;
        return new xn7[]{c77Var, c77Var, xn7VarF};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
