package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cc9 extends eb3 {
    public final vb9 Z;

    public cc9(vb9 vb9Var) {
        vb9Var.getClass();
        this.Z = vb9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && cc9.class == obj.getClass() && pa7.t(this.Z, ((cc9) obj).Z);
    }

    public final int hashCode() {
        return this.Z.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.Z + ", direction=-1)";
    }
}
