package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n6g implements v6g {
    public final List a;
    public final boolean b;
    public final boolean c;

    public n6g(List list, boolean z, boolean z2) {
        this.a = list;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6g)) {
            return false;
        }
        n6g n6gVar = (n6g) obj;
        return this.a.equals(n6gVar.a) && this.b == n6gVar.b && this.c == n6gVar.c;
    }

    @Override // defpackage.v6g
    public final String getType() {
        return "daily_update";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ub3.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DailyFortuneUpdate(appWidgetIds=");
        sb.append(this.a);
        sb.append(", trackInstall=");
        sb.append(this.b);
        sb.append(", scheduleMidnightRefresh=");
        return ub3.m(sb, this.c, ")");
    }
}
