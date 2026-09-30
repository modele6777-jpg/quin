package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g59 {
    public static final long a = w6c.l(14);

    public static final long a(long j, long j2) {
        if (!wue.d(j2)) {
            qc0.j(ib8.j("The multiplier must be in em, but was ", wue.e(j2), "."));
            return 0L;
        }
        if (wue.d(j)) {
            qc0.p(ib8.j("Cannot convert Em to Px when style.fontSize is Em (", wue.e(j2), "). Please declare the style.fontSize with Sp units instead."));
            return 0L;
        }
        long j3 = j & 1095216660480L;
        if (j3 != 0) {
            float fC = wue.c(j2);
            w6c.f(j);
            return w6c.r(j3, wue.c(j) * fC);
        }
        float fC2 = wue.c(j2);
        long j4 = a;
        w6c.f(j4);
        return w6c.r(1095216660480L & j4, wue.c(j4) * fC2);
    }
}
