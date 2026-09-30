package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ip5 {
    public final String a;
    public final ep5 b;
    public final sp5 c;

    public ip5(String str, ep5 ep5Var, sp5 sp5Var) {
        this.a = str;
        this.b = ep5Var;
        this.c = sp5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip5)) {
            return false;
        }
        ip5 ip5Var = (ip5) obj;
        return pa7.t(this.a, ip5Var.a) && this.b == ip5Var.b && this.c == ip5Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "FollowUpQuotaNoticeConfig(dailyLimitResetAt=" + this.a + ", noPermissionNotice=" + this.b + ", usageEmptyPeriod=" + this.c + ")";
    }
}
