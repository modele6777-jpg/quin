package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xa3 {
    public final int a;
    public final int b;
    public final int c;
    public final String d;

    public xa3(String str, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa3)) {
            return false;
        }
        xa3 xa3Var = (xa3) obj;
        return this.a == xa3Var.a && this.b == xa3Var.b && this.c == xa3Var.c && pa7.t(this.d, xa3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ub3.b(this.c, ub3.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = ib8.n(this.a, this.b, "DailyPushTemplate(index=", ", titleRes=", ", bodyRes=");
        sbN.append(this.c);
        sbN.append(", pushIdPrefix=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }

    public /* synthetic */ xa3(int i, int i2, int i3) {
        this("daily_push", i, i2, i3);
    }
}
