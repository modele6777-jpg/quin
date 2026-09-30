package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vw3 implements sw3 {
    public final float a;
    public final float b;

    public vw3(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw3)) {
            return false;
        }
        vw3 vw3Var = (vw3) obj;
        return Float.compare(this.a, vw3Var.a) == 0 && Float.compare(this.b, vw3Var.b) == 0;
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
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return kv2.k("DensityImpl(density=", this.a, ", fontScale=", this.b, ")");
    }
}
