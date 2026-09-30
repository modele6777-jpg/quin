package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vna {
    public final bo8 a;
    public final double b;
    public final double c;

    public vna(bo8 bo8Var, double d, double d2) {
        bo8Var.getClass();
        this.a = bo8Var;
        this.b = d;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vna)) {
            return false;
        }
        vna vnaVar = (vna) obj;
        return pa7.t(this.a, vnaVar.a) && Double.compare(this.b, vnaVar.b) == 0 && Double.compare(this.c, vnaVar.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + ((Double.hashCode(this.b) + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PositionedShareDocumentNode(node=" + this.a + ", x=" + this.b + ", y=" + this.c + ")";
    }
}
