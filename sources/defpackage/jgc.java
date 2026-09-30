package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jgc {
    public final x48 a;
    public final String b;
    public final String c;
    public final xfc d;

    public jgc(x48 x48Var, String str, String str2, xfc xfcVar) {
        x48Var.getClass();
        this.a = x48Var;
        this.b = str;
        this.c = str2;
        this.d = xfcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jgc) {
            jgc jgcVar = (jgc) obj;
            return pa7.t(this.a, jgcVar.a) && this.b.equals(jgcVar.b) && this.c.equals(jgcVar.c) && this.d == jgcVar.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ub3.c(ub3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "ScreenshotPage(owner=" + this.a + ", pageName=" + this.b + ", pathway=" + this.c + ", onScreenshot=" + this.d + ")";
    }
}
