package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f3h implements Thread.UncaughtExceptionHandler {
    public final String a;
    public final /* synthetic */ m3h b;

    public f3h(m3h m3hVar, String str) {
        this.b = m3hVar;
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        w0h w0hVar = ((w3h) this.b.b).f;
        w3h.h(w0hVar);
        w0hVar.g.b(th, this.a);
    }
}
