package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rif {
    public final a26 a;
    public final fe6 b;
    public final c0d c;
    public final lw7 d;

    public rif(a26 a26Var, fe6 fe6Var, c0d c0dVar, lw7 lw7Var) {
        a26Var.getClass();
        this.a = a26Var;
        this.b = fe6Var;
        this.c = c0dVar;
        this.d = lw7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!rif.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        rif rifVar = (rif) obj;
        return this.c == rifVar.c && this.b == rifVar.b;
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.c.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "UseCaseCameraConfig(cameraGraphFactory=" + this.a + ", graphStateToCameraStateAdapter=" + this.b + ", sessionConfigAdapter=" + this.c + ", sessionProcessor=null, lazyCreationResult=" + this.d + ')';
    }
}
