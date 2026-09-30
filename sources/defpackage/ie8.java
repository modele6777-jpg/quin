package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class ie8 {
    public static final /* synthetic */ long a = ud0.a.objectFieldOffset(ie8.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new ke8(8, false);

    public final boolean a(Runnable runnable) {
        ie8 ie8Var;
        while (true) {
            Unsafe unsafe = ud0.a;
            long j = a;
            ke8 ke8Var = (ke8) unsafe.getObjectVolatile(this, j);
            int iA = ke8Var.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                ke8 ke8VarC = ke8Var.c();
                while (true) {
                    Unsafe unsafe2 = ud0.a;
                    ie8Var = this;
                    if (unsafe2.compareAndSwapObject(ie8Var, a, ke8Var, ke8VarC) || unsafe2.getObjectVolatile(ie8Var, j) != ke8Var) {
                        break;
                    }
                    this = ie8Var;
                }
            } else {
                if (iA == 2) {
                    return false;
                }
                ie8Var = this;
            }
            this = ie8Var;
        }
    }

    public final void b() {
        ie8 ie8Var;
        while (true) {
            Unsafe unsafe = ud0.a;
            long j = a;
            ke8 ke8Var = (ke8) unsafe.getObjectVolatile(this, j);
            if (ke8Var.b()) {
                return;
            }
            ke8 ke8VarC = ke8Var.c();
            while (true) {
                ie8Var = this;
                if (ud0.a.compareAndSwapObject(ie8Var, a, ke8Var, ke8VarC) || ud0.a.getObjectVolatile(ie8Var, j) != ke8Var) {
                    break;
                } else {
                    this = ie8Var;
                }
            }
            this = ie8Var;
        }
    }

    public final int c() {
        ke8 ke8Var = (ke8) ud0.a.getObjectVolatile(this, a);
        ke8Var.getClass();
        long longVolatile = ud0.a.getLongVolatile(ke8Var, ke8.g);
        return 1073741823 & (((int) ((longVolatile & 1152921503533105152L) >> 30)) - ((int) (1073741823 & longVolatile)));
    }

    public final Object d() {
        ie8 ie8Var;
        while (true) {
            Unsafe unsafe = ud0.a;
            long j = a;
            ke8 ke8Var = (ke8) unsafe.getObjectVolatile(this, j);
            Object objD = ke8Var.d();
            if (objD != ke8.e) {
                return objD;
            }
            ke8 ke8VarC = ke8Var.c();
            while (true) {
                ie8Var = this;
                if (ud0.a.compareAndSwapObject(ie8Var, a, ke8Var, ke8VarC) || ud0.a.getObjectVolatile(ie8Var, j) != ke8Var) {
                    break;
                }
                this = ie8Var;
            }
            this = ie8Var;
        }
    }
}
