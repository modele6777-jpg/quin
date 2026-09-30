package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fd7 {
    public final bv7 a;
    public final bv7 b;

    public fd7(bv7 bv7Var, bv7 bv7Var2) {
        bv7Var.getClass();
        bv7Var2.getClass();
        this.a = bv7Var;
        this.b = bv7Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd7)) {
            return false;
        }
        fd7 fd7Var = (fd7) obj;
        return pa7.t(this.a, fd7Var.a) && pa7.t(this.b, fd7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ItemCoordinates(itemRootCoordinates=" + this.a + ", firstDayCoordinates=" + this.b + ")";
    }
}
