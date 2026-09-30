package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bx9 implements xw9 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public bx9(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            g37.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.xw9
    public final float a() {
        return this.d;
    }

    @Override // defpackage.xw9
    public final float b(cv7 cv7Var) {
        return cv7Var == cv7.a ? this.a : this.c;
    }

    @Override // defpackage.xw9
    public final float c(cv7 cv7Var) {
        return cv7Var == cv7.a ? this.c : this.a;
    }

    @Override // defpackage.xw9
    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bx9)) {
            return false;
        }
        bx9 bx9Var = (bx9) obj;
        return yi4.b(this.a, bx9Var.a) && yi4.b(this.b, bx9Var.b) && yi4.b(this.c, bx9Var.c) && yi4.b(this.d, bx9Var.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ub3.a(this.c, ub3.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        String strC = yi4.c(this.a);
        String strC2 = yi4.c(this.b);
        return ks0.m(ib8.o("PaddingValues(start=", strC, ", top=", strC2, ", end="), yi4.c(this.c), ", bottom=", yi4.c(this.d), ")");
    }
}
