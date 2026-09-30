package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s51 {
    public final q51 a;
    public final int b;
    public final int c;

    public s51(q51 q51Var, int i, int i2) {
        this.a = q51Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s51)) {
            return false;
        }
        s51 s51Var = (s51) obj;
        return pa7.t(this.a, s51Var.a) && this.b == s51Var.b && this.c == s51Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ub3.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BulletSpanWithLevel(bullet=");
        sb.append(this.a);
        sb.append(", indentationLevel=");
        sb.append(this.b);
        sb.append(", start=");
        return tec.g(this.c, ")", sb);
    }
}
