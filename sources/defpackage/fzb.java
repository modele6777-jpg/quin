package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fzb {
    public final int a;
    public final es b;

    public fzb(int i, es esVar) {
        this.a = i;
        this.b = esVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzb)) {
            return false;
        }
        fzb fzbVar = (fzb) obj;
        return this.a == fzbVar.a && pa7.t(this.b, fzbVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        es esVar = this.b;
        return iHashCode + (esVar == null ? 0 : esVar.hashCode());
    }

    public final String toString() {
        return "Result3A(status=" + ((Object) ("Status(value=" + this.a + ')')) + ", frameMetadata=" + this.b + ')';
    }
}
