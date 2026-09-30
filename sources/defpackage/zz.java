package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zz extends b00 {
    public float a;
    public float b;
    public float c;

    public zz(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.b00
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.c;
    }

    @Override // defpackage.b00
    public final int b() {
        return 3;
    }

    @Override // defpackage.b00
    public final b00 c() {
        return new zz(0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.b00
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    @Override // defpackage.b00
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else if (i == 1) {
            this.b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zz)) {
            return false;
        }
        zz zzVar = (zz) obj;
        return zzVar.a == this.a && zzVar.b == this.b && zzVar.c == this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + ub3.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        StringBuilder sbO = tec.o("AnimationVector3D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
        sbO.append(f3);
        return sbO.toString();
    }
}
