package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rm8 {
    public final String a;
    public final z67 b;

    public rm8(String str, z67 z67Var) {
        this.a = str;
        this.b = z67Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm8)) {
            return false;
        }
        rm8 rm8Var = (rm8) obj;
        return this.a.equals(rm8Var.a) && this.b.equals(rm8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
