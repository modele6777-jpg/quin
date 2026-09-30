package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dh2 implements srf {
    public final a26 a;

    public dh2(a26 a26Var) {
        this.a = a26Var;
    }

    @Override // defpackage.srf
    public final Object a(u8a u8aVar) {
        return this.a.d(u8aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dh2) && pa7.t(this.a, ((dh2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ")";
    }
}
