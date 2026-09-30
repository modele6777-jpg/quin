package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class v4d implements w4d {
    public final hu2 a;
    public final boolean b;
    public final boolean c;
    public final float d;

    public v4d(hu2 hu2Var, boolean z, boolean z2) {
        this.a = hu2Var;
        this.b = z;
        this.c = z2;
        this.d = (hu2Var.c() == -1 && hu2Var.d() == -1) ? 1.0f : (hu2Var.c() == -1 || hu2Var.d() == -1) ? 0.0f : hu2Var.c() / hu2Var.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4d)) {
            return false;
        }
        v4d v4dVar = (v4d) obj;
        return this.a.equals(v4dVar.a) && this.b == v4dVar.b && this.c == v4dVar.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode + r2) * 31;
        boolean z2 = this.c;
        return i + (z2 ? 1 : z2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DrawableShape(image=");
        sb.append(this.a);
        sb.append(", tint=");
        sb.append(this.b);
        sb.append(", applyAlpha=");
        return ub3.m(sb, this.c, ")");
    }
}
