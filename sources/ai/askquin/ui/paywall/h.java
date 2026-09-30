package ai.askquin.ui.paywall;

import defpackage.ag2;
import defpackage.ev4;
import defpackage.g11;
import defpackage.gia;
import defpackage.nyc;
import defpackage.om3;
import defpackage.s8f;
import defpackage.w56;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.zf2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements w56 {
    public static final h a;
    private static final nyc descriptor;

    static {
        h hVar = new h();
        a = hVar;
        gia giaVar = new gia("ai.askquin.ui.paywall.PaywallRoute.Congratulation", hVar, 2);
        giaVar.k("showWeComQrCode", true);
        giaVar.k("wasSubscription", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        PaywallRoute.Congratulation congratulation = (PaywallRoute.Congratulation) obj;
        congratulation.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        PaywallRoute.Congratulation.write$Self$Quin_component_paywall_release(congratulation, ag2VarC, nycVar);
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
        while (true) {
            xyc xycVar = null;
            if (!z) {
                zf2VarC.b(nycVar);
                return new PaywallRoute.Congratulation(i, z2, z3, xycVar);
            }
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
                z3 = zf2VarC.z(nycVar, 1);
                i |= 2;
            }
        }
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        g11 g11Var = g11.a;
        return new xn7[]{g11Var, g11Var};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
