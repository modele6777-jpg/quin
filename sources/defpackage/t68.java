package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t68 {
    public final String a;
    public final String b;
    public final String c;

    public t68(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t68)) {
            return false;
        }
        t68 t68Var = (t68) obj;
        return pa7.t(this.a, t68Var.a) && pa7.t(this.b, t68Var.b) && pa7.t(this.c, t68Var.c);
    }

    public final int hashCode() {
        int iC = ub3.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ks0.l(ib8.o("LinkedReadingSnapshot(id=", this.a, ", question=", this.b, ", content="), this.c, ")");
    }
}
