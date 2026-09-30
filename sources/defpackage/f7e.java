package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f7e {
    public final String a;
    public final String b;
    public final u7e c;

    public f7e(String str, String str2, u7e u7eVar) {
        this.a = str;
        this.b = str2;
        this.c = u7eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7e)) {
            return false;
        }
        f7e f7eVar = (f7e) obj;
        return this.a.equals(f7eVar.a) && pa7.t(this.b, f7eVar.b) && this.c == f7eVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("SubscriptionDetail(token=", this.a, ", orderId=", this.b, ", type=");
        sbO.append(this.c);
        sbO.append(")");
        return sbO.toString();
    }
}
