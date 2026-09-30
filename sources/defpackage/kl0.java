package defpackage;

import ai.askquin.ui.account.component.AuthOption;
import ai.askquin.ui.account.navigation.AuthNavigation$BindPhoneRoute;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kl0 implements w56 {
    public static final kl0 a;
    private static final nyc descriptor;

    static {
        kl0 kl0Var = new kl0();
        a = kl0Var;
        gia giaVar = new gia("ai.askquin.ui.account.navigation.AuthNavigation.BindPhoneRoute", kl0Var, 1);
        giaVar.k("signOption", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        AuthNavigation$BindPhoneRoute authNavigation$BindPhoneRoute = (AuthNavigation$BindPhoneRoute) obj;
        authNavigation$BindPhoneRoute.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ag2VarC.p(nycVar, 0, (xn7) AuthNavigation$BindPhoneRoute.$childSerializers[0].getValue(), authNavigation$BindPhoneRoute.signOption);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = AuthNavigation$BindPhoneRoute.$childSerializers;
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        AuthOption authOption = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else {
                if (iJ != 0) {
                    s8f.f(iJ);
                    return null;
                }
                authOption = (AuthOption) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), authOption);
                i = 1;
            }
        }
        zf2VarC.b(nycVar);
        return new AuthNavigation$BindPhoneRoute(i, authOption, xycVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{AuthNavigation$BindPhoneRoute.$childSerializers[0].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
