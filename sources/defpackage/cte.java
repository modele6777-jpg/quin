package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cte {
    public static final cte c = new cte(1.0f, 0.0f);
    public final float a;
    public final float b;

    public cte(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cte)) {
            return false;
        }
        cte cteVar = (cte) obj;
        return this.a == cteVar.a && this.b == cteVar.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return kv2.k("TextGeometricTransform(scaleX=", this.a, ", skewX=", this.b, ")");
    }
}
