package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q7d {
    public final bo8 a;
    public final float b;
    public final float c;

    public q7d(bo8 bo8Var, float f, float f2) {
        this.a = bo8Var;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7d)) {
            return false;
        }
        q7d q7dVar = (q7d) obj;
        return this.a.equals(q7dVar.a) && Float.compare(this.b, q7dVar.b) == 0 && Float.compare(this.c, q7dVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + ub3.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ShareDocumentLayout(root=" + this.a + ", scaleX=" + this.b + ", scaleY=" + this.c + ")";
    }
}
