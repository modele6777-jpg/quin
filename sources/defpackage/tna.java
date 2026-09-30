package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tna extends dj6 {
    public final double j;
    public final double k;

    public tna(double d, double d2) {
        this.j = d;
        this.k = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tna)) {
            return false;
        }
        tna tnaVar = (tna) obj;
        return Double.compare(this.j, tnaVar.j) == 0 && Double.compare(this.k, tnaVar.k) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.k) + (Double.hashCode(this.j) * 31);
    }

    public final String toString() {
        return "Relative(x=" + this.j + ", y=" + this.k + ")";
    }
}
