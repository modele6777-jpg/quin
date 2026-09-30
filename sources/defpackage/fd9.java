package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fd9 {
    public final int a;
    public final String b;
    public final String c;

    public fd9(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd9)) {
            return false;
        }
        fd9 fd9Var = (fd9) obj;
        return this.a == fd9Var.a && pa7.t(this.b, fd9Var.b) && this.c.equals(fd9Var.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetSimFailure(code=");
        sb.append(this.a);
        sb.append(", body=");
        sb.append(this.b);
        sb.append(", contentType=");
        return ks0.l(sb, this.c, ")");
    }
}
