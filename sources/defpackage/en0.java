package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import tech.chatmind.api.credits.QuinSubscription;
import tech.chatmind.api.payment.ContractInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class en0 {
    public static final int i = ContractInfo.$stable | QuinSubscription.$stable;
    public final QuinSubscription a;
    public final String b;
    public final boolean c;
    public final ContractInfo d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;

    public /* synthetic */ en0(QuinSubscription quinSubscription, String str, boolean z, String str2, int i2) {
        this((i2 & 1) != 0 ? null : quinSubscription, (i2 & 2) != 0 ? null : str, false, null, (i2 & 16) != 0 ? false : z, false, false, (i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : str2);
    }

    public final boolean a() {
        if (!this.c) {
            return false;
        }
        ContractInfo contractInfo = this.d;
        return (contractInfo != null ? contractInfo.getContractStatus() : null) == eo2.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en0)) {
            return false;
        }
        en0 en0Var = (en0) obj;
        return pa7.t(this.a, en0Var.a) && pa7.t(this.b, en0Var.b) && this.c == en0Var.c && pa7.t(this.d, en0Var.d) && this.e == en0Var.e && this.f == en0Var.f && this.g == en0Var.g && pa7.t(this.h, en0Var.h);
    }

    public final int hashCode() {
        QuinSubscription quinSubscription = this.a;
        int iHashCode = (quinSubscription == null ? 0 : quinSubscription.hashCode()) * 31;
        String str = this.b;
        int iD = ub3.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        ContractInfo contractInfo = this.d;
        int iD2 = ub3.d(ub3.d(ub3.d((iD + (contractInfo == null ? 0 : contractInfo.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
        String str2 = this.h;
        return iD2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoRenewUiState(subscription=");
        sb.append(this.a);
        sb.append(", paymentType=");
        sb.append(this.b);
        sb.append(", hasActiveContract=");
        sb.append(this.c);
        sb.append(", contractInfo=");
        sb.append(this.d);
        sb.append(", hasSubscription=");
        ib8.w(sb, this.e, ", isProcessing=", this.f, ", isLoading=");
        sb.append(this.g);
        sb.append(", renewalPrice=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    public en0(QuinSubscription quinSubscription, String str, boolean z, ContractInfo contractInfo, boolean z2, boolean z3, boolean z4, String str2) {
        this.a = quinSubscription;
        this.b = str;
        this.c = z;
        this.d = contractInfo;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = str2;
    }
}
