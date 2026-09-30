package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ae9 {
    public final String a;
    public final String b;
    public final xd9 c;
    public final r95 d;

    public ae9(String str, String str2, xd9 xd9Var, r95 r95Var) {
        this.a = str;
        this.b = str2;
        this.c = xd9Var;
        this.d = r95Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae9)) {
            return false;
        }
        ae9 ae9Var = (ae9) obj;
        return this.a.equals(ae9Var.a) && pa7.t(this.b, ae9Var.b) && this.c.equals(ae9Var.c) && pa7.t(this.d, ae9Var.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + ib8.c(this.c.a, ub3.c(this.a.hashCode() * 31, 31, this.b), 961);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("NetworkRequest(url=", this.a, ", method=", this.b, ", headers=");
        sbO.append(this.c);
        sbO.append(", body=null, extras=");
        sbO.append(this.d);
        sbO.append(")");
        return sbO.toString();
    }
}
