package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w2f {
    public final k00 a;
    public final sl9 b;

    public w2f(k00 k00Var, sl9 sl9Var) {
        this.a = k00Var;
        this.b = sl9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2f)) {
            return false;
        }
        w2f w2fVar = (w2f) obj;
        return pa7.t(this.a, w2fVar.a) && this.b.equals(w2fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ")";
    }
}
