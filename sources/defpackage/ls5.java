package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ls5 implements mtd {
    public final mtd a;

    public ls5(mtd mtdVar) {
        mtdVar.getClass();
        this.a = mtdVar;
    }

    @Override // defpackage.mtd
    public long c0(f41 f41Var, long j) {
        f41Var.getClass();
        return this.a.c0(f41Var, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.mtd
    public final jye j() {
        return this.a.j();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.a + ')';
    }
}
