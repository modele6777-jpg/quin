package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gt8 implements ot8, mh6 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public gt8(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gt8)) {
            return false;
        }
        gt8 gt8Var = (gt8) obj;
        return pa7.t(this.a, gt8Var.a) && pa7.t(this.b, gt8Var.b) && pa7.t(this.c, gt8Var.c) && pa7.t(this.d, gt8Var.d);
    }

    @Override // defpackage.mh6
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + ub3.c(ub3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ks0.m(ib8.o("ClarifyingCardInterpretation(id=", this.a, ", text=", this.b, ", drawMessageId="), this.c, ", requestMessageId=", this.d, ")");
    }
}
