package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ugb {
    public final String a;
    public final String b;
    public final String c;

    public ugb(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugb)) {
            return false;
        }
        ugb ugbVar = (ugb) obj;
        return this.a.equals(ugbVar.a) && pa7.t(this.b, ugbVar.b) && pa7.t(this.c, ugbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ub3.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ks0.l(ib8.o("ReadingShareParameters(scene=", this.a, ", format=", this.b, ", language="), this.c, ")");
    }
}
