package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w6d {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    public w6d(String str, String str2, String str3, int i, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6d)) {
            return false;
        }
        w6d w6dVar = (w6d) obj;
        return this.a.equals(w6dVar.a) && this.b.equals(w6dVar.b) && this.c.equals(w6dVar.c) && this.d.equals(w6dVar.d) && this.e == w6dVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ub3.c(ub3.c(ub3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("ShareConfig(url=", this.a, ", title=", this.b, ", summary=");
        ub3.v(sbO, this.c, ", imageUrl=", this.d, ", thumbnailRes=");
        return tec.g(this.e, ")", sbO);
    }
}
