package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fr4 implements xn7 {
    public static final fr4 a = new fr4();
    public static final hua b = new hua("kotlin.time.Duration", fua.k);

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        long j = ((ar4) obj).a;
        qfc qfcVar = ar4.b;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long j2 = j < 0 ? ar4.j(j) : j;
        long jH = ar4.h(j2, gr4.HOURS);
        boolean z = false;
        int iH = ar4.f(j2) ? 0 : (int) (ar4.h(j2, gr4.MINUTES) % 60);
        int iH2 = ar4.f(j2) ? 0 : (int) (ar4.h(j2, gr4.SECONDS) % 60);
        int iE = ar4.e(j2);
        if (ar4.f(j)) {
            jH = 9999999999999L;
        }
        boolean z2 = jH != 0;
        boolean z3 = (iH2 == 0 && iE == 0) ? false : true;
        if (iH != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jH);
            sb.append('H');
        }
        if (z) {
            sb.append(iH);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            ar4.b(sb, iH2, iE, 9, "S", true);
        }
        ev4Var.D(sb.toString());
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        qfc qfcVar = ar4.b;
        String strU = om3Var.u();
        strU.getClass();
        try {
            long jI = y41.I(strU);
            if (jI == ar4.e) {
                throw new IllegalStateException("invariant failed");
            }
            return new ar4(jI);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(ib8.j("Invalid ISO duration string format: '", strU, "'."), e);
        }
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return b;
    }
}
