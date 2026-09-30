package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y7d {
    public final e95 a;
    public final x7d b;

    public y7d(e95 e95Var, x7d x7dVar) {
        this.a = e95Var;
        this.b = x7dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7d)) {
            return false;
        }
        y7d y7dVar = (y7d) obj;
        return pa7.t(this.a, y7dVar.a) && this.b == y7dVar.b;
    }

    public final int hashCode() {
        e95 e95Var = this.a;
        return this.b.hashCode() + ((e95Var == null ? 0 : e95Var.hashCode()) * 31);
    }

    public final String toString() {
        return "ShareExternalReturnResolution(operation=" + this.a + ", action=" + this.b + ")";
    }
}
