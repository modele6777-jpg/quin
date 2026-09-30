package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v4g {
    public final boolean a;
    public final boolean b;
    public final String c;

    public v4g(String str, boolean z, boolean z2) {
        str.getClass();
        this.a = z;
        this.b = z2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4g)) {
            return false;
        }
        v4g v4gVar = (v4g) obj;
        return this.a == v4gVar.a && this.b == v4gVar.b && pa7.t(this.c, v4gVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ub3.d(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return ks0.l(ib8.p("WidgetGuideSnapshot(installed=", ", optedOut=", ", lastAnySheetDate=", this.a, this.b), this.c, ")");
    }
}
