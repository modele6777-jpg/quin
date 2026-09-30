package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xm6 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public xm6(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm6)) {
            return false;
        }
        xm6 xm6Var = (xm6) obj;
        return this.a == xm6Var.a && this.b == xm6Var.b && this.c == xm6Var.c && this.d == xm6Var.d && this.e == xm6Var.e && this.f == xm6Var.f && this.g == xm6Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ub3.d(ub3.d(ub3.d(ub3.d(ub3.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbP = ib8.p("HomeGuideConditions(isLoaded=", ", calendarCompleted=", ", isHomeResumed=", this.a, this.b);
        ib8.w(sbP, this.c, ", popupsReady=", this.d, ", popupVisible=");
        ib8.w(sbP, this.e, ", drawerOpen=", this.f, ", homeAtRest=");
        return ub3.m(sbP, this.g, ")");
    }
}
