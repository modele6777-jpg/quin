package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nh5 implements g7g {
    public final float a;
    public final float b;
    public final float c;

    public nh5(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.g7g
    public final int a(sw3 sw3Var) {
        return sw3Var.D0(0.0f);
    }

    @Override // defpackage.g7g
    public final int b(sw3 sw3Var, cv7 cv7Var) {
        return sw3Var.D0(this.b);
    }

    @Override // defpackage.g7g
    public final int c(sw3 sw3Var) {
        return sw3Var.D0(this.c);
    }

    @Override // defpackage.g7g
    public final int d(sw3 sw3Var, cv7 cv7Var) {
        return sw3Var.D0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh5)) {
            return false;
        }
        nh5 nh5Var = (nh5) obj;
        return yi4.b(this.a, nh5Var.a) && yi4.b(0.0f, 0.0f) && yi4.b(this.b, nh5Var.b) && yi4.b(this.c, nh5Var.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + ub3.a(this.b, ub3.a(0.0f, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        String strC = yi4.c(this.a);
        String strC2 = yi4.c(0.0f);
        return ks0.m(ib8.o("Insets(left=", strC, ", top=", strC2, ", right="), yi4.c(this.b), ", bottom=", yi4.c(this.c), ")");
    }
}
