package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wm6 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public wm6(String str, String str2, String str3, boolean z) {
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm6)) {
            return false;
        }
        wm6 wm6Var = (wm6) obj;
        return this.a.equals(wm6Var.a) && pa7.t(this.b, wm6Var.b) && pa7.t(this.c, wm6Var.c) && this.d == wm6Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ub3.c(ub3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("HomeEventInfo(title=", this.a, ", iconUrl=", this.b, ", link=");
        sbO.append(this.c);
        sbO.append(", openInBrowser=");
        sbO.append(this.d);
        sbO.append(")");
        return sbO.toString();
    }
}
