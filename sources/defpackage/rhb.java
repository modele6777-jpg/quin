package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rhb {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public rhb(String str, String str2, String str3, String str4) {
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
        if (!(obj instanceof rhb)) {
            return false;
        }
        rhb rhbVar = (rhb) obj;
        return pa7.t(this.a, rhbVar.a) && pa7.t(this.b, rhbVar.b) && pa7.t(this.c, rhbVar.c) && pa7.t(this.d, rhbVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ub3.c(ub3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ks0.m(ib8.o("ReadingTextMenuLabels(copyAll=", this.a, ", selectText=", this.b, ", listen="), this.c, ", share=", this.d, ")");
    }
}
