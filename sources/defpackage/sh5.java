package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sh5 extends ls5 {
    public final long b;
    public final boolean c;
    public long d;

    public sh5(mtd mtdVar, long j, boolean z) {
        super(mtdVar);
        this.b = j;
        this.c = z;
    }

    @Override // defpackage.ls5, defpackage.mtd
    public final long c0(f41 f41Var, long j) throws IOException {
        f41Var.getClass();
        long j2 = this.d;
        long j3 = this.b;
        if (j2 > j3) {
            j = 0;
        } else if (this.c) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long jC0 = this.a.c0(f41Var, j);
        if (jC0 != -1) {
            this.d += jC0;
        }
        long j5 = this.d;
        if ((j5 >= j3 || jC0 != -1) && j5 <= j3) {
            return jC0;
        }
        if (jC0 > 0 && j5 > j3) {
            long j6 = f41Var.b - (j5 - j3);
            f41 f41Var2 = new f41();
            f41Var2.h1(f41Var);
            f41Var.M0(f41Var2, j6);
            f41Var2.b();
        }
        StringBuilder sbP = ub3.p("expected ", " bytes but got ", j3);
        sbP.append(this.d);
        throw new IOException(sbP.toString());
    }
}
