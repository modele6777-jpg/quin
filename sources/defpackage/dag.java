package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dag {
    public final Object a;
    public final boolean b;

    public dag(Object obj, boolean z) {
        this.a = obj;
        this.b = z;
    }

    public static dag a(dag dagVar, Object obj, boolean z, int i) {
        if ((i & 1) != 0) {
            obj = dagVar.a;
        }
        if ((i & 2) != 0) {
            z = dagVar.b;
        }
        dagVar.getClass();
        return new dag(obj, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dag)) {
            return false;
        }
        dag dagVar = (dag) obj;
        return pa7.t(this.a, dagVar.a) && this.b == dagVar.b;
    }

    public final int hashCode() {
        Object obj = this.a;
        return Boolean.hashCode(this.b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "WithMigrationStatus(qualifier=" + this.a + ", isForWarningOnly=" + this.b + ')';
    }
}
