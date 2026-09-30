package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tpe {
    public static final w1e g = new w1e(4);
    public final zn8 a;
    public final cv7 b;
    public final xp5 c;
    public final long d;
    public final float e;
    public final float f;

    public tpe(zn8 zn8Var, cv7 cv7Var, xp5 xp5Var, long j) {
        this.a = zn8Var;
        this.b = cv7Var;
        this.c = xp5Var;
        this.d = j;
        this.e = zn8Var.getDensity();
        this.f = zn8Var.h0();
    }

    public final String toString() {
        return "MeasureInputs(density=" + this.a + ", densityValue=" + this.e + ", fontScale=" + this.f + ", layoutDirection=" + this.b + ", fontFamilyResolver=" + this.c + ", constraints=" + kl2.l(this.d) + ")";
    }
}
