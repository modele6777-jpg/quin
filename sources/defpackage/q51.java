package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q51 implements g00 {
    public static final long d = w6c.r(8589934592L, 1.0f);
    public static final q51 e;
    public final long a;
    public final long b;
    public final long c;

    static {
        long jI = w6c.i(0.25d);
        e = new q51(jI, jI, w6c.i(0.25d));
    }

    public q51(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof q51)) {
            return false;
        }
        q51 q51Var = (q51) obj;
        if (!wue.a(this.a, q51Var.a) || !wue.a(this.b, q51Var.b)) {
            return false;
        }
        wue.a(this.c, q51Var.c);
        return false;
    }

    public final int hashCode() {
        int iHashCode = y02.b.hashCode() * 31;
        xue[] xueVarArr = wue.b;
        return oe5.a.hashCode() + ub3.a(Float.NaN, ib8.b(ib8.b(ib8.b(iHashCode, 31, this.a), 31, this.b), 961, this.c), 31);
    }

    public final String toString() {
        y02 y02Var = y02.b;
        String strE = wue.e(this.a);
        String strE2 = wue.e(this.b);
        String strE3 = wue.e(this.c);
        StringBuilder sb = new StringBuilder("Bullet(shape=");
        sb.append(y02Var);
        sb.append(", size=(");
        sb.append(strE);
        sb.append(", ");
        ub3.v(sb, strE2, "), padding=", strE3, ", brush=null, alpha=NaN, drawStyle=");
        sb.append(oe5.a);
        sb.append(")");
        return sb.toString();
    }
}
