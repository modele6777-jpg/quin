package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yx0 {
    public static final yx0 e = new yx0(-9223372036854775807L, -3, -1);
    public static yx0 f;
    public final /* synthetic */ int a = 1;
    public long b;
    public long c;
    public int d;

    public yx0(long j, int i, long j2) {
        this.d = i;
        this.b = j;
        this.c = j2;
    }

    public static void c(yx0 yx0Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        synchronized (yx0Var) {
            try {
                if (j < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j2 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j3 = yx0Var.b + j;
                yx0Var.b = j3;
                long j4 = yx0Var.c + j2;
                yx0Var.c = j4;
                if (j4 > j3) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(long j, double d, double d2) {
        float f2 = (j - 946728000000L) / 8.64E7f;
        float f3 = (0.01720197f * f2) + 6.24006f;
        double d3 = f3;
        double dSin = (Math.sin(f3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f3) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + ((double) (Math.round(((double) (f2 - 9.0E-4f)) - d4) + 9.0E-4f)) + d4;
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d5 = 0.01745329238474369d * d;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d5))) / (Math.cos(dAsin) * Math.cos(d5));
        if (dSin3 >= 1.0d) {
            this.d = 1;
            this.b = -1L;
            this.c = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.d = 0;
                this.b = -1L;
                this.c = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.b = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.c = jRound;
            if (jRound >= j || this.b <= j) {
                this.d = 1;
            } else {
                this.d = 0;
            }
        }
    }

    public synchronized long b() {
        return this.b - this.c;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "WindowCounter(streamId=" + this.d + ", total=" + this.b + ", acknowledged=" + this.c + ", unacknowledged=" + b() + ')';
            default:
                return super.toString();
        }
    }

    public yx0(int i) {
        this.d = i;
    }

    public /* synthetic */ yx0() {
    }
}
