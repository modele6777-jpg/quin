package defpackage;

import ai.askquin.ui.paywall.upgrade.FiveCardUpgradePending;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vua implements yua {
    public static final /* synthetic */ int b = 0;
    public final FiveCardUpgradePending a;

    static {
        int i = FiveCardUpgradePending.$stable;
    }

    public vua(FiveCardUpgradePending fiveCardUpgradePending) {
        this.a = fiveCardUpgradePending;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vua) && this.a.equals(((vua) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UpgradePaywall(pending=" + this.a + ")";
    }
}
