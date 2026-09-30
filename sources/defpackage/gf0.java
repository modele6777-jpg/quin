package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gf0 extends df0 {
    public final char l;
    public final int m;
    public final int n;
    public final String o;
    public final String p;

    public gf0(char c, int i, int i2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.l = c;
        this.m = i;
        this.n = i2;
        this.o = str;
        this.p = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf0)) {
            return false;
        }
        gf0 gf0Var = (gf0) obj;
        return this.l == gf0Var.l && this.m == gf0Var.m && this.n == gf0Var.n && pa7.t(this.o, gf0Var.o) && pa7.t(this.p, gf0Var.p);
    }

    public final int hashCode() {
        return this.p.hashCode() + ub3.c(ub3.b(this.n, ub3.b(this.m, Character.hashCode(this.l) * 31, 31), 31), 31, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AstFencedCodeBlock(fenceChar=");
        sb.append(this.l);
        sb.append(", fenceLength=");
        sb.append(this.m);
        sb.append(", fenceIndent=");
        sb.append(this.n);
        sb.append(", info=");
        sb.append(this.o);
        sb.append(", literal=");
        return ks0.l(sb, this.p, ")");
    }
}
