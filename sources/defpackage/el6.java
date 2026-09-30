package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class el6 implements fl6 {
    public final q9a a;
    public final boolean b;
    public final boolean c;

    public el6(q9a q9aVar, boolean z, boolean z2) {
        this.a = q9aVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el6)) {
            return false;
        }
        el6 el6Var = (el6) obj;
        return this.a.equals(el6Var.a) && this.b == el6Var.b && this.c == el6Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ub3.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(historyGroup=");
        sb.append(this.a);
        sb.append(", loadingMore=");
        sb.append(this.b);
        sb.append(", hasMore=");
        return ub3.m(sb, this.c, ")");
    }
}
