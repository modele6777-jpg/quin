package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ro0 {
    public final iae a;
    public final iae b;
    public final ArrayList c;

    public ro0(iae iaeVar, iae iaeVar2, ArrayList arrayList) {
        if (iaeVar == null) {
            r82.g("Null primarySurfaceEdge");
            throw null;
        }
        this.a = iaeVar;
        if (iaeVar2 == null) {
            r82.g("Null secondarySurfaceEdge");
            throw null;
        }
        this.b = iaeVar2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ro0)) {
            return false;
        }
        ro0 ro0Var = (ro0) obj;
        return this.a.equals(ro0Var.a) && this.b.equals(ro0Var.b) && this.c.equals(ro0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "In{primarySurfaceEdge=" + this.a + ", secondarySurfaceEdge=" + this.b + ", outConfigs=" + this.c + "}";
    }
}
