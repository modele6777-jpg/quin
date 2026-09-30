package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class s47 implements mtd {
    public final InputStream a;
    public final jye b;

    public s47(InputStream inputStream, jye jyeVar) {
        inputStream.getClass();
        this.a = inputStream;
        this.b = jyeVar;
    }

    @Override // defpackage.mtd
    public final long c0(f41 f41Var, long j) throws IOException {
        f41Var.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            qc0.o(ks0.i(j, "byteCount < 0: "));
            return 0L;
        }
        try {
            this.b.f();
            qtc qtcVarE1 = f41Var.e1(1);
            int i = this.a.read(qtcVarE1.a, qtcVarE1.c, (int) Math.min(j, 8192 - qtcVarE1.c));
            if (i != -1) {
                qtcVarE1.c += i;
                long j2 = i;
                f41Var.b += j2;
                return j2;
            }
            if (qtcVarE1.b != qtcVarE1.c) {
                return -1L;
            }
            f41Var.a = qtcVarE1.a();
            ttc.a(qtcVarE1);
            return -1L;
        } catch (AssertionError e) {
            if (heg.a(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.mtd
    public final jye j() {
        return this.b;
    }

    public final String toString() {
        return "source(" + this.a + ')';
    }
}
