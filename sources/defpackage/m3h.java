package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class m3h extends g5h {
    public static final AtomicLong z = new AtomicLong(Long.MIN_VALUE);
    public j3h d;
    public j3h e;
    public final PriorityBlockingQueue f;
    public final LinkedBlockingQueue g;
    public final f3h v;
    public final f3h w;
    public final Object x;
    public final Semaphore y;

    public m3h(w3h w3hVar) {
        super(w3hVar);
        this.x = new Object();
        this.y = new Semaphore(2);
        this.f = new PriorityBlockingQueue();
        this.g = new LinkedBlockingQueue();
        this.v = new f3h(this, "Thread death: Uncaught exception on worker thread");
        this.w = new f3h(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // defpackage.m4
    public final void A0() {
        if (Thread.currentThread() == this.d) {
            return;
        }
        qc0.p("Call expected from worker thread");
    }

    @Override // defpackage.g5h
    public final boolean B0() {
        return false;
    }

    public final void E0() {
        if (Thread.currentThread() == this.e) {
            return;
        }
        qc0.p("Call expected from network thread");
    }

    public final void F0() {
        if (Thread.currentThread() != this.d) {
            return;
        }
        qc0.p("Call not expected from worker thread");
    }

    public final boolean G0() {
        return Thread.currentThread() == this.d;
    }

    public final h3h H0(Callable callable) {
        C0();
        h3h h3hVar = new h3h(this, callable, false);
        if (Thread.currentThread() != this.d) {
            N0(h3hVar);
            return h3hVar;
        }
        if (!this.f.isEmpty()) {
            w0h w0hVar = ((w3h) this.b).f;
            w3h.h(w0hVar);
            w0hVar.x.a("Callable skipped the worker queue.");
        }
        h3hVar.run();
        return h3hVar;
    }

    public final h3h I0(Callable callable) {
        C0();
        h3h h3hVar = new h3h(this, callable, true);
        if (Thread.currentThread() == this.d) {
            h3hVar.run();
            return h3hVar;
        }
        N0(h3hVar);
        return h3hVar;
    }

    public final void J0(Runnable runnable) {
        C0();
        oa7.A(runnable);
        N0(new h3h(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object K0(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            m3h m3hVar = ((w3h) this.b).g;
            w3h.h(m3hVar);
            m3hVar.J0(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                w0h w0hVar = ((w3h) this.b).f;
                w3h.h(w0hVar);
                tz0 tz0Var = w0hVar.x;
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                tz0Var.a(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            w0h w0hVar2 = ((w3h) this.b).f;
            w3h.h(w0hVar2);
            w0hVar2.x.a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void L0(Runnable runnable) {
        C0();
        N0(new h3h(this, runnable, true, "Task exception on worker thread"));
    }

    public final void M0(Runnable runnable) {
        C0();
        h3h h3hVar = new h3h(this, runnable, false, "Task exception on network thread");
        synchronized (this.x) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.g;
                linkedBlockingQueue.add(h3hVar);
                j3h j3hVar = this.e;
                if (j3hVar == null) {
                    j3h j3hVar2 = new j3h(this, "Measurement Network", linkedBlockingQueue);
                    this.e = j3hVar2;
                    j3hVar2.setUncaughtExceptionHandler(this.w);
                    this.e.start();
                } else {
                    Object obj = j3hVar.a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void N0(h3h h3hVar) {
        synchronized (this.x) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f;
                priorityBlockingQueue.add(h3hVar);
                j3h j3hVar = this.d;
                if (j3hVar == null) {
                    j3h j3hVar2 = new j3h(this, "Measurement Worker", priorityBlockingQueue);
                    this.d = j3hVar2;
                    j3hVar2.setUncaughtExceptionHandler(this.v);
                    this.d.start();
                } else {
                    Object obj = j3hVar.a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
