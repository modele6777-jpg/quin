package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class r5f extends ba7 {
    private final Callable<Object> callable;
    final /* synthetic */ s5f this$0;

    public r5f(s5f s5fVar, Callable callable) {
        this.this$0 = s5fVar;
        callable.getClass();
        this.callable = callable;
    }

    @Override // defpackage.ba7
    public final void a(Throwable th) {
        this.this$0.n(th);
    }

    @Override // defpackage.ba7
    public final void b(Object obj) {
        this.this$0.m(obj);
    }

    @Override // defpackage.ba7
    public final boolean c() {
        return this.this$0.isDone();
    }

    @Override // defpackage.ba7
    public final Object d() {
        return this.callable.call();
    }

    @Override // defpackage.ba7
    public final String e() {
        return this.callable.toString();
    }
}
