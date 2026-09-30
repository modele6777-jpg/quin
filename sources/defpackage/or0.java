package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class or0 implements ll1 {
    public final nr0[] a;

    public or0(nr0[] nr0VarArr) {
        this.a = nr0VarArr;
    }

    public final void a() {
        for (nr0 nr0Var : this.a) {
            ta4 ta4Var = nr0Var.f;
            if (ta4Var == null) {
                pa7.g0("handle");
                throw null;
            }
            ta4Var.a();
        }
    }

    @Override // defpackage.ll1
    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
