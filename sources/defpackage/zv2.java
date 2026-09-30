package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zv2 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater v = AtomicLongFieldUpdater.newUpdater(zv2.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater w = AtomicLongFieldUpdater.newUpdater(zv2.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater x = AtomicIntegerFieldUpdater.newUpdater(zv2.class, "_isTerminated$volatile");
    public static final ig4 y = new ig4("NOT_IN_STACK", 2);
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String d;
    public final nb6 e;
    public final nb6 f;
    public final kxb g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public zv2(int i, int i2, long j, String str) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = str;
        if (i < 1) {
            qc0.o(tec.f(i, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            qc0.o(ks0.k("Max pool size ", i2, " should be greater than or equals to core pool size ", i));
            throw null;
        }
        if (i2 > 2097150) {
            qc0.o(tec.f(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            qc0.o(kv2.m("Idle worker keep alive time ", " must be positive", j));
            throw null;
        }
        this.e = new nb6();
        this.f = new nb6();
        this.g = new kxb((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    public static /* synthetic */ void l(zv2 zv2Var, Runnable runnable, int i) {
        zv2Var.h(runnable, false, (i & 4) == 0);
    }

    public final boolean E() {
        zv2 zv2Var;
        ig4 ig4Var;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = v;
            long j = atomicLongFieldUpdater.get(this);
            xv2 xv2Var = (xv2) this.g.b((int) (2097151 & j));
            if (xv2Var == null) {
                xv2Var = null;
                zv2Var = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objC = xv2Var.c();
                while (true) {
                    ig4Var = y;
                    if (objC == ig4Var) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    xv2 xv2Var2 = (xv2) objC;
                    iB = xv2Var2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = xv2Var2.c();
                    atomicLongFieldUpdater = atomicLongFieldUpdater;
                    this = this;
                }
                if (iB >= 0) {
                    zv2 zv2Var2 = this;
                    boolean zCompareAndSet = atomicLongFieldUpdater.compareAndSet(zv2Var2, j, j2 | ((long) iB));
                    zv2Var = zv2Var2;
                    if (zCompareAndSet) {
                        xv2Var.g(ig4Var);
                    }
                    this = zv2Var;
                } else {
                    continue;
                }
            }
            if (xv2Var == null) {
                return false;
            }
            if (xv2.w.compareAndSet(xv2Var, -1, 0)) {
                LockSupport.unpark(xv2Var);
                return true;
            }
            this = zv2Var;
        }
    }

    public final int b() {
        synchronized (this.g) {
            try {
                if (x.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = w;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.a) {
                    return 0;
                }
                if (i >= this.b) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.g.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                xv2 xv2Var = new xv2(this, i3);
                this.g.c(i3, xv2Var);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                xv2Var.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        fle fleVarA;
        if (x.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            xv2 xv2Var = threadCurrentThread instanceof xv2 ? (xv2) threadCurrentThread : null;
            if (xv2Var == null || xv2Var.v != this) {
                xv2Var = null;
            }
            synchronized (this.g) {
                i = (int) (w.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objB = this.g.b(i2);
                    objB.getClass();
                    xv2 xv2Var2 = (xv2) objB;
                    if (xv2Var2 != xv2Var) {
                        while (xv2Var2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(xv2Var2);
                            xv2Var2.join(10000L);
                        }
                        hbg hbgVar = xv2Var2.a;
                        nb6 nb6Var = this.f;
                        hbgVar.getClass();
                        fle fleVar = (fle) ud0.a.getAndSetObject(hbgVar, hbg.f, (Object) null);
                        if (fleVar != null) {
                            nb6Var.a(fleVar);
                        }
                        while (true) {
                            fle fleVarC = hbgVar.c();
                            if (fleVarC == null) {
                                break;
                            } else {
                                nb6Var.a(fleVarC);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f.b();
            this.e.b();
            while (true) {
                if (xv2Var != null) {
                    fleVarA = xv2Var.a(true);
                    if (fleVarA == null) {
                        fleVarA = (fle) this.e.d();
                        if (fleVarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    fleVarA = (fle) this.e.d();
                    if (fleVarA == null && (fleVarA = (fle) this.f.d()) == null) {
                        break;
                    }
                }
                try {
                    fleVarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (xv2Var != null) {
                xv2Var.h(yv2.e);
            }
            v.set(this, 0L);
            w.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        l(this, runnable, 6);
    }

    public final void h(Runnable runnable, boolean z, boolean z2) {
        fle ileVar;
        yv2 yv2Var;
        lle.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof fle) {
            ileVar = (fle) runnable;
            ileVar.a = jNanoTime;
            ileVar.b = z;
        } else {
            ileVar = new ile(runnable, jNanoTime, z);
        }
        boolean z3 = ileVar.b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = w;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        xv2 xv2Var = threadCurrentThread instanceof xv2 ? (xv2) threadCurrentThread : null;
        if (xv2Var == null || xv2Var.v != this) {
            xv2Var = null;
        }
        if (xv2Var != null && (yv2Var = xv2Var.c) != yv2.e && (ileVar.b || yv2Var != yv2.b)) {
            xv2Var.g = true;
            hbg hbgVar = xv2Var.a;
            if (z2) {
                ileVar = hbgVar.a(ileVar);
            } else {
                hbgVar.getClass();
                fle fleVar = (fle) ud0.a.getAndSetObject(hbgVar, hbg.f, ileVar);
                ileVar = fleVar == null ? null : hbgVar.a(fleVar);
            }
        }
        if (ileVar != null) {
            if (!(ileVar.b ? this.f.a(ileVar) : this.e.a(ileVar))) {
                throw new RejectedExecutionException(ks0.l(new StringBuilder(), this.d, " was terminated"));
            }
        }
        if (z3) {
            if (E() || x(jAddAndGet)) {
                return;
            }
            E();
            return;
        }
        if (E() || x(atomicLongFieldUpdater.get(this))) {
            return;
        }
        E();
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kxb kxbVar = this.g;
        int iA = kxbVar.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            xv2 xv2Var = (xv2) kxbVar.b(i6);
            if (xv2Var != null) {
                hbg hbgVar = xv2Var.a;
                hbgVar.getClass();
                Object objectVolatile = ud0.a.getObjectVolatile(hbgVar, hbg.f);
                int iB = hbgVar.b();
                if (objectVolatile != null) {
                    iB++;
                }
                int iOrdinal = xv2Var.c.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iB);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iB);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (iB > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iB);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        ap.c();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = w.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.d);
        sb4.append('@');
        sb4.append(mh3.F(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.a;
        sb4.append(i7);
        sb4.append(", max = ");
        ub3.u(sb4, this.b, "}, Worker States {CPU = ", i, ", blocking = ");
        ub3.u(sb4, i2, ", parked = ", i3, ", dormant = ");
        ub3.u(sb4, i4, ", terminated = ", i5, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final void u(xv2 xv2Var, int i, int i2) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = v;
            long j = atomicLongFieldUpdater.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objC = xv2Var.c();
                    while (true) {
                        if (objC == y) {
                            i3 = -1;
                            break;
                        }
                        if (objC == null) {
                            i3 = 0;
                            break;
                        }
                        xv2 xv2Var2 = (xv2) objC;
                        int iB = xv2Var2.b();
                        if (iB != 0) {
                            i3 = iB;
                            break;
                        }
                        objC = xv2Var2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                long j3 = j2 | ((long) i3);
                zv2 zv2Var = this;
                if (atomicLongFieldUpdater.compareAndSet(zv2Var, j, j3)) {
                    return;
                } else {
                    this = zv2Var;
                }
            }
        }
    }

    public final boolean x(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.a;
        if (i < i2) {
            int iB = b();
            if (iB == 1 && i2 > 1) {
                b();
            }
            if (iB > 0) {
                return true;
            }
        }
        return false;
    }
}
