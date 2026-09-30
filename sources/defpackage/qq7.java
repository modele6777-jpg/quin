package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qq7 {
    public final em7 a;

    public qq7(em7 em7Var) {
        em7Var.getClass();
        this.a = em7Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qq7) {
            return pa7.t(this.a, ((qq7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return af1.R(this.a).getName();
    }
}
