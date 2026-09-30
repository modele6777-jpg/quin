package defpackage;

import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xh5 implements zx0 {
    public final bi5 a;
    public final int b;
    public final d82 c = new d82(2);

    public xh5(bi5 bi5Var, int i) {
        this.a = bi5Var;
        this.b = i;
    }

    public final long a(m95 m95Var) {
        d82 d82Var;
        bi5 bi5Var;
        int iH;
        while (true) {
            long jE = m95Var.e();
            long length = m95Var.getLength() - 6;
            d82Var = this.c;
            bi5Var = this.a;
            if (jE >= length) {
                break;
            }
            long jE2 = m95Var.e();
            d0a d0aVar = new d0a(17);
            int i = 0;
            boolean zA = false;
            m95Var.o(d0aVar.a, 0, 2);
            char cG = d0aVar.g(0, ByteOrder.BIG_ENDIAN);
            int i2 = this.b;
            if (cG != i2) {
                m95Var.k();
                m95Var.f((int) (jE2 - m95Var.getPosition()));
            } else {
                byte[] bArr = d0aVar.a;
                while (i < 15 && (iH = m95Var.h(bArr, 2 + i, 15 - i)) != -1) {
                    i += iH;
                }
                d0aVar.L(i + 2);
                m95Var.k();
                m95Var.f((int) (jE2 - m95Var.getPosition()));
                zA = db6.A(d0aVar, bi5Var, i2, d82Var);
            }
            if (zA) {
                break;
            }
            m95Var.f(1);
        }
        if (m95Var.e() < m95Var.getLength() - 6) {
            return d82Var.b;
        }
        m95Var.f((int) (m95Var.getLength() - m95Var.e()));
        return bi5Var.j;
    }

    @Override // defpackage.zx0
    public final yx0 d(m95 m95Var, long j) {
        long position = m95Var.getPosition();
        long jA = a(m95Var);
        long jE = m95Var.e();
        m95Var.f(Math.max(6, this.a.c));
        long jA2 = a(m95Var);
        long jE2 = m95Var.e();
        if (jA > j || jA2 <= j) {
            return jA2 <= j ? new yx0(jA2, -2, jE2) : new yx0(jA, -1, position);
        }
        return new yx0(-9223372036854775807L, 0, jE);
    }
}
