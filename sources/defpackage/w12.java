package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w12 {
    public final shb a;
    public final String b;
    public final int c;

    public w12(shb shbVar, String str, int i) {
        shbVar.getClass();
        str.getClass();
        this.a = shbVar;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w12)) {
            return false;
        }
        w12 w12Var = (w12) obj;
        return pa7.t(this.a, w12Var.a) && pa7.t(this.b, w12Var.b) && this.c == w12Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ub3.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClarifyingTrackingContext(reading=");
        sb.append(this.a);
        sb.append(", cardLabel=");
        sb.append(this.b);
        sb.append(", extraN=");
        return tec.g(this.c, ")", sb);
    }
}
