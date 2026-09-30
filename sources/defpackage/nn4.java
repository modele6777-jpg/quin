package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nn4 {
    public final String a;
    public final String b;

    public nn4(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn4)) {
            return false;
        }
        nn4 nn4Var = (nn4) obj;
        return pa7.t(this.a, nn4Var.a) && pa7.t(this.b, nn4Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return tec.m("DrawEvent(cardKey=", this.a, ", skinKey=", this.b, ")");
    }
}
