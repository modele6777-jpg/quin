package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hu6 implements ju6 {
    public final int a;
    public final boolean b;

    public hu6(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu6)) {
            return false;
        }
        hu6 hu6Var = (hu6) obj;
        return this.a == hu6Var.a && this.b == hu6Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DrawableResource(resId=" + this.a + ", tintable=" + this.b + ")";
    }
}
