package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lf0 extends nf0 {
    public final String l;
    public final String m;

    public lf0(String str, String str2) {
        str2.getClass();
        this.l = str;
        this.m = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf0)) {
            return false;
        }
        lf0 lf0Var = (lf0) obj;
        return this.l.equals(lf0Var.l) && pa7.t(this.m, lf0Var.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + (this.l.hashCode() * 31);
    }

    public final String toString() {
        return tec.m("AstImage(title=", this.l, ", destination=", this.m, ")");
    }
}
