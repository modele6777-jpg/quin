package defpackage;

import ai.askquin.ui.onboard.OnboardAuthRoute;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nn9 implements w56 {
    public static final nn9 a;
    private static final nyc descriptor;

    static {
        nn9 nn9Var = new nn9();
        a = nn9Var;
        gia giaVar = new gia("ai.askquin.ui.onboard.OnboardAuthRoute", nn9Var, 3);
        giaVar.k("fromWelcomeLogin", true);
        giaVar.k("afterFirstReading", true);
        giaVar.k("showBack", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        OnboardAuthRoute onboardAuthRoute = (OnboardAuthRoute) obj;
        onboardAuthRoute.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        OnboardAuthRoute.write$Self$Quin_conversation_gpRelease(onboardAuthRoute, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                z2 = zf2VarC.z(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                z3 = zf2VarC.z(nycVar, 1);
                i |= 2;
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                z4 = zf2VarC.z(nycVar, 2);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new OnboardAuthRoute(i, z2, z3, z4, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        g11 g11Var = g11.a;
        return new xn7[]{g11Var, g11Var, g11Var};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
