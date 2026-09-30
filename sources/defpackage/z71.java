package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z71 extends ks5 {
    public final /* synthetic */ a81 b;
    public final /* synthetic */ kv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z71(a81 a81Var, kv kvVar, wkd wkdVar) {
        super(wkdVar);
        this.b = a81Var;
        this.c = kvVar;
    }

    @Override // defpackage.ks5, defpackage.wkd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a81 a81Var = this.b;
        kv kvVar = this.c;
        synchronized (a81Var) {
            if (kvVar.a) {
                return;
            }
            kvVar.a = true;
            super.close();
            ((zi0) this.c.b).g();
        }
    }
}
