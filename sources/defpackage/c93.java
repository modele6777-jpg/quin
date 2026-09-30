package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c93 {
    public final x4d a;
    public final bx9 b;
    public final long c;
    public final Integer d;

    public c93(x4d x4dVar, bx9 bx9Var, long j, Integer num) {
        this.a = x4dVar;
        this.b = bx9Var;
        this.c = j;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c93)) {
            return false;
        }
        c93 c93Var = (c93) obj;
        if (!this.a.equals(c93Var.a) || !this.b.equals(c93Var.b)) {
            return false;
        }
        long j = c93Var.c;
        int i = y72.l;
        return faf.a(this.c, j) && pa7.t(this.d, c93Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = y72.l;
        int iB = ib8.b(iHashCode, 31, this.c);
        Integer num = this.d;
        return iB + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "DailyFortuneToken(shape=" + this.a + ", padding=" + this.b + ", backgroundColor=" + y72.h(this.c) + ", image=" + this.d + ")";
    }
}
