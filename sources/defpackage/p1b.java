package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p1b implements q1b {
    public final id a;
    public final h99 b;

    public p1b(id idVar, h99 h99Var) {
        this.a = idVar;
        this.b = h99Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1b)) {
            return false;
        }
        p1b p1bVar = (p1b) obj;
        return this.a == p1bVar.a && this.b == p1bVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(activeCamera=" + this.a + ", token=" + this.b + ')';
    }
}
