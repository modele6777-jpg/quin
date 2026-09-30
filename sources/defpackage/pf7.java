package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pf7 {
    public final j22 a;
    public final j22 b;
    public final j22 c;

    public pf7(j22 j22Var, j22 j22Var2, j22 j22Var3) {
        this.a = j22Var;
        this.b = j22Var2;
        this.c = j22Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf7)) {
            return false;
        }
        pf7 pf7Var = (pf7) obj;
        return this.a.equals(pf7Var.a) && this.b.equals(pf7Var.b) && this.c.equals(pf7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.a + ", kotlinReadOnly=" + this.b + ", kotlinMutable=" + this.c + ')';
    }
}
