package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class icb {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public icb(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icb)) {
            return false;
        }
        icb icbVar = (icb) obj;
        return this.a == icbVar.a && this.b == icbVar.b && this.c == icbVar.c && this.d == icbVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ub3.b(0, ub3.b(this.c, ub3.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = ib8.n(this.a, this.b, "RatingConditionRecord(totalShowRatingCount=", ", appLaunchCount=", ", drawCardTimes=");
        sbN.append(this.c);
        sbN.append(", askQuestionTimes=0, isOver8Hours=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
