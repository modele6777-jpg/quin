package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hs3 {
    public final isa a;
    public final Object b;

    public hs3(isa isaVar, Object obj) {
        this.a = isaVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs3)) {
            return false;
        }
        hs3 hs3Var = (hs3) obj;
        return this.a.equals(hs3Var.a) && this.b.equals(hs3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "DefaultPreferencePair(key=" + this.a + ", default=" + this.b + ")";
    }
}
