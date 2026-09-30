package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ba7 extends AtomicReference implements Runnable {
    public static final mt4 a;
    public static final mt4 b;

    static {
        int i = 1;
        a = new mt4(i);
        b = new mt4(i);
    }

    public abstract void a(Throwable th);

    public abstract void b(Object obj);

    public abstract boolean c();

    public abstract Object d();

    public abstract String e();

    public final void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        aa7 aa7Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof aa7;
            mt4 mt4Var = b;
            if (!z2 && runnable != mt4Var) {
                break;
            }
            if (z2) {
                aa7Var = (aa7) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == mt4Var || compareAndSet(runnable, mt4Var)) {
                z = Thread.interrupted() || z;
                LockSupport.park(aa7Var);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objD = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zC = c();
            mt4 mt4Var = a;
            if (!zC) {
                try {
                    objD = d();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, mt4Var)) {
                            g(threadCurrentThread);
                        }
                        if (zC) {
                            return;
                        }
                        a(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, mt4Var)) {
                            g(threadCurrentThread);
                        }
                        if (!zC) {
                            b(null);
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, mt4Var)) {
                g(threadCurrentThread);
            }
            if (zC) {
                return;
            }
            b(objD);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == a) {
            str = "running=[DONE]";
        } else if (runnable instanceof aa7) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sbQ = kv2.q(str, ", ");
        sbQ.append(e());
        return sbQ.toString();
    }
}
