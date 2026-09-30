package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ou0 {
    public final float a;

    public /* synthetic */ ou0(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ou0) {
            return Float.compare(this.a, ((ou0) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return kv2.j("BaselineShift(multiplier=", this.a, ")");
    }
}
