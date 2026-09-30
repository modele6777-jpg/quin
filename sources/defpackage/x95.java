package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x95 {
    public final float a;
    public final ze5 b;

    public x95(float f, ze5 ze5Var) {
        this.a = f;
        this.b = ze5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x95)) {
            return false;
        }
        x95 x95Var = (x95) obj;
        return Float.compare(this.a, x95Var.a) == 0 && pa7.t(this.b, x95Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.a + ", animationSpec=" + this.b + ")";
    }
}
