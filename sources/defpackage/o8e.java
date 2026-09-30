package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o8e {
    public final String a;
    public final qhe b;
    public final String c;
    public final String d;
    public final String e;

    public o8e(String str, qhe qheVar, String str2, String str3, String str4) {
        qheVar.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = qheVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8e)) {
            return false;
        }
        o8e o8eVar = (o8e) obj;
        return pa7.t(this.a, o8eVar.a) && pa7.t(this.b, o8eVar.b) && pa7.t(this.c, o8eVar.c) && pa7.t(this.d, o8eVar.d) && pa7.t(this.e, o8eVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        return this.e.hashCode() + ub3.c(ub3.c((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SummaryContent(theme=");
        sb.append(this.a);
        sb.append(", card=");
        sb.append(this.b);
        sb.append(", label=");
        ub3.v(sb, this.c, ", highlight=", this.d, ", content=");
        return ks0.l(sb, this.e, ")");
    }
}
