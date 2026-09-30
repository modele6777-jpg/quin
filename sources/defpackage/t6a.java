package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t6a {
    public final String a;
    public final r8a b;
    public final ei9 c;

    public t6a(String str, r8a r8aVar, ei9 ei9Var) {
        str.getClass();
        this.a = str;
        this.b = r8aVar;
        this.c = ei9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6a)) {
            return false;
        }
        t6a t6aVar = (t6a) obj;
        return pa7.t(this.a, t6aVar.a) && this.b == t6aVar.b && this.c.equals(t6aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PendingPermissionResult(occurrenceId=" + this.a + ", method=" + this.b + ", trackingContext=" + this.c + ")";
    }
}
