package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cq0 {
    public final j52 a;
    public final HashMap b;

    public cq0(j52 j52Var, HashMap map) {
        this.a = j52Var;
        this.b = map;
    }

    public final long a(lua luaVar, long j, int i) {
        long jE = j - this.a.e();
        dq0 dq0Var = (dq0) this.b.get(luaVar);
        long j2 = dq0Var.a;
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * ((long) i2)))), jE), dq0Var.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cq0)) {
            return false;
        }
        cq0 cq0Var = (cq0) obj;
        return this.a.equals(cq0Var.a) && this.b.equals(cq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
