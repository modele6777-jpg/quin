package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dr1 {
    public final long a;
    public final float b;

    public dr1(long j, float f) {
        this.a = j;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr1)) {
            return false;
        }
        dr1 dr1Var = (dr1) obj;
        return hl9.c(this.a, dr1Var.a) && Float.compare(this.b, dr1Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CardFaceHighlight(center=" + hl9.i(this.a) + ", intensity=" + this.b + ")";
    }
}
