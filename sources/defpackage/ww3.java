package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ww3 implements sw3 {
    public final float a;
    public final float b;
    public final tq5 c;

    public ww3(float f, float f2, tq5 tq5Var) {
        this.a = f;
        this.b = f2;
        this.c = tq5Var;
    }

    @Override // defpackage.sw3
    public final float F(long j) {
        if (xue.a(wue.b(j), 4294967296L)) {
            return this.c.b(wue.c(j));
        }
        qc0.p("Only Sp can convert to Px");
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww3)) {
            return false;
        }
        ww3 ww3Var = (ww3) obj;
        return Float.compare(this.a, ww3Var.a) == 0 && Float.compare(this.b, ww3Var.b) == 0 && this.c.equals(ww3Var.c);
    }

    @Override // defpackage.sw3
    public final float getDensity() {
        return this.a;
    }

    @Override // defpackage.sw3
    public final float h0() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + ub3.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    @Override // defpackage.sw3
    public final long t(float f) {
        return w6c.r(4294967296L, this.c.a(f));
    }

    public final String toString() {
        StringBuilder sbO = tec.o("DensityWithConverter(density=", this.a, ", fontScale=", this.b, ", converter=");
        sbO.append(this.c);
        sbO.append(")");
        return sbO.toString();
    }
}
