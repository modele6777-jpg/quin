package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class axf {
    public final wae a;
    public final wy6 b;
    public final t2f c;

    public axf(wae waeVar, wy6 wy6Var, t2f t2fVar) {
        this.a = waeVar;
        this.b = wy6Var;
        this.c = t2fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axf)) {
            return false;
        }
        axf axfVar = (axf) obj;
        return pa7.t(this.a, axfVar.a) && this.b == axfVar.b && this.c.equals(axfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ViewfinderArgs(surfaceRequest=" + this.a + ", implementationMode=" + this.b + ", transformationInfo=" + this.c + ')';
    }
}
