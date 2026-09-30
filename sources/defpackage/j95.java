package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j95 {
    public final qhe a;
    public final String b;

    public j95(qhe qheVar, String str) {
        qheVar.getClass();
        this.a = qheVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j95)) {
            return false;
        }
        j95 j95Var = (j95) obj;
        return pa7.t(this.a, j95Var.a) && pa7.t(this.b, j95Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ExtraTarotCard(tarotCard=" + this.a + ", label=" + this.b + ")";
    }
}
