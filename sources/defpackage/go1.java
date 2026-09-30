package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class go1 {
    public final re1 a;
    public final vd6 b;
    public final wc1 c;

    public go1(re1 re1Var, vd6 vd6Var, wc1 wc1Var) {
        re1Var.getClass();
        this.a = re1Var;
        this.b = vd6Var;
        this.c = wc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof go1) {
            go1 go1Var = (go1) obj;
            return pa7.t(this.a, go1Var.a) && this.b == go1Var.b && this.c == go1Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ConfiguredCameraCaptureSession(session=" + this.a + ", processor=" + this.b + ", captureSequenceProcessor=" + this.c + ')';
    }
}
