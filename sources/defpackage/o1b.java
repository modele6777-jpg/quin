package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o1b implements q1b {
    public final nf1 a;

    public o1b(nf1 nf1Var) {
        this.a = nf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o1b) && pa7.t(this.a, ((o1b) obj).a);
    }

    public final int hashCode() {
        nf1 nf1Var = this.a;
        if (nf1Var == null) {
            return 0;
        }
        return Integer.hashCode(nf1Var.a);
    }

    public final String toString() {
        return "Error(lastCameraError=" + this.a + ')';
    }
}
