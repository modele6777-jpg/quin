package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class et8 implements ot8, mh6 {
    public final String a;
    public final String b;
    public final boolean c;

    public et8(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et8)) {
            return false;
        }
        et8 et8Var = (et8) obj;
        return pa7.t(this.a, et8Var.a) && pa7.t(this.b, et8Var.b) && this.c == et8Var.c;
    }

    @Override // defpackage.mh6
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ub3.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ub3.m(ib8.o("CardExplanation(id=", this.a, ", text=", this.b, ", finished="), this.c, ")");
    }
}
