package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s4d extends vtb {
    public final float a;
    public final float b;

    public s4d(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4d)) {
            return false;
        }
        s4d s4dVar = (s4d) obj;
        return yi4.b(this.a, s4dVar.a) && yi4.b(this.b, s4dVar.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return tec.m("Rectangle(topCornerRadius=", yi4.c(this.a), ", bottomCornerRadius=", yi4.c(this.b), ")");
    }
}
