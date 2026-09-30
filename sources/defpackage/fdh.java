package defpackage;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fdh {
    public final boolean a;
    public final List b;
    public final xlg c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final hah k;

    public fdh(boolean z, jy6 jy6Var, xlg xlgVar, String str, String str2, jy6 jy6Var2, jy6 jy6Var3, boolean z2, boolean z3, boolean z4, hah hahVar) {
        jy6Var.getClass();
        xlgVar.getClass();
        str.getClass();
        str2.getClass();
        jy6Var2.getClass();
        jy6Var3.getClass();
        hahVar.getClass();
        this.a = z;
        this.b = jy6Var;
        this.c = xlgVar;
        this.d = str;
        this.e = str2;
        this.f = jy6Var2;
        this.g = jy6Var3;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = hahVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdh)) {
            return false;
        }
        fdh fdhVar = (fdh) obj;
        return this.a == fdhVar.a && this.b.equals(fdhVar.b) && pa7.t(this.c, fdhVar.c) && pa7.t(this.d, fdhVar.d) && pa7.t(this.e, fdhVar.e) && this.f.equals(fdhVar.f) && this.g.equals(fdhVar.g) && this.h == fdhVar.h && this.i == fdhVar.i && this.j == fdhVar.j && pa7.t(this.k, fdhVar.k);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, Boolean.valueOf(this.h), Boolean.valueOf(this.i), Boolean.valueOf(this.j));
    }

    public final String toString() {
        boolean z = this.a;
        int length = String.valueOf(z).length();
        List list = this.b;
        int length2 = String.valueOf(list).length();
        xlg xlgVar = this.c;
        int length3 = String.valueOf(xlgVar).length();
        String str = this.d;
        int length4 = String.valueOf(str).length();
        String str2 = this.e;
        int length5 = String.valueOf(str2).length();
        List list2 = this.f;
        int length6 = String.valueOf(list2).length();
        List list3 = this.g;
        int length7 = String.valueOf(list3).length();
        boolean z2 = this.h;
        int length8 = String.valueOf(z2).length();
        boolean z3 = this.i;
        int length9 = String.valueOf(z3).length();
        boolean z4 = this.j;
        int length10 = String.valueOf(z4).length();
        hah hahVar = this.k;
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 9 + length3 + 10 + length4 + 17 + length5 + 30 + length6 + 30 + length7 + 24 + length8 + 26 + length9 + 20 + length10 + 14 + String.valueOf(hahVar).length() + 1);
        sb.append("SharedStorageInfo(shouldUseSharedStorage=");
        sb.append(z);
        sb.append(", enabledBackings=");
        sb.append(list);
        sb.append(", secret=");
        sb.append(xlgVar);
        sb.append(", dirPath=");
        sb.append(str);
        sb.append(", gmsCoreDirPath=");
        sb.append(str2);
        sb.append(", includeStaticConfigPackages=");
        sb.append(list2);
        sb.append(", excludeStaticConfigPackages=");
        sb.append(list3);
        sb.append(", hasStorageInfoFromGms=");
        sb.append(z2);
        sb.append(", allowEmptySnapshotToken=");
        sb.append(z3);
        sb.append(", enableCommitV2Api=");
        sb.append(z4);
        sb.append(", clientFlags=");
        sb.append(hahVar);
        sb.append(")");
        return sb.toString();
    }
}
