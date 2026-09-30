package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d2 extends urg {
    public static final Unsafe S;
    public static final long T;
    public static final long U;
    public static final long V;
    public static final long W;
    public static final long X;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                cva.q("Could not initialize intrinsics", e.getCause());
                return;
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new c2(0));
        }
        try {
            U = unsafe.objectFieldOffset(f2.class.getDeclaredField("c"));
            T = unsafe.objectFieldOffset(f2.class.getDeclaredField("b"));
            V = unsafe.objectFieldOffset(f2.class.getDeclaredField("a"));
            W = unsafe.objectFieldOffset(e2.class.getDeclaredField("a"));
            X = unsafe.objectFieldOffset(e2.class.getDeclaredField("b"));
            S = unsafe;
        } catch (NoSuchFieldException e2) {
            yg5.p(e2);
        }
    }

    @Override // defpackage.urg
    public final void N(e2 e2Var, e2 e2Var2) {
        S.putObject(e2Var, X, e2Var2);
    }

    @Override // defpackage.urg
    public final void O(e2 e2Var, Thread thread) {
        S.putObject(e2Var, W, thread);
    }

    @Override // defpackage.urg
    public final boolean l(f2 f2Var, w1 w1Var, w1 w1Var2) {
        while (true) {
            Unsafe unsafe = S;
            long j = T;
            f2 f2Var2 = f2Var;
            w1 w1Var3 = w1Var;
            w1 w1Var4 = w1Var2;
            if (unsafe.compareAndSwapObject(f2Var2, j, w1Var3, w1Var4)) {
                return true;
            }
            if (unsafe.getObject(f2Var2, j) != w1Var3) {
                return false;
            }
            f2Var = f2Var2;
            w1Var = w1Var3;
            w1Var2 = w1Var4;
        }
    }

    @Override // defpackage.urg
    public final boolean m(f2 f2Var, Object obj, Object obj2) {
        while (true) {
            Unsafe unsafe = S;
            long j = V;
            f2 f2Var2 = f2Var;
            Object obj3 = obj;
            Object obj4 = obj2;
            if (unsafe.compareAndSwapObject(f2Var2, j, obj3, obj4)) {
                return true;
            }
            if (unsafe.getObject(f2Var2, j) != obj3) {
                return false;
            }
            f2Var = f2Var2;
            obj = obj3;
            obj2 = obj4;
        }
    }

    @Override // defpackage.urg
    public final boolean n(f2 f2Var, e2 e2Var, e2 e2Var2) {
        while (true) {
            Unsafe unsafe = S;
            long j = U;
            f2 f2Var2 = f2Var;
            e2 e2Var3 = e2Var;
            e2 e2Var4 = e2Var2;
            if (unsafe.compareAndSwapObject(f2Var2, j, e2Var3, e2Var4)) {
                return true;
            }
            if (unsafe.getObject(f2Var2, j) != e2Var3) {
                return false;
            }
            f2Var = f2Var2;
            e2Var = e2Var3;
            e2Var2 = e2Var4;
        }
    }

    @Override // defpackage.urg
    public final w1 x(f2 f2Var) {
        w1 w1Var;
        w1 w1Var2 = w1.d;
        do {
            w1Var = f2Var.b;
            if (w1Var2 == w1Var) {
                break;
            }
        } while (!l(f2Var, w1Var, w1Var2));
        return w1Var;
    }

    @Override // defpackage.urg
    public final e2 y(f2 f2Var) {
        e2 e2Var;
        e2 e2Var2 = e2.c;
        do {
            e2Var = f2Var.c;
            if (e2Var2 == e2Var) {
                break;
            }
        } while (!n(f2Var, e2Var, e2Var2));
        return e2Var;
    }
}
