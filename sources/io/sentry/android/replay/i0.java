package io.sentry.android.replay;

import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import defpackage.bha;
import defpackage.cgg;
import defpackage.s72;
import defpackage.x72;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.q5;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements f, Closeable {
    public volatile f0 X;
    public volatile HandlerThread Y;
    public volatile Handler Z;
    public final SentryAndroidOptions a;
    public final ReplayIntegration b;
    public final ReplayIntegration c;
    public final io.sentry.d d;
    public final ScheduledExecutorService e;
    public final AtomicBoolean f;
    public final ArrayList g;
    public final Point v;
    public final WeakHashMap w;
    public final io.sentry.util.a x;
    public final io.sentry.util.a y;
    public final io.sentry.util.a z;

    public i0(SentryAndroidOptions sentryAndroidOptions, ReplayIntegration replayIntegration, ReplayIntegration replayIntegration2, io.sentry.d dVar, io.sentry.android.replay.util.g gVar) {
        dVar.getClass();
        gVar.getClass();
        this.a = sentryAndroidOptions;
        this.b = replayIntegration;
        this.c = replayIntegration2;
        this.d = dVar;
        this.e = gVar;
        this.f = new AtomicBoolean(false);
        this.g = new ArrayList();
        this.v = new Point();
        this.w = new WeakHashMap();
        this.x = new io.sentry.util.a();
        this.y = new io.sentry.util.a();
        this.z = new io.sentry.util.a();
    }

    public final void E() {
        f0 f0Var = this.X;
        if (f0Var != null) {
            a0 a0Var = f0Var.c;
            if (a0Var != null) {
                a0Var.c.set(false);
                WeakReference weakReference = a0Var.b;
                a0Var.c(weakReference != null ? (View) weakReference.get() : null);
                WeakReference weakReference2 = a0Var.b;
                if (weakReference2 != null) {
                    weakReference2.clear();
                }
                a0Var.e.close();
            }
            f0Var.c = null;
            f0Var.e.getAndSet(false);
        }
        io.sentry.util.a aVar = this.y;
        aVar.b();
        try {
            this.X = null;
            cgg.t(aVar, null);
            this.f.set(false);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                cgg.t(aVar, th);
                throw th2;
            }
        }
    }

    @Override // io.sentry.android.replay.f
    public final void b(View view, boolean z) {
        a0 a0Var;
        a0 a0Var2;
        a0 a0Var3;
        view.getClass();
        io.sentry.util.a aVar = this.x;
        aVar.b();
        int i = 2;
        try {
            if (!z) {
                View.OnLayoutChangeListener onLayoutChangeListener = (View.OnLayoutChangeListener) this.w.remove(view);
                if (onLayoutChangeListener != null) {
                    view.removeOnLayoutChangeListener(onLayoutChangeListener);
                }
                f0 f0Var = this.X;
                if (f0Var != null && (a0Var2 = f0Var.c) != null) {
                    a0Var2.c(view);
                }
                x72.i0(new h0(view), this.g);
                WeakReference weakReference = (WeakReference) s72.H0(this.g);
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && !view.equals(view2)) {
                    f0 f0Var2 = this.X;
                    if (f0Var2 != null && (a0Var = f0Var2.c) != null) {
                        a0Var.a(view2);
                    }
                    h(view2);
                    WeakHashMap weakHashMap = this.w;
                    if (!weakHashMap.containsKey(view2)) {
                        bha bhaVar = new bha(i, this);
                        weakHashMap.put(view2, bhaVar);
                        view2.addOnLayoutChangeListener(bhaVar);
                    }
                }
            } else {
                if (io.sentry.config.a.o(view) == null) {
                    this.a.getLogger().i(q5.WARNING, "Root view does not have a phone window, skipping.", new Object[0]);
                    cgg.t(aVar, null);
                    return;
                }
                this.g.add(new WeakReference(view));
                f0 f0Var3 = this.X;
                if (f0Var3 != null && (a0Var3 = f0Var3.c) != null) {
                    a0Var3.a(view);
                }
                h(view);
                WeakHashMap weakHashMap2 = this.w;
                if (!weakHashMap2.containsKey(view)) {
                    bha bhaVar2 = new bha(i, this);
                    weakHashMap2.put(view, bhaVar2);
                    view.addOnLayoutChangeListener(bhaVar2);
                }
            }
            cgg.t(aVar, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                cgg.t(aVar, th);
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        reset();
        io.sentry.d dVar = this.d;
        f0 f0Var = this.X;
        Handler handler = (Handler) dVar.b;
        if (f0Var != null) {
            handler.removeCallbacks(f0Var);
        }
        io.sentry.util.a aVar = this.z;
        aVar.b();
        try {
            Handler handler2 = this.Z;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread = this.Y;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            cgg.t(aVar, null);
            E();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                cgg.t(aVar, th);
                throw th2;
            }
        }
    }

    public final void h(View view) {
        view.getClass();
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            g0 g0Var = new g0(this, view);
            if (view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
                return;
            }
            try {
                view.getViewTreeObserver().addOnPreDrawListener(g0Var);
                return;
            } catch (IllegalStateException unused) {
                return;
            }
        }
        int width = view.getWidth();
        Point point = this.v;
        if (width == point.x && view.getHeight() == point.y) {
            return;
        }
        point.set(view.getWidth(), view.getHeight());
        this.c.F0(view.getWidth(), view.getHeight());
    }

    public final Handler l() {
        if (this.Z == null) {
            io.sentry.util.a aVar = this.z;
            aVar.b();
            try {
                if (this.Z == null) {
                    this.Y = new HandlerThread("SentryReplayBackgroundProcessing");
                    HandlerThread handlerThread = this.Y;
                    if (handlerThread != null) {
                        handlerThread.start();
                    }
                    HandlerThread handlerThread2 = this.Y;
                    handlerThread2.getClass();
                    this.Z = new Handler(handlerThread2.getLooper());
                }
                cgg.t(aVar, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    cgg.t(aVar, th);
                    throw th2;
                }
            }
        }
        Handler handler = this.Z;
        handler.getClass();
        return handler;
    }

    public final void reset() {
        a0 a0Var;
        this.v.set(0, 0);
        io.sentry.util.a aVar = this.x;
        aVar.b();
        try {
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null) {
                    View.OnLayoutChangeListener onLayoutChangeListener = (View.OnLayoutChangeListener) this.w.remove(view);
                    if (onLayoutChangeListener != null) {
                        view.removeOnLayoutChangeListener(onLayoutChangeListener);
                    }
                    f0 f0Var = this.X;
                    if (f0Var != null && (a0Var = f0Var.c) != null) {
                        a0Var.c(view);
                    }
                }
            }
            this.g.clear();
            cgg.t(aVar, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                cgg.t(aVar, th);
                throw th2;
            }
        }
    }

    public final void u() {
        f0 f0Var = this.X;
        if (f0Var != null) {
            a0 a0Var = f0Var.c;
            if (a0Var != null) {
                a0Var.c.set(false);
                WeakReference weakReference = a0Var.b;
                a0Var.c(weakReference != null ? (View) weakReference.get() : null);
            }
            f0Var.e.getAndSet(false);
        }
    }

    public final void x() {
        View view;
        f0 f0Var = this.X;
        if (f0Var != null) {
            io.sentry.d dVar = f0Var.b;
            SentryAndroidOptions sentryAndroidOptions = f0Var.a;
            if (sentryAndroidOptions.getSessionReplay().m) {
                sentryAndroidOptions.getLogger().i(q5.DEBUG, "Resuming the capture runnable.", new Object[0]);
            }
            a0 a0Var = f0Var.c;
            if (a0Var != null) {
                WeakReference weakReference = a0Var.b;
                if (weakReference != null && (view = (View) weakReference.get()) != null && view.getViewTreeObserver() != null && view.getViewTreeObserver().isAlive()) {
                    try {
                        view.getViewTreeObserver().addOnDrawListener(a0Var);
                    } catch (IllegalStateException unused) {
                    }
                }
                a0Var.c.set(true);
            }
            f0Var.e.getAndSet(true);
            ((Handler) dVar.b).removeCallbacks(f0Var);
            if (((Handler) dVar.b).post(f0Var)) {
                return;
            }
            sentryAndroidOptions.getLogger().i(q5.WARNING, "Failed to post the capture runnable, main looper is not ready.", new Object[0]);
        }
    }
}
