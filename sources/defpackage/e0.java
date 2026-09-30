package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends g0 {
    @Override // defpackage.g0
    public final Object r(Object obj, Throwable th) {
        sg0 sg0Var = (sg0) obj;
        m88 m88VarApply = sg0Var.apply(th);
        pa7.D(m88VarApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", sg0Var);
        return m88VarApply;
    }

    @Override // defpackage.g0
    public final void s(Object obj) {
        o((m88) obj);
    }
}
