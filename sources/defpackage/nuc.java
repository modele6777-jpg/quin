package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nuc implements puc {
    public final z6e a;

    public nuc(z6e z6eVar) {
        z6eVar.getClass();
        this.a = z6eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nuc) && pa7.t(this.a, ((nuc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Monthly(product=" + this.a + ")";
    }
}
