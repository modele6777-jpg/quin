package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cb2 {
    public final Object a;
    public final ll1 b;
    public final n26 c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ cb2(Object obj, ll1 ll1Var, n26 n26Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : ll1Var, (i & 4) != 0 ? null : n26Var, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static cb2 a(cb2 cb2Var, ll1 ll1Var, Throwable th, int i) {
        Object obj = cb2Var.a;
        if ((i & 2) != 0) {
            ll1Var = cb2Var.b;
        }
        ll1 ll1Var2 = ll1Var;
        n26 n26Var = cb2Var.c;
        Object obj2 = cb2Var.d;
        if ((i & 16) != 0) {
            th = cb2Var.e;
        }
        return new cb2(obj, ll1Var2, n26Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb2)) {
            return false;
        }
        cb2 cb2Var = (cb2) obj;
        return pa7.t(this.a, cb2Var.a) && pa7.t(this.b, cb2Var.b) && pa7.t(this.c, cb2Var.c) && pa7.t(this.d, cb2Var.d) && pa7.t(this.e, cb2Var.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        ll1 ll1Var = this.b;
        int iHashCode2 = (iHashCode + (ll1Var == null ? 0 : ll1Var.hashCode())) * 31;
        n26 n26Var = this.c;
        int iHashCode3 = (iHashCode2 + (n26Var == null ? 0 : n26Var.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public cb2(Object obj, ll1 ll1Var, n26 n26Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = ll1Var;
        this.c = n26Var;
        this.d = obj2;
        this.e = th;
    }
}
