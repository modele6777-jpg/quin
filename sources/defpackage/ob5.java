package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ob5 {
    public final String a;
    public final String b;
    public final int c;

    public ob5(String str, String str2, int i) {
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
        if (!(obj instanceof ob5)) {
            return false;
        }
        ob5 ob5Var = (ob5) obj;
        return pa7.t(this.a, ob5Var.a) && pa7.t(this.b, ob5Var.b) && this.c == ob5Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(5) + ub3.b(this.c, ub3.c(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return tec.g(this.c, ", star=5)", ib8.o("FeedbackComment(nickname=", this.a, ", comment=", this.b, ", avatorRes="));
    }
}
