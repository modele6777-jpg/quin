package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j8f implements z3b {
    public final String a;

    public j8f(em7 em7Var) {
        em7Var.getClass();
        this.a = fm7.a(em7Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && j8f.class == obj.getClass() && this.a.equals(((j8f) obj).a);
    }

    @Override // defpackage.z3b
    public final String getValue() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
