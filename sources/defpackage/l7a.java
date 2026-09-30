package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l7a {
    public final o7a a;
    public final Boolean b;

    public l7a(o7a o7aVar, Boolean bool) {
        o7aVar.getClass();
        this.a = o7aVar;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7a)) {
            return false;
        }
        l7a l7aVar = (l7a) obj;
        return pa7.t(this.a, l7aVar.a) && pa7.t(this.b, l7aVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "PendingSharePermission(action=" + this.a + ", granted=" + this.b + ")";
    }
}
