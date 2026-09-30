package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l48 implements w48 {
    public final m48 a;
    public final x48 b;

    public l48(x48 x48Var, m48 m48Var) {
        this.b = x48Var;
        this.a = m48Var;
    }

    @dn9(f48.ON_DESTROY)
    public void onDestroy(x48 x48Var) {
        this.a.l(x48Var);
    }

    @dn9(f48.ON_START)
    public void onStart(x48 x48Var) {
        this.a.g(x48Var);
    }

    @dn9(f48.ON_STOP)
    public void onStop(x48 x48Var) {
        this.a.h(x48Var);
    }
}
