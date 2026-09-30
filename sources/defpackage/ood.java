package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ood {
    public final a26 a;
    public final ze5 b;

    public ood(ze5 ze5Var, a26 a26Var) {
        this.a = a26Var;
        this.b = ze5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ood)) {
            return false;
        }
        ood oodVar = (ood) obj;
        return pa7.t(this.a, oodVar.a) && pa7.t(this.b, oodVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ")";
    }
}
