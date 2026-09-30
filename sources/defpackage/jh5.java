package defpackage;

import ai.askquin.ui.paywall.upgrade.FiveCardUpgradePending;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jh5 implements w56 {
    public static final jh5 a;
    private static final nyc descriptor;

    static {
        jh5 jh5Var = new jh5();
        a = jh5Var;
        gia giaVar = new gia("ai.askquin.ui.paywall.upgrade.FiveCardUpgradePending", jh5Var, 4);
        giaVar.k("accountId", false);
        giaVar.k("readingId", false);
        giaVar.k("orderIds", false);
        giaVar.k("remainingReadings", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        FiveCardUpgradePending fiveCardUpgradePending = (FiveCardUpgradePending) obj;
        fiveCardUpgradePending.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        FiveCardUpgradePending.write$Self$Quin_conversation_gpRelease(fiveCardUpgradePending, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = FiveCardUpgradePending.$childSerializers;
        boolean z = true;
        int i = 0;
        int iT = 0;
        String strO = null;
        String strO2 = null;
        List list = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                strO2 = zf2VarC.o(nycVar, 1);
                i |= 2;
            } else if (iJ == 2) {
                list = (List) zf2VarC.s(nycVar, 2, (xn7) lw7VarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                iT = zf2VarC.t(nycVar, 3);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new FiveCardUpgradePending(i, strO, strO2, list, iT, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = FiveCardUpgradePending.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, lw7VarArr[2].getValue(), c77.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
