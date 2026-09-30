package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ru3 extends sv2 {
    public static final /* synthetic */ long e = ud0.a.objectFieldOffset(ru3.class.getDeclaredField("d"));
    public final sv2 c;
    public volatile /* synthetic */ int d = 1;

    public ru3(sv2 sv2Var) {
        this.c = sv2Var;
    }

    @Override // defpackage.sv2
    public final void Z0(pv2 pv2Var, Runnable runnable) {
        d1().Z0(pv2Var, runnable);
    }

    @Override // defpackage.sv2
    public final void a1(pv2 pv2Var, Runnable runnable) {
        d1().a1(pv2Var, runnable);
    }

    @Override // defpackage.sv2
    public final boolean b1(pv2 pv2Var) {
        return d1().b1(pv2Var);
    }

    @Override // defpackage.sv2
    public final sv2 c1(int i) {
        return d1().c1(i);
    }

    public final sv2 d1() {
        return ud0.a.getIntVolatile(this, e) == 1 ? ga4.b : this.c;
    }

    @Override // defpackage.sv2
    public final String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.c + ")";
    }
}
