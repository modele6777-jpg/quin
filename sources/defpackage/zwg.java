package defpackage;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zwg extends ivg implements vwg {
    public vwg v;
    public ScheduledFuture w;

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof xug) {
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(((xug) obj).b);
            throw cancellationException;
        }
        if (obj instanceof avg) {
            throw new ExecutionException(((avg) obj).a);
        }
        if (obj == ivg.d) {
            return null;
        }
        return obj;
    }

    public static boolean g(Object obj) {
        return !(obj instanceof yug);
    }

    public static Object h(vwg vwgVar) {
        Object obj;
        Throwable thD;
        if (vwgVar instanceof zwg) {
            Object xugVar = ((zwg) vwgVar).a;
            if (xugVar instanceof xug) {
                xug xugVar2 = (xug) xugVar;
                if (xugVar2.a) {
                    Throwable th = xugVar2.b;
                    xugVar = th != null ? new xug(th, false) : xug.d;
                }
            }
            Objects.requireNonNull(xugVar);
            return xugVar;
        }
        if ((vwgVar instanceof ivg) && (thD = ((ivg) vwgVar).d()) != null) {
            return new avg(thD);
        }
        boolean zIsCancelled = vwgVar.isCancelled();
        boolean z = true;
        if ((!ivg.f) && zIsCancelled) {
            xug xugVar3 = xug.d;
            Objects.requireNonNull(xugVar3);
            return xugVar3;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = vwgVar.get();
                        break;
                    } catch (Error | Exception e) {
                        e = e;
                        return new avg(e);
                    } catch (CancellationException e2) {
                        return !zIsCancelled ? new avg(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(vwgVar)), e2)) : new xug(e2, false);
                    } catch (ExecutionException e3) {
                        return zIsCancelled ? new xug(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(vwgVar)), e3), false) : new avg(e3.getCause());
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th2) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (Error e4) {
                e = e4;
                return new avg(e);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (zIsCancelled) {
            return new xug(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(vwgVar))), false);
        }
        return obj == null ? ivg.d : obj;
    }

    public static void j(zwg zwgVar) {
        bvg bvgVar = null;
        while (true) {
            zwgVar.getClass();
            for (gvg gvgVarX = ivg.g.x(zwgVar); gvgVarX != null; gvgVarX = gvgVarX.b) {
                Thread thread = gvgVarX.a;
                if (thread != null) {
                    gvgVarX.a = null;
                    LockSupport.unpark(thread);
                }
            }
            vwg vwgVar = zwgVar.v;
            if ((zwgVar.a instanceof xug) & (vwgVar != null)) {
                Object obj = zwgVar.a;
                vwgVar.cancel((obj instanceof xug) && ((xug) obj).a);
            }
            ScheduledFuture scheduledFuture = zwgVar.w;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            zwgVar.v = null;
            zwgVar.w = null;
            bvg bvgVar2 = bvgVar;
            bvg bvgVarW = ivg.g.w(zwgVar);
            bvg bvgVar3 = bvgVar2;
            while (bvgVarW != null) {
                bvg bvgVar4 = bvgVarW.c;
                bvgVarW.c = bvgVar3;
                bvgVar3 = bvgVarW;
                bvgVarW = bvgVar4;
            }
            while (bvgVar3 != null) {
                Runnable runnable = bvgVar3.a;
                bvg bvgVar5 = bvgVar3.c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof yug) {
                    yug yugVar = (yug) runnable;
                    zwgVar = yugVar.a;
                    if (zwgVar.a != yugVar) {
                        continue;
                    } else if (ivg.g.B(zwgVar, yugVar, h(yugVar.b))) {
                        bvgVar = bvgVar5;
                    }
                } else {
                    Executor executor = bvgVar3.b;
                    Objects.requireNonNull(executor);
                    k(runnable, executor);
                }
                bvgVar3 = bvgVar5;
            }
            return;
        }
    }

    public static void k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            ivg.e.b().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", ub3.k("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // defpackage.vwg
    public final void c(Runnable runnable, Executor executor) {
        bvg bvgVar;
        bvg bvgVar2 = bvg.d;
        if (executor == null) {
            r82.g("Executor was null.");
            return;
        }
        if (!isDone() && (bvgVar = this.b) != bvgVar2) {
            bvg bvgVar3 = new bvg(runnable, executor);
            do {
                bvgVar3.c = bvgVar;
                if (ivg.g.A(this, bvgVar, bvgVar3)) {
                    return;
                } else {
                    bvgVar = this.b;
                }
            } while (bvgVar != bvgVar2);
        }
        k(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        xug xugVar;
        Object obj = this.a;
        if (!(obj instanceof yug) && !(obj == null)) {
            return false;
        }
        if (ivg.f) {
            xugVar = new xug(new CancellationException("Future.cancel() was called."), z);
        } else {
            xugVar = z ? xug.c : xug.d;
            Objects.requireNonNull(xugVar);
        }
        boolean z2 = false;
        while (true) {
            if (ivg.g.B(this, obj, xugVar)) {
                j(this);
                if (obj instanceof yug) {
                    vwg vwgVar = ((yug) obj).b;
                    if (vwgVar instanceof zwg) {
                        this = (zwg) vwgVar;
                        obj = this.a;
                        if ((obj == null) | (obj instanceof yug)) {
                            z2 = true;
                        }
                    } else {
                        vwgVar.cancel(z);
                    }
                }
                return true;
            }
            obj = this.a;
            if (g(obj)) {
                return z2;
            }
        }
    }

    @Override // defpackage.ivg
    public final Throwable d() {
        if (!(this instanceof zwg)) {
            return null;
        }
        Object obj = this.a;
        if (obj instanceof avg) {
            return ((avg) obj).a;
        }
        return null;
    }

    public final String f() {
        vwg vwgVar = this.v;
        ScheduledFuture scheduledFuture = this.w;
        if (vwgVar == null) {
            return null;
        }
        String strJ = ib8.j("inputFuture=[", vwgVar.toString(), "]");
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return strJ + ", remaining delay=[" + delay + " ms]";
            }
        }
        return strJ;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long j2;
        gvg gvgVar = gvg.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if ((obj != null) && g(obj)) {
            return e(obj);
        }
        long j3 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            gvg gvgVar2 = this.c;
            if (gvgVar2 != gvgVar) {
                gvg gvgVar3 = new gvg();
                while (true) {
                    m7c m7cVar = ivg.g;
                    m7cVar.y(gvgVar3, gvgVar2);
                    if (m7cVar.C(this, gvgVar2, gvgVar3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                a(gvgVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && g(obj2)) {
                                return e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        a(gvgVar3);
                        break;
                    }
                    long j4 = j3;
                    gvgVar2 = this.c;
                    if (gvgVar2 != gvgVar) {
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return e(obj3);
        }
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.a;
            if ((obj4 != null) && g(obj4)) {
                return e(obj4);
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
        if (nanos + 1000 < j2) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == j2 || nanos2 > 1000;
            if (jConvert > j2) {
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

    public final void i(StringBuilder sb) {
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
                } catch (ExecutionException e) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e.getCause());
                    sb.append("]");
                    return;
                } catch (Exception e2) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e2.getClass());
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
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof xug;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.a;
        return (obj != null) & g(obj);
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.a instanceof xug) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            i(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.a;
            if (obj instanceof yug) {
                sb.append(", setFuture=[");
                vwg vwgVar = ((yug) obj).b;
                try {
                    if (vwgVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(vwgVar);
                    }
                } catch (Throwable th) {
                    if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                        throw th;
                    }
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strConcat = f();
                    if (strConcat == null || strConcat.isEmpty()) {
                        strConcat = null;
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (strConcat != null) {
                    sb.append(", info=[");
                    sb.append(strConcat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                i(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        gvg gvgVar = gvg.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & g(obj2)) {
                return e(obj2);
            }
            gvg gvgVar2 = this.c;
            if (gvgVar2 != gvgVar) {
                gvg gvgVar3 = new gvg();
                do {
                    m7c m7cVar = ivg.g;
                    m7cVar.y(gvgVar3, gvgVar2);
                    if (m7cVar.C(this, gvgVar2, gvgVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                a(gvgVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & g(obj)));
                        return e(obj);
                    }
                    gvgVar2 = this.c;
                } while (gvgVar2 != gvgVar);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return e(obj3);
        }
        throw new InterruptedException();
    }
}
