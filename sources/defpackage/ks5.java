package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ks5 implements wkd {
    public final wkd a;

    public ks5(wkd wkdVar) {
        wkdVar.getClass();
        this.a = wkdVar;
    }

    @Override // defpackage.wkd
    public void M0(f41 f41Var, long j) {
        this.a.M0(f41Var, j);
    }

    @Override // defpackage.wkd, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.wkd, java.io.Flushable
    public void flush() {
        this.a.flush();
    }

    @Override // defpackage.wkd
    public final jye j() {
        return this.a.j();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.a + ')';
    }
}
