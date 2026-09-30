package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q5f extends ba7 {
    private final lg0 callable;
    final /* synthetic */ s5f this$0;

    public q5f(s5f s5fVar, lg0 lg0Var) {
        this.this$0 = s5fVar;
        this.callable = lg0Var;
    }

    @Override // defpackage.ba7
    public final void a(Throwable th) {
        this.this$0.n(th);
    }

    @Override // defpackage.ba7
    public final void b(Object obj) {
        this.this$0.o((m88) obj);
    }

    @Override // defpackage.ba7
    public final boolean c() {
        return this.this$0.isDone();
    }

    @Override // defpackage.ba7
    public final Object d() {
        m88 m88VarCall = this.callable.call();
        pa7.D(m88VarCall, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.callable);
        return m88VarCall;
    }

    @Override // defpackage.ba7
    public final String e() {
        return this.callable.toString();
    }
}
