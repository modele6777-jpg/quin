package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dh0 {
    public final Object a;
    public final vg0 b;
    public final aw6 c;

    public dh0(Object obj, vg0 vg0Var, aw6 aw6Var) {
        this.a = obj;
        this.b = vg0Var;
        this.c = aw6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh0)) {
            return false;
        }
        dh0 dh0Var = (dh0) obj;
        vg0 vg0Var = dh0Var.b;
        vg0 vg0Var2 = this.b;
        return pa7.t(vg0Var2, vg0Var) && vg0Var2.a(this.a, dh0Var.a) && pa7.t(this.c, dh0Var.c);
    }

    public final int hashCode() {
        vg0 vg0Var = this.b;
        return this.c.hashCode() + ((vg0Var.b(this.a) + (vg0Var.hashCode() * 31)) * 31);
    }
}
