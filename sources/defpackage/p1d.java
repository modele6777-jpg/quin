package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p1d implements vs4 {
    public final int a;
    public final int b;

    public p1d(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.vs4
    public final void a(er0 er0Var) {
        boolean z = er0Var.d != -1;
        p90 p90Var = (p90) er0Var.f;
        if (z) {
            er0Var.d = -1;
            er0Var.e = -1;
        }
        int iO = mh3.o(this.a, 0, p90Var.C());
        int iO2 = mh3.o(this.b, 0, p90Var.C());
        if (iO != iO2) {
            if (iO < iO2) {
                er0Var.p(iO, iO2);
            } else {
                er0Var.p(iO2, iO);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1d)) {
            return false;
        }
        p1d p1dVar = (p1d) obj;
        return this.a == p1dVar.a && this.b == p1dVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return kv2.h(this.a, this.b, "SetComposingRegionCommand(start=", ", end=", ")");
    }
}
