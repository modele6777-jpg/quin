package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h39 extends b2 implements Runnable {
    public final Runnable v;

    public h39(Runnable runnable) {
        runnable.getClass();
        this.v = runnable;
    }

    @Override // defpackage.f2
    public final String k() {
        return "task=[" + this.v + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.v.run();
        } catch (Throwable th) {
            n(th);
            throw th;
        }
    }
}
