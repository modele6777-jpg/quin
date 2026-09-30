package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qff extends vyb implements mtd {
    public final oq8 c;
    public final long d;

    public qff(oq8 oq8Var, long j) {
        this.c = oq8Var;
        this.d = j;
    }

    @Override // defpackage.vyb
    public final v41 P0() {
        return new yhb(this);
    }

    @Override // defpackage.mtd
    public final long c0(f41 f41Var, long j) {
        f41Var.getClass();
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // defpackage.vyb
    public final long h() {
        return this.d;
    }

    @Override // defpackage.mtd
    public final jye j() {
        return jye.d;
    }

    @Override // defpackage.vyb
    public final oq8 l() {
        return this.c;
    }

    @Override // defpackage.vyb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
