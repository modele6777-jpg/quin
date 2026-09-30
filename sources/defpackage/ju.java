package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ju implements mia {
    public final int b;

    public ju(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ju.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.b == ((ju) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return tec.f(this.b, "AndroidPointerIcon(type=", ")");
    }
}
