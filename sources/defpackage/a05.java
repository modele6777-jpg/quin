package defpackage;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a05 extends vz4 implements ov3 {
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long v;
    public static final /* synthetic */ long w;
    public static final /* synthetic */ int x = 0;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = ud0.a;
        w = unsafe.objectFieldOffset(a05.class.getDeclaredField("_queue$volatile"));
        g = unsafe.objectFieldOffset(a05.class.getDeclaredField("_delayed$volatile"));
        v = unsafe.objectFieldOffset(a05.class.getDeclaredField("_isCompleted$volatile"));
    }

    @Override // defpackage.sv2
    public final void Z0(pv2 pv2Var, Runnable runnable) {
        i1(runnable);
    }

    @Override // defpackage.vz4
    public final long g1() {
        Unsafe unsafe;
        a05 a05Var;
        Unsafe unsafe2;
        Runnable runnable;
        yz4 yz4Var;
        ig4 ig4Var = b05.b;
        long j = w;
        if (!h1()) {
            j1();
            loop0: while (true) {
                unsafe = ud0.a;
                Object objectVolatile = unsafe.getObjectVolatile(this, j);
                if (objectVolatile == null) {
                    a05Var = this;
                } else if (objectVolatile instanceof ke8) {
                    ke8 ke8Var = (ke8) objectVolatile;
                    Object objD = ke8Var.d();
                    if (objD != ke8.e) {
                        Runnable runnable2 = (Runnable) objD;
                        a05Var = this;
                        runnable = runnable2;
                        unsafe2 = unsafe;
                        break;
                    }
                    ke8 ke8VarC = ke8Var.c();
                    while (true) {
                        Unsafe unsafe3 = ud0.a;
                        a05Var = this;
                        if (unsafe3.compareAndSwapObject(a05Var, w, objectVolatile, ke8VarC) || unsafe3.getObjectVolatile(a05Var, j) != objectVolatile) {
                            break;
                        }
                        this = a05Var;
                    }
                    this = a05Var;
                } else {
                    a05Var = this;
                    if (objectVolatile != ig4Var) {
                        do {
                            unsafe2 = ud0.a;
                            if (unsafe2.compareAndSwapObject(a05Var, w, objectVolatile, (Object) null)) {
                                runnable = (Runnable) objectVolatile;
                                unsafe = unsafe2;
                                break loop0;
                            }
                        } while (unsafe2.getObjectVolatile(a05Var, j) == objectVolatile);
                        this = a05Var;
                    }
                }
                unsafe2 = unsafe;
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            ad0 ad0Var = a05Var.e;
            if (((ad0Var == null || ad0Var.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object objectVolatile2 = unsafe.getObjectVolatile(a05Var, j);
                if (objectVolatile2 != null) {
                    if (objectVolatile2 instanceof ke8) {
                        long longVolatile = unsafe2.getLongVolatile((ke8) objectVolatile2, ke8.g);
                        if (((int) (1073741823 & longVolatile)) != ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (objectVolatile2 == ig4Var) {
                        return Long.MAX_VALUE;
                    }
                }
                zz4 zz4Var = (zz4) unsafe.getObjectVolatile(a05Var, g);
                if (zz4Var != null) {
                    synchronized (zz4Var) {
                        yz4[] yz4VarArr = zz4Var.a;
                        yz4Var = yz4VarArr != null ? yz4VarArr[0] : null;
                    }
                    if (yz4Var != null) {
                        long jNanoTime = yz4Var.a - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void i1(Runnable runnable) {
        j1();
        if (!k1(runnable)) {
            pq3.y.i1(runnable);
            return;
        }
        Thread threadL1 = l1();
        if (Thread.currentThread() != threadL1) {
            LockSupport.unpark(threadL1);
        }
    }

    public final void j1() {
        yz4 yz4VarC;
        zz4 zz4Var = (zz4) ud0.a.getObjectVolatile(this, g);
        if (zz4Var == null || zz4Var.b() == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (zz4Var) {
                try {
                    yz4[] yz4VarArr = zz4Var.a;
                    yz4VarC = null;
                    yz4 yz4Var = yz4VarArr != null ? yz4VarArr[0] : null;
                    if (yz4Var != null) {
                        if (jNanoTime - yz4Var.a >= 0 ? k1(yz4Var) : false) {
                            yz4VarC = zz4Var.c(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (yz4VarC != null);
    }

    @Override // defpackage.ov3
    public final void k0(long j, pl1 pl1Var) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            wz4 wz4Var = new wz4(this, j2 + jNanoTime, pl1Var);
            o1(jNanoTime, wz4Var);
            pl1Var.y(new kl1(2, wz4Var));
        }
    }

    public final boolean k1(Runnable runnable) {
        Unsafe unsafe;
        Unsafe unsafe2;
        Unsafe unsafe3;
        while (true) {
            Unsafe unsafe4 = ud0.a;
            long j = w;
            Object objectVolatile = unsafe4.getObjectVolatile(this, j);
            if (unsafe4.getIntVolatile(this, v) == 1) {
                return false;
            }
            if (objectVolatile == null) {
                do {
                    unsafe = ud0.a;
                    if (unsafe.compareAndSwapObject(this, w, (Object) null, runnable)) {
                        return true;
                    }
                } while (unsafe.getObjectVolatile(this, j) == null);
            } else if (objectVolatile instanceof ke8) {
                ke8 ke8Var = (ke8) objectVolatile;
                int iA = ke8Var.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    ke8 ke8VarC = ke8Var.c();
                    do {
                        unsafe2 = ud0.a;
                        if (unsafe2.compareAndSwapObject(this, w, objectVolatile, ke8VarC)) {
                            break;
                        }
                    } while (unsafe2.getObjectVolatile(this, j) == objectVolatile);
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (objectVolatile == b05.b) {
                    return false;
                }
                ke8 ke8Var2 = new ke8(8, true);
                ke8Var2.a((Runnable) objectVolatile);
                ke8Var2.a(runnable);
                do {
                    unsafe3 = ud0.a;
                    if (unsafe3.compareAndSwapObject(this, w, objectVolatile, ke8Var2)) {
                        return true;
                    }
                } while (unsafe3.getObjectVolatile(this, j) == objectVolatile);
            }
        }
    }

    public abstract Thread l1();

    public final boolean m1() {
        ad0 ad0Var = this.e;
        if (ad0Var != null ? ad0Var.isEmpty() : true) {
            Unsafe unsafe = ud0.a;
            zz4 zz4Var = (zz4) unsafe.getObjectVolatile(this, g);
            if (zz4Var != null && zz4Var.b() != 0) {
                return false;
            }
            Object objectVolatile = unsafe.getObjectVolatile(this, w);
            if (objectVolatile != null) {
                if (objectVolatile instanceof ke8) {
                    long longVolatile = unsafe.getLongVolatile((ke8) objectVolatile, ke8.g);
                    return ((int) (1073741823 & longVolatile)) == ((int) ((longVolatile & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == b05.b) {
                }
            }
            return true;
        }
        return false;
    }

    public void n1(long j, yz4 yz4Var) {
        pq3.y.o1(j, yz4Var);
    }

    public final void o1(long j, yz4 yz4Var) {
        a05 a05Var;
        int iB;
        Unsafe unsafe;
        Thread threadL1;
        long j2 = g;
        Unsafe unsafe2 = ud0.a;
        if (unsafe2.getIntVolatile(this, v) == 1) {
            a05Var = this;
            iB = 1;
        } else {
            zz4 zz4Var = (zz4) unsafe2.getObjectVolatile(this, j2);
            if (zz4Var == null) {
                zz4 zz4Var2 = new zz4();
                zz4Var2.c = j;
                while (true) {
                    unsafe = ud0.a;
                    a05Var = this;
                    if (unsafe.compareAndSwapObject(a05Var, g, (Object) null, zz4Var2) || unsafe.getObjectVolatile(a05Var, j2) != null) {
                        break;
                    } else {
                        this = a05Var;
                    }
                }
                Object objectVolatile = unsafe.getObjectVolatile(a05Var, j2);
                objectVolatile.getClass();
                zz4Var = (zz4) objectVolatile;
                unsafe2 = unsafe;
            } else {
                a05Var = this;
            }
            iB = yz4Var.b(j, zz4Var, a05Var);
        }
        if (iB != 0) {
            if (iB == 1) {
                a05Var.n1(j, yz4Var);
                return;
            } else {
                if (iB == 2) {
                    return;
                }
                qc0.p("unexpected result");
                return;
            }
        }
        zz4 zz4Var3 = (zz4) unsafe2.getObjectVolatile(a05Var, j2);
        yz4 yz4Var2 = null;
        if (zz4Var3 != null) {
            synchronized (zz4Var3) {
                yz4[] yz4VarArr = zz4Var3.a;
                yz4Var2 = yz4VarArr != null ? yz4VarArr[0] : null;
            }
        }
        if (yz4Var2 != yz4Var || Thread.currentThread() == (threadL1 = a05Var.l1())) {
            return;
        }
        LockSupport.unpark(threadL1);
    }

    @Override // defpackage.vz4
    public void shutdown() {
        ig4 ig4Var;
        Unsafe unsafe;
        yz4 yz4VarC;
        gwe.a.set(null);
        ud0.a.putIntVolatile(this, v, 1);
        ig4 ig4Var2 = b05.b;
        long j = w;
        loop0: while (true) {
            Object objectVolatile = ud0.a.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe2 = ud0.a;
                    ig4Var = ig4Var2;
                    if (unsafe2.compareAndSwapObject(this, w, (Object) null, ig4Var2)) {
                        break loop0;
                    } else if (unsafe2.getObjectVolatile(this, j) != null) {
                        break;
                    } else {
                        ig4Var2 = ig4Var;
                    }
                }
                ig4Var2 = ig4Var;
            } else {
                ig4Var = ig4Var2;
                if (objectVolatile instanceof ke8) {
                    ((ke8) objectVolatile).b();
                    break;
                }
                if (objectVolatile == ig4Var) {
                    break;
                }
                ke8 ke8Var = new ke8(8, true);
                ke8Var.a((Runnable) objectVolatile);
                do {
                    unsafe = ud0.a;
                    if (unsafe.compareAndSwapObject(this, w, objectVolatile, ke8Var)) {
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                ig4Var2 = ig4Var;
            }
        }
        while (g1() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            zz4 zz4Var = (zz4) ud0.a.getObjectVolatile(this, g);
            if (zz4Var == null) {
                return;
            }
            synchronized (zz4Var) {
                yz4VarC = zz4Var.b() > 0 ? zz4Var.c(0) : null;
            }
            if (yz4VarC == null) {
                return;
            } else {
                n1(jNanoTime, yz4VarC);
            }
        }
    }
}
