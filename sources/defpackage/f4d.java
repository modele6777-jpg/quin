package defpackage;

import ai.askquin.ui.settings.model.UserSubscriptionInformation;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f4d {
    public final boolean a;
    public final boolean b;
    public final e4d c;
    public final zz5 d;
    public final UserSubscriptionInformation e;

    static {
        tpf tpfVar = UserSubscriptionInformation.Companion;
    }

    public f4d(boolean z, boolean z2, e4d e4dVar, zz5 zz5Var, UserSubscriptionInformation userSubscriptionInformation) {
        this.a = z;
        this.b = z2;
        this.c = e4dVar;
        this.d = zz5Var;
        this.e = userSubscriptionInformation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4d)) {
            return false;
        }
        f4d f4dVar = (f4d) obj;
        return this.a == f4dVar.a && this.b == f4dVar.b && this.c == f4dVar.c && this.d.equals(f4dVar.d) && this.e.equals(f4dVar.e);
    }

    public final int hashCode() {
        int iD = ub3.d(Boolean.hashCode(this.a) * 31, 31, this.b);
        e4d e4dVar = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iD + (e4dVar == null ? 0 : e4dVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbP = ib8.p("SettingsUiState(hasNewMessage=", ", isAccountUsageReady=", ", primaryButtonType=", this.a, this.b);
        sbP.append(this.c);
        sbP.append(", friendCouponEntryIndicator=");
        sbP.append(this.d);
        sbP.append(", userSubscriptionInformation=");
        sbP.append(this.e);
        sbP.append(")");
        return sbP.toString();
    }
}
