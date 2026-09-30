package defpackage;

import ai.askquin.ui.dailycard.DailyCardEntry;
import ai.askquin.ui.fourseasons.FourSeasonsEntry;
import ai.askquin.ui.router.AppRoute;
import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ro2 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q7b b;

    public /* synthetic */ ro2(q7b q7bVar, int i) {
        this.a = i;
        this.b = q7bVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        q7b q7bVar = this.b;
        switch (i) {
            case 0:
                ka9.e(q7bVar.a, new AppRoute.Paywall("others", false, false, false, 14, (rp3) null), null, 6);
                break;
            case 1:
                ka9.e(q7bVar.a, AppRoute.NotificationSettingsRoute.INSTANCE, null, 6);
                break;
            case 2:
                ka9.e(q7bVar.a, AppRoute.Invitation.INSTANCE, null, 6);
                break;
            case 3:
                cb9 cb9Var = q7bVar.a;
                String string = LocalDate.now().toString();
                string.getClass();
                ka9.e(cb9Var, new DailyCardEntry("daily_fortune_guide", string), null, 6);
                break;
            case 4:
                ka9.e(q7bVar.a, AppRoute.MyAccount.INSTANCE, null, 6);
                break;
            case 5:
                jr2.a(q7bVar.b);
                break;
            case 6:
                ka9.e(q7bVar.a, AppRoute.AllHistory.INSTANCE, null, 6);
                break;
            case 7:
                mic.a.getClass();
                mic micVar = mic.b;
                yic yicVarC = rmc.c(micVar);
                FourSeasonsEntry.Companion.getClass();
                FourSeasonsEntry fourSeasonsEntryA = ss5.a(micVar, "homepage");
                x1f x1fVar = x1f.a;
                x1f.k(p05.a, new yl6(yicVarC, 0), 2);
                ka9.e(q7bVar.a, fourSeasonsEntryA, null, 6);
                break;
            default:
                jr2.a(q7bVar.b);
                break;
        }
        return wefVar;
    }
}
