package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rna extends dj6 {
    public final float j;
    public final float k;

    public rna(float f, float f2) {
        this.j = f;
        this.k = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rna)) {
            return false;
        }
        rna rnaVar = (rna) obj;
        return Float.compare(this.j, rnaVar.j) == 0 && Float.compare(this.k, rnaVar.k) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.k) + (Float.hashCode(this.j) * 31);
    }

    public final String toString() {
        return kv2.k("Absolute(x=", this.j, ", y=", this.k, ")");
    }
}
