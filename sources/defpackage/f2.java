package defpackage;

import java.util.Locale;
import java.util.Objects;
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
public abstract class f2 implements m88 {
    public static final boolean d;
    public static final l18 e;
    public static final urg f;
    public static final Object g;
    public volatile Object a;
    public volatile w1 b;
    public volatile e2 c;

    static {
        boolean z;
        Throwable th;
        urg z1Var;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = new l18(f2.class, 0);
        Throwable th2 = null;
        try {
            z1Var = new d2();
            th = null;
        } catch (Error | Exception e2) {
            th = e2;
            try {
                z1Var = new x1(AtomicReferenceFieldUpdater.newUpdater(e2.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(e2.class, e2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(f2.class, e2.class, "c"), AtomicReferenceFieldUpdater.newUpdater(f2.class, w1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(f2.class, Object.class, "a"));
            } catch (Error | Exception e3) {
                th2 = e3;
                z1Var = new z1();
            }
        }
        f = z1Var;
        if (th2 != null) {
            l18 l18Var = e;
            Logger loggerA = l18Var.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th);
            l18Var.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        g = new Object();
    }

    public static void f(f2 f2Var, boolean z) {
        w1 w1Var = null;
        while (true) {
            for (e2 e2VarY = f.y(f2Var); e2VarY != null; e2VarY = e2VarY.b) {
                Thread thread = e2VarY.a;
                if (thread != null) {
                    e2VarY.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                z = false;
            }
            f2Var.d();
            w1 w1Var2 = w1Var;
            w1 w1VarX = f.x(f2Var);
            w1 w1Var3 = w1Var2;
            while (w1VarX != null) {
                w1 w1Var4 = w1VarX.c;
                w1VarX.c = w1Var3;
                w1Var3 = w1VarX;
                w1VarX = w1Var4;
            }
            while (w1Var3 != null) {
                w1Var = w1Var3.c;
                Runnable runnable = w1Var3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof y1) {
                    y1 y1Var = (y1) runnable;
                    f2Var = y1Var.a;
                    if (f2Var.a == y1Var) {
                        if (f.m(f2Var, y1Var, i(y1Var.b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = w1Var3.b;
                    Objects.requireNonNull(executor);
                    g(runnable, executor);
                }
                w1Var3 = w1Var;
            }
            return;
        }
    }

    public static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object h(Object obj) throws ExecutionException {
        if (obj instanceof t1) {
            Throwable th = ((t1) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof v1) {
            throw new ExecutionException(((v1) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    public static Object i(m88 m88Var) {
        Object obj;
        Throwable thP;
        if (m88Var instanceof a2) {
            Object t1Var = ((f2) m88Var).a;
            if (t1Var instanceof t1) {
                t1 t1Var2 = (t1) t1Var;
                if (t1Var2.a) {
                    t1Var = t1Var2.b != null ? new t1(t1Var2.b, false) : t1.d;
                }
            }
            Objects.requireNonNull(t1Var);
            return t1Var;
        }
        if ((m88Var instanceof f2) && (thP = ((f2) m88Var).p()) != null) {
            return new v1(thP);
        }
        boolean zIsCancelled = m88Var.isCancelled();
        boolean z = true;
        if ((!d) && zIsCancelled) {
            t1 t1Var3 = t1.d;
            Objects.requireNonNull(t1Var3);
            return t1Var3;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = m88Var.get();
                        break;
                    } catch (Error | Exception e2) {
                        e = e2;
                        return new v1(e);
                    } catch (CancellationException e3) {
                        if (zIsCancelled) {
                            return new t1(e3, false);
                        }
                        return new v1(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + m88Var, e3));
                    } catch (ExecutionException e4) {
                        if (!zIsCancelled) {
                            return new v1(e4.getCause());
                        }
                        return new t1(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + m88Var, e4), false);
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error e5) {
                e = e5;
                return new v1(e);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? g : obj;
        }
        return new t1(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + m88Var), false);
    }

    public final void a(StringBuilder sb) {
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
                } catch (ExecutionException e2) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e2.getCause());
                    sb.append("]");
                    return;
                } catch (Exception e3) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e3.getClass());
                    sb.append(" thrown from get()]");
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
        e(sb, obj);
        sb.append("]");
    }

    @Override // defpackage.m88
    public void b(Runnable runnable, Executor executor) {
        w1 w1Var;
        w1 w1Var2 = w1.d;
        pa7.F(executor, "Executor was null.");
        if (!isDone() && (w1Var = this.b) != w1Var2) {
            w1 w1Var3 = new w1(runnable, executor);
            do {
                w1Var3.c = w1Var;
                if (f.l(this, w1Var, w1Var3)) {
                    return;
                } else {
                    w1Var = this.b;
                }
            } while (w1Var != w1Var2);
        }
        g(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        t1 t1Var;
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof y1)) {
            return false;
        }
        if (d) {
            t1Var = new t1(new CancellationException("Future.cancel() was called."), z);
        } else {
            t1Var = z ? t1.c : t1.d;
            Objects.requireNonNull(t1Var);
        }
        boolean z2 = false;
        while (true) {
            if (f.m(this, obj, t1Var)) {
                f(this, z);
                if (obj instanceof y1) {
                    m88 m88Var = ((y1) obj).b;
                    if (m88Var instanceof a2) {
                        this = (f2) m88Var;
                        obj = this.a;
                        if ((obj == null) | (obj instanceof y1)) {
                            z2 = true;
                        }
                    } else {
                        m88Var.cancel(z);
                    }
                }
                return true;
            }
            obj = this.a;
            if (!(obj instanceof y1)) {
                return z2;
            }
        }
    }

    public final void e(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        long j2;
        e2 e2Var = e2.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if ((obj != null) && (!(obj instanceof y1))) {
            return h(obj);
        }
        long j3 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            e2 e2Var2 = this.c;
            if (e2Var2 != e2Var) {
                e2 e2Var3 = new e2();
                z = true;
                while (true) {
                    urg urgVar = f;
                    urgVar.N(e2Var3, e2Var2);
                    if (urgVar.n(this, e2Var2, e2Var3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                l(e2Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && (!(obj2 instanceof y1))) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        l(e2Var3);
                        break;
                    }
                    long j4 = j3;
                    e2Var2 = this.c;
                    if (e2Var2 != e2Var) {
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return h(obj3);
        }
        z = true;
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.a;
            if ((obj4 != null ? z : false) && (!(obj4 instanceof y1))) {
                return h(obj4);
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
        if (nanos + 1000 < j2) {
            String strConcat = string3.concat(" (plus ");
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == j2 || nanos2 > 1000) ? z : false;
            if (jConvert > j2) {
                String strConcat2 = strConcat + jConvert + " " + lowerCase;
                if (z2) {
                    strConcat2 = strConcat2.concat(",");
                }
                strConcat = strConcat2.concat(" ");
            }
            if (z2) {
                strConcat = kv2.m(strConcat, " nanoseconds ", nanos2);
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(ib8.j(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.a instanceof t1;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.a;
        return (!(obj instanceof y1)) & (obj != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String k() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void l(e2 e2Var) {
        e2Var.a = null;
        while (true) {
            e2 e2Var2 = this.c;
            if (e2Var2 == e2.c) {
                return;
            }
            e2 e2Var3 = null;
            while (e2Var2 != null) {
                e2 e2Var4 = e2Var2.b;
                if (e2Var2.a != null) {
                    e2Var3 = e2Var2;
                } else if (e2Var3 != null) {
                    e2Var3.b = e2Var4;
                    if (e2Var3.a == null) {
                    }
                } else if (!f.n(this, e2Var2, e2Var4)) {
                }
                e2Var2 = e2Var4;
            }
            return;
        }
    }

    public boolean m(Object obj) {
        if (obj == null) {
            obj = g;
        }
        if (!f.m(this, null, obj)) {
            return false;
        }
        f(this, false);
        return true;
    }

    public boolean n(Throwable th) {
        th.getClass();
        if (!f.m(this, null, new v1(th))) {
            return false;
        }
        f(this, false);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public boolean o(m88 m88Var) {
        v1 v1Var;
        m88Var.getClass();
        Object obj = this.a;
        if (obj != null) {
            if (obj instanceof t1) {
                m88Var.cancel(((t1) obj).a);
            }
        } else if (m88Var.isDone()) {
            if (f.m(this, null, i(m88Var))) {
                f(this, false);
                return true;
            }
        } else {
            y1 y1Var = new y1(this, m88Var);
            if (f.m(this, null, y1Var)) {
                try {
                    m88Var.b(y1Var, f94.a);
                    return true;
                } catch (Throwable th) {
                    try {
                        v1Var = new v1(th);
                    } catch (Error | Exception unused) {
                        v1Var = v1.b;
                    }
                    f.m(this, y1Var, v1Var);
                    return true;
                }
            }
            obj = this.a;
            if (obj instanceof t1) {
                m88Var.cancel(((t1) obj).a);
            }
        }
        return false;
    }

    public final Throwable p() {
        if (!(this instanceof a2)) {
            return null;
        }
        Object obj = this.a;
        if (obj instanceof v1) {
            return ((v1) obj).a;
        }
        return null;
    }

    public final boolean q() {
        Object obj = this.a;
        return (obj instanceof t1) && ((t1) obj).a;
    }

    public String toString() {
        String strK;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.a;
            if (obj instanceof y1) {
                sb.append(", setFuture=[");
                m88 m88Var = ((y1) obj).b;
                try {
                    if (m88Var == this) {
                        sb.append("this future");
                    } else {
                        sb.append(m88Var);
                    }
                } catch (Exception e2) {
                    e = e2;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                } catch (StackOverflowError e3) {
                    e = e3;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strK = k();
                    if (strK == null || strK.isEmpty()) {
                        strK = null;
                    }
                } catch (Exception | StackOverflowError e4) {
                    strK = "Exception thrown from implementation: " + e4.getClass();
                }
                if (strK != null) {
                    sb.append(", info=[");
                    sb.append(strK);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                a(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void d() {
    }

    public void j() {
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        e2 e2Var = e2.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof y1))) {
                return h(obj2);
            }
            e2 e2Var2 = this.c;
            if (e2Var2 != e2Var) {
                e2 e2Var3 = new e2();
                do {
                    urg urgVar = f;
                    urgVar.N(e2Var3, e2Var2);
                    if (urgVar.n(this, e2Var2, e2Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                l(e2Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof y1))));
                        return h(obj);
                    }
                    e2Var2 = this.c;
                } while (e2Var2 != e2Var);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return h(obj3);
        }
        throw new InterruptedException();
    }
}
