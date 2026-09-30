package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ba4 extends pfc {
    public static final /* synthetic */ long f = ud0.a.objectFieldOffset(ba4.class.getDeclaredField("_decision$volatile"));
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.pfc, defpackage.rg7
    public final void f(Object obj) {
        r(obj);
    }

    @Override // defpackage.pfc, defpackage.rg7
    public final void r(Object obj) {
        while (true) {
            Unsafe unsafe = ud0.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1) {
                    aa4.a(k99.D(this.e), vfh.G(obj));
                    return;
                } else {
                    qc0.p("Already resumed");
                    return;
                }
            }
            ba4 ba4Var = this;
            if (unsafe.compareAndSwapInt(ba4Var, j, 0, 2)) {
                return;
            } else {
                this = ba4Var;
            }
        }
    }
}
