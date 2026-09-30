package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a3d implements vs4 {
    public final int a;
    public final int b;

    public a3d(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.vs4
    public final void a(er0 er0Var) {
        int iO = mh3.o(this.a, 0, ((p90) er0Var.f).C());
        int iO2 = mh3.o(this.b, 0, ((p90) er0Var.f).C());
        if (iO < iO2) {
            er0Var.s(iO, iO2);
        } else {
            er0Var.s(iO2, iO);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3d)) {
            return false;
        }
        a3d a3dVar = (a3d) obj;
        return this.a == a3dVar.a && this.b == a3dVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return kv2.h(this.a, this.b, "SetSelectionCommand(start=", ", end=", ")");
    }
}
