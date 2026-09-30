package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i11 {
    public ks a = null;
    public lp b = null;
    public xl1 c = null;
    public zt d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i11)) {
            return false;
        }
        i11 i11Var = (i11) obj;
        return pa7.t(this.a, i11Var.a) && pa7.t(this.b, i11Var.b) && pa7.t(this.c, i11Var.c) && pa7.t(this.d, i11Var.d);
    }

    public final int hashCode() {
        ks ksVar = this.a;
        int iHashCode = (ksVar == null ? 0 : ksVar.hashCode()) * 31;
        lp lpVar = this.b;
        int iHashCode2 = (iHashCode + (lpVar == null ? 0 : lpVar.hashCode())) * 31;
        xl1 xl1Var = this.c;
        int iHashCode3 = (iHashCode2 + (xl1Var == null ? 0 : xl1Var.hashCode())) * 31;
        zt ztVar = this.d;
        return iHashCode3 + (ztVar != null ? ztVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ")";
    }
}
