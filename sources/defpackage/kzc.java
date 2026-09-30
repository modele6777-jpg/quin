package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kzc {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public kzc(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzc)) {
            return false;
        }
        kzc kzcVar = (kzc) obj;
        return pa7.t(this.a, kzcVar.a) && pa7.t(this.b, kzcVar.b) && pa7.t(this.c, kzcVar.c) && pa7.t(this.d, kzcVar.d) && pa7.t(this.e, kzcVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("ServerErrorDiagnostics(body=", this.a, ", errorCode=", this.b, ", errorMessage=");
        ub3.v(sbO, this.c, ", error=", this.d, ", data=");
        return ks0.l(sbO, this.e, ")");
    }
}
