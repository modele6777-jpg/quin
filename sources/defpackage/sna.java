package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sna extends dj6 {
    public final tna j;
    public final tna k;

    public sna(tna tnaVar, tna tnaVar2) {
        this.j = tnaVar;
        this.k = tnaVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sna)) {
            return false;
        }
        sna snaVar = (sna) obj;
        return this.j.equals(snaVar.j) && this.k.equals(snaVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + (this.j.hashCode() * 31);
    }

    public final String toString() {
        return "Between(min=" + this.j + ", max=" + this.k + ")";
    }
}
