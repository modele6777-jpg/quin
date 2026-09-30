package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fea {
    public final long a;
    public final long b;

    public fea(long j, long j2) {
        this.a = j;
        this.b = j2;
        xue[] xueVarArr = wue.b;
        if ((j & 1095216660480L) == 0) {
            j37.a("width cannot be TextUnit.Unspecified");
        }
        if ((j2 & 1095216660480L) == 0) {
            j37.a("height cannot be TextUnit.Unspecified");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fea)) {
            return false;
        }
        fea feaVar = (fea) obj;
        return wue.a(this.a, feaVar.a) && wue.a(this.b, feaVar.b);
    }

    public final int hashCode() {
        xue[] xueVarArr = wue.b;
        return Integer.hashCode(1) + ib8.b(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return ks0.l(ib8.o("Placeholder(width=", wue.e(this.a), ", height=", wue.e(this.b), ", placeholderVerticalAlign="), "AboveBaseline", ")");
    }
}
