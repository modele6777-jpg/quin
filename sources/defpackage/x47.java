package defpackage;

import android.graphics.Insets;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x47 {
    public static final x47 e = new x47(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public x47(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static x47 a(x47 x47Var, x47 x47Var2) {
        return b(Math.max(x47Var.a, x47Var2.a), Math.max(x47Var.b, x47Var2.b), Math.max(x47Var.c, x47Var2.c), Math.max(x47Var.d, x47Var2.d));
    }

    public static x47 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new x47(i, i2, i3, i4);
    }

    public static x47 c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return bp.E(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x47.class != obj.getClass()) {
            return false;
        }
        x47 x47Var = (x47) obj;
        return this.d == x47Var.d && this.a == x47Var.a && this.c == x47Var.c && this.b == x47Var.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return tec.n(sb, this.d, '}');
    }
}
