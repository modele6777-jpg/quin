package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q27 implements mtd {
    public final yhb a;
    public final Inflater b;
    public int c;
    public boolean d;

    public q27(yhb yhbVar, Inflater inflater) {
        this.a = yhbVar;
        this.b = inflater;
    }

    @Override // defpackage.mtd
    public final long c0(f41 f41Var, long j) throws IOException {
        long j2;
        f41Var.getClass();
        while (j >= 0) {
            if (this.d) {
                qc0.p("closed");
                return 0L;
            }
            yhb yhbVar = this.a;
            Inflater inflater = this.b;
            if (j == 0) {
                j2 = 0;
            } else {
                try {
                    qtc qtcVarE1 = f41Var.e1(1);
                    int iMin = (int) Math.min(j, 8192 - qtcVarE1.c);
                    if (inflater.needsInput() && !yhbVar.b()) {
                        qtc qtcVar = yhbVar.b.a;
                        qtcVar.getClass();
                        int i = qtcVar.c;
                        int i2 = qtcVar.b;
                        int i3 = i - i2;
                        this.c = i3;
                        inflater.setInput(qtcVar.a, i2, i3);
                    }
                    int iInflate = inflater.inflate(qtcVarE1.a, qtcVarE1.c, iMin);
                    int i4 = this.c;
                    if (i4 != 0) {
                        int remaining = i4 - inflater.getRemaining();
                        this.c -= remaining;
                        yhbVar.k0(remaining);
                    }
                    if (iInflate > 0) {
                        qtcVarE1.c += iInflate;
                        j2 = iInflate;
                        f41Var.b += j2;
                    } else {
                        if (qtcVarE1.b == qtcVarE1.c) {
                            f41Var.a = qtcVarE1.a();
                            ttc.a(qtcVarE1);
                        }
                        j2 = 0;
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            if (j2 > 0) {
                return j2;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (yhbVar.b()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        qc0.o(ks0.i(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }

    @Override // defpackage.mtd
    public final jye j() {
        return this.a.a.j();
    }
}
