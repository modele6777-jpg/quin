package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wy1 extends hg7 {
    public final pl1 e;

    public wy1(pl1 pl1Var) {
        this.e = pl1Var;
    }

    @Override // defpackage.hg7
    public final boolean m() {
        return true;
    }

    @Override // defpackage.hg7
    public final void n(Throwable th) {
        Unsafe unsafe;
        Unsafe unsafe2;
        rg7 rg7VarL = l();
        pl1 pl1Var = this.e;
        Throwable thS = pl1Var.s(rg7VarL);
        if (pl1Var.A()) {
            z94 z94Var = (z94) pl1Var.d;
            long j = z94.v;
            loop0: while (true) {
                Object objectVolatile = ud0.a.getObjectVolatile(z94Var, j);
                ig4 ig4Var = aa4.b;
                if (pa7.t(objectVolatile, ig4Var)) {
                    do {
                        unsafe = ud0.a;
                        if (unsafe.compareAndSwapObject(z94Var, z94.v, ig4Var, thS)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(z94Var, j) == ig4Var);
                } else {
                    if (objectVolatile instanceof Throwable) {
                        return;
                    }
                    do {
                        unsafe2 = ud0.a;
                        if (unsafe2.compareAndSwapObject(z94Var, z94.v, objectVolatile, (Object) null)) {
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(z94Var, j) == objectVolatile);
                }
            }
        }
        pl1Var.p(thS);
        if (pl1Var.A()) {
            return;
        }
        pl1Var.o();
    }
}
