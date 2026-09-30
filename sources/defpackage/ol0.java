package defpackage;

import ai.askquin.ui.account.navigation.AuthNavigation$Terminal;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ol0 implements w56 {
    public static final ol0 a;
    private static final nyc descriptor;

    static {
        ol0 ol0Var = new ol0();
        a = ol0Var;
        gia giaVar = new gia("ai.askquin.ui.account.navigation.AuthNavigation.Terminal", ol0Var, 2);
        giaVar.k("isNewUser", false);
        giaVar.k("method", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        AuthNavigation$Terminal authNavigation$Terminal = (AuthNavigation$Terminal) obj;
        authNavigation$Terminal.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        AuthNavigation$Terminal.write$Self$Quin_component_account_release(authNavigation$Terminal, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String strO = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                z2 = zf2VarC.z(nycVar, 0);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                strO = zf2VarC.o(nycVar, 1);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new AuthNavigation$Terminal(i, z2, strO, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{g11.a, p4e.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
