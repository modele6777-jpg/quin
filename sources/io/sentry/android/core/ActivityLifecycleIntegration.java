package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import com.adjust.sdk.sig.r3;
import defpackage.bwe;
import defpackage.kw;
import defpackage.nzf;
import defpackage.rl2;
import defpackage.veh;
import defpackage.xag;
import defpackage.zi0;
import io.sentry.f4;
import io.sentry.g7;
import io.sentry.h7;
import io.sentry.i3;
import io.sentry.k4;
import io.sentry.m7;
import io.sentry.n2;
import io.sentry.n7;
import io.sentry.q5;
import io.sentry.v5;
import io.sentry.w3;
import io.sentry.w6;
import io.sentry.y5;
import io.sentry.y6;
import io.sentry.z4;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ActivityLifecycleIntegration implements io.sentry.w1, Closeable, Application.ActivityLifecycleCallbacks {
    public final d G0;
    public final Application a;
    public final o0 b;
    public io.sentry.g1 c;
    public SentryAndroidOptions d;
    public final boolean g;
    public io.sentry.o1 x;
    public io.sentry.q1 y;
    public boolean e = false;
    public boolean f = false;
    public boolean v = false;
    public io.sentry.k0 w = null;
    public final WeakHashMap z = new WeakHashMap();
    public final WeakHashMap X = new WeakHashMap();
    public final WeakHashMap Y = new WeakHashMap();
    public z4 Z = new y5(0, 0);
    public Future E0 = null;
    public final WeakHashMap F0 = new WeakHashMap();
    public final io.sentry.util.a H0 = new io.sentry.util.a();
    public final io.sentry.util.a I0 = new io.sentry.util.a();

    public ActivityLifecycleIntegration(Application application, o0 o0Var, d dVar) {
        this.a = application;
        this.b = o0Var;
        this.G0 = dVar;
        if (Build.VERSION.SDK_INT >= 29) {
            this.g = true;
        }
    }

    public static void h(io.sentry.o1 o1Var, io.sentry.o1 o1Var2) {
        if (o1Var == null || o1Var.e()) {
            return;
        }
        String description = o1Var.getDescription();
        if (description == null || !description.endsWith(" - Deadline Exceeded")) {
            description = o1Var.getDescription() + " - Deadline Exceeded";
        }
        o1Var.p(description);
        z4 z4VarV = o1Var2 != null ? o1Var2.v() : null;
        if (z4VarV == null) {
            z4VarV = o1Var.z();
        }
        l(o1Var, z4VarV, h7.DEADLINE_EXCEEDED);
    }

    public static void l(io.sentry.o1 o1Var, z4 z4Var, h7 h7Var) {
        if (o1Var == null || o1Var.e()) {
            return;
        }
        if (h7Var == null) {
            h7Var = o1Var.a() != null ? o1Var.a() : h7.OK;
        }
        o1Var.x(h7Var, z4Var);
    }

    public final void E(Activity activity) {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        v5 v5VarB;
        Boolean boolValueOf;
        z4 z4Var;
        w3 w3Var;
        v5 v5Var;
        Boolean bool;
        String strA;
        z4 z4Var2;
        String str;
        SentryAndroidOptions sentryAndroidOptions;
        z4 z4Var3;
        w3 w3Var2;
        w3 w3Var3;
        m7 m7Var;
        io.sentry.c cVarA;
        zi0 zi0Var;
        WeakReference weakReference = new WeakReference(activity);
        if (this.c != null) {
            WeakHashMap weakHashMap3 = this.F0;
            if (weakHashMap3.containsKey(activity)) {
                return;
            }
            int i = 4;
            if (!this.e) {
                weakHashMap3.put(activity, i3.a);
                if (this.d.isEnableAutoTraceIdGeneration()) {
                    this.c.n(new io.sentry.android.replay.capture.v(i));
                    return;
                }
                return;
            }
            Iterator it = weakHashMap3.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                weakHashMap = this.X;
                weakHashMap2 = this.z;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                u((io.sentry.q1) entry.getValue(), (io.sentry.o1) weakHashMap2.get(entry.getKey()), (io.sentry.o1) weakHashMap.get(entry.getKey()));
            }
            String simpleName = activity.getClass().getSimpleName();
            io.sentry.android.core.performance.h hVarB = io.sentry.android.core.performance.g.c().b(this.d);
            if (p0.g() && hVarB.d()) {
                v5VarB = hVarB.b();
                boolValueOf = Boolean.valueOf(io.sentry.android.core.performance.g.c().a == io.sentry.android.core.performance.f.COLD);
            } else {
                v5VarB = null;
                boolValueOf = null;
            }
            n7 n7Var = new n7();
            long deadlineTimeout = this.d.getDeadlineTimeout();
            n7Var.v = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
            if (this.d.isEnableActivityLifecycleTracingAutoFinish()) {
                n7Var.g = this.d.getIdleTimeout();
                n7Var.a = true;
            }
            n7Var.f = true;
            n7Var.w = new e(this, weakReference, simpleName);
            if (this.v || v5VarB == null || boolValueOf == null) {
                z4Var = this.Z;
                w3Var = null;
            } else {
                w3 w3Var4 = io.sentry.android.core.performance.g.c().y;
                io.sentry.android.core.performance.g.c().y = null;
                w3Var = w3Var4;
                z4Var = v5VarB;
            }
            n7Var.b = z4Var;
            n7Var.e = w3Var != null;
            n7Var.d = "auto.ui.activity";
            io.sentry.util.a aVar = (io.sentry.util.a) io.sentry.android.core.performance.g.c().M0.a;
            aVar.b();
            aVar.close();
            boolean z = io.sentry.android.core.performance.g.c().H0 != null;
            boolean z2 = (this.v || v5VarB == null || boolValueOf == null) ? false : true;
            boolean z3 = z2 && this.d.isEnableStandaloneAppStartTracing() && !z;
            if (z3) {
                n7 n7Var2 = new n7();
                n7Var2.c = f4.OFF;
                n7Var2.b = v5VarB;
                n7Var2.e = w3Var != null;
                n7Var2.d = "auto.app.start";
                v5Var = v5VarB;
                bool = boolValueOf;
                io.sentry.q1 q1VarM = this.c.m(new m7("App Start", io.sentry.protocol.h0.COMPONENT, "app.start", w3Var), n7Var2);
                this.y = q1VarM;
                q1VarM.k(simpleName, "app.vitals.start.screen");
                String strA2 = io.sentry.android.core.performance.g.c().a();
                if (strA2 != null) {
                    this.y.k(strA2, "app.vitals.start.reason");
                }
            } else {
                v5Var = v5VarB;
                bool = boolValueOf;
            }
            if (z3) {
                strA = this.y.d().a();
                io.sentry.d dVarM = this.y.m();
                str = dVarM == null ? null : (String) dVarM.b;
            } else if (!z || ((z4Var2 = io.sentry.android.core.performance.g.c().K0) != null && z4Var.b(z4Var2) > 60000000000L)) {
                strA = null;
            } else {
                strA = io.sentry.android.core.performance.g.c().I0;
                str = io.sentry.android.core.performance.g.c().J0;
            }
            if (strA == null || (sentryAndroidOptions = this.d) == null || !sentryAndroidOptions.isTracingEnabled()) {
                z4Var3 = z4Var;
                m7Var = null;
            } else {
                io.sentry.z0 logger = this.d.getLogger();
                List listSingletonList = str == null ? null : Collections.singletonList(str);
                SentryAndroidOptions sentryAndroidOptions2 = this.d;
                try {
                    w6 w6Var = new w6(strA);
                    if (listSingletonList != null) {
                        kw kwVar = io.sentry.c.i;
                        cVarA = io.sentry.c.a(logger, io.sentry.util.p.c(listSingletonList), false);
                        z4Var3 = z4Var;
                    } else {
                        z4Var3 = z4Var;
                        try {
                            cVarA = io.sentry.c.a(logger, null, false);
                        } catch (io.sentry.exception.b e) {
                            e = e;
                            logger.c(q5.DEBUG, e, "Failed to parse Sentry trace header: %s", e.getMessage());
                            w3Var2 = new w3();
                        }
                    }
                    w3Var2 = w3.a(w6Var, cVarA, sentryAndroidOptions2);
                } catch (io.sentry.exception.b e2) {
                    e = e2;
                    z4Var3 = z4Var;
                }
                Boolean bool2 = (Boolean) w3Var2.a;
                io.sentry.c cVar = (io.sentry.c) w3Var2.e;
                if (bool2 == null) {
                    w3Var3 = null;
                } else {
                    Double d = cVar.c;
                    Double d2 = cVar.d;
                    w3Var3 = new w3(bool2, d, Double.valueOf(d2 == null ? 0.0d : d2.doubleValue()));
                }
                m7Var = new m7((io.sentry.protocol.w) w3Var2.b, (g7) w3Var2.c, null, w3Var3, cVar);
                m7Var.E0 = simpleName;
                m7Var.F0 = io.sentry.protocol.h0.COMPONENT;
                m7Var.e = "ui.load";
            }
            io.sentry.g1 g1Var = this.c;
            io.sentry.q1 q1VarM2 = m7Var != null ? g1Var.m(m7Var, n7Var) : g1Var.m(new m7(simpleName, io.sentry.protocol.h0.COMPONENT, "ui.load", w3Var), n7Var);
            if (z) {
                io.sentry.android.core.performance.g.c().H0 = null;
                io.sentry.android.core.performance.g.c().I0 = null;
                io.sentry.android.core.performance.g.c().J0 = null;
            }
            zi0 zi0Var2 = new zi0(11);
            zi0Var2.d = "auto.ui.activity";
            if (!z2 || z3 || this.d.isEnableStandaloneAppStartTracing()) {
                zi0Var = zi0Var2;
            } else {
                zi0Var = zi0Var2;
                io.sentry.o1 o1VarL = q1VarM2.l(bool.booleanValue() ? "app.start.cold" : "app.start.warm", bool.booleanValue() ? "Cold Start" : "Warm Start", v5Var, io.sentry.v1.SENTRY, zi0Var);
                q1VarM2 = q1VarM2;
                this.x = o1VarL;
                b(null);
            }
            String strConcat = simpleName.concat(" initial display");
            zi0 zi0Var3 = zi0Var;
            io.sentry.v1 v1Var = io.sentry.v1.SENTRY;
            z4 z4Var4 = z4Var3;
            io.sentry.o1 o1VarL2 = q1VarM2.l("ui.load.initial_display", strConcat, z4Var4, v1Var, zi0Var3);
            weakHashMap2.put(activity, o1VarL2);
            if (this.f && this.w != null && this.d != null) {
                io.sentry.o1 o1VarL3 = q1VarM2.l("ui.load.full_display", simpleName.concat(" full display"), z4Var4, v1Var, zi0Var3);
                try {
                    weakHashMap.put(activity, o1VarL3);
                    this.E0 = this.d.getExecutorService().schedule(new nzf(this, o1VarL3, o1VarL2, 4), 25000L);
                } catch (RejectedExecutionException e3) {
                    this.d.getLogger().d(q5.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e3);
                }
            }
            this.c.n(new y6(1, this, q1VarM2));
            weakHashMap3.put(activity, q1VarM2);
        }
    }

    @Override // io.sentry.w1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        k4 k4Var = k4.a;
        this.d = sentryAndroidOptions;
        this.c = k4Var;
        this.e = sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
        this.w = this.d.getFullyDisplayedReporter();
        this.f = this.d.isEnableTimeToFullDisplayTracing();
        this.a.registerActivityLifecycleCallbacks(this);
        if (this.e && this.d.isEnableStandaloneAppStartTracing()) {
            io.sentry.android.core.performance.g gVarC = io.sentry.android.core.performance.g.c();
            gVarC.G0 = new xag(5, this);
            if (gVarC.z && gVarC.Y.get() == 0 && !gVarC.Z.get() && gVarC.E0.compareAndSet(false, true)) {
                Looper.getMainLooper().getQueue().addIdleHandler(new io.sentry.android.core.performance.d(gVarC));
            }
            io.sentry.util.a aVar = (io.sentry.util.a) gVarC.M0.a;
            aVar.b();
            aVar.close();
            io.sentry.util.b.a("StandaloneAppStart");
        }
        this.d.getLogger().i(q5.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        io.sentry.util.b.a("ActivityLifecycle");
    }

    public final void b(z4 z4Var) {
        long jA;
        if (z4Var == null) {
            io.sentry.android.core.performance.h hVarB = io.sentry.android.core.performance.g.c().b(this.d);
            if (hVarB.e()) {
                if (hVarB.d()) {
                    jA = hVarB.a() + hVarB.b;
                } else {
                    jA = 0;
                }
                z4Var = new v5(jA * 1000000);
            } else {
                z4Var = null;
            }
        }
        if (!this.e || z4Var == null) {
            return;
        }
        l(this.x, z4Var, null);
        io.sentry.q1 q1Var = this.y;
        if (q1Var != null && !q1Var.e()) {
            this.y.x(h7.OK, z4Var);
        }
        io.sentry.util.a aVar = (io.sentry.util.a) io.sentry.android.core.performance.g.c().M0.a;
        aVar.b();
        aVar.close();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.unregisterActivityLifecycleCallbacks(this);
        io.sentry.android.core.performance.g gVarC = io.sentry.android.core.performance.g.c();
        gVarC.G0 = null;
        io.sentry.util.a aVar = (io.sentry.util.a) gVarC.M0.a;
        aVar.b();
        aVar.close();
        SentryAndroidOptions sentryAndroidOptions = this.d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        d dVar = this.G0;
        io.sentry.util.a aVar2 = dVar.f;
        aVar2.b();
        try {
            if (dVar.c()) {
                dVar.d(new bwe(7, dVar), "FrameMetricsAggregator.stop");
                veh vehVar = ((FrameMetricsAggregator) dVar.a.a()).a;
                Object obj = vehVar.c;
                vehVar.c = new SparseIntArray[9];
            }
            dVar.c.clear();
            aVar2.close();
        } catch (Throwable th) {
            try {
                aVar2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        io.sentry.k0 k0Var;
        SentryAndroidOptions sentryAndroidOptions;
        if (!this.g) {
            onActivityPreCreated(activity, bundle);
        }
        io.sentry.util.a aVar = this.H0;
        aVar.b();
        try {
            if (this.c != null && (sentryAndroidOptions = this.d) != null && sentryAndroidOptions.isEnableScreenTracking()) {
                this.c.n(new rl2(io.sentry.config.a.k(activity), 7));
            }
            E(activity);
            io.sentry.o1 o1Var = (io.sentry.o1) this.z.get(activity);
            io.sentry.o1 o1Var2 = (io.sentry.o1) this.X.get(activity);
            this.v = true;
            if (this.e && o1Var != null && o1Var2 != null && (k0Var = this.w) != null) {
                k0Var.a.add(new r3(16));
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        WeakHashMap weakHashMap = this.X;
        WeakHashMap weakHashMap2 = this.z;
        WeakHashMap weakHashMap3 = this.Y;
        io.sentry.util.a aVar = this.H0;
        aVar.b();
        try {
            io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) weakHashMap3.remove(activity);
            if (bVar != null) {
                io.sentry.o1 o1Var = bVar.d;
                if (o1Var != null && !o1Var.e()) {
                    bVar.d.h(h7.CANCELLED);
                }
                bVar.d = null;
                io.sentry.o1 o1Var2 = bVar.e;
                if (o1Var2 != null && !o1Var2.e()) {
                    bVar.e.h(h7.CANCELLED);
                }
                bVar.e = null;
            }
            boolean z = this.e;
            WeakHashMap weakHashMap4 = this.F0;
            if (z) {
                io.sentry.o1 o1Var3 = this.x;
                h7 h7Var = h7.CANCELLED;
                if (o1Var3 != null && !o1Var3.e()) {
                    o1Var3.h(h7Var);
                }
                io.sentry.q1 q1Var = this.y;
                if (q1Var != null && !q1Var.e()) {
                    this.y.h(h7Var);
                }
                io.sentry.o1 o1Var4 = (io.sentry.o1) weakHashMap2.get(activity);
                io.sentry.o1 o1Var5 = (io.sentry.o1) weakHashMap.get(activity);
                h7 h7Var2 = h7.DEADLINE_EXCEEDED;
                if (o1Var4 != null && !o1Var4.e()) {
                    o1Var4.h(h7Var2);
                }
                h(o1Var5, o1Var4);
                Future future = this.E0;
                if (future != null) {
                    future.cancel(false);
                    this.E0 = null;
                }
                if (this.e) {
                    u((io.sentry.q1) weakHashMap4.get(activity), null, null);
                }
                this.x = null;
                this.y = null;
                weakHashMap2.remove(activity);
                weakHashMap.remove(activity);
            }
            weakHashMap4.remove(activity);
            if (weakHashMap4.isEmpty() && !activity.isChangingConfigurations()) {
                this.v = false;
                this.Z = new y5(0L, 0L);
                weakHashMap3.clear();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        io.sentry.util.a aVar = this.H0;
        aVar.b();
        try {
            if (!this.g) {
                onActivityPrePaused(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.Y.get(activity);
        if (bVar != null) {
            io.sentry.o1 o1Var = this.y;
            if (o1Var == null && (o1Var = this.x) == null) {
                o1Var = (io.sentry.o1) this.F0.get(activity);
            }
            if (bVar.b == null || o1Var == null) {
                return;
            }
            io.sentry.o1 o1VarA = io.sentry.android.core.performance.b.a(o1Var, bVar.a.concat(".onCreate"), bVar.b);
            bVar.d = o1VarA;
            o1VarA.j();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.Y.get(activity);
        if (bVar != null) {
            io.sentry.o1 o1Var = this.y;
            if (o1Var == null && (o1Var = this.x) == null) {
                o1Var = (io.sentry.o1) this.F0.get(activity);
            }
            if (bVar.c != null && o1Var != null) {
                io.sentry.o1 o1VarA = io.sentry.android.core.performance.b.a(o1Var, bVar.a.concat(".onStart"), bVar.c);
                bVar.e = o1VarA;
                o1VarA.j();
            }
            io.sentry.o1 o1Var2 = bVar.d;
            if (o1Var2 != null && bVar.e != null) {
                z4 z4VarV = o1Var2.v();
                z4 z4VarV2 = bVar.e.v();
                if (z4VarV != null && z4VarV2 != null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    l.a.getClass();
                    y5 y5Var = new y5();
                    long jB = y5Var.b(bVar.d.z()) / 1000000;
                    long jB2 = y5Var.b(z4VarV) / 1000000;
                    long jB3 = y5Var.b(bVar.e.z()) / 1000000;
                    long jB4 = y5Var.b(z4VarV2) / 1000000;
                    io.sentry.android.core.performance.c cVar = new io.sentry.android.core.performance.c();
                    String description = bVar.d.getDescription();
                    long jD = bVar.d.z().d() / 1000000;
                    io.sentry.android.core.performance.h hVar = cVar.a;
                    hVar.a = description;
                    hVar.b = jD;
                    hVar.c = jUptimeMillis - jB;
                    hVar.d = jUptimeMillis - jB2;
                    String description2 = bVar.e.getDescription();
                    long jD2 = bVar.e.z().d() / 1000000;
                    io.sentry.android.core.performance.h hVar2 = cVar.b;
                    hVar2.a = description2;
                    hVar2.b = jD2;
                    hVar2.c = jUptimeMillis - jB3;
                    hVar2.d = jUptimeMillis - jB4;
                    io.sentry.android.core.performance.g.c().v.add(cVar);
                }
            }
        }
        b(null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        z4 y5Var;
        io.sentry.android.core.performance.b bVar = new io.sentry.android.core.performance.b(activity.getClass().getName());
        this.Y.put(activity, bVar);
        if (this.v) {
            return;
        }
        io.sentry.g1 g1Var = this.c;
        if (g1Var != null) {
            y5Var = g1Var.o().getDateProvider().a();
        } else {
            l.a.getClass();
            y5Var = new y5();
        }
        this.Z = y5Var;
        bVar.b = y5Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
        z4 y5Var;
        this.v = true;
        io.sentry.g1 g1Var = this.c;
        if (g1Var != null) {
            y5Var = g1Var.o().getDateProvider().a();
        } else {
            l.a.getClass();
            y5Var = new y5();
        }
        this.Z = y5Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
        z4 y5Var;
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.Y.get(activity);
        if (bVar != null) {
            SentryAndroidOptions sentryAndroidOptions = this.d;
            if (sentryAndroidOptions != null) {
                y5Var = sentryAndroidOptions.getDateProvider().a();
            } else {
                l.a.getClass();
                y5Var = new y5();
            }
            bVar.c = y5Var;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        io.sentry.util.a aVar = this.H0;
        aVar.b();
        try {
            if (!this.g) {
                onActivityPostStarted(activity);
            }
            if (this.e) {
                final io.sentry.o1 o1Var = (io.sentry.o1) this.z.get(activity);
                final io.sentry.o1 o1Var2 = (io.sentry.o1) this.X.get(activity);
                if (activity.getWindow() != null) {
                    final int i = 0;
                    io.sentry.android.core.internal.util.h.a(activity, new Runnable(this) { // from class: io.sentry.android.core.f
                        public final /* synthetic */ ActivityLifecycleIntegration b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2 = i;
                            io.sentry.o1 o1Var3 = o1Var;
                            io.sentry.o1 o1Var4 = o1Var2;
                            ActivityLifecycleIntegration activityLifecycleIntegration = this.b;
                            switch (i2) {
                                case 0:
                                    activityLifecycleIntegration.x(o1Var4, o1Var3);
                                    break;
                                default:
                                    activityLifecycleIntegration.x(o1Var4, o1Var3);
                                    break;
                            }
                        }
                    }, this.b);
                } else {
                    final int i2 = 1;
                    new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: io.sentry.android.core.f
                        public final /* synthetic */ ActivityLifecycleIntegration b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i2;
                            io.sentry.o1 o1Var3 = o1Var;
                            io.sentry.o1 o1Var4 = o1Var2;
                            ActivityLifecycleIntegration activityLifecycleIntegration = this.b;
                            switch (i3) {
                                case 0:
                                    activityLifecycleIntegration.x(o1Var4, o1Var3);
                                    break;
                                default:
                                    activityLifecycleIntegration.x(o1Var4, o1Var3);
                                    break;
                            }
                        }
                    });
                }
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        io.sentry.util.a aVar = this.H0;
        aVar.b();
        try {
            if (!this.g) {
                onActivityPostCreated(activity, null);
                onActivityPreStarted(activity);
            }
            if (this.e) {
                this.G0.a(activity);
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

    public final void u(io.sentry.q1 q1Var, io.sentry.o1 o1Var, io.sentry.o1 o1Var2) {
        if (q1Var == null || q1Var.e()) {
            return;
        }
        h7 h7Var = h7.DEADLINE_EXCEEDED;
        if (o1Var != null && !o1Var.e()) {
            o1Var.h(h7Var);
        }
        h(o1Var2, o1Var);
        Future future = this.E0;
        if (future != null) {
            future.cancel(false);
            this.E0 = null;
        }
        h7 h7VarA = q1Var.a();
        if (h7VarA == null) {
            h7VarA = h7.OK;
        }
        q1Var.h(h7VarA);
        io.sentry.g1 g1Var = this.c;
        if (g1Var != null) {
            g1Var.n(new g(this, q1Var));
        }
    }

    public final void x(io.sentry.o1 o1Var, io.sentry.o1 o1Var2) {
        io.sentry.android.core.performance.g gVarC = io.sentry.android.core.performance.g.c();
        io.sentry.android.core.performance.h hVar = gVarC.d;
        io.sentry.android.core.performance.h hVar2 = gVarC.e;
        SentryAndroidOptions sentryAndroidOptions = this.d;
        z4 z4VarA = sentryAndroidOptions != null ? sentryAndroidOptions.getDateProvider().a() : null;
        if (hVar.d() && hVar.c()) {
            v5 v5VarB = hVar.b();
            if (z4VarA == null || v5VarB == null) {
                hVar.d = SystemClock.uptimeMillis();
            } else {
                hVar.d = hVar.c + (z4VarA.b(v5VarB) / 1000000);
            }
        }
        if (hVar2.d() && hVar2.c()) {
            v5 v5VarB2 = hVar2.b();
            if (z4VarA == null || v5VarB2 == null) {
                hVar2.d = SystemClock.uptimeMillis();
            } else {
                hVar2.d = hVar2.c + (z4VarA.b(v5VarB2) / 1000000);
            }
        }
        b(z4VarA);
        io.sentry.util.a aVar = this.I0;
        aVar.b();
        try {
            if (this.d != null && o1Var2 != null && z4VarA != null) {
                o1Var2.t("time_to_initial_display", Long.valueOf(z4VarA.b(o1Var2.z()) / 1000000), n2.MILLISECOND);
                l(o1Var2, z4VarA, null);
            } else if (o1Var2 != null && !o1Var2.e()) {
                o1Var2.j();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
