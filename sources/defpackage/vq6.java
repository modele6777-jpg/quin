package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vq6 extends cgf {
    public final uw9 e;

    public vq6(uw9 uw9Var) {
        super(txe.a, uw9Var == uw9.b ? 2 : 1, uw9Var == uw9.c ? 2 : null);
        this.e = uw9Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vq6) {
            return this.e == ((vq6) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
