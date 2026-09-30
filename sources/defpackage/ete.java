package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ete {
    public static final ete c = new ete(w6c.l(0), w6c.l(0));
    public final long a;
    public final long b;

    public ete(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ete)) {
            return false;
        }
        ete eteVar = (ete) obj;
        return wue.a(this.a, eteVar.a) && wue.a(this.b, eteVar.b);
    }

    public final int hashCode() {
        xue[] xueVarArr = wue.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return tec.m("TextIndent(firstLine=", wue.e(this.a), ", restLine=", wue.e(this.b), ")");
    }
}
