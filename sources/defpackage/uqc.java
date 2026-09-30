package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uqc {
    public final xqc a;
    public final lsc b;
    public final boolean c;

    public uqc(xqc xqcVar, lsc lscVar, boolean z) {
        this.a = xqcVar;
        this.b = lscVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uqc) {
            uqc uqcVar = (uqc) obj;
            if (this.a == uqcVar.a && this.b.equals(uqcVar.b) && this.c == uqcVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeasonalRootBinding(viewModel=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", analyticsEnabled=");
        return ub3.m(sb, this.c, ")");
    }
}
