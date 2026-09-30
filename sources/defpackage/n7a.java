package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n7a implements o7a {
    public final e8d a;
    public final gbd b;
    public final String c;

    public n7a(e8d e8dVar, gbd gbdVar, String str) {
        e8dVar.getClass();
        gbdVar.getClass();
        this.a = e8dVar;
        this.b = gbdVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7a)) {
            return false;
        }
        n7a n7aVar = (n7a) obj;
        return this.a == n7aVar.a && this.b == n7aVar.b && this.c.equals(n7aVar.c);
    }

    @Override // defpackage.o7a
    public final e8d getFormat() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Share(format=");
        sb.append(this.a);
        sb.append(", shareType=");
        sb.append(this.b);
        sb.append(", operationId=");
        return ks0.l(sb, this.c, ")");
    }
}
