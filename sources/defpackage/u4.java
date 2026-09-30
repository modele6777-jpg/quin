package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u4 implements m88 {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(u4.class.getName());
    public static final jgb f;
    public static final Object g;
    public volatile Object a;
    public volatile q4 b;
    public volatile t4 c;

    static {
        jgb s4Var;
        try {
            s4Var = new r4(AtomicReferenceFieldUpdater.newUpdater(t4.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(t4.class, t4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(u4.class, t4.class, "c"), AtomicReferenceFieldUpdater.newUpdater(u4.class, q4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(u4.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            s4Var = new s4();
        }
        f = s4Var;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    public static void e(u4 u4Var) {
        t4 t4Var;
        q4 q4Var;
        q4 q4Var2;
        q4 q4Var3;
        do {
            t4Var = u4Var.c;
        } while (!f.L(u4Var, t4Var, t4.c));
        while (true) {
            q4Var = null;
            if (t4Var == null) {
                break;
            }
            Thread thread = t4Var.a;
            if (thread != null) {
                t4Var.a = null;
                LockSupport.unpark(thread);
            }
            t4Var = t4Var.b;
        }
        u4Var.d();
        do {
            q4Var2 = u4Var.b;
        } while (!f.J(u4Var, q4Var2, q4.d));
        while (true) {
            q4Var3 = q4Var;
            q4Var = q4Var2;
            if (q4Var == null) {
                break;
            }
            q4Var2 = q4Var.c;
            q4Var.c = q4Var3;
        }
        while (q4Var3 != null) {
            q4 q4Var4 = q4Var3.c;
            f(q4Var3.a, q4Var3.b);
            q4Var3 = q4Var4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object g(Object obj) throws ExecutionException {
        if (obj instanceof n4) {
            Throwable th = ((n4) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof p4) {
            throw new ExecutionException(((p4) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    public static Object h(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objH = h(this);
            sb.append("SUCCESS, result=[");
            sb.append(objH == this ? "this future" : String.valueOf(objH));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // defpackage.m88
    public final void b(Runnable runnable, Executor executor) {
        executor.getClass();
        q4 q4Var = this.b;
        q4 q4Var2 = q4.d;
        if (q4Var != q4Var2) {
            q4 q4Var3 = new q4(runnable, executor);
            do {
                q4Var3.c = q4Var;
                if (f.J(this, q4Var, q4Var3)) {
                    return;
                } else {
                    q4Var = this.b;
                }
            } while (q4Var != q4Var2);
        }
        f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        n4 n4Var;
        Object obj = this.a;
        if (obj == null) {
            if (d) {
                n4Var = new n4(new CancellationException("Future.cancel() was called."), z);
            } else {
                n4Var = z ? n4.c : n4.d;
            }
            if (f.K(this, obj, n4Var)) {
                e(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        t4 t4Var = t4.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if (obj != null) {
            return g(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            t4 t4Var2 = this.c;
            if (t4Var2 != t4Var) {
                t4 t4Var3 = new t4();
                while (true) {
                    jgb jgbVar = f;
                    jgbVar.e0(t4Var3, t4Var2);
                    if (jgbVar.L(this, t4Var2, t4Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                j(t4Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        j(t4Var3);
                        break;
                    }
                    t4Var2 = this.c;
                    if (t4Var2 == t4Var) {
                    }
                }
            }
            return g(this.a);
        }
        while (nanos > 0) {
            Object obj3 = this.a;
            if (obj3 != null) {
                return g(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbP = ub3.p("Waited ", " ", j);
        sbP.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbP.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat2 = strConcat + jConvert + " " + lowerCase;
                if (z) {
                    strConcat2 = strConcat2.concat(",");
                }
                strConcat = strConcat2.concat(" ");
            }
            if (z) {
                strConcat = kv2.m(strConcat, " nanoseconds ", nanos2);
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(ib8.j(string3, " for ", string));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof n4;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    public final void j(t4 t4Var) {
        t4Var.a = null;
        while (true) {
            t4 t4Var2 = this.c;
            if (t4Var2 == t4.c) {
                return;
            }
            t4 t4Var3 = null;
            while (t4Var2 != null) {
                t4 t4Var4 = t4Var2.b;
                if (t4Var2.a != null) {
                    t4Var3 = t4Var2;
                } else if (t4Var3 != null) {
                    t4Var3.b = t4Var4;
                    if (t4Var3.a == null) {
                    }
                } else if (!f.L(this, t4Var2, t4Var4)) {
                }
                t4Var2 = t4Var4;
            }
            return;
        }
    }

    public boolean k(Object obj) {
        if (obj == null) {
            obj = g;
        }
        if (!f.K(this, null, obj)) {
            return false;
        }
        e(this);
        return true;
    }

    public boolean l(Throwable th) {
        th.getClass();
        if (!f.K(this, null, new p4(th))) {
            return false;
        }
        e(this);
        return true;
    }

    public final String toString() {
        String strI;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof n4) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strI = i();
            } catch (RuntimeException e2) {
                strI = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strI != null && !strI.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strI);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void d() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        t4 t4Var = t4.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return g(obj2);
            }
            t4 t4Var2 = this.c;
            if (t4Var2 != t4Var) {
                t4 t4Var3 = new t4();
                do {
                    jgb jgbVar = f;
                    jgbVar.e0(t4Var3, t4Var2);
                    if (jgbVar.L(this, t4Var2, t4Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                j(t4Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return g(obj);
                    }
                    t4Var2 = this.c;
                } while (t4Var2 != t4Var);
            }
            return g(this.a);
        }
        throw new InterruptedException();
    }
}
