package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j3b {
    public final Object a;
    public final w b;

    public j3b(Object obj, w wVar) {
        this.a = obj;
        this.b = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j3b) {
            j3b j3bVar = (j3b) obj;
            if (this.a == j3bVar.a && this.b.equals(j3bVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Entry(token=" + this.a + ", apply=" + this.b + ")";
    }
}
