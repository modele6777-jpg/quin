package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k10 {
    public final h10 a;

    public k10(h10 h10Var) {
        h10Var.getClass();
        this.a = h10Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k10) {
            return pa7.t(((k10) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
