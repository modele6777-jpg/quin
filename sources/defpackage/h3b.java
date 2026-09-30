package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h3b {
    public final Object a;
    public final yv9 b;

    public h3b(Object obj, yv9 yv9Var) {
        this.a = obj;
        this.b = yv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h3b) {
            h3b h3bVar = (h3b) obj;
            if (this.a == h3bVar.a && this.b.equals(h3bVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Entry(token=" + this.a + ", pushBadCard=" + this.b + ")";
    }
}
