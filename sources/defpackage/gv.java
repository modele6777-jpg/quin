package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gv {
    public x4d a;
    public long b;
    public cv7 c;
    public float d;
    public n4d e;

    public gv(x4d x4dVar, long j, cv7 cv7Var, float f, n4d n4dVar) {
        this.a = x4dVar;
        this.b = j;
        this.c = cv7Var;
        this.d = f;
        this.e = n4dVar;
    }

    public static gv a(gv gvVar) {
        return new gv(gvVar.a, gvVar.b, gvVar.c, gvVar.d, gvVar.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gv)) {
            return false;
        }
        gv gvVar = (gv) obj;
        return pa7.t(this.a, gvVar.a) && ald.a(this.b, gvVar.b) && this.c == gvVar.c && Float.compare(this.d, gvVar.d) == 0 && pa7.t(this.e, gvVar.e);
    }

    public final int hashCode() {
        int iA = ub3.a(this.d, (this.c.hashCode() + ib8.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31);
        n4d n4dVar = this.e;
        return iA + (n4dVar == null ? 0 : n4dVar.hashCode());
    }

    public final String toString() {
        return "ShadowKey(shape=" + this.a + ", size=" + ald.g(this.b) + ", layoutDirection=" + this.c + ", density=" + this.d + ", shadow=" + this.e + ")";
    }
}
