package defpackage;

import android.os.SystemClock;
import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ouf {
    public final a90 a;
    public final iuf b;
    public final w21 c = new w21();
    public final p90 d = new p90();
    public final p90 e = new p90();
    public final er0 f;
    public final juf g;
    public final qh5 h;
    public long i;
    public long j;
    public long k;
    public uuf l;
    public long m;

    public ouf(a90 a90Var, iuf iufVar, juf jufVar, qh5 qh5Var) {
        this.a = a90Var;
        this.b = iufVar;
        this.g = jufVar;
        this.h = qh5Var;
        er0 er0Var = new er0();
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        er0Var.b = 0;
        er0Var.c = -1;
        er0Var.d = 0;
        er0Var.f = new long[iHighestOneBit];
        er0Var.e = iHighestOneBit - 1;
        this.f = er0Var;
        this.i = -9223372036854775807L;
        this.l = uuf.d;
        this.j = -9223372036854775807L;
        this.k = -9223372036854775807L;
    }

    public final void a(long j, long j2) {
        final a90 a90Var = this.a;
        gu3 gu3Var = (gu3) a90Var.c;
        while (true) {
            er0 er0Var = this.f;
            int i = er0Var.d;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                s8f.c();
                return;
            }
            long j3 = ((long[]) er0Var.f)[er0Var.b];
            Long l = (Long) this.e.X(j3);
            iuf iufVar = this.b;
            if (l != null && l.longValue() != this.m) {
                this.m = l.longValue();
                iufVar.e(2);
            }
            qh5 qh5Var = this.h;
            qh5Var.b(1000 * j3);
            long j4 = this.m;
            long jA = qh5Var.a();
            long j5 = qh5Var.h;
            iuf iufVar2 = this.b;
            w21 w21Var = this.c;
            int iA = iufVar2.a(j3, j, j2, j4, false, false, jA, j5, w21Var);
            if (iA != 5 && iA != 4) {
                this.g.a(j3, w21Var.b);
            }
            final int i2 = 0;
            final int i3 = 1;
            if (iA == 0 || iA == 1) {
                this.j = j3;
                boolean z = iA == 0;
                long jN = er0Var.n();
                uuf uufVar = (uuf) this.d.X(jN);
                if (uufVar != null && !uufVar.equals(uuf.d) && !uufVar.equals(this.l)) {
                    this.l = uufVar;
                    qr5 qr5Var = new qr5();
                    qr5Var.v = uufVar.a;
                    qr5Var.w = uufVar.b;
                    qr5Var.o = qv8.l("video/raw");
                    a90Var.b = new rr5(qr5Var);
                    gu3Var.j.execute(new ny2(11, a90Var, uufVar));
                }
                long jNanoTime = z ? System.nanoTime() : w21Var.c;
                i3 = iufVar.e == 3 ? 0 : 1;
                iufVar.e = 3;
                iufVar.k.getClass();
                iufVar.g = pqf.H(SystemClock.elapsedRealtime());
                if (i3 != 0 && gu3Var.f != null) {
                    gu3Var.j.execute(new Runnable() { // from class: fu3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i2;
                            a90 a90Var2 = a90Var;
                            switch (i4) {
                                case 0:
                                    ((gu3) a90Var2.c).i.b();
                                    break;
                                default:
                                    ((gu3) a90Var2.c).i.c();
                                    break;
                            }
                        }
                    });
                }
                rr5 rr5Var = (rr5) a90Var.b;
                gu3Var.k.c(jN, jNanoTime, rr5Var == null ? new rr5(new qr5()) : rr5Var, null);
                dp8 dp8Var = (dp8) gu3Var.d.remove();
                dp8Var.c.P0(dp8Var.a, dp8Var.b, jNanoTime);
            } else if (iA == 2 || iA == 3) {
                this.j = j3;
                er0Var.n();
                gu3Var.j.execute(new Runnable() { // from class: fu3
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = i3;
                        a90 a90Var2 = a90Var;
                        switch (i4) {
                            case 0:
                                ((gu3) a90Var2.c).i.b();
                                break;
                            default:
                                ((gu3) a90Var2.c).i.c();
                                break;
                        }
                    }
                });
                dp8 dp8Var2 = (dp8) gu3Var.d.remove();
                gp8 gp8Var = dp8Var2.c;
                po8 po8Var = dp8Var2.a;
                int i4 = dp8Var2.b;
                Trace.beginSection("dropVideoBuffer");
                po8Var.f(i4);
                Trace.endSection();
                gp8Var.U0(0, 1);
            } else {
                if (iA != 4) {
                    if (iA == 5) {
                        return;
                    }
                    qc0.p(String.valueOf(iA));
                    return;
                }
                this.j = j3;
            }
        }
    }
}
