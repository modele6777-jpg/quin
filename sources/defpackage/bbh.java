package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class bbh implements vwg {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(bbh.class.getName());
    public static final d8c f;
    public static final Object g;
    public volatile Object a;
    public volatile j1h b;
    public volatile y8h c;

    static {
        d8c o7hVar;
        try {
            o7hVar = new z4h(AtomicReferenceFieldUpdater.newUpdater(y8h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(y8h.class, y8h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(bbh.class, y8h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(bbh.class, j1h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(bbh.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            o7hVar = new o7h();
        }
        Throwable th2 = th;
        f = o7hVar;
        if (th2 != null) {
            e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        g = new Object();
    }

    public static void d(bbh bbhVar) {
        y8h y8hVar;
        d8c d8cVar;
        j1h j1hVar;
        j1h j1hVar2;
        j1h j1hVar3;
        do {
            y8hVar = bbhVar.c;
            d8cVar = f;
        } while (!d8cVar.y(bbhVar, y8hVar, y8h.c));
        while (true) {
            j1hVar = null;
            if (y8hVar == null) {
                break;
            }
            Thread thread = y8hVar.a;
            if (thread != null) {
                y8hVar.a = null;
                LockSupport.unpark(thread);
            }
            y8hVar = y8hVar.b;
        }
        do {
            j1hVar2 = bbhVar.b;
        } while (!d8cVar.w(bbhVar, j1hVar2, j1h.d));
        while (true) {
            j1hVar3 = j1hVar;
            j1hVar = j1hVar2;
            if (j1hVar == null) {
                break;
            }
            j1hVar2 = j1hVar.c;
            j1hVar.c = j1hVar3;
        }
        while (j1hVar3 != null) {
            Runnable runnable = j1hVar3.a;
            j1h j1hVar4 = j1hVar3.c;
            f(runnable, j1hVar3.b);
            j1hVar3 = j1hVar4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", ub3.k("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e2);
        }
    }

    public static final Object h(Object obj) throws ExecutionException {
        if (obj instanceof dxg) {
            Throwable th = ((dxg) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof ezg) {
            throw new ExecutionException(((ezg) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String a() {
        if (this instanceof ScheduledFuture) {
            return kv2.m("remaining delay=[", " ms]", ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
        }
        return null;
    }

    @Override // defpackage.vwg
    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        j1h j1hVar = this.b;
        j1h j1hVar2 = j1h.d;
        if (j1hVar != j1hVar2) {
            j1h j1hVar3 = new j1h(runnable, executor);
            do {
                j1hVar3.c = j1hVar;
                if (f.w(this, j1hVar, j1hVar3)) {
                    return;
                } else {
                    j1hVar = this.b;
                }
            } while (j1hVar != j1hVar2);
        }
        f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        dxg dxgVar;
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (d) {
            dxgVar = new dxg(new CancellationException("Future.cancel() was called."));
        } else {
            dxgVar = z ? dxg.b : dxg.c;
        }
        if (!f.x(this, obj, dxgVar)) {
            return false;
        }
        d(this);
        return true;
    }

    public final void e(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    sb.append("CANCELLED");
                    return;
                } catch (RuntimeException e2) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e2.getClass());
                    sb.append(" thrown from get()]");
                    return;
                } catch (ExecutionException e3) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e3.getCause());
                    sb.append("]");
                    return;
                }
            } catch (InterruptedException unused2) {
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
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    public final void g(y8h y8hVar) {
        y8hVar.a = null;
        while (true) {
            y8h y8hVar2 = this.c;
            if (y8hVar2 != y8h.c) {
                y8h y8hVar3 = null;
                while (y8hVar2 != null) {
                    y8h y8hVar4 = y8hVar2.b;
                    if (y8hVar2.a != null) {
                        y8hVar3 = y8hVar2;
                    } else if (y8hVar3 != null) {
                        y8hVar3.b = y8hVar4;
                        if (y8hVar3.a == null) {
                        }
                    } else if (!f.y(this, y8hVar2, y8hVar4)) {
                    }
                    y8hVar2 = y8hVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if (obj != null) {
            return h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            y8h y8hVar = this.c;
            y8h y8hVar2 = y8h.c;
            if (y8hVar != y8hVar2) {
                y8h y8hVar3 = new y8h();
                while (true) {
                    d8c d8cVar = f;
                    d8cVar.u(y8hVar3, y8hVar);
                    if (d8cVar.y(this, y8hVar, y8hVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                g(y8hVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        g(y8hVar3);
                        break;
                    }
                    y8hVar = this.c;
                    if (y8hVar == y8hVar2) {
                    }
                }
            }
            return h(this.a);
        }
        while (nanos > 0) {
            Object obj3 = this.a;
            if (obj3 != null) {
                return h(obj3);
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
        String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = true;
            if (jConvert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z) {
                strConcat2 = kv2.m(strConcat2, " nanoseconds ", nanos2);
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(ib8.j(strConcat, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof dxg;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof dxg) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            e(sb);
        } else {
            try {
                strConcat = a();
            } catch (RuntimeException e2) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e2.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strConcat);
                sb.append("]");
            } else if (isDone()) {
                e(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return h(obj2);
            }
            y8h y8hVar = this.c;
            y8h y8hVar2 = y8h.c;
            if (y8hVar != y8hVar2) {
                y8h y8hVar3 = new y8h();
                do {
                    d8c d8cVar = f;
                    d8cVar.u(y8hVar3, y8hVar);
                    if (d8cVar.y(this, y8hVar, y8hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                g(y8hVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return h(obj);
                    }
                    y8hVar = this.c;
                } while (y8hVar != y8hVar2);
            }
            return h(this.a);
        }
        throw new InterruptedException();
    }
}
