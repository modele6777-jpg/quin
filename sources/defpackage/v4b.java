package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v4b implements w4b {
    public final gd4 a;

    public v4b(gd4 gd4Var) {
        gd4Var.getClass();
        this.a = gd4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v4b) && pa7.t(this.a, ((v4b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Confirm(state=" + this.a + ")";
    }
}
