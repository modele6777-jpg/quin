package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xz extends b00 {
    public float a;

    public xz(float f) {
        this.a = f;
    }

    @Override // defpackage.b00
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.b00
    public final int b() {
        return 1;
    }

    @Override // defpackage.b00
    public final b00 c() {
        return new xz(0.0f);
    }

    @Override // defpackage.b00
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.b00
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xz) && ((xz) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
