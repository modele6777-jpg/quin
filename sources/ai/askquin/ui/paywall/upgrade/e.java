package ai.askquin.ui.paywall.upgrade;

import defpackage.ag2;
import defpackage.ev4;
import defpackage.g11;
import defpackage.gia;
import defpackage.jh5;
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
public final /* synthetic */ class e implements w56 {
    public static final e a;
    private static final nyc descriptor;

    static {
        e eVar = new e();
        a = eVar;
        gia giaVar = new gia("ai.askquin.ui.paywall.upgrade.FiveCardUpgradeManager.ReadingState", eVar, 6);
        giaVar.k("before", true);
        giaVar.k("capturedAt", true);
        giaVar.k("succeeded", true);
        giaVar.k("confirmed", true);
        giaVar.k("suppressed", true);
        giaVar.k("pending", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        FiveCardUpgradeManager$ReadingState fiveCardUpgradeManager$ReadingState = (FiveCardUpgradeManager$ReadingState) obj;
        fiveCardUpgradeManager$ReadingState.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        FiveCardUpgradeManager$ReadingState.write$Self$Quin_conversation_gpRelease(fiveCardUpgradeManager$ReadingState, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = FiveCardUpgradeManager$ReadingState.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        List list = null;
        String str = null;
        FiveCardUpgradePending fiveCardUpgradePending = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) zf2VarC.y(nycVar, 0, (xn7) lw7VarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    str = (String) zf2VarC.y(nycVar, 1, p4e.a, str);
                    i |= 2;
                    break;
                case 2:
                    z2 = zf2VarC.z(nycVar, 2);
                    i |= 4;
                    break;
                case 3:
                    z3 = zf2VarC.z(nycVar, 3);
                    i |= 8;
                    break;
                case 4:
                    z4 = zf2VarC.z(nycVar, 4);
                    i |= 16;
                    break;
                case 5:
                    fiveCardUpgradePending = (FiveCardUpgradePending) zf2VarC.y(nycVar, 5, jh5.a, fiveCardUpgradePending);
                    i |= 32;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new FiveCardUpgradeManager$ReadingState(i, list, str, z2, z3, z4, fiveCardUpgradePending, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        xn7 xn7VarF = t72.F((xn7) FiveCardUpgradeManager$ReadingState.$childSerializers[0].getValue());
        xn7 xn7VarF2 = t72.F(p4e.a);
        xn7 xn7VarF3 = t72.F(jh5.a);
        g11 g11Var = g11.a;
        return new xn7[]{xn7VarF, xn7VarF2, g11Var, g11Var, g11Var, xn7VarF3};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
