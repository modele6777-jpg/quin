package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d3g {
    public final float a;
    public final float b;
    public final float c;
    public final boolean d;
    public final x16 e;

    public d3g(float f, float f2, float f3, boolean z, x16 x16Var) {
        x16Var.getClass();
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = z;
        this.e = x16Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3g)) {
            return false;
        }
        d3g d3gVar = (d3g) obj;
        return yi4.b(this.a, d3gVar.a) && yi4.b(this.b, d3gVar.b) && yi4.b(this.c, d3gVar.c) && this.d == d3gVar.d && pa7.t(this.e, d3gVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ub3.d(ub3.a(this.c, ub3.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        String strC = yi4.c(this.a);
        String strC2 = yi4.c(this.b);
        String strC3 = yi4.c(this.c);
        StringBuilder sbO = ib8.o("WelcomeOpeningTransition(titleOffsetY=", strC, ", buttonOffsetY=", strC2, ", cardOffsetY=");
        sbO.append(strC3);
        sbO.append(", isFinished=");
        sbO.append(this.d);
        sbO.append(", advance=");
        sbO.append(this.e);
        sbO.append(")");
        return sbO.toString();
    }
}
