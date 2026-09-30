package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a00 extends b00 {
    public float a;
    public float b;
    public float c;
    public float d;

    public a00(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.b00
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.d;
    }

    @Override // defpackage.b00
    public final int b() {
        return 4;
    }

    @Override // defpackage.b00
    public final b00 c() {
        return new a00(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.b00
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }

    @Override // defpackage.b00
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
            return;
        }
        if (i == 1) {
            this.b = f;
        } else if (i == 2) {
            this.c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a00)) {
            return false;
        }
        a00 a00Var = (a00) obj;
        return a00Var.a == this.a && a00Var.b == this.b && a00Var.c == this.c && a00Var.d == this.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ub3.a(this.c, ub3.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        StringBuilder sbO = tec.o("AnimationVector4D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
        sbO.append(f3);
        sbO.append(", v4 = ");
        sbO.append(f4);
        return sbO.toString();
    }
}
