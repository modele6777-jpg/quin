package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h13 {
    public final String a;
    public final String b;
    public final int c;

    public h13(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h13)) {
            return false;
        }
        h13 h13Var = (h13) obj;
        return pa7.t(this.a, h13Var.a) && pa7.t(this.b, h13Var.b) && this.c == h13Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ub3.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return tec.g(this.c, ")", ib8.o("InsertResult(id=", this.a, ", accountId=", this.b, ", payloadBytes="));
    }
}
