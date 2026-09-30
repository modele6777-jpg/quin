package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i7c {
    public final j7c a;
    public final j7c b;
    public final Throwable c;

    public i7c(j7c j7cVar, wj2 wj2Var, Throwable th) {
        this.a = j7cVar;
        this.b = wj2Var;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7c)) {
            return false;
        }
        i7c i7cVar = (i7c) obj;
        return pa7.t(this.a, i7cVar.a) && pa7.t(this.b, i7cVar.b) && pa7.t(this.c, i7cVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        j7c j7cVar = this.b;
        int iHashCode2 = (iHashCode + (j7cVar == null ? 0 : j7cVar.hashCode())) * 31;
        Throwable th = this.c;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.a + ", nextPlan=" + this.b + ", throwable=" + this.c + ')';
    }

    public /* synthetic */ i7c(j7c j7cVar, Throwable th, int i) {
        this(j7cVar, (wj2) null, (i & 4) != 0 ? null : th);
    }
}
