package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ip {
    public final d62 a;
    public final long b;
    public final nf1 c;
    public final Throwable d;

    public ip(d62 d62Var, nf1 nf1Var, Exception exc, int i) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        nf1Var = (i & 4) != 0 ? null : nf1Var;
        exc = (i & 8) != 0 ? null : exc;
        this.a = d62Var;
        this.b = jElapsedRealtimeNanos;
        this.c = nf1Var;
        this.d = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip)) {
            return false;
        }
        ip ipVar = (ip) obj;
        return this.a == ipVar.a && this.b == ipVar.b && pa7.t(this.c, ipVar.c) && pa7.t(this.d, ipVar.d);
    }

    public final int hashCode() {
        int iB = ib8.b(this.a.hashCode() * 31, 31, this.b);
        nf1 nf1Var = this.c;
        int iHashCode = (iB + (nf1Var == null ? 0 : Integer.hashCode(nf1Var.a))) * 31;
        Throwable th = this.d;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ClosingInfo(reason=" + this.a + ", closingTimestamp=" + ((Object) sye.a(this.b)) + ", errorCode=" + this.c + ", exception=" + this.d + ')';
    }
}
