package ai.askquin.ui.paywall.upgrade;

import defpackage.ag2;
import defpackage.ev4;
import defpackage.gia;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.om3;
import defpackage.s8f;
import defpackage.w56;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.zf2;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements w56 {
    public static final d a;
    private static final nyc descriptor;

    static {
        d dVar = new d();
        a = dVar;
        gia giaVar = new gia("ai.askquin.ui.paywall.upgrade.FiveCardUpgradeManager.AccountState", dVar, 2);
        giaVar.k("readings", true);
        giaVar.k("exposedOrderIds", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        FiveCardUpgradeManager$AccountState fiveCardUpgradeManager$AccountState = (FiveCardUpgradeManager$AccountState) obj;
        fiveCardUpgradeManager$AccountState.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        FiveCardUpgradeManager$AccountState.write$Self$Quin_conversation_gpRelease(fiveCardUpgradeManager$AccountState, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = FiveCardUpgradeManager$AccountState.$childSerializers;
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        Map map = null;
        Set set = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                map = (Map) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), map);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                set = (Set) zf2VarC.s(nycVar, 1, (xn7) lw7VarArr[1].getValue(), set);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new FiveCardUpgradeManager$AccountState(i, map, set, xycVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = FiveCardUpgradeManager$AccountState.$childSerializers;
        return new xn7[]{lw7VarArr[0].getValue(), lw7VarArr[1].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
