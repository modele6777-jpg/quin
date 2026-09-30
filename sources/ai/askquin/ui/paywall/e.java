package ai.askquin.ui.paywall;

import defpackage.ag2;
import defpackage.ev4;
import defpackage.g11;
import defpackage.gia;
import defpackage.nyc;
import defpackage.om3;
import defpackage.p4e;
import defpackage.s8f;
import defpackage.t72;
import defpackage.w56;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.zf2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements w56 {
    public static final e a;
    private static final nyc descriptor;

    static {
        e eVar = new e();
        a = eVar;
        gia giaVar = new gia("ai.askquin.ui.paywall.PaywallRoute.AddonPaywall", eVar, 4);
        giaVar.k("source", true);
        giaVar.k("blockedReason", true);
        giaVar.k("resultKey", true);
        giaVar.k("armDailyFortuneGuideOnDismiss", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        PaywallRoute.AddonPaywall addonPaywall = (PaywallRoute.AddonPaywall) obj;
        addonPaywall.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        PaywallRoute.AddonPaywall.write$Self$Quin_component_paywall_release(addonPaywall, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String strO = null;
        String str = null;
        String strO2 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                str = (String) zf2VarC.y(nycVar, 1, p4e.a, str);
                i |= 2;
            } else if (iJ == 2) {
                strO2 = zf2VarC.o(nycVar, 2);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                z2 = zf2VarC.z(nycVar, 3);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new PaywallRoute.AddonPaywall(i, strO, str, strO2, z2, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, t72.F(p4eVar), p4eVar, g11.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
