package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kb5 implements lb5 {
    public final String a;
    public final gf6 b;

    public kb5(String str, gf6 gf6Var) {
        gf6Var.getClass();
        this.a = str;
        this.b = gf6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb5)) {
            return false;
        }
        kb5 kb5Var = (kb5) obj;
        return this.a.equals(kb5Var.a) && pa7.t(this.b, kb5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UseCaseMissing(requiredUseCases=" + this.a + ", featureRequiring=" + this.b + ')';
    }
}
