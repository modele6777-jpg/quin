package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ju9 {
    public final long a;
    public final bx9 b;

    public ju9() {
        long jD = abg.d(4284900966L);
        bx9 bx9VarQ = ynb.q(0.0f, 0.0f, 3);
        this.a = jD;
        this.b = bx9VarQ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ju9.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ju9 ju9Var = (ju9) obj;
        long j = ju9Var.a;
        int i = y72.l;
        return faf.a(this.a, j) && this.b.equals(ju9Var.b);
    }

    public final int hashCode() {
        int i = y72.l;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + y72.h(this.a) + ", drawPadding=" + this.b + ")";
    }
}
