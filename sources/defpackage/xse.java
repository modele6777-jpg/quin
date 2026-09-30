package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xse {
    public final nue a;
    public final int b;

    public xse(nue nueVar, int i) {
        this.a = nueVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xse)) {
            return false;
        }
        xse xseVar = (xse) obj;
        return this.b == xseVar.b && this.a.equals(xseVar.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
