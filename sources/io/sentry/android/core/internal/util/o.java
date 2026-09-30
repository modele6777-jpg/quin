package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.Window;
import defpackage.ex2;
import defpackage.nzf;
import io.sentry.android.core.o0;
import io.sentry.z0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements Application.ActivityLifecycleCallbacks {
    public long X;
    public long Y;
    public final ConcurrentSkipListSet Z;
    public final o0 a;
    public final CopyOnWriteArraySet b;
    public final z0 c;
    public volatile Handler d;
    public final io.sentry.util.a e;
    public WeakReference f;
    public final ConcurrentHashMap g;
    public final boolean v;
    public final c w;
    public final l x;
    public volatile Choreographer y;
    public volatile Field z;

    /* JADX WARN: Type inference failed for: r4v4, types: [io.sentry.android.core.internal.util.l] */
    public o(Context context, z0 z0Var, final o0 o0Var) {
        c cVar = new c();
        this.b = new CopyOnWriteArraySet();
        this.e = new io.sentry.util.a();
        this.g = new ConcurrentHashMap();
        this.v = false;
        this.X = 0L;
        this.Y = 0L;
        this.Z = new ConcurrentSkipListSet();
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        io.sentry.util.b.r(z0Var, "Logger is required");
        this.c = z0Var;
        io.sentry.util.b.r(o0Var, "BuildInfoProvider is required");
        this.a = o0Var;
        this.w = cVar;
        if (context instanceof Application) {
            this.v = true;
            ((Application) context).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new nzf(12, this, z0Var));
            this.x = new Window.OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.l
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                    this.a.a(o0Var, window, frameMetrics);
                }
            };
        }
    }

    public final void a(o0 o0Var, Window window, FrameMetrics frameMetrics) {
        long jNanoTime = System.nanoTime();
        o0Var.getClass();
        float refreshRate = Build.VERSION.SDK_INT >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        long jMax = Math.max(0L, metric - ((long) (1.0E9f / refreshRate)));
        this.a.getClass();
        long metric2 = frameMetrics.getMetric(10);
        if (metric2 < 0) {
            metric2 = jNanoTime - metric;
        }
        long jMax2 = Math.max(metric2, this.Y);
        if (jMax2 == this.X) {
            return;
        }
        this.X = jMax2;
        long j = jMax2 + metric;
        this.Y = j;
        boolean z = metric > ((long) (1.0E9f / (refreshRate - 1.0f)));
        boolean z2 = z && metric > 700000000;
        if (jMax > 0) {
            long j2 = j - 300000000000L;
            m mVar = new m(j2, j2);
            ConcurrentSkipListSet concurrentSkipListSet = this.Z;
            concurrentSkipListSet.headSet(mVar).clear();
            if (concurrentSkipListSet.size() < 3600) {
                concurrentSkipListSet.add(new m(jMax2, this.Y));
            }
        }
        Iterator it = this.g.values().iterator();
        while (it.hasNext()) {
            long j3 = metric;
            long j4 = jMax;
            ((n) it.next()).b(jMax2, this.Y, j3, j4, z, z2, refreshRate);
            jMax = j4;
            metric = j3;
        }
    }

    public final String b(n nVar) {
        if (!this.v) {
            return null;
        }
        if (this.d == null) {
            io.sentry.util.a aVar = this.e;
            aVar.b();
            try {
                if (this.d == null) {
                    HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
                    handlerThread.setUncaughtExceptionHandler(new ex2(2, this));
                    handlerThread.start();
                    this.d = new Handler(handlerThread.getLooper());
                }
                aVar.close();
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        String strJ = io.sentry.config.a.j();
        this.g.put(strJ, nVar);
        d();
        return strJ;
    }

    public final void c(String str) {
        if (this.v) {
            ConcurrentHashMap concurrentHashMap = this.g;
            if (str != null) {
                concurrentHashMap.remove(str);
            }
            WeakReference weakReference = this.f;
            Window window = weakReference != null ? (Window) weakReference.get() : null;
            if (window == null || !concurrentHashMap.isEmpty()) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new k(this, window, 1));
        }
    }

    public final void d() {
        WeakReference weakReference = this.f;
        Window window = weakReference != null ? (Window) weakReference.get() : null;
        if (window == null || !this.v || this.g.isEmpty() || this.d == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new k(this, window, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Window window = activity.getWindow();
        WeakReference weakReference = this.f;
        if (weakReference == null || weakReference.get() != window) {
            this.f = new WeakReference(window);
            d();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        new Handler(Looper.getMainLooper()).post(new k(this, activity.getWindow(), 1));
        WeakReference weakReference = this.f;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.f = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
