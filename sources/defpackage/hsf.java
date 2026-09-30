package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hsf {
    public float a;
    public float b;

    public hsf(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsf)) {
            return false;
        }
        hsf hsfVar = (hsf) obj;
        return Float.compare(this.a, hsfVar.a) == 0 && Float.compare(this.b, hsfVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return kv2.k("Vector(x=", this.a, ", y=", this.b, ")");
    }
}
