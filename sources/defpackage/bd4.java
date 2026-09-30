package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bd4 implements jd4 {
    public final String a;
    public final dd4 b;

    public bd4(String str, dd4 dd4Var) {
        str.getClass();
        dd4Var.getClass();
        this.a = str;
        this.b = dd4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd4)) {
            return false;
        }
        bd4 bd4Var = (bd4) obj;
        return pa7.t(this.a, bd4Var.a) && pa7.t(this.b, bd4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CardsExplanation(text=" + this.a + ", prev=" + this.b + ")";
    }
}
