package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u7d implements r7d {
    public final dd2 a;
    public final jx0 b;

    public u7d(dd2 dd2Var, jx0 jx0Var) {
        this.a = dd2Var;
        this.b = jx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7d)) {
            return false;
        }
        u7d u7dVar = (u7d) obj;
        return pa7.t(this.a, u7dVar.a) && pa7.t(this.b, u7dVar.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShareDocumentSlot(content=" + this.a + ", alignment=" + this.b + ")";
    }

    public u7d(dd2 dd2Var) {
        this(dd2Var, ndb.Y);
    }
}
