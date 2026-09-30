package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ad7 extends hg7 {
    public static final /* synthetic */ long f = ud0.a.objectFieldOffset(ad7.class.getDeclaredField("_invoked$volatile"));
    private volatile /* synthetic */ int _invoked$volatile;
    public final uj3 e;

    public ad7(uj3 uj3Var) {
        this.e = uj3Var;
    }

    @Override // defpackage.hg7
    public final boolean m() {
        return true;
    }

    @Override // defpackage.hg7
    public final void n(Throwable th) {
        if (ud0.a.compareAndSwapInt(this, f, 0, 1)) {
            this.e.d(th);
        }
    }
}
