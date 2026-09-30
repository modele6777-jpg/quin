package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zve {
    public final String a;
    public final Throwable b;

    public zve(String str, Exception exc, int i) {
        str = (i & 2) != 0 ? null : str;
        exc = (i & 4) != 0 ? null : exc;
        this.a = str;
        this.b = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zve)) {
            return false;
        }
        zve zveVar = (zve) obj;
        return pa7.t(this.a, zveVar.a) && pa7.t(this.b, zveVar.b);
    }

    public final int hashCode() {
        int iHashCode = if8.a.hashCode() * 31;
        String str = this.a;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th = this.b;
        return ub3.d((iHashCode2 + (th == null ? 0 : th.hashCode())) * 31, 31, false);
    }

    public final String toString() {
        return "ThirdPartAuthResult(loginWays=" + if8.a + ", token=" + this.a + ", error=" + this.b + ", privacyAccepted=false, requestedAlternative=null)";
    }
}
