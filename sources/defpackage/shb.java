package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class shb {
    public final String a;
    public final String b;

    public shb(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shb)) {
            return false;
        }
        shb shbVar = (shb) obj;
        return this.a.equals(shbVar.a) && pa7.t(this.b, shbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tec.m("ReadingTrackingContext(divinationType=", this.a, ", parentSessionId=", this.b, ")");
    }
}
