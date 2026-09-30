package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w7d implements AutoCloseable {
    public final g8d a;
    public final f6d b;
    public boolean c;

    public w7d(g8d g8dVar, f6d f6dVar, int i) {
        g8dVar = (i & 1) != 0 ? null : g8dVar;
        f6dVar = (i & 2) != 0 ? null : f6dVar;
        this.a = g8dVar;
        this.b = f6dVar;
        if ((g8dVar == null) != (f6dVar == null)) {
            return;
        }
        qc0.j("Failed requirement.");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        g8d g8dVar = this.a;
        if (g8dVar != null) {
            g8dVar.a();
        }
        f6d f6dVar = this.b;
        if (f6dVar != null) {
            f6dVar.close();
        }
    }
}
