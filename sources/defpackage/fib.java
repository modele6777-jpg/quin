package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fib implements AutoCloseable {
    public final r94 a;

    public fib(r94 r94Var) {
        this.a = r94Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
