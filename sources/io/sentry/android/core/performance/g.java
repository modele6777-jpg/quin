package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationStartInfo;
import android.content.ContentProvider;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.adjust.sdk.Constants;
import defpackage.je9;
import defpackage.xag;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.j;
import io.sentry.android.core.o0;
import io.sentry.android.core.p0;
import io.sentry.android.core.q0;
import io.sentry.android.core.y;
import io.sentry.f4;
import io.sentry.h7;
import io.sentry.m7;
import io.sentry.n7;
import io.sentry.protocol.h0;
import io.sentry.protocol.w;
import io.sentry.q1;
import io.sentry.v2;
import io.sentry.v5;
import io.sentry.w3;
import io.sentry.z4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends a {
    public static volatile g O0;
    public volatile xag G0;
    public w H0;
    public String I0;
    public String J0;
    public z4 K0;
    public ApplicationStartInfo L0;
    public volatile Boolean b;
    public static long N0 = SystemClock.uptimeMillis();
    public static final io.sentry.util.a P0 = new io.sentry.util.a();
    public f a = f.UNKNOWN;
    public volatile long c = -1;
    public y w = null;
    public j x = null;
    public w3 y = null;
    public boolean z = false;
    public volatile boolean X = true;
    public final AtomicInteger Y = new AtomicInteger();
    public final AtomicBoolean Z = new AtomicBoolean(false);
    public final AtomicBoolean E0 = new AtomicBoolean(false);
    public final AtomicBoolean F0 = new AtomicBoolean(false);
    public final q0 M0 = new q0(2);
    public final h d = new h();
    public final h e = new h();
    public final h f = new h();
    public final HashMap g = new HashMap();
    public final ArrayList v = new ArrayList();

    public static g c() {
        if (O0 == null) {
            io.sentry.util.a aVar = P0;
            aVar.b();
            try {
                if (O0 == null) {
                    O0 = new g();
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
        return O0;
    }

    public static void e(ContentProvider contentProvider) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        h hVar = new h();
        hVar.f(jUptimeMillis);
        c().g.put(contentProvider, hVar);
    }

    public static void f(ContentProvider contentProvider) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        h hVar = (h) c().g.get(contentProvider);
        if (hVar == null || !hVar.c()) {
            return;
        }
        hVar.a = contentProvider.getClass().getName().concat(".onCreate");
        hVar.d = jUptimeMillis;
    }

    public final String a() {
        ApplicationStartInfo applicationStartInfo = this.L0;
        if (applicationStartInfo == null || Build.VERSION.SDK_INT < 35) {
            return null;
        }
        switch (applicationStartInfo.getReason()) {
            case 0:
                return "alarm";
            case 1:
                return "backup";
            case 2:
                return "boot_complete";
            case 3:
                return "broadcast";
            case 4:
                return Constants.CONTENT_PROVIDER;
            case 5:
                return "job";
            case 6:
                return "launcher";
            case 7:
                return "launcher_recents";
            case 8:
                return "other";
            case 9:
                return Constants.PUSH;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return "service";
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return "start_activity";
            default:
                return null;
        }
    }

    public final h b(SentryAndroidOptions sentryAndroidOptions) {
        if (this.a != f.UNKNOWN && Boolean.TRUE.equals(this.b)) {
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                h hVar = this.d;
                if (hVar.d() && hVar.a() <= 60000) {
                    return hVar;
                }
            }
            h hVar2 = this.e;
            if (hVar2.d() && hVar2.a() <= 60000) {
                return hVar2;
            }
        }
        return new h();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0096  */
    public final void d() {
        v5 v5Var;
        long jA;
        this.c = SystemClock.uptimeMillis();
        this.E0.set(false);
        if (this.Y.get() == 0) {
            if (this.G0 == null || !p0.g()) {
                this.b = Boolean.FALSE;
                if (this.a == f.UNKNOWN) {
                    this.a = f.COLD;
                }
                y yVar = this.w;
                if (yVar != null && yVar.w.get()) {
                    this.w.close();
                    this.w = null;
                }
                j jVar = this.x;
                if (jVar != null && jVar.w) {
                    jVar.a(true);
                    this.x = null;
                }
                xag xagVar = this.G0;
                if (xagVar == null || !this.F0.compareAndSet(false, true)) {
                    return;
                }
                h hVar = this.f;
                if (hVar.e()) {
                    i(hVar.a() + hVar.c);
                } else {
                    ApplicationStartInfo applicationStartInfo = this.L0;
                    if (applicationStartInfo == null || Build.VERSION.SDK_INT < 35) {
                        i(N0);
                    } else {
                        try {
                            Long l = (Long) applicationStartInfo.getStartupTimestamps().get(2);
                            if (l != null) {
                                i(l.longValue() / 1000000);
                            } else {
                                i(N0);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
                ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) xagVar.b;
                if (activityLifecycleIntegration.c == null || activityLifecycleIntegration.d == null || !activityLifecycleIntegration.e) {
                    return;
                }
                g gVarC = c();
                gVarC.y = null;
                h hVar2 = gVarC.d;
                if (!hVar2.d() || !hVar2.e()) {
                    hVar2 = gVarC.e;
                }
                if (hVar2.d() && hVar2.e()) {
                    v5 v5VarB = hVar2.b();
                    if (hVar2.e()) {
                        if (hVar2.d()) {
                            jA = hVar2.a() + hVar2.b;
                        } else {
                            jA = 0;
                        }
                        v5Var = new v5(jA * 1000000);
                    } else {
                        v5Var = null;
                    }
                    if (v5VarB == null || v5Var == null) {
                        return;
                    }
                    gVarC.K0 = v5Var;
                    io.sentry.util.a aVar = (io.sentry.util.a) gVarC.M0.a;
                    aVar.b();
                    aVar.close();
                    if (gVarC.X) {
                        g gVarC2 = c();
                        n7 n7Var = new n7();
                        n7Var.c = f4.OFF;
                        n7Var.b = v5VarB;
                        n7Var.d = "auto.app.start";
                        n7Var.e = false;
                        q1 q1VarM = activityLifecycleIntegration.c.m(new m7("App Start", h0.COMPONENT, "app.start", null), n7Var);
                        String strA = gVarC2.a();
                        if (strA != null) {
                            q1VarM.k(strA, "app.vitals.start.reason");
                        }
                        gVarC2.H0 = q1VarM.u().a;
                        gVarC2.I0 = q1VarM.d().a();
                        io.sentry.d dVarM = q1VarM.m();
                        gVarC2.J0 = dVarM != null ? (String) dVarM.b : null;
                        q1VarM.x(h7.OK, v5Var);
                    }
                }
            }
        }
    }

    public final synchronized void g() {
        if (!this.Z.getAndSet(true)) {
            g gVarC = c();
            h hVar = gVarC.e;
            hVar.getClass();
            hVar.d = SystemClock.uptimeMillis();
            h hVar2 = gVarC.d;
            hVar2.getClass();
            hVar2.d = SystemClock.uptimeMillis();
        }
    }

    public final void h(Application application) {
        ActivityManager activityManager;
        if (this.z) {
            return;
        }
        this.z = true;
        Boolean bool = null;
        this.b = null;
        application.registerActivityLifecycleCallbacks(O0);
        if (Build.VERSION.SDK_INT >= 35 && (activityManager = (ActivityManager) application.getSystemService("activity")) != null) {
            try {
                List historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(1);
                if (!historicalProcessStartReasons.isEmpty()) {
                    ApplicationStartInfo applicationStartInfo = (ApplicationStartInfo) historicalProcessStartReasons.get(0);
                    this.L0 = applicationStartInfo;
                    if (applicationStartInfo.getStartupState() == 0) {
                        if (applicationStartInfo.getStartType() == 1) {
                            this.a = f.COLD;
                        } else {
                            this.a = f.WARM;
                        }
                        switch (applicationStartInfo.getReason()) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 9:
                            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                bool = Boolean.FALSE;
                                break;
                            case 6:
                            case 7:
                            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                bool = Boolean.TRUE;
                                break;
                        }
                        this.b = bool;
                    }
                }
            } catch (RuntimeException e) {
                Log.w("AppStartMetrics", e);
            }
        }
        if (this.b == null) {
            this.b = Boolean.valueOf(p0.g());
        }
        if ((this.a == f.UNKNOWN || this.G0 != null) && this.E0.compareAndSet(false, true)) {
            Looper.getMainLooper().getQueue().addIdleHandler(new d(this));
        }
    }

    public final void i(long j) {
        h hVar = this.d;
        if (hVar.d()) {
            if (hVar.c()) {
                hVar.d = j;
            }
        } else {
            h hVar2 = this.e;
            if (hVar2.d() && hVar2.c()) {
                hVar2.d = j;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        q0.b.b(activity);
        if (this.Y.incrementAndGet() == 1 && !this.Z.get()) {
            long jUptimeMillis2 = SystemClock.uptimeMillis() - this.d.c;
            if (!Boolean.TRUE.equals(this.b) || jUptimeMillis2 > 60000) {
                io.sentry.util.a aVar = (io.sentry.util.a) this.M0.a;
                aVar.b();
                aVar.close();
                this.a = f.WARM;
                this.X = true;
                h hVar = this.d;
                hVar.a = null;
                hVar.c = 0L;
                hVar.d = 0L;
                hVar.b = 0L;
                hVar.f(jUptimeMillis);
                N0 = jUptimeMillis;
                this.g.clear();
                h hVar2 = this.f;
                hVar2.a = null;
                hVar2.c = 0L;
                hVar2.d = 0L;
                hVar2.b = 0L;
            } else if (this.a == f.UNKNOWN) {
                if (bundle != null) {
                    this.a = f.WARM;
                } else if (this.c == -1 || jUptimeMillis <= this.c) {
                    this.a = f.COLD;
                } else {
                    this.a = f.WARM;
                }
            }
        }
        this.b = Boolean.TRUE;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        q0 q0Var = q0.b;
        WeakReference weakReference = (WeakReference) q0Var.a;
        if (weakReference == null || weakReference.get() == activity) {
            q0Var.a = null;
        }
        int iDecrementAndGet = this.Y.decrementAndGet();
        if (iDecrementAndGet < 0) {
            this.Y.set(0);
            iDecrementAndGet = 0;
        }
        if (iDecrementAndGet != 0 || activity.isChangingConfigurations()) {
            return;
        }
        this.a = f.WARM;
        this.b = Boolean.TRUE;
        this.X = true;
        this.Z.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        q0 q0Var = q0.b;
        WeakReference weakReference = (WeakReference) q0Var.a;
        if (weakReference == null || weakReference.get() == activity) {
            q0Var.a = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        q0.b.b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        q0.b.b(activity);
        if (this.Z.get()) {
            return;
        }
        if (activity.getWindow() != null) {
            final int i = 0;
            io.sentry.android.core.internal.util.h.a(activity, new Runnable(this) { // from class: io.sentry.android.core.performance.e
                public final /* synthetic */ g b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    g gVar = this.b;
                    switch (i2) {
                        case 0:
                            gVar.g();
                            break;
                        default:
                            gVar.g();
                            break;
                    }
                }
            }, new o0(v2.a));
        } else {
            final int i2 = 1;
            new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: io.sentry.android.core.performance.e
                public final /* synthetic */ g b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i2;
                    g gVar = this.b;
                    switch (i3) {
                        case 0:
                            gVar.g();
                            break;
                        default:
                            gVar.g();
                            break;
                    }
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        q0 q0Var = q0.b;
        WeakReference weakReference = (WeakReference) q0Var.a;
        if (weakReference == null || weakReference.get() == activity) {
            q0Var.a = null;
        }
    }
}
