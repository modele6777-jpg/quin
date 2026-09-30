package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fzd implements vz {
    public final vz a;
    public final long b;

    public fzd(ze5 ze5Var, long j) {
        this.a = ze5Var;
        this.b = j;
    }

    @Override // defpackage.vz
    public final psf a(y6f y6fVar) {
        return new gzd(this.a.a(y6fVar), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fzd)) {
            return false;
        }
        fzd fzdVar = (fzd) obj;
        return fzdVar.b == this.b && pa7.t(fzdVar.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
