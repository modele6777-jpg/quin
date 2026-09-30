package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class psc {
    public static final psc d = new psc(true, null, new gpc(7));
    public final boolean a;
    public final Throwable b;
    public final x16 c;

    public psc(boolean z, Throwable th, x16 x16Var) {
        this.a = z;
        this.b = th;
        this.c = x16Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psc)) {
            return false;
        }
        psc pscVar = (psc) obj;
        return this.a == pscVar.a && pa7.t(this.b, pscVar.b) && this.c.equals(pscVar.c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        Throwable th = this.b;
        return this.c.hashCode() + ((iHashCode + (th == null ? 0 : th.hashCode())) * 31);
    }

    public final String toString() {
        return "SecondaryButtonGating(isReady=" + this.a + ", failure=" + this.b + ", onRetry=" + this.c + ")";
    }
}
