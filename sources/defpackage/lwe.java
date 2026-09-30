package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lwe extends hg7 {
    public static final /* synthetic */ long g = ud0.a.objectFieldOffset(lwe.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ int _state$volatile;
    public final Thread e = Thread.currentThread();
    public ta4 f;

    public static void p(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // defpackage.hg7
    public final boolean m() {
        return true;
    }

    @Override // defpackage.hg7
    public final void n(Throwable th) {
        while (true) {
            Unsafe unsafe = ud0.a;
            long j = g;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1 || intVolatile == 2 || intVolatile == 3) {
                    return;
                }
                p(intVolatile);
                throw null;
            }
            lwe lweVar = this;
            if (unsafe.compareAndSwapInt(lweVar, g, intVolatile, 2)) {
                lweVar.e.interrupt();
                unsafe.putIntVolatile(lweVar, j, 3);
                return;
            }
            this = lweVar;
        }
    }

    public final void o() {
        lwe lweVar;
        while (true) {
            Unsafe unsafe = ud0.a;
            long j = g;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == 0) {
                lweVar = this;
                if (unsafe.compareAndSwapInt(lweVar, j, intVolatile, 1)) {
                    ta4 ta4Var = lweVar.f;
                    if (ta4Var != null) {
                        ta4Var.a();
                        return;
                    }
                    return;
                }
            } else {
                if (intVolatile != 2) {
                    if (intVolatile == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        p(intVolatile);
                        throw null;
                    }
                }
                lweVar = this;
            }
            this = lweVar;
        }
    }
}
