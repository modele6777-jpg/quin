package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l3b {
    public final Object a;
    public final sg4 b;

    public l3b(Object obj, sg4 sg4Var) {
        obj.getClass();
        this.a = obj;
        this.b = sg4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l3b) {
            l3b l3bVar = (l3b) obj;
            return pa7.t(this.a, l3bVar.a) && this.b == l3bVar.b;
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
