package ai.askquin.ui.paywall;

import defpackage.ag2;
import defpackage.c77;
import defpackage.ev4;
import defpackage.g11;
import defpackage.gia;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.om3;
import defpackage.p4e;
import defpackage.s8f;
import defpackage.t72;
import defpackage.w56;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.zf2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements w56 {
    public static final l a;
    private static final nyc descriptor;

    static {
        l lVar = new l();
        a = lVar;
        gia giaVar = new gia("ai.askquin.ui.paywall.PaywallRoute.UpgradePaywall", lVar, 5);
        giaVar.k("remainingReadings", false);
        giaVar.k("isPreview", true);
        giaVar.k("accountId", true);
        giaVar.k("readingId", true);
        giaVar.k("orderIds", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        PaywallRoute.UpgradePaywall upgradePaywall = (PaywallRoute.UpgradePaywall) obj;
        upgradePaywall.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        PaywallRoute.UpgradePaywall.write$Self$Quin_component_paywall_release(upgradePaywall, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = PaywallRoute.UpgradePaywall.$childSerializers;
        boolean z = true;
        int i = 0;
        int iT = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        List list = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                iT = zf2VarC.t(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                z2 = zf2VarC.z(nycVar, 1);
                i |= 2;
            } else if (iJ == 2) {
                str = (String) zf2VarC.y(nycVar, 2, p4e.a, str);
                i |= 4;
            } else if (iJ == 3) {
                str2 = (String) zf2VarC.y(nycVar, 3, p4e.a, str2);
                i |= 8;
            } else {
                if (iJ != 4) {
                    s8f.f(iJ);
                    return null;
                }
                list = (List) zf2VarC.s(nycVar, 4, (xn7) lw7VarArr[4].getValue(), list);
                i |= 16;
            }
        }
        zf2VarC.b(nycVar);
        return new PaywallRoute.UpgradePaywall(i, iT, z2, str, str2, list, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = PaywallRoute.UpgradePaywall.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{c77.a, g11.a, t72.F(p4eVar), t72.F(p4eVar), lw7VarArr[4].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
