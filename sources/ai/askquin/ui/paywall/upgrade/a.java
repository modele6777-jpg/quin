package ai.askquin.ui.paywall.upgrade;

import defpackage.l26;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements l26 {
    public final /* synthetic */ String a;
    public final /* synthetic */ FiveCardUpgradePending b;

    public /* synthetic */ a(String str, FiveCardUpgradePending fiveCardUpgradePending) {
        this.a = str;
        this.b = fiveCardUpgradePending;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        FiveCardUpgradePending pending;
        List<String> orderIds;
        String str = (String) obj;
        FiveCardUpgradeManager$ReadingState fiveCardUpgradeManager$ReadingState = (FiveCardUpgradeManager$ReadingState) obj2;
        str.getClass();
        fiveCardUpgradeManager$ReadingState.getClass();
        if (!str.equals(this.a) && (pending = fiveCardUpgradeManager$ReadingState.getPending()) != null && (orderIds = pending.getOrderIds()) != null && !orderIds.isEmpty()) {
            Iterator<T> it = orderIds.iterator();
            while (it.hasNext()) {
                if (this.b.getOrderIds().contains((String) it.next())) {
                    return FiveCardUpgradeManager$ReadingState.copy$default(fiveCardUpgradeManager$ReadingState, null, null, false, false, false, null, 31, null);
                }
            }
        }
        return fiveCardUpgradeManager$ReadingState;
    }
}
