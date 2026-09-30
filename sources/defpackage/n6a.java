package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n6a implements o6a {
    public final int a;
    public final gbd b;

    public n6a(int i, gbd gbdVar) {
        this.a = i;
        this.b = gbdVar;
    }

    @Override // defpackage.o6a
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6a)) {
            return false;
        }
        n6a n6aVar = (n6a) obj;
        return this.a == n6aVar.a && this.b == n6aVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Share(pageIndex=" + this.a + ", shareType=" + this.b + ")";
    }
}
