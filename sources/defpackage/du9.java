package defpackage;

import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class du9 implements wkd {
    public final FileOutputStream a;
    public final jye b;

    public du9(FileOutputStream fileOutputStream, jye jyeVar) {
        this.a = fileOutputStream;
        this.b = jyeVar;
    }

    @Override // defpackage.wkd
    public final void M0(f41 f41Var, long j) throws IOException {
        vpf.s(f41Var.b, 0L, j);
        while (j > 0) {
            this.b.f();
            qtc qtcVar = f41Var.a;
            qtcVar.getClass();
            int iMin = (int) Math.min(j, qtcVar.c - qtcVar.b);
            this.a.write(qtcVar.a, qtcVar.b, iMin);
            int i = qtcVar.b + iMin;
            qtcVar.b = i;
            long j2 = iMin;
            j -= j2;
            f41Var.b -= j2;
            if (i == qtcVar.c) {
                f41Var.a = qtcVar.a();
                ttc.a(qtcVar);
            }
        }
    }

    @Override // defpackage.wkd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.wkd, java.io.Flushable
    public final void flush() throws IOException {
        this.a.flush();
    }

    @Override // defpackage.wkd
    public final jye j() {
        return this.b;
    }

    public final String toString() {
        return "sink(" + this.a + ')';
    }
}
