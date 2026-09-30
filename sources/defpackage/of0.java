package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class of0 extends nf0 {
    public final String l;
    public final String m;

    public of0(String str, String str2) {
        str.getClass();
        this.l = str;
        this.m = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of0)) {
            return false;
        }
        of0 of0Var = (of0) obj;
        return pa7.t(this.l, of0Var.l) && this.m.equals(of0Var.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + (this.l.hashCode() * 31);
    }

    public final String toString() {
        return tec.m("AstLink(destination=", this.l, ", title=", this.m, ")");
    }
}
