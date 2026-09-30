package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o7d {
    public final r7d a;
    public final yi4 b;

    public o7d(r7d r7dVar, yi4 yi4Var, int i) {
        yi4Var = (i & 4) != 0 ? null : yi4Var;
        r7dVar.getClass();
        this.a = r7dVar;
        this.b = yi4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7d)) {
            return false;
        }
        o7d o7dVar = (o7d) obj;
        return pa7.t(this.a, o7dVar.a) && Float.compare(1.0f, 1.0f) == 0 && pa7.t(this.b, o7dVar.b);
    }

    public final int hashCode() {
        int iA = ub3.a(1.0f, this.a.hashCode() * 31, 31);
        yi4 yi4Var = this.b;
        return iA + (yi4Var == null ? 0 : Float.hashCode(yi4Var.a));
    }

    public final String toString() {
        return "ShareDocumentCell(node=" + this.a + ", weight=1.0, width=" + this.b + ")";
    }
}
