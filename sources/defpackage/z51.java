package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z51 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public z51(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof z51)) {
            return false;
        }
        z51 z51Var = (z51) obj;
        return yi4.b(this.a, z51Var.a) && yi4.b(this.b, z51Var.b) && yi4.b(this.c, z51Var.c) && yi4.b(this.d, z51Var.d) && yi4.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + ub3.a(this.d, ub3.a(this.c, ub3.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
