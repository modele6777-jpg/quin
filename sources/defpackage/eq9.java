package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class eq9 {
    public final kp a;
    public final nf1 b;

    public eq9(kp kpVar, nf1 nf1Var, int i) {
        kpVar = (i & 1) != 0 ? null : kpVar;
        nf1Var = (i & 2) != 0 ? null : nf1Var;
        this.a = kpVar;
        this.b = nf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq9)) {
            return false;
        }
        eq9 eq9Var = (eq9) obj;
        return pa7.t(this.a, eq9Var.a) && pa7.t(this.b, eq9Var.b);
    }

    public final int hashCode() {
        kp kpVar = this.a;
        int iHashCode = (kpVar == null ? 0 : kpVar.hashCode()) * 31;
        nf1 nf1Var = this.b;
        return iHashCode + (nf1Var != null ? Integer.hashCode(nf1Var.a) : 0);
    }

    public final String toString() {
        return "OpenCameraResult(cameraState=" + this.a + ", errorCode=" + this.b + ')';
    }
}
