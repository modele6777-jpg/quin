package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yz extends b00 {
    public float a;
    public float b;

    public yz(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.b00
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // defpackage.b00
    public final int b() {
        return 2;
    }

    @Override // defpackage.b00
    public final b00 c() {
        return new yz(0.0f, 0.0f);
    }

    @Override // defpackage.b00
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // defpackage.b00
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yz)) {
            return false;
        }
        yz yzVar = (yz) obj;
        return yzVar.a == this.a && yzVar.b == this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
