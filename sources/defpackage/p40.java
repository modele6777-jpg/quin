package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p40 {
    public final String a;
    public final w57 b;

    public p40(String str, w57 w57Var) {
        str.getClass();
        w57Var.getClass();
        this.a = str;
        this.b = w57Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p40)) {
            return false;
        }
        p40 p40Var = (p40) obj;
        return pa7.t(this.a, p40Var.a) && pa7.t(this.b, p40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnnualReportProgress(routeKey=" + this.a + ", savedAt=" + this.b + ")";
    }
}
