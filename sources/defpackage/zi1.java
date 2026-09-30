package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zi1 {
    public final og1 a;
    public final io0 b;

    public zi1(og1 og1Var) {
        this.a = og1Var;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi1)) {
            return false;
        }
        zi1 zi1Var = (zi1) obj;
        return this.a == zi1Var.a && pa7.t(this.b, zi1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        io0 io0Var = this.b;
        return iHashCode + (io0Var == null ? 0 : io0Var.hashCode());
    }

    public final String toString() {
        return "CombinedCameraState(state=" + this.a + ", error=" + this.b + ')';
    }

    public zi1(og1 og1Var, io0 io0Var) {
        this.a = og1Var;
        this.b = io0Var;
    }
}
