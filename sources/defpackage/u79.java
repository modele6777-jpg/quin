package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u79 implements e3b {
    public final s0e a;
    public final whb b;

    public u79() {
        g3b.a = g3b.b();
        s0e s0eVarA = t0e.a(g3b.a);
        this.a = s0eVarA;
        this.b = if9.n(s0eVarA);
    }

    public final long b() {
        Long l = (Long) this.b.a.getValue();
        return l != null ? l.longValue() : System.currentTimeMillis();
    }

    public final void c() {
        Long l = g3b.a;
        g3b.a = null;
        this.a.m(null);
        bm8.P(new s79(2, null));
    }

    public final void d(long j) {
        Long l = g3b.a;
        g3b.a = Long.valueOf(j);
        this.a.n(null, Long.valueOf(j));
        bm8.P(new t79(j, null));
    }
}
