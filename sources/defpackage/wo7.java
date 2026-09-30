package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wo7 {
    public static final wo7 g = new wo7(0, 0, 127);
    public final int a;
    public final Boolean b;
    public final int c;
    public final int d;
    public final Boolean e;
    public final sd8 f;

    public wo7(int i, int i2, int i3) {
        Boolean bool = (i3 & 2) != 0 ? null : Boolean.FALSE;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? -1 : i2;
        this.a = -1;
        this.b = bool;
        this.c = i;
        this.d = i2;
        this.e = null;
        this.f = null;
    }

    public final int a() {
        int i = this.d;
        lx6 lx6Var = new lx6(i);
        if (i == -1) {
            lx6Var = null;
        }
        if (lx6Var != null) {
            return lx6Var.a;
        }
        return 1;
    }

    public final rx6 b(boolean z) {
        int i = this.a;
        vo7 vo7Var = new vo7(i);
        if (i == -1) {
            vo7Var = null;
        }
        int i2 = vo7Var != null ? vo7Var.a : 0;
        Boolean bool = this.b;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        int i3 = this.c;
        xo7 xo7Var = i3 != 0 ? new xo7(i3) : null;
        int i4 = xo7Var != null ? xo7Var.a : 1;
        int iA = a();
        sd8 sd8Var = this.f;
        if (sd8Var == null) {
            sd8Var = sd8.c;
        }
        return new rx6(z, i2, zBooleanValue, i4, iA, sd8Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo7)) {
            return false;
        }
        wo7 wo7Var = (wo7) obj;
        return this.a == wo7Var.a && pa7.t(this.b, wo7Var.b) && this.c == wo7Var.c && this.d == wo7Var.d && pa7.t(this.e, wo7Var.e) && pa7.t(this.f, wo7Var.f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Boolean bool = this.b;
        int iB = ub3.b(this.d, ub3.b(this.c, (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 961);
        Boolean bool2 = this.e;
        int iHashCode2 = (iB + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        sd8 sd8Var = this.f;
        return iHashCode2 + (sd8Var != null ? sd8Var.a.hashCode() : 0);
    }

    public final String toString() {
        String strA = vo7.a(this.a);
        String strA2 = xo7.a(this.c);
        String strA3 = lx6.a(this.d);
        StringBuilder sb = new StringBuilder("KeyboardOptions(capitalization=");
        sb.append(strA);
        sb.append(", autoCorrectEnabled=");
        sb.append(this.b);
        sb.append(", keyboardType=");
        ub3.v(sb, strA2, ", imeAction=", strA3, ", platformImeOptions=nullshowKeyboardOnFocus=");
        sb.append(this.e);
        sb.append(", hintLocales=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
