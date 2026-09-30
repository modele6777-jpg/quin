package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n91 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public n91(long j, int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n91)) {
            return false;
        }
        n91 n91Var = (n91) obj;
        return this.a == n91Var.a && this.b == n91Var.b && this.c == n91Var.c && this.d == n91Var.d && this.e == n91Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ub3.b(this.d, ub3.b(this.c, ub3.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "CalendarMonth(year=" + this.a + ", month=" + this.b + ", numberOfDays=" + this.c + ", daysFromStartOfWeekToFirstOfMonth=" + this.d + ", startUtcTimeMillis=" + this.e + ')';
    }
}
