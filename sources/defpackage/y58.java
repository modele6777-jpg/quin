package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y58 {
    public static final y58 d = new y58(v58.c, 17, 0);
    public final float a;
    public final int b;
    public final int c;

    public y58(float f, int i, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y58)) {
            return false;
        }
        y58 y58Var = (y58) obj;
        float f = y58Var.a;
        float f2 = v58.b;
        return Float.compare(this.a, f) == 0 && this.b == y58Var.b && this.c == y58Var.c;
    }

    public final int hashCode() {
        float f = v58.b;
        return Integer.hashCode(this.c) + ub3.b(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String str;
        String strB = v58.b(this.a);
        String str2 = "Invalid";
        int i = this.b;
        if (i == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else {
            str = i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
        int i2 = this.c;
        if (i2 == 0) {
            str2 = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str2 = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str2 = "LineHeightStyle.Mode.Tight";
        }
        return ks0.l(ib8.o("LineHeightStyle(alignment=", strB, ", trim=", str, ",mode="), str2, ")");
    }
}
