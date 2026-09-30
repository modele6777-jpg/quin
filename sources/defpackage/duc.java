package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class duc {
    public final float a;
    public final float b;

    public duc(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof duc)) {
            return false;
        }
        return yi4.b(0.0f, 0.0f) && yi4.b(0.0f, 0.0f) && yi4.b(0.0f, 0.0f) && yi4.b(this.a, ((duc) obj).a) && yi4.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + ub3.a(this.a, ub3.a(0.0f, ub3.a(0.0f, Float.hashCode(0.0f) * 31, 31), 31), 31);
    }
}
