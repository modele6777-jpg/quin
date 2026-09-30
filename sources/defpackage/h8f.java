package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h8f {
    public final c8f a;
    public final tf7 b;

    public h8f(c8f c8fVar, tf7 tf7Var) {
        c8fVar.getClass();
        tf7Var.getClass();
        this.a = c8fVar;
        this.b = tf7Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h8f)) {
            return false;
        }
        h8f h8fVar = (h8f) obj;
        return pa7.t(h8fVar.a, this.a) && pa7.t(h8fVar.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        return this.b.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.a + ", typeAttr=" + this.b + ')';
    }
}
