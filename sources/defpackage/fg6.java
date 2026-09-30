package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fg6 implements mtd {
    public byte a;
    public final yhb b;
    public final Inflater c;
    public final q27 d;
    public final CRC32 e;

    public fg6(v41 v41Var) {
        v41Var.getClass();
        yhb yhbVar = new yhb(v41Var);
        this.b = yhbVar;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new q27(yhbVar, inflater);
        this.e = new CRC32();
    }

    public static void b(int i, int i2, String str) throws IOException {
        if (i2 == i) {
            return;
        }
        StringBuilder sbQ = kv2.q(str, ": actual 0x");
        sbQ.append(v4e.W(8, vpf.S(i2)));
        sbQ.append(" != expected 0x");
        sbQ.append(v4e.W(8, vpf.S(i)));
        throw new IOException(sbQ.toString());
    }

    @Override // defpackage.mtd
    public final long c0(f41 f41Var, long j) throws IOException {
        byte b;
        fg6 fg6Var = this;
        yhb yhbVar = fg6Var.b;
        f41 f41Var2 = yhbVar.b;
        f41Var.getClass();
        if (j < 0) {
            qc0.o(ks0.i(j, "byteCount < 0: "));
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        byte b2 = fg6Var.a;
        CRC32 crc32 = fg6Var.e;
        if (b2 == 0) {
            yhbVar.h0(10L);
            byte bG = f41Var2.G(3L);
            boolean z = ((bG >> 1) & 1) == 1;
            if (z) {
                fg6Var.h(f41Var2, 0L, 10L);
            }
            b(8075, yhbVar.R(), "ID1ID2");
            yhbVar.k0(8L);
            if (((bG >> 2) & 1) == 1) {
                yhbVar.h0(2L);
                if (z) {
                    h(f41Var2, 0L, 2L);
                }
                long jV0 = f41Var2.V0() & 65535;
                yhbVar.h0(jV0);
                if (z) {
                    h(f41Var2, 0L, jV0);
                }
                yhbVar.k0(jV0);
            }
            if (((bG >> 3) & 1) == 1) {
                long jH = yhbVar.h((byte) 0, 0L, Long.MAX_VALUE);
                if (jH == -1) {
                    throw new EOFException();
                }
                if (z) {
                    h(f41Var2, 0L, jH + 1);
                }
                yhbVar.k0(jH + 1);
            }
            if (((bG >> 4) & 1) == 1) {
                long jH2 = yhbVar.h((byte) 0, 0L, Long.MAX_VALUE);
                if (jH2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    fg6Var = this;
                    fg6Var.h(f41Var2, 0L, jH2 + 1);
                } else {
                    fg6Var = this;
                }
                yhbVar.k0(jH2 + 1);
            } else {
                fg6Var = this;
            }
            if (z) {
                b(yhbVar.U(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            fg6Var.a = (byte) 1;
            b2 = 1;
        }
        if (b2 == 1) {
            long j2 = f41Var.b;
            long jC0 = fg6Var.d.c0(f41Var, j);
            if (jC0 != -1) {
                fg6Var.h(f41Var, j2, jC0);
                return jC0;
            }
            b = 2;
            fg6Var.a = (byte) 2;
            b2 = 2;
        } else {
            b = 2;
        }
        if (b2 == b) {
            b(yhbVar.G(), (int) crc32.getValue(), "CRC");
            b(yhbVar.G(), (int) fg6Var.c.getBytesWritten(), "ISIZE");
            fg6Var.a = (byte) 3;
            if (!yhbVar.b()) {
                yg5.m("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    public final void h(f41 f41Var, long j, long j2) {
        qtc qtcVar = f41Var.a;
        qtcVar.getClass();
        while (true) {
            long j3 = qtcVar.c - qtcVar.b;
            if (j < j3) {
                break;
            }
            j -= j3;
            qtcVar = qtcVar.f;
            qtcVar.getClass();
        }
        while (j2 > 0) {
            int i = (int) (((long) qtcVar.b) + j);
            int iMin = (int) Math.min(qtcVar.c - i, j2);
            this.e.update(qtcVar.a, i, iMin);
            j2 -= (long) iMin;
            qtcVar = qtcVar.f;
            qtcVar.getClass();
            j = 0;
        }
    }

    @Override // defpackage.mtd
    public final jye j() {
        return this.b.a.j();
    }
}
