package defpackage;

import tech.chatmind.api.credits.UsageBillingBalance;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kb implements lb {
    public final UsageBillingBalance a;
    public final String b;
    public final String c;
    public final int d;

    public kb(UsageBillingBalance usageBillingBalance, String str, String str2) {
        this.a = usageBillingBalance;
        this.b = str;
        this.c = str2;
        this.d = mh3.o(usageBillingBalance.getRemainingPercent(), 0, 100);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb)) {
            return false;
        }
        kb kbVar = (kb) obj;
        return this.a.equals(kbVar.a) && pa7.t(this.b, kbVar.b) && pa7.t(this.c, kbVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Usage(balance=");
        sb.append(this.a);
        sb.append(", nextRefreshAt=");
        sb.append(this.b);
        sb.append(", expiresAt=");
        return ks0.l(sb, this.c, ")");
    }
}
