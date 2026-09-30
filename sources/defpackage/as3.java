package defpackage;

import com.adjust.sdk.sig.r3;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class as3 implements bm9 {
    public final am9 a;
    public final long b;
    public final long c;
    public final h3e d;
    public int e;
    public long f;
    public long g;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    public as3(h3e h3eVar, long j, long j2, long j3, long j4, boolean z) {
        pa7.A(j >= 0 && j2 > j);
        this.d = h3eVar;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.f = j4;
            this.e = 4;
        } else {
            this.e = 0;
        }
        this.a = new am9();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
    @Override // defpackage.bm9
    public final long a(m95 m95Var) throws IOException {
        long j;
        long jI;
        int i = this.e;
        long j2 = this.c;
        am9 am9Var = this.a;
        if (i == 0) {
            long position = m95Var.getPosition();
            this.g = position;
            this.e = 1;
            long j3 = j2 - 65307;
            if (j3 > position) {
                return j3;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (this.w == this.x) {
                    jI = -1;
                } else {
                    long position2 = m95Var.getPosition();
                    if (am9Var.b(m95Var, this.x)) {
                        am9Var.a(m95Var, false);
                        m95Var.k();
                        long j4 = this.v;
                        long j5 = am9Var.b;
                        long j6 = j4 - j5;
                        j = 2;
                        int i2 = am9Var.d + am9Var.e;
                        if (0 > j6 || j6 >= 72000) {
                            if (j6 < 0) {
                                this.x = position2;
                                this.z = j5;
                            } else {
                                this.w = m95Var.getPosition() + ((long) i2);
                                this.y = am9Var.b;
                            }
                            long j7 = this.x;
                            long j8 = this.w;
                            if (j7 - j8 < 100000) {
                                this.x = j8;
                                jI = j8;
                            } else {
                                long position3 = m95Var.getPosition() - (((long) i2) * (j6 <= 0 ? 2L : 1L));
                                long j9 = this.x;
                                long j10 = this.w;
                                jI = pqf.i((((j9 - j10) * j6) / (this.z - this.y)) + position3, j10, j9 - 1);
                            }
                        } else {
                            jI = -1;
                        }
                    } else {
                        jI = this.w;
                        if (jI == position2) {
                            yg5.m("No ogg page can be found.");
                            return 0L;
                        }
                    }
                    if (jI != -1) {
                        return jI;
                    }
                    this.e = 3;
                }
                j = 2;
                if (jI != -1) {
                    return jI;
                }
                this.e = 3;
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return -1L;
                    }
                    r3.l();
                    return 0L;
                }
                j = 2;
            }
            while (true) {
                am9Var.b(m95Var, -1L);
                am9Var.a(m95Var, false);
                if (am9Var.b > this.v) {
                    m95Var.k();
                    this.e = 4;
                    return -(this.y + j);
                }
                m95Var.l(am9Var.d + am9Var.e);
                this.w = m95Var.getPosition();
                this.y = am9Var.b;
            }
        }
        am9Var.a = 0;
        am9Var.b = 0L;
        am9Var.c = 0;
        am9Var.d = 0;
        am9Var.e = 0;
        if (!am9Var.b(m95Var, -1L)) {
            throw new EOFException();
        }
        am9Var.a(m95Var, false);
        m95Var.l(am9Var.d + am9Var.e);
        long j11 = am9Var.b;
        while ((am9Var.a & 4) != 4 && am9Var.b(m95Var, -1L) && m95Var.getPosition() < j2 && am9Var.a(m95Var, true)) {
            try {
                m95Var.l(am9Var.d + am9Var.e);
                j11 = am9Var.b;
            } catch (EOFException unused) {
            }
        }
        this.f = j11;
        this.e = 4;
        return this.g;
    }

    @Override // defpackage.bm9
    public final xsc d() {
        if (this.f != 0) {
            return new zr3(this);
        }
        return null;
    }

    @Override // defpackage.bm9
    public final void f(long j) {
        this.v = pqf.i(j, 0L, this.f - 1);
        this.e = 2;
        this.w = this.b;
        this.x = this.c;
        this.y = 0L;
        this.z = this.f;
    }
}
