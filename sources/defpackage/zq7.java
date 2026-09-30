package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zq7 {
    public static final zq7 c = new zq7(null, null);
    public final br7 a;
    public final wq7 b;

    public zq7(br7 br7Var, wq7 wq7Var) {
        this.a = br7Var;
        this.b = wq7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq7)) {
            return false;
        }
        zq7 zq7Var = (zq7) obj;
        return this.a == zq7Var.a && pa7.t(this.b, zq7Var.b);
    }

    public final int hashCode() {
        br7 br7Var = this.a;
        int iHashCode = (br7Var == null ? 0 : br7Var.hashCode()) * 31;
        wq7 wq7Var = this.b;
        return iHashCode + (wq7Var != null ? wq7Var.hashCode() : 0);
    }

    public final String toString() {
        return "KmTypeProjection(variance=" + this.a + ", type=" + this.b + ')';
    }
}
