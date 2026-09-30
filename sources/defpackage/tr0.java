package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tr0 {
    public final lf1 a;
    public final kp b;

    public tr0(lf1 lf1Var, kp kpVar) {
        this.a = lf1Var;
        this.b = kpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr0)) {
            return false;
        }
        tr0 tr0Var = (tr0) obj;
        return pa7.t(this.a, tr0Var.a) && pa7.t(this.b, tr0Var.b);
    }

    public final int hashCode() {
        lf1 lf1Var = this.a;
        int iHashCode = (lf1Var == null ? 0 : lf1Var.hashCode()) * 31;
        kp kpVar = this.b;
        return iHashCode + (kpVar != null ? kpVar.hashCode() : 0);
    }

    public final String toString() {
        return "AwaitOpenCameraResult(cameraDeviceWrapper=" + this.a + ", androidCameraState=" + this.b + ')';
    }
}
