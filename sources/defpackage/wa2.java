package defpackage;

import tech.chatmind.api.CompensateCount;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wa2 implements w56 {
    public static final wa2 a;
    private static final nyc descriptor;

    static {
        wa2 wa2Var = new wa2();
        a = wa2Var;
        gia giaVar = new gia("tech.chatmind.api.CompensateCount", wa2Var, 3);
        giaVar.k("totalCount", false);
        giaVar.k("usedCount", false);
        giaVar.k("expiredAt", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        CompensateCount compensateCount = (CompensateCount) obj;
        compensateCount.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        CompensateCount.write$Self$Quin_core_base_api_release(compensateCount, ag2VarC, nycVar);
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
        String str = null;
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
                str = (String) zf2VarC.y(nycVar, 2, p4e.a, str);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new CompensateCount(i, iT, iT2, str, null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        xn7 xn7VarF = t72.F(p4e.a);
        c77 c77Var = c77.a;
        return new xn7[]{c77Var, c77Var, xn7VarF};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
