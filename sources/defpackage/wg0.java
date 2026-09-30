package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wg0 {
    public final aw6 a;
    public final sw6 b;
    public final vg0 c;

    public wg0(aw6 aw6Var, sw6 sw6Var, vg0 vg0Var) {
        this.a = aw6Var;
        this.b = sw6Var;
        this.c = vg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg0)) {
            return false;
        }
        wg0 wg0Var = (wg0) obj;
        if (!pa7.t(this.a, wg0Var.a)) {
            return false;
        }
        vg0 vg0Var = wg0Var.c;
        vg0 vg0Var2 = this.c;
        return pa7.t(vg0Var2, vg0Var) && vg0Var2.a(this.b, wg0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        vg0 vg0Var = this.c;
        return vg0Var.b(this.b) + ((vg0Var.hashCode() + iHashCode) * 31);
    }

    public final String toString() {
        return "Input(imageLoader=" + this.a + ", request=" + this.b + ", modelEqualityDelegate=" + this.c + ")";
    }
}
