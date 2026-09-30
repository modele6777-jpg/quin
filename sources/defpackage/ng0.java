package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ng0 {
    public final long a;
    public final int b;
    public final String c;
    public final String d;

    public ng0(int i, long j, String str, String str2) {
        str2.getClass();
        this.a = j;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng0)) {
            return false;
        }
        ng0 ng0Var = (ng0) obj;
        return this.a == ng0Var.a && this.b == ng0Var.b && pa7.t(this.c, ng0Var.c) && pa7.t(this.d, ng0Var.d);
    }

    public final int hashCode() {
        int iB = ub3.b(this.b, Long.hashCode(this.a) * 31, 31);
        String str = this.c;
        return this.d.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Entry(ts=");
        sb.append(this.a);
        sb.append(", level=");
        sb.append(this.b);
        ub3.v(sb, ", tag=", this.c, ", message=", this.d);
        sb.append(")");
        return sb.toString();
    }
}
