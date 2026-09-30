package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class aec {
    public final float a;
    public final long b;
    public final ze5 c;

    public aec(float f, long j, ze5 ze5Var) {
        this.a = f;
        this.b = j;
        this.c = ze5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aec)) {
            return false;
        }
        aec aecVar = (aec) obj;
        return Float.compare(this.a, aecVar.a) == 0 && r2f.a(this.b, aecVar.b) && pa7.t(this.c, aecVar.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        int i = r2f.c;
        return this.c.hashCode() + ib8.b(iHashCode, 31, this.b);
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + r2f.d(this.b) + ", animationSpec=" + this.c + ")";
    }
}
