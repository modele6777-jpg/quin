package ai.askquin.ui.router;

import defpackage.ag2;
import defpackage.ev4;
import defpackage.g11;
import defpackage.gia;
import defpackage.nyc;
import defpackage.om3;
import defpackage.p4e;
import defpackage.s8f;
import defpackage.w56;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.zf2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements w56 {
    public static final j a;
    private static final nyc descriptor;

    static {
        j jVar = new j();
        a = jVar;
        gia giaVar = new gia("ai.askquin.ui.router.AppRoute.Paywall", jVar, 4);
        giaVar.k("source", false);
        giaVar.k("forSpread", true);
        giaVar.k("onlyAddOn", true);
        giaVar.k("ignoreSale", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        AppRoute.Paywall paywall = (AppRoute.Paywall) obj;
        paywall.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        AppRoute.Paywall.write$Self$Quin_conversation_gpRelease(paywall, ag2VarC, nycVar);
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
        String strO = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                z2 = zf2VarC.z(nycVar, 1);
                i |= 2;
            } else if (iJ == 2) {
                z3 = zf2VarC.z(nycVar, 2);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                z4 = zf2VarC.z(nycVar, 3);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new AppRoute.Paywall(i, strO, z2, z3, z4, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        g11 g11Var = g11.a;
        return new xn7[]{p4e.a, g11Var, g11Var, g11Var};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
