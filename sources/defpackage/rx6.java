package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rx6 {
    public static final rx6 g = new rx6(false, 0, true, 1, 1, sd8.c);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final sd8 f;

    public rx6(boolean z, int i, boolean z2, int i2, int i3, sd8 sd8Var) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = sd8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx6)) {
            return false;
        }
        rx6 rx6Var = (rx6) obj;
        return this.a == rx6Var.a && this.b == rx6Var.b && this.c == rx6Var.c && this.d == rx6Var.d && this.e == rx6Var.e && pa7.t(this.f, rx6Var.f);
    }

    public final int hashCode() {
        return this.f.a.hashCode() + ub3.b(this.e, ub3.b(this.d, ub3.d(ub3.b(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + vo7.a(this.b) + ", autoCorrect=" + this.c + ", keyboardType=" + xo7.a(this.d) + ", imeAction=" + lx6.a(this.e) + ", platformImeOptions=null, hintLocales=" + this.f + ")";
    }
}
