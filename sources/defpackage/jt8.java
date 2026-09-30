package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jt8 implements ot8, mh6 {
    public final String a;
    public final String b;
    public final String c;
    public final t68 d;

    public jt8(String str, String str2, String str3, t68 t68Var) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = t68Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt8)) {
            return false;
        }
        jt8 jt8Var = (jt8) obj;
        return pa7.t(this.a, jt8Var.a) && pa7.t(this.b, jt8Var.b) && pa7.t(this.c, jt8Var.c) && pa7.t(this.d, jt8Var.d);
    }

    @Override // defpackage.mh6
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iC = ub3.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        t68 t68Var = this.d;
        return iHashCode + (t68Var != null ? t68Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("NewReadingRequest(id=", this.a, ", question=", this.b, ", childReadingId=");
        sbO.append(this.c);
        sbO.append(", childReading=");
        sbO.append(this.d);
        sbO.append(")");
        return sbO.toString();
    }
}
