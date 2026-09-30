package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zc4 implements jd4 {
    public final String a;
    public final String b;
    public final List c;
    public final ed4 d;
    public final f1d e;
    public final String f;
    public final String g;

    public /* synthetic */ zc4(String str, String str2, List list, ed4 ed4Var, f1d f1dVar, String str3, String str4, int i) {
        this(str, str2, list, ed4Var, (i & 16) != 0 ? f1d.a : f1dVar, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
    }

    public static zc4 b(zc4 zc4Var, String str, List list, String str2, int i) {
        String str3 = zc4Var.a;
        if ((i & 2) != 0) {
            str = zc4Var.b;
        }
        String str4 = str;
        ed4 ed4Var = zc4Var.d;
        f1d f1dVar = zc4Var.e;
        String str5 = zc4Var.f;
        if ((i & 64) != 0) {
            str2 = zc4Var.g;
        }
        str3.getClass();
        str4.getClass();
        list.getClass();
        ed4Var.getClass();
        f1dVar.getClass();
        return new zc4(str3, str4, list, ed4Var, f1dVar, str5, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc4)) {
            return false;
        }
        zc4 zc4Var = (zc4) obj;
        return pa7.t(this.a, zc4Var.a) && pa7.t(this.b, zc4Var.b) && pa7.t(this.c, zc4Var.c) && pa7.t(this.d, zc4Var.d) && this.e == zc4Var.e && pa7.t(this.f, zc4Var.f) && pa7.t(this.g, zc4Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + tec.a(ub3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("Analysis(question=", this.a, ", pattern=", this.b, ", patternData=");
        sbO.append(this.c);
        sbO.append(", prev=");
        sbO.append(this.d);
        sbO.append(", source=");
        sbO.append(this.e);
        sbO.append(", aid=");
        sbO.append(this.f);
        sbO.append(", spreadId=");
        return ks0.l(sbO, this.g, ")");
    }

    public zc4(String str, String str2, List list, ed4 ed4Var, f1d f1dVar, String str3, String str4) {
        str.getClass();
        str2.getClass();
        list.getClass();
        ed4Var.getClass();
        f1dVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = ed4Var;
        this.e = f1dVar;
        this.f = str3;
        this.g = str4;
    }
}
