package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c91 implements Comparable {
    public final int a;
    public final int b;
    public final int c;
    public final long d;

    public c91(int i, int i2, int i3, long j) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return pa7.M(this.d, ((c91) obj).d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c91)) {
            return false;
        }
        c91 c91Var = (c91) obj;
        return this.a == c91Var.a && this.b == c91Var.b && this.c == c91Var.c && this.d == c91Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ub3.b(this.c, ub3.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "CalendarDate(year=" + this.a + ", month=" + this.b + ", dayOfMonth=" + this.c + ", utcTimeMillis=" + this.d + ')';
    }
}
