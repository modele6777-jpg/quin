package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class az1 {
    public final shb a;
    public final String b;

    public az1(shb shbVar, String str) {
        str.getClass();
        this.a = shbVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az1)) {
            return false;
        }
        az1 az1Var = (az1) obj;
        return this.a.equals(az1Var.a) && pa7.t(this.b, az1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChildReadingTrackingContext(reading=" + this.a + ", sessionId=" + this.b + ")";
    }
}
