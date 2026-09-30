package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k68 extends l68 {
    public final String a;
    public final zte b;

    public k68(String str, zte zteVar) {
        this.a = str;
        this.b = zteVar;
    }

    @Override // defpackage.l68
    public final zte a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k68)) {
            return false;
        }
        k68 k68Var = (k68) obj;
        return pa7.t(this.a, k68Var.a) && pa7.t(this.b, k68Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        zte zteVar = this.b;
        return (iHashCode + (zteVar != null ? zteVar.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return ib8.j("LinkAnnotation.Url(url=", this.a, ")");
    }
}
