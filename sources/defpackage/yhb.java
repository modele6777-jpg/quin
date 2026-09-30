package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yhb implements v41 {
    public final mtd a;
    public final f41 b;
    public boolean c;

    public yhb(mtd mtdVar) {
        mtdVar.getClass();
        this.a = mtdVar;
        this.b = new f41();
    }

    public final int E() {
        h0(4L);
        return this.b.L0();
    }

    public final int G() {
        h0(4L);
        int iL0 = this.b.L0();
        return ((iL0 & 255) << 24) | (((-16777216) & iL0) >>> 24) | ((16711680 & iL0) >>> 8) | ((65280 & iL0) << 8);
    }

    @Override // defpackage.v41
    public final boolean I(long j, a71 a71Var) {
        a71Var.getClass();
        int iE = a71Var.e();
        if (!this.c) {
            return iE >= 0 && j >= 0 && iE <= a71Var.e() && (iE == 0 || z7f.y(this, a71Var, iE, j, j + 1) != -1);
        }
        qc0.p("closed");
        return false;
    }

    @Override // defpackage.v41
    public final int L(zr9 zr9Var) {
        f41 f41Var;
        zr9Var.getClass();
        if (this.c) {
            qc0.p("closed");
            return 0;
        }
        do {
            f41Var = this.b;
            int iD = b.d(f41Var, zr9Var, true);
            if (iD != -2) {
                if (iD == -1) {
                    break;
                }
                f41Var.c1(zr9Var.a[iD].e());
                return iD;
            }
        } while (this.a.c0(f41Var, 8192L) != -1);
        return -1;
    }

    public final long N() throws EOFException {
        char c;
        char c2;
        long jL0;
        h0(8L);
        f41 f41Var = this.b;
        if (f41Var.b < 8) {
            throw new EOFException();
        }
        qtc qtcVar = f41Var.a;
        qtcVar.getClass();
        int i = qtcVar.b;
        int i2 = qtcVar.c;
        if (i2 - i < 8) {
            jL0 = ((((long) f41Var.L0()) & 4294967295L) << 32) | (4294967295L & ((long) f41Var.L0()));
            c = 24;
            c2 = '(';
        } else {
            byte[] bArr = qtcVar.a;
            c = 24;
            c2 = '(';
            int i3 = i + 7;
            long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
            int i4 = i + 8;
            long j2 = j | (((long) bArr[i3]) & 255);
            f41Var.b -= 8;
            if (i4 == i2) {
                f41Var.a = qtcVar.a();
                ttc.a(qtcVar);
            } else {
                qtcVar.b = i4;
            }
            jL0 = j2;
        }
        return ((jL0 & 255) << 56) | (((-72057594037927936L) & jL0) >>> 56) | ((71776119061217280L & jL0) >>> c2) | ((280375465082880L & jL0) >>> c) | ((1095216660480L & jL0) >>> 8) | ((4278190080L & jL0) << 8) | ((16711680 & jL0) << c) | ((65280 & jL0) << c2);
    }

    public final short R() {
        h0(2L);
        return this.b.U0();
    }

    public final short U() {
        h0(2L);
        return this.b.V0();
    }

    public final String W(long j) {
        h0(j);
        return this.b.Z0(j, ox1.a);
    }

    @Override // defpackage.v41
    public final InputStream Y0() {
        return new e41(this, 1);
    }

    @Override // defpackage.v41
    public final long a0(u41 u41Var) {
        f41 f41Var;
        long j = 0;
        while (true) {
            mtd mtdVar = this.a;
            f41Var = this.b;
            if (mtdVar.c0(f41Var, 8192L) == -1) {
                break;
            }
            long jH = f41Var.h();
            if (jH > 0) {
                j += jH;
                u41Var.M0(f41Var, jH);
            }
        }
        long j2 = f41Var.b;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        u41Var.M0(f41Var, j2);
        return j3;
    }

    public final boolean b() {
        if (this.c) {
            qc0.p("closed");
            return false;
        }
        f41 f41Var = this.b;
        return f41Var.E() && this.a.c0(f41Var, 8192L) == -1;
    }

    @Override // defpackage.mtd
    public final long c0(f41 f41Var, long j) {
        f41Var.getClass();
        if (j < 0) {
            qc0.o(ks0.i(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.c) {
            qc0.p("closed");
            return 0L;
        }
        f41 f41Var2 = this.b;
        if (f41Var2.b == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.a.c0(f41Var2, 8192L) == -1) {
                return -1L;
            }
        }
        return f41Var2.c0(f41Var, Math.min(j, f41Var2.b));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.close();
        this.b.b();
    }

    @Override // defpackage.v41
    public final long f0(long j, a71 a71Var) {
        a71Var.getClass();
        return z7f.y(this, a71Var, a71Var.e(), 0L, j);
    }

    public final String g0(long j) throws EOFException {
        if (j < 0) {
            qc0.o(ks0.i(j, "limit < 0: "));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jH = h((byte) 10, 0L, j2);
        f41 f41Var = this.b;
        if (jH != -1) {
            return b.c(f41Var, jH);
        }
        if (j2 < Long.MAX_VALUE && request(j2) && f41Var.G(j2 - 1) == 13 && request(j2 + 1) && f41Var.G(j2) == 10) {
            return b.c(f41Var, j2);
        }
        f41 f41Var2 = new f41();
        f41Var.u(f41Var2, 0L, Math.min(32L, f41Var.b));
        throw new EOFException("\\n not found: limit=" + Math.min(f41Var.b, j) + " content=" + f41Var2.p0(f41Var2.b).g() + (char) 8230);
    }

    public final long h(byte b, long j, long j2) {
        if (this.c) {
            qc0.p("closed");
            return 0L;
        }
        if (0 > j2) {
            qc0.o(ks0.i(j2, "fromIndex=0 toIndex="));
            return 0L;
        }
        long jMax = 0;
        while (jMax < j2) {
            f41 f41Var = this.b;
            byte b2 = b;
            long j3 = j2;
            long jN = f41Var.N(b2, jMax, j3);
            if (jN != -1) {
                return jN;
            }
            long j4 = f41Var.b;
            if (j4 >= j3 || this.a.c0(f41Var, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    public final void h0(long j) {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // defpackage.v41, defpackage.u41
    public final f41 i() {
        return this.b;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.mtd
    public final jye j() {
        return this.a.j();
    }

    public final void k0(long j) {
        if (this.c) {
            qc0.p("closed");
            return;
        }
        while (j > 0) {
            f41 f41Var = this.b;
            if (f41Var.b == 0 && this.a.c0(f41Var, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, f41Var.b);
            f41Var.c1(jMin);
            j -= jMin;
        }
    }

    public final long l(a71 a71Var) {
        a71Var.getClass();
        long jMax = 0;
        if (this.c) {
            qc0.p("closed");
            return 0L;
        }
        while (true) {
            f41 f41Var = this.b;
            long jR = f41Var.R(jMax, a71Var);
            if (jR != -1) {
                return jR;
            }
            long j = f41Var.b;
            if (this.a.c0(f41Var, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    @Override // defpackage.v41
    public final String n0(Charset charset) {
        charset.getClass();
        mtd mtdVar = this.a;
        f41 f41Var = this.b;
        f41Var.h1(mtdVar);
        return f41Var.Z0(f41Var.b, charset);
    }

    @Override // defpackage.v41
    public final yhb peek() {
        return new yhb(new f6a(this));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        f41 f41Var = this.b;
        if (f41Var.b == 0 && this.a.c0(f41Var, 8192L) == -1) {
            return -1;
        }
        return f41Var.read(byteBuffer);
    }

    @Override // defpackage.v41
    public final boolean request(long j) {
        f41 f41Var;
        if (j < 0) {
            qc0.o(ks0.i(j, "byteCount < 0: "));
            return false;
        }
        if (this.c) {
            qc0.p("closed");
            return false;
        }
        do {
            f41Var = this.b;
            if (f41Var.b >= j) {
                return true;
            }
        } while (this.a.c0(f41Var, 8192L) != -1);
        return false;
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    public final byte u() {
        h0(1L);
        return this.b.h0();
    }

    public final a71 x(long j) {
        h0(j);
        return this.b.p0(j);
    }
}
