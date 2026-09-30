package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xzd implements ned {
    public final long a;
    public final long b;

    public xzd(long j, long j2) {
        this.a = j;
        this.b = j2;
        if (j < 0) {
            qc0.o(kv2.m("stopTimeout(", " ms) cannot be negative", j));
            throw null;
        }
        if (j2 >= 0) {
            return;
        }
        qc0.o(kv2.m("replayExpiration(", " ms) cannot be negative", j2));
        throw null;
    }

    @Override // defpackage.ned
    public final wj5 a(c7e c7eVar) {
        return dj6.I(new kl5(am5.a(c7eVar, new vzd(this, null)), new wzd(2, null), 0));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xzd)) {
            return false;
        }
        xzd xzdVar = (xzd) obj;
        return this.a == xzdVar.a && this.b == xzdVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        c78 c78Var = new c78(2);
        long j = this.a;
        if (j > 0) {
            c78Var.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.b;
        if (j2 < Long.MAX_VALUE) {
            c78Var.add("replayExpiration=" + j2 + "ms");
        }
        return ub3.l(new StringBuilder("SharingStarted.WhileSubscribed("), s72.D0(c78Var.n(), null, null, null, null, 63), ')');
    }
}
