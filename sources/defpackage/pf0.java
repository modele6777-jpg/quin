package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pf0 extends df0 {
    public final String l;
    public final String m;
    public final String n;

    public pf0(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.l = str;
        this.m = str2;
        this.n = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf0)) {
            return false;
        }
        pf0 pf0Var = (pf0) obj;
        return pa7.t(this.l, pf0Var.l) && pa7.t(this.m, pf0Var.m) && this.n.equals(pf0Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + ub3.c(this.l.hashCode() * 31, 31, this.m);
    }

    public final String toString() {
        return ks0.l(ib8.o("AstLinkReferenceDefinition(label=", this.l, ", destination=", this.m, ", title="), this.n, ")");
    }
}
