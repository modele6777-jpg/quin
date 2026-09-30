package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fxe {
    public static final fxe c = new fxe(0.0f, 0.0f);
    public final float a;
    public final float b;

    public fxe(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxe)) {
            return false;
        }
        fxe fxeVar = (fxe) obj;
        return Float.compare(this.a, fxeVar.a) == 0 && Float.compare(this.b, fxeVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return kv2.k("TiltState(pitch=", this.a, ", roll=", this.b, ")");
    }
}
