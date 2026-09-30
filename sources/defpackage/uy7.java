package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uy7 {
    public final int a;
    public final int b;

    public uy7(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!(i >= 0)) {
            l37.a("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        l37.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy7)) {
            return false;
        }
        uy7 uy7Var = (uy7) obj;
        return this.a == uy7Var.a && this.b == uy7Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return kv2.h(this.a, this.b, "Interval(start=", ", end=", ")");
    }
}
