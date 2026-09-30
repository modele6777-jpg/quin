package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rw6 {
    public final pv2 a;
    public final pv2 b;
    public final pv2 c;
    public final m81 d;
    public final hld e;
    public final zdc f;
    public final bpa g;

    public rw6(pv2 pv2Var, pv2 pv2Var2, pv2 pv2Var3, m81 m81Var, hld hldVar, zdc zdcVar, bpa bpaVar) {
        this.a = pv2Var;
        this.b = pv2Var2;
        this.c = pv2Var3;
        this.d = m81Var;
        this.e = hldVar;
        this.f = zdcVar;
        this.g = bpaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw6)) {
            return false;
        }
        rw6 rw6Var = (rw6) obj;
        return pa7.t(this.a, rw6Var.a) && pa7.t(this.b, rw6Var.b) && pa7.t(this.c, rw6Var.c) && this.d == rw6Var.d && pa7.t(this.e, rw6Var.e) && this.f == rw6Var.f && this.g == rw6Var.g;
    }

    public final int hashCode() {
        pv2 pv2Var = this.a;
        int iHashCode = (pv2Var == null ? 0 : pv2Var.hashCode()) * 31;
        pv2 pv2Var2 = this.b;
        int iHashCode2 = (iHashCode + (pv2Var2 == null ? 0 : pv2Var2.hashCode())) * 31;
        pv2 pv2Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (pv2Var3 == null ? 0 : pv2Var3.hashCode())) * 961;
        m81 m81Var = this.d;
        int iHashCode4 = (iHashCode3 + (m81Var == null ? 0 : m81Var.hashCode())) * 961;
        qqf qqfVar = qqf.c;
        int iHashCode5 = (qqfVar.hashCode() + ((qqfVar.hashCode() + ((qqfVar.hashCode() + iHashCode4) * 31)) * 31)) * 31;
        hld hldVar = this.e;
        int iHashCode6 = (iHashCode5 + (hldVar == null ? 0 : hldVar.hashCode())) * 31;
        zdc zdcVar = this.f;
        int iHashCode7 = (iHashCode6 + (zdcVar == null ? 0 : zdcVar.hashCode())) * 31;
        bpa bpaVar = this.g;
        return iHashCode7 + (bpaVar != null ? bpaVar.hashCode() : 0);
    }

    public final String toString() {
        qqf qqfVar = qqf.c;
        return "Defined(fileSystem=null, interceptorCoroutineContext=" + this.a + ", fetcherCoroutineContext=" + this.b + ", decoderCoroutineContext=" + this.c + ", memoryCachePolicy=null, diskCachePolicy=" + this.d + ", networkCachePolicy=null, placeholderFactory=" + qqfVar + ", errorFactory=" + qqfVar + ", fallbackFactory=" + qqfVar + ", sizeResolver=" + this.e + ", scale=" + this.f + ", precision=" + this.g + ")";
    }
}
