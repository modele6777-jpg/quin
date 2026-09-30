package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ur6 extends qr6 {
    public boolean e;

    @Override // defpackage.qr6, defpackage.mtd
    public final long c0(f41 f41Var, long j) throws IOException {
        f41Var.getClass();
        if (j < 0) {
            qc0.o(ks0.i(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.c) {
            qc0.p("closed");
            return 0L;
        }
        if (this.e) {
            return -1L;
        }
        long jC0 = super.c0(f41Var, j);
        if (jC0 != -1) {
            return jC0;
        }
        this.e = true;
        b(si6.b);
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        if (!this.e) {
            b(vr6.f);
        }
        this.c = true;
    }
}
