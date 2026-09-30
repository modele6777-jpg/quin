package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ry5 extends ls5 {
    public static final a71 c;
    public final f41 b;

    static {
        a71 a71Var = a71.c;
        c = m8c.r("0021F904");
    }

    public ry5(v41 v41Var) {
        super(v41Var);
        this.b = new f41();
    }

    public final boolean b(long j) {
        f41 f41Var = this.b;
        long j2 = f41Var.b;
        if (j2 >= j) {
            return true;
        }
        long j3 = j - j2;
        return this.a.c0(f41Var, j3) == j3;
    }

    @Override // defpackage.ls5, defpackage.mtd
    public final long c0(f41 f41Var, long j) {
        b(j);
        f41 f41Var2 = this.b;
        if (f41Var2.b == 0) {
            return j == 0 ? 0L : -1L;
        }
        long j2 = 0;
        while (true) {
            long jN = -1;
            while (true) {
                a71 a71Var = c;
                jN = f41Var2.N(a71Var.k(0), jN + 1, Long.MAX_VALUE);
                if (jN == -1 || (b(a71Var.e()) && f41Var2.g0(jN, a71Var, a71Var.e()))) {
                    break;
                }
            }
            if (jN == -1) {
                break;
            }
            long jC0 = f41Var2.c0(f41Var, jN + 4);
            if (jC0 < 0) {
                jC0 = 0;
            }
            j2 += jC0;
            if (b(5L) && f41Var2.G(4L) == 0 && (((f41Var2.G(2L) & 255) << 8) | (f41Var2.G(1L) & 255)) < 2) {
                f41Var.i1(f41Var2.G(0L));
                f41Var.i1(10);
                f41Var.i1(0);
                f41Var2.c1(3L);
            }
        }
        if (j2 < j) {
            long jC1 = f41Var2.c0(f41Var, j - j2);
            if (jC1 < 0) {
                jC1 = 0;
            }
            j2 += jC1;
        }
        if (j2 == 0) {
            return -1L;
        }
        return j2;
    }
}
