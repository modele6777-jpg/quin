package defpackage;

import ai.askquin.ui.paywall.upgrade.FiveCardUpgradePending;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class eh5 {
    public final int a;
    public final int b;
    public final int c;
    public final FiveCardUpgradePending d;
    public final int e;
    public final int f;

    public eh5(int i, int i2, int i3, FiveCardUpgradePending fiveCardUpgradePending, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = fiveCardUpgradePending;
        this.e = i4;
        this.f = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh5)) {
            return false;
        }
        eh5 eh5Var = (eh5) obj;
        return this.a == eh5Var.a && this.b == eh5Var.b && this.c == eh5Var.c && pa7.t(this.d, eh5Var.d) && this.e == eh5Var.e && this.f == eh5Var.f;
    }

    public final int hashCode() {
        int iB = ub3.b(this.c, ub3.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        FiveCardUpgradePending fiveCardUpgradePending = this.d;
        return Integer.hashCode(this.f) + ub3.b(this.e, (iB + (fiveCardUpgradePending == null ? 0 : fiveCardUpgradePending.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbN = ib8.n(this.a, this.b, "FiveCardUpgradeDebugState(capturedReadingCount=", ", awaitingConfirmationCount=", ", confirmingCount=");
        sbN.append(this.c);
        sbN.append(", pending=");
        sbN.append(this.d);
        sbN.append(", exposedOrderCount=");
        sbN.append(this.e);
        sbN.append(", suppressedReadingCount=");
        sbN.append(this.f);
        sbN.append(")");
        return sbN.toString();
    }
}
