package ai.askquin.ui.popup.dailyfortune;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.ev4;
import defpackage.g11;
import defpackage.gia;
import defpackage.lw7;
import defpackage.ma8;
import defpackage.nyc;
import defpackage.om3;
import defpackage.s8f;
import defpackage.sa8;
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
        gia giaVar = new gia("ai.askquin.ui.popup.dailyfortune.DailyFortuneGuideStore.AccountState", eVar, 9);
        giaVar.k("firstReadingEligible", true);
        giaVar.k("firstReadingEvaluated", true);
        giaVar.k("pendingTrigger", true);
        giaVar.k("pendingDate", true);
        giaVar.k("consumed", true);
        giaVar.k("tomorrowReminderPending", true);
        giaVar.k("tomorrowReminderShown", true);
        giaVar.k("homeTooltipPending", true);
        giaVar.k("homeTooltipShown", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        DailyFortuneGuideStore$AccountState dailyFortuneGuideStore$AccountState = (DailyFortuneGuideStore$AccountState) obj;
        dailyFortuneGuideStore$AccountState.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        DailyFortuneGuideStore$AccountState.write$Self$Quin_conversation_gpRelease(dailyFortuneGuideStore$AccountState, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = DailyFortuneGuideStore$AccountState.$childSerializers;
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        DailyFortuneGuideTrigger dailyFortuneGuideTrigger = null;
        ma8 ma8Var = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    z2 = zf2VarC.z(nycVar, 0);
                    i |= 1;
                    break;
                case 1:
                    z3 = zf2VarC.z(nycVar, 1);
                    i |= 2;
                    break;
                case 2:
                    dailyFortuneGuideTrigger = (DailyFortuneGuideTrigger) zf2VarC.y(nycVar, 2, (xn7) lw7VarArr[2].getValue(), dailyFortuneGuideTrigger);
                    i |= 4;
                    break;
                case 3:
                    ma8Var = (ma8) zf2VarC.y(nycVar, 3, sa8.a, ma8Var);
                    i |= 8;
                    break;
                case 4:
                    z4 = zf2VarC.z(nycVar, 4);
                    i |= 16;
                    continue;
                case 5:
                    z5 = zf2VarC.z(nycVar, 5);
                    i |= 32;
                    continue;
                case 6:
                    z6 = zf2VarC.z(nycVar, 6);
                    i |= 64;
                    continue;
                case 7:
                    z7 = zf2VarC.z(nycVar, 7);
                    i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    continue;
                case 8:
                    z8 = zf2VarC.z(nycVar, 8);
                    i |= 256;
                    continue;
                default:
                    s8f.f(iJ);
                    return obj;
            }
            obj = null;
        }
        zf2VarC.b(nycVar);
        return new DailyFortuneGuideStore$AccountState(i, z2, z3, dailyFortuneGuideTrigger, ma8Var, z4, z5, z6, z7, z8, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        xn7 xn7VarF = t72.F((xn7) DailyFortuneGuideStore$AccountState.$childSerializers[2].getValue());
        xn7 xn7VarF2 = t72.F(sa8.a);
        g11 g11Var = g11.a;
        return new xn7[]{g11Var, g11Var, xn7VarF, xn7VarF2, g11Var, g11Var, g11Var, g11Var, g11Var};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
