package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pq3 extends a05 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final pq3 y;
    public static final long z;

    static {
        Long l;
        pq3 pq3Var = new pq3();
        y = pq3Var;
        pq3Var.f1(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        z = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.ov3
    public final ta4 R(long j, Runnable runnable, pv2 pv2Var) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 >= 4611686018427387903L) {
            return hg9.a;
        }
        long jNanoTime = System.nanoTime();
        xz4 xz4Var = new xz4(runnable, j2 + jNanoTime);
        o1(jNanoTime, xz4Var);
        return xz4Var;
    }

    @Override // defpackage.a05
    public final void i1(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.i1(runnable);
    }

    @Override // defpackage.a05
    public final Thread l1() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(y.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.a05
    public final void n1(long j, yz4 yz4Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void p1() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            Unsafe unsafe = ud0.a;
            unsafe.putObjectVolatile(this, a05.w, (Object) null);
            unsafe.putObjectVolatile(this, a05.g, (Object) null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        gwe.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    p1();
                    if (m1()) {
                        return;
                    }
                    l1();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jG1 = g1();
                    if (jG1 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = z + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            p1();
                            if (m1()) {
                                return;
                            }
                            l1();
                            return;
                        }
                        if (jG1 > j2) {
                            jG1 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jG1 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            p1();
                            if (m1()) {
                                return;
                            }
                            l1();
                            return;
                        }
                        LockSupport.parkNanos(this, jG1);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            p1();
            if (!m1()) {
                l1();
            }
            throw th;
        }
    }

    @Override // defpackage.a05, defpackage.vz4
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.sv2
    public final String toString() {
        return "DefaultExecutor";
    }
}
