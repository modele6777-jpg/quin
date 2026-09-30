package ai.askquin.ui.popup.dailyfortune;

import defpackage.a26;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements a26 {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        switch (this.a) {
            case 0:
                DailyFortuneGuideStore$AccountState dailyFortuneGuideStore$AccountState = (DailyFortuneGuideStore$AccountState) obj;
                dailyFortuneGuideStore$AccountState.getClass();
                return dailyFortuneGuideStore$AccountState.getTomorrowReminderShown() ? dailyFortuneGuideStore$AccountState : DailyFortuneGuideStore$AccountState.copy$default(dailyFortuneGuideStore$AccountState, false, false, null, null, false, true, false, false, false, 479, null);
            case 1:
                DailyFortuneGuideStore$AccountState dailyFortuneGuideStore$AccountState2 = (DailyFortuneGuideStore$AccountState) obj;
                dailyFortuneGuideStore$AccountState2.getClass();
                return dailyFortuneGuideStore$AccountState2.getHomeTooltipShown() ? dailyFortuneGuideStore$AccountState2 : DailyFortuneGuideStore$AccountState.copy$default(dailyFortuneGuideStore$AccountState2, false, false, null, null, false, false, false, true, false, 383, null);
            case 2:
                DailyFortuneGuideStore$AccountState dailyFortuneGuideStore$AccountState3 = (DailyFortuneGuideStore$AccountState) obj;
                dailyFortuneGuideStore$AccountState3.getClass();
                return DailyFortuneGuideStore$AccountState.copy$default(dailyFortuneGuideStore$AccountState3, false, false, null, null, false, false, false, true, false, 127, null);
            case 3:
                DailyFortuneGuideStore$AccountState dailyFortuneGuideStore$AccountState4 = (DailyFortuneGuideStore$AccountState) obj;
                dailyFortuneGuideStore$AccountState4.getClass();
                return DailyFortuneGuideStore$AccountState.copy$default(dailyFortuneGuideStore$AccountState4, false, false, null, null, true, false, false, false, false, 482, null);
            default:
                DailyFortuneGuideStore$AccountState dailyFortuneGuideStore$AccountState5 = (DailyFortuneGuideStore$AccountState) obj;
                dailyFortuneGuideStore$AccountState5.getClass();
                return DailyFortuneGuideStore$AccountState.copy$default(dailyFortuneGuideStore$AccountState5, false, false, null, null, false, false, true, false, false, 415, null);
        }
    }
}
