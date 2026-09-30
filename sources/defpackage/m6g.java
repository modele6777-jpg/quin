package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m6g implements v6g {
    public final boolean a;

    public m6g(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m6g) && this.a == ((m6g) obj).a;
    }

    @Override // defpackage.v6g
    public final String getType() {
        return "daily_refresh_all";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "DailyFortuneRefreshAll(scheduleMidnightRefresh=" + this.a + ")";
    }
}
