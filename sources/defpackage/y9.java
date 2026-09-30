package defpackage;

import ai.askquin.ui.settings.profile.AccountProfileRoute$SetBios;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y9 implements w56 {
    public static final y9 a;
    private static final nyc descriptor;

    static {
        y9 y9Var = new y9();
        a = y9Var;
        gia giaVar = new gia("ai.askquin.ui.settings.profile.AccountProfileRoute.SetBios", y9Var, 1);
        giaVar.k("bios", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        AccountProfileRoute$SetBios accountProfileRoute$SetBios = (AccountProfileRoute$SetBios) obj;
        accountProfileRoute$SetBios.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ag2VarC.A(nycVar, 0, p4e.a, accountProfileRoute$SetBios.bios);
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
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else {
                if (iJ != 0) {
                    s8f.f(iJ);
                    return null;
                }
                str = (String) zf2VarC.y(nycVar, 0, p4e.a, str);
                i = 1;
            }
        }
        zf2VarC.b(nycVar);
        return new AccountProfileRoute$SetBios(i, str, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{t72.F(p4e.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
