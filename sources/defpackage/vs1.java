package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vs1 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final boolean h;

    public vs1(int i, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs1)) {
            return false;
        }
        vs1 vs1Var = (vs1) obj;
        return this.a == vs1Var.a && Float.compare(this.b, vs1Var.b) == 0 && Float.compare(this.c, vs1Var.c) == 0 && Float.compare(this.d, vs1Var.d) == 0 && Float.compare(this.e, vs1Var.e) == 0 && Float.compare(this.f, vs1Var.f) == 0 && Float.compare(this.g, vs1Var.g) == 0 && this.h == vs1Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ub3.a(this.g, ub3.a(this.f, ub3.a(this.e, ub3.a(this.d, ub3.a(this.c, ub3.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardPlacement(index=");
        sb.append(this.a);
        sb.append(", centerX=");
        sb.append(this.b);
        sb.append(", centerY=");
        ks0.w(sb, this.c, ", width=", this.d, ", height=");
        ks0.w(sb, this.e, ", rotationDegrees=", this.f, ", zIndex=");
        sb.append(this.g);
        sb.append(", isHidden=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
