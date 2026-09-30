package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class phd {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public phd(String str, String str2, String str3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = "android";
    }

    public final Map a() {
        return bm8.H(new iy9("uid", this.a), new iy9("pathway", this.b), new iy9("region", this.c), new iy9("platform", this.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phd)) {
            return false;
        }
        phd phdVar = (phd) obj;
        return pa7.t(this.a, phdVar.a) && this.b.equals(phdVar.b) && this.c.equals(phdVar.c) && this.d.equals(phdVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ub3.c(ub3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ks0.m(ib8.o("SignUpCompletedEvent(uid=", this.a, ", pathway=", this.b, ", region="), this.c, ", platform=", this.d, ")");
    }
}
