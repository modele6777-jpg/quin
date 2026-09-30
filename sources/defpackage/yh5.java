package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yh5 {
    public final vx0 a;
    public final zx0 b;
    public wx0 c;
    public final int d;

    public yh5(xx0 xx0Var, zx0 zx0Var, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = zx0Var;
        this.d = i;
        this.a = new vx0(xx0Var, j, j2, j3, j4, j5);
    }

    public static int b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static int c(m95 m95Var, long j, d82 d82Var) {
        if (j == m95Var.getPosition()) {
            return 0;
        }
        d82Var.b = j;
        return 1;
    }

    public final int a(m95 m95Var, d82 d82Var) {
        while (true) {
            wx0 wx0Var = this.c;
            wx0Var.getClass();
            long j = wx0Var.f;
            long j2 = wx0Var.g;
            long j3 = wx0Var.h;
            long j4 = j2 - j;
            long j5 = this.d;
            zx0 zx0Var = this.b;
            if (j4 <= j5) {
                this.c = null;
                zx0Var.m();
                return c(m95Var, j, d82Var);
            }
            long position = j3 - m95Var.getPosition();
            if (position < 0 || position > 262144) {
                return c(m95Var, j3, d82Var);
            }
            m95Var.l((int) position);
            m95Var.k();
            yx0 yx0VarD = zx0Var.d(m95Var, wx0Var.b);
            int i = yx0VarD.d;
            long j6 = yx0VarD.b;
            long j7 = yx0VarD.c;
            if (i == -3) {
                this.c = null;
                zx0Var.m();
                return c(m95Var, j3, d82Var);
            }
            if (i == -2) {
                wx0Var.d = j6;
                wx0Var.f = j7;
                wx0Var.h = wx0.a(wx0Var.b, j6, wx0Var.e, j7, wx0Var.g, wx0Var.c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        qc0.p("Invalid case");
                        return 0;
                    }
                    long position2 = j7 - m95Var.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        m95Var.l((int) position2);
                    }
                    this.c = null;
                    zx0Var.m();
                    return c(m95Var, j7, d82Var);
                }
                wx0Var.e = j6;
                wx0Var.g = j7;
                wx0Var.h = wx0.a(wx0Var.b, wx0Var.d, j6, wx0Var.f, j7, wx0Var.c);
            }
        }
    }

    public final void d(long j) {
        wx0 wx0Var = this.c;
        if (wx0Var == null || wx0Var.a != j) {
            vx0 vx0Var = this.a;
            this.c = new wx0(j, vx0Var.a.c(j), vx0Var.c, vx0Var.d, vx0Var.e, vx0Var.f);
        }
    }
}
