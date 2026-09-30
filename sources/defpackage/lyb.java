package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lyb implements oyb {
    public final aw2 a;

    public lyb(aw2 aw2Var) {
        aw2Var.getClass();
        this.a = aw2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lyb) && pa7.t(this.a, ((lyb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loading(cancelable=" + this.a + ")";
    }
}
