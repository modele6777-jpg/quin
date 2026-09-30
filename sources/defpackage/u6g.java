package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u6g implements v6g {
    public final List a;
    public final boolean b;
    public final boolean c;

    public u6g(List list, boolean z, boolean z2) {
        this.a = list;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6g)) {
            return false;
        }
        u6g u6gVar = (u6g) obj;
        return this.a.equals(u6gVar.a) && this.b == u6gVar.b && this.c == u6gVar.c;
    }

    @Override // defpackage.v6g
    public final String getType() {
        return "qd_update";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ub3.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuickDecisionUpdate(appWidgetIds=");
        sb.append(this.a);
        sb.append(", trackInstall=");
        sb.append(this.b);
        sb.append(", scheduleNext=");
        return ub3.m(sb, this.c, ")");
    }
}
