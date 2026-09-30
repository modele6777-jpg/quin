package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xv2 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater w = AtomicIntegerFieldUpdater.newUpdater(xv2.class, "workerCtl$volatile");
    public static final /* synthetic */ long x = ud0.a.objectFieldOffset(xv2.class.getDeclaredField("workerCtl$volatile"));
    public final hbg a;
    public final mmb b;
    public yv2 c;
    public long d;
    public long e;
    public int f;
    public boolean g;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    public final /* synthetic */ zv2 v;
    private volatile /* synthetic */ int workerCtl$volatile;

    public xv2(zv2 zv2Var, int i) {
        this.v = zv2Var;
        setDaemon(true);
        setContextClassLoader(zv2.class.getClassLoader());
        this.a = new hbg();
        this.b = new mmb();
        this.c = yv2.d;
        this.nextParkedWorker = zv2.y;
        int iNanoTime = (int) System.nanoTime();
        this.f = iNanoTime == 0 ? 42 : iNanoTime;
        f(i);
    }

    public final fle a(boolean z) {
        fle fleVarE;
        fle fleVarE2;
        long j;
        Unsafe unsafe;
        yv2 yv2Var = this.c;
        zv2 zv2Var = this.v;
        fle fleVar = null;
        hbg hbgVar = this.a;
        yv2 yv2Var2 = yv2.a;
        if (yv2Var != yv2Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = zv2.w;
            do {
                j = atomicLongFieldUpdater.get(zv2Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    hbgVar.getClass();
                    long j2 = hbg.f;
                    loop1: while (true) {
                        Unsafe unsafe2 = ud0.a;
                        fle fleVar2 = (fle) unsafe2.getObjectVolatile(hbgVar, j2);
                        if (fleVar2 == null || !fleVar2.b) {
                            int intVolatile = unsafe2.getIntVolatile(hbgVar, hbg.e);
                            int intVolatile2 = unsafe2.getIntVolatile(hbgVar, hbg.g);
                            while (intVolatile != intVolatile2 && ud0.a.getIntVolatile(hbgVar, hbg.d) != 0) {
                                intVolatile2--;
                                fle fleVarD = hbgVar.d(intVolatile2, true);
                                if (fleVarD != null) {
                                    fleVar = fleVarD;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            unsafe = ud0.a;
                            if (unsafe.compareAndSwapObject(hbgVar, hbg.f, fleVar2, (Object) null)) {
                                fleVar = fleVar2;
                                break loop1;
                            }
                        } while (unsafe.getObjectVolatile(hbgVar, j2) == fleVar2);
                    }
                    if (fleVar != null) {
                        return fleVar;
                    }
                    fle fleVar3 = (fle) zv2Var.f.d();
                    return fleVar3 == null ? i(1) : fleVar3;
                }
            } while (!zv2.w.compareAndSet(zv2Var, j, j - 4398046511104L));
            this.c = yv2Var2;
        }
        if (z) {
            boolean z2 = d(zv2Var.a * 2) == 0;
            if (z2 && (fleVarE2 = e()) != null) {
                return fleVarE2;
            }
            hbgVar.getClass();
            fle fleVarC = (fle) ud0.a.getAndSetObject(hbgVar, hbg.f, (Object) null);
            if (fleVarC == null) {
                fleVarC = hbgVar.c();
            }
            if (fleVarC != null) {
                return fleVarC;
            }
            if (!z2 && (fleVarE = e()) != null) {
                return fleVarE;
            }
        } else {
            fle fleVarE3 = e();
            if (fleVarE3 != null) {
                return fleVarE3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.f;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final fle e() {
        int iD = d(2);
        zv2 zv2Var = this.v;
        nb6 nb6Var = zv2Var.f;
        nb6 nb6Var2 = zv2Var.e;
        if (iD == 0) {
            fle fleVar = (fle) nb6Var2.d();
            return fleVar != null ? fleVar : (fle) nb6Var.d();
        }
        fle fleVar2 = (fle) nb6Var.d();
        return fleVar2 != null ? fleVar2 : (fle) nb6Var2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.v.d);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(yv2 yv2Var) {
        yv2 yv2Var2 = this.c;
        boolean z = yv2Var2 == yv2.a;
        if (z) {
            zv2.w.addAndGet(this.v, 4398046511104L);
        }
        if (yv2Var2 != yv2Var) {
            this.c = yv2Var;
        }
        return z;
    }

    public final fle i(int i) {
        int i2;
        long j;
        fle fleVarC;
        long j2;
        long j3;
        Unsafe unsafe;
        AtomicLongFieldUpdater atomicLongFieldUpdater = zv2.w;
        zv2 zv2Var = this.v;
        int i3 = (int) (atomicLongFieldUpdater.get(zv2Var) & 2097151);
        fle fleVar = null;
        if (i3 < 2) {
            return null;
        }
        int iD = d(i3);
        int i4 = 0;
        long jMin = Long.MAX_VALUE;
        while (i4 < i3) {
            iD++;
            if (iD > i3) {
                iD = 1;
            }
            xv2 xv2Var = (xv2) zv2Var.g.b(iD);
            if (xv2Var == null || xv2Var == this) {
                i2 = i3;
            } else {
                hbg hbgVar = xv2Var.a;
                hbgVar.getClass();
                if (i != 3) {
                    boolean z = i == 1;
                    Unsafe unsafe2 = ud0.a;
                    j = 0;
                    int intVolatile = unsafe2.getIntVolatile(hbgVar, hbg.e);
                    int intVolatile2 = unsafe2.getIntVolatile(hbgVar, hbg.g);
                    while (true) {
                        if (intVolatile != intVolatile2) {
                            if (z) {
                                i2 = i3;
                                if (ud0.a.getIntVolatile(hbgVar, hbg.d) == 0) {
                                }
                            } else {
                                i2 = i3;
                            }
                            int i5 = intVolatile + 1;
                            fle fleVarD = hbgVar.d(intVolatile, z);
                            if (fleVarD != null) {
                                fleVarC = fleVarD;
                                break;
                            }
                            intVolatile = i5;
                            i3 = i2;
                        } else {
                            i2 = i3;
                        }
                        fleVarC = fleVar;
                        break;
                    }
                } else {
                    fleVarC = hbgVar.c();
                    i2 = i3;
                    j = 0;
                }
                mmb mmbVar = this.b;
                if (fleVarC == null) {
                    j2 = -1;
                    long j4 = hbg.f;
                    while (true) {
                        fle fleVar2 = (fle) ud0.a.getObjectVolatile(hbgVar, j4);
                        if (fleVar2 != null) {
                            if (((fleVar2.b ? 1 : 2) & i) != 0) {
                                lle.f.getClass();
                                hbg hbgVar2 = hbgVar;
                                long jNanoTime = System.nanoTime() - fleVar2.a;
                                long j5 = lle.b;
                                if (jNanoTime < j5) {
                                    j3 = j5 - jNanoTime;
                                    break;
                                }
                                do {
                                    unsafe = ud0.a;
                                    if (unsafe.compareAndSwapObject(hbgVar2, hbg.f, fleVar2, (Object) null)) {
                                        mmbVar.element = fleVar2;
                                        j3 = -1;
                                        break;
                                    }
                                } while (unsafe.getObjectVolatile(hbgVar2, j4) == fleVar2);
                                hbgVar = hbgVar2;
                            }
                        }
                        j3 = -2;
                        break;
                    }
                } else {
                    mmbVar.element = fleVarC;
                    j3 = -1;
                    j2 = -1;
                }
                if (j3 == j2) {
                    fle fleVar3 = (fle) mmbVar.element;
                    mmbVar.element = null;
                    return fleVar3;
                }
                if (j3 > j) {
                    jMin = Math.min(jMin, j3);
                }
            }
            i4++;
            i3 = i2;
            fleVar = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.e = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (zv2.x.get(this.v) != 1) {
                    yv2 yv2Var = this.c;
                    yv2 yv2Var2 = yv2.e;
                    if (yv2Var == yv2Var2) {
                        break loop0;
                    }
                    fle fleVarA = a(this.g);
                    if (fleVarA != null) {
                        this.e = 0L;
                        zv2 zv2Var = this.v;
                        this.d = 0L;
                        if (this.c == yv2.c) {
                            this.c = yv2.b;
                        }
                        if (!fleVarA.b) {
                            try {
                                fleVarA.run();
                                break;
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                break;
                            }
                        }
                        if (h(yv2.b) && !zv2Var.E() && !zv2Var.x(zv2.w.get(zv2Var))) {
                            zv2Var.E();
                        }
                        try {
                            fleVarA.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                        zv2.w.addAndGet(zv2Var, -2097152L);
                        if (this.c == yv2Var2) {
                            break;
                        }
                        this.c = yv2.d;
                        break;
                    }
                    this.g = false;
                    if (this.e == 0) {
                        Object obj = this.nextParkedWorker;
                        ig4 ig4Var = zv2.y;
                        if (obj != ig4Var) {
                            int i = -1;
                            ud0.a.putIntVolatile(this, x, -1);
                            while (this.nextParkedWorker != zv2.y) {
                                Unsafe unsafe = ud0.a;
                                long j = x;
                                if (unsafe.getIntVolatile(this, j) != i) {
                                    break;
                                }
                                zv2 zv2Var2 = this.v;
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = zv2.x;
                                if (atomicIntegerFieldUpdater.get(zv2Var2) == 1) {
                                    break;
                                }
                                yv2 yv2Var3 = this.c;
                                yv2 yv2Var4 = yv2.e;
                                if (yv2Var3 == yv2Var4) {
                                    break;
                                }
                                h(yv2.c);
                                Thread.interrupted();
                                if (this.d == 0) {
                                    this.d = System.nanoTime() + this.v.c;
                                }
                                LockSupport.parkNanos(this.v.c);
                                if (System.nanoTime() - this.d >= 0) {
                                    this.d = 0L;
                                    zv2 zv2Var3 = this.v;
                                    synchronized (zv2Var3.g) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater.get(zv2Var3) == 1)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = zv2.w;
                                                if (((int) (atomicLongFieldUpdater.get(zv2Var3) & 2097151)) > zv2Var3.a && unsafe.compareAndSwapInt(this, j, -1, 1)) {
                                                    int i2 = this.indexInArray;
                                                    f(0);
                                                    zv2Var3.u(this, i2, 0);
                                                    int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(zv2Var3) & 2097151);
                                                    if (andDecrement != i2) {
                                                        Object objB = zv2Var3.g.b(andDecrement);
                                                        objB.getClass();
                                                        xv2 xv2Var = (xv2) objB;
                                                        zv2Var3.g.c(i2, xv2Var);
                                                        xv2Var.f(i2);
                                                        zv2Var3.u(xv2Var, andDecrement, i2);
                                                    }
                                                    zv2Var3.g.c(andDecrement, null);
                                                    this.c = yv2Var4;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                                i = -1;
                            }
                        } else {
                            zv2 zv2Var4 = this.v;
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = zv2.v;
                            if (this.nextParkedWorker == ig4Var) {
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(zv2Var4);
                                    int i3 = this.indexInArray;
                                    this.nextParkedWorker = zv2Var4.g.b((int) (j2 & 2097151));
                                    zv2 zv2Var5 = zv2Var4;
                                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                                    if (atomicLongFieldUpdater3.compareAndSet(zv2Var5, j2, ((j2 + 2097152) & (-2097152)) | ((long) i3))) {
                                        break;
                                    }
                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                    zv2Var4 = zv2Var5;
                                }
                            }
                        }
                    } else {
                        if (z) {
                            h(yv2.c);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.e);
                            this.e = 0L;
                            break;
                        }
                        z = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(yv2.e);
    }
}
