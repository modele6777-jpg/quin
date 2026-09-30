package defpackage;

import ai.askquin.ui.settings.model.ExpireableCount;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s55 implements w56 {
    public static final s55 a;
    private static final nyc descriptor;

    static {
        s55 s55Var = new s55();
        a = s55Var;
        gia giaVar = new gia("ai.askquin.ui.settings.model.ExpireableCount", s55Var, 5);
        giaVar.k("totalCount", false);
        giaVar.k("usedCount", false);
        giaVar.k("expiredAt", false);
        giaVar.k("productName", false);
        giaVar.k("category", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        ExpireableCount expireableCount = (ExpireableCount) obj;
        expireableCount.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ExpireableCount.write$Self$Quin_conversation_gpRelease(expireableCount, ag2VarC, nycVar);
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
        String strO = null;
        String strO2 = null;
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
            } else if (iJ == 2) {
                str = (String) zf2VarC.y(nycVar, 2, p4e.a, str);
                i |= 4;
            } else if (iJ == 3) {
                strO = zf2VarC.o(nycVar, 3);
                i |= 8;
            } else {
                if (iJ != 4) {
                    s8f.f(iJ);
                    return null;
                }
                strO2 = zf2VarC.o(nycVar, 4);
                i |= 16;
            }
        }
        zf2VarC.b(nycVar);
        return new ExpireableCount(i, iT, iT2, str, strO, strO2, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        xn7 xn7VarF = t72.F(p4eVar);
        c77 c77Var = c77.a;
        return new xn7[]{c77Var, c77Var, xn7VarF, p4eVar, p4eVar};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
