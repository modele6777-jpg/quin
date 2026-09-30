package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w8b {
    public final p5d a;
    public final hc2 b;
    public final i88 c;
    public final s91 d;
    public final bl6 e;

    public w8b(p5d p5dVar, hc2 hc2Var, i88 i88Var, s91 s91Var, bl6 bl6Var) {
        this.a = p5dVar;
        this.b = hc2Var;
        this.c = i88Var;
        this.d = s91Var;
        this.e = bl6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w8b) {
            w8b w8bVar = (w8b) obj;
            if (this.a.equals(w8bVar.a) && this.b == w8bVar.b && this.c.equals(w8bVar.c) && this.d == w8bVar.d && this.e.equals(w8bVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "QuinTokens(shapes=" + this.a + ", colors=" + this.b + ", list=" + this.c + ", calendar=" + this.d + ", history=" + this.e + ")";
    }
}
