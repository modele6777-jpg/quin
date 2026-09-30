package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mlc {
    public final kkc a;
    public final String b;

    public mlc(kkc kkcVar, String str) {
        this.a = kkcVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlc)) {
            return false;
        }
        mlc mlcVar = (mlc) obj;
        return this.a == mlcVar.a && this.b.equals(mlcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SeasonalGuideUi(element=" + this.a + ", text=" + this.b + ")";
    }
}
