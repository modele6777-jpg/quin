package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u02 {
    public final int a;
    public final int b;
    public final float c;
    public final float d;

    public u02(int i, int i2, float f, float f2) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u02)) {
            return false;
        }
        u02 u02Var = (u02) obj;
        return this.a == u02Var.a && this.b == u02Var.b && Float.compare(this.c, u02Var.c) == 0 && Float.compare(this.d, u02Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ub3.a(this.c, ub3.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = ib8.n(this.a, this.b, "CircleCardGeometry(layoutWidth=", ", layoutHeight=", ", centerX=");
        sbN.append(this.c);
        sbN.append(", centerY=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
