package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iga {
    public final aga a;
    public final ofa b;

    public iga() {
        this(null, new ofa());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iga)) {
            return false;
        }
        iga igaVar = (iga) obj;
        return pa7.t(this.b, igaVar.b) && pa7.t(this.a, igaVar.a);
    }

    public final int hashCode() {
        aga agaVar = this.a;
        int iHashCode = (agaVar != null ? agaVar.hashCode() : 0) * 31;
        ofa ofaVar = this.b;
        return iHashCode + (ofaVar != null ? ofaVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ")";
    }

    public iga(aga agaVar, ofa ofaVar) {
        this.a = agaVar;
        this.b = ofaVar;
    }
}
