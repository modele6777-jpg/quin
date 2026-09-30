package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ulb {
    public final String a;
    public final String b;
    public final List c;

    public ulb(String str, String str2, List list) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ulb)) {
            return false;
        }
        ulb ulbVar = (ulb) obj;
        return this.a.equals(ulbVar.a) && pa7.t(this.b, ulbVar.b) && pa7.t(this.c, ulbVar.c);
    }

    public final int hashCode() {
        int iC = ub3.c(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        return iC + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return ks0.n(ib8.o("RedeemErrorInfo(message=", this.a, ", result=", this.b, ", tarotIds="), this.c, ")");
    }
}
