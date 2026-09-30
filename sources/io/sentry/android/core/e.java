package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.d4;
import io.sentry.f3;
import io.sentry.i4;
import io.sentry.k3;
import io.sentry.p2;
import io.sentry.p4;
import io.sentry.q2;
import io.sentry.q5;
import io.sentry.r2;
import io.sentry.s2;
import io.sentry.x2;
import io.sentry.z5;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements d4, p4 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // io.sentry.d4
    public void c(io.sentry.q1 q1Var) {
        ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) this.a;
        io.sentry.e1 e1Var = (io.sentry.e1) this.b;
        io.sentry.q1 q1Var2 = (io.sentry.q1) this.c;
        if (q1Var == null) {
            e1Var.K(q1Var2);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", q1Var2.getName());
        }
    }

    @Override // io.sentry.p4
    public void d(SentryAndroidOptions sentryAndroidOptions) {
        int i;
        io.sentry.z0 z0Var = (x) this.a;
        Context context = (Context) this.b;
        p4 p4Var = (p4) this.c;
        boolean zB = io.sentry.util.g.b(sentryAndroidOptions, "timber.log.Timber");
        int i2 = 1;
        boolean z = io.sentry.util.g.b(sentryAndroidOptions, "androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks") && io.sentry.util.g.b(sentryAndroidOptions, "io.sentry.android.fragment.FragmentLifecycleIntegration");
        boolean z2 = zB && io.sentry.util.g.b(sentryAndroidOptions, "io.sentry.android.timber.SentryTimberIntegration");
        boolean zB2 = io.sentry.util.g.b(sentryAndroidOptions, "io.sentry.android.replay.ReplayIntegration");
        boolean zB3 = io.sentry.util.g.b(sentryAndroidOptions, "io.sentry.android.distribution.DistributionIntegration");
        o0 o0Var = new o0(z0Var);
        io.sentry.util.g gVar = new io.sentry.util.g();
        d dVar = new d(gVar, sentryAndroidOptions);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        sentryAndroidOptions.setLogger(z0Var);
        sentryAndroidOptions.setFatalLogger(new x(2));
        sentryAndroidOptions.setDefaultScopeType(i4.CURRENT);
        sentryAndroidOptions.setOpenTelemetryMode(z5.OFF);
        sentryAndroidOptions.setDateProvider(new t1());
        sentryAndroidOptions.getLogs().b = new x(4);
        sentryAndroidOptions.getMetrics().b = new x(5);
        sentryAndroidOptions.setFlushTimeoutMillis(4000L);
        sentryAndroidOptions.setFrameMetricsCollector(new io.sentry.android.core.internal.util.o(applicationContext, z0Var, o0Var));
        b1.c(applicationContext, o0Var, sentryAndroidOptions);
        sentryAndroidOptions.setCacheDirPath(new File(applicationContext.getCacheDir(), "sentry").getAbsolutePath());
        io.sentry.android.core.anr.e.a.set(true);
        PackageInfo packageInfoE = p0.e(applicationContext, o0Var);
        if (packageInfoE != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(packageInfoE.packageName + "@" + packageInfoE.versionName + "+" + p0.f(packageInfoE, o0Var));
            }
            String str = packageInfoE.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId(z0.a(applicationContext));
            } catch (RuntimeException e) {
                sentryAndroidOptions.getLogger().d(q5.ERROR, "Could not generate distinct Id.", e);
            }
        }
        i0 i0Var = i0.e;
        if (i0Var.b == null) {
            io.sentry.util.a aVar = i0Var.a;
            aVar.b();
            try {
                i0Var.l(sentryAndroidOptions.getLogger());
                aVar.close();
            } catch (Throwable th) {
                try {
                    aVar.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        sentryAndroidOptions.activate();
        t.a(context, sentryAndroidOptions, o0Var, gVar, dVar, z, z2, zB2, zB3);
        boolean z3 = z;
        boolean z4 = z2;
        try {
            p4Var.d(sentryAndroidOptions);
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().d(q5.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th3);
        }
        io.sentry.android.core.performance.g gVarC = io.sentry.android.core.performance.g.c();
        if (sentryAndroidOptions.isEnablePerformanceV2()) {
            io.sentry.android.core.performance.h hVar = gVarC.d;
            if (hVar.c == 0) {
                hVar.f(Process.getStartUptimeMillis());
            }
        }
        if (context.getApplicationContext() instanceof Application) {
            gVarC.h((Application) context.getApplicationContext());
        }
        io.sentry.android.core.performance.h hVar2 = gVarC.e;
        if (hVar2.c == 0) {
            hVar2.f(s1.a);
        }
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.i)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new io.sentry.android.core.cache.b(sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getConnectionStatusProvider() instanceof r2) {
            sentryAndroidOptions.setConnectionStatusProvider(new io.sentry.android.core.internal.util.b(context, o0Var, sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            sentryAndroidOptions.addScopeObserver(new io.sentry.cache.g(sentryAndroidOptions));
            sentryAndroidOptions.addOptionsObserver(new io.sentry.cache.e(sentryAndroidOptions));
            PackageInfo packageInfoE2 = p0.e(context, o0Var);
            if (packageInfoE2 != null) {
                long j = packageInfoE2.lastUpdateTime;
                if (j > 0) {
                    sentryAndroidOptions.addOptionsObserver(new q1(sentryAndroidOptions, j));
                }
            }
        }
        sentryAndroidOptions.addEventProcessor(new io.sentry.q(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new s0(context, o0Var, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new p1(sentryAndroidOptions, dVar));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, o0Var, zB2));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new l0(context, o0Var, sentryAndroidOptions));
        if (sentryAndroidOptions.getTransportGate() instanceof io.sentry.transport.k) {
            q0 q0Var = new q0();
            q0Var.a = sentryAndroidOptions;
            sentryAndroidOptions.setTransportGate(q0Var);
        }
        io.sentry.android.core.performance.g gVarC2 = io.sentry.android.core.performance.g.c();
        sentryAndroidOptions.setAppStartExtender(gVarC2.M0);
        if (sentryAndroidOptions.getModulesLoader() instanceof io.sentry.internal.modules.e) {
            sentryAndroidOptions.setModulesLoader(new io.sentry.internal.modules.f(context, sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            sentryAndroidOptions.setDebugMetaLoader(new io.sentry.internal.debugmeta.c(context, sentryAndroidOptions.getLogger()));
        }
        if (sentryAndroidOptions.getVersionDetector() instanceof k3) {
            sentryAndroidOptions.setVersionDetector(new io.sentry.x(sentryAndroidOptions, 0));
        }
        io.sentry.util.f fVar = new io.sentry.util.f(new r(gVar, sentryAndroidOptions));
        boolean zB4 = io.sentry.util.g.b(sentryAndroidOptions, "androidx.compose.ui.node.Owner");
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new io.sentry.android.core.internal.gestures.a(fVar));
            if (zB4 && io.sentry.util.g.b(sentryAndroidOptions, "io.sentry.compose.gestures.ComposeGestureTargetLocator")) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && zB4 && io.sentry.util.g.b(sentryAndroidOptions, "io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter")) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        if (sentryAndroidOptions.getThreadChecker() instanceof io.sentry.util.thread.b) {
            sentryAndroidOptions.setThreadChecker(io.sentry.android.core.internal.util.e.a);
        }
        if (sentryAndroidOptions.getSocketTagger() instanceof f3) {
            sentryAndroidOptions.setSocketTagger(x.b);
        }
        if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
            sentryAndroidOptions.addPerformanceCollector(new p());
            io.sentry.z0 logger = sentryAndroidOptions.getLogger();
            k kVar = new k();
            kVar.a = 0L;
            kVar.b = 0L;
            kVar.c = 1L;
            kVar.d = false;
            io.sentry.util.b.r(logger, "Logger is required.");
            sentryAndroidOptions.addPerformanceCollector(kVar);
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                io.sentry.android.core.internal.util.o frameMetricsCollector = sentryAndroidOptions.getFrameMetricsCollector();
                io.sentry.util.b.r(frameMetricsCollector, "options.getFrameMetricsCollector is required");
                sentryAndroidOptions.addPerformanceCollector(new f2(sentryAndroidOptions, frameMetricsCollector));
            }
        }
        if (sentryAndroidOptions.getCompositePerformanceCollector() instanceof q2) {
            sentryAndroidOptions.setCompositePerformanceCollector(new io.sentry.u(sentryAndroidOptions));
        }
        if (zB2 && (sentryAndroidOptions.getReplayController().getZ() instanceof x2)) {
            sentryAndroidOptions.getReplayController().G(new io.sentry.android.replay.c(sentryAndroidOptions));
        }
        io.sentry.util.a aVar2 = io.sentry.android.core.performance.g.P0;
        aVar2.b();
        try {
            io.sentry.r1 r1Var = gVarC2.w;
            j jVar = gVarC2.x;
            gVarC2.w = null;
            gVarC2.x = null;
            aVar2.close();
            io.sentry.o compositePerformanceCollector = sentryAndroidOptions.getCompositePerformanceCollector();
            io.sentry.r1 r1Var2 = p2.e;
            if (sentryAndroidOptions.isProfilingEnabled() || sentryAndroidOptions.getProfilesSampleRate() != null) {
                i = 0;
                sentryAndroidOptions.setContinuousProfiler(s2.a);
                if (sentryAndroidOptions.isEnableLegacyProfiling()) {
                    if (jVar != null) {
                        jVar.a(true);
                    }
                    if (r1Var != null) {
                        sentryAndroidOptions.setTransactionProfiler(r1Var);
                    } else {
                        io.sentry.android.core.internal.util.o frameMetricsCollector2 = sentryAndroidOptions.getFrameMetricsCollector();
                        io.sentry.util.b.r(frameMetricsCollector2, "options.getFrameMetricsCollector is required");
                        sentryAndroidOptions.setTransactionProfiler(new y(context, o0Var, frameMetricsCollector2, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), new r(sentryAndroidOptions, 4)));
                    }
                } else {
                    sentryAndroidOptions.getLogger().i(q5.WARNING, "Transaction-based profiling (profilesSampleRate/profilesSampler) is disabled because enableLegacyProfiling is false. Transaction-based profiling always uses the legacy profiler and is not supported by Perfetto. No profiling data will be collected. Use profileSessionSampleRate for continuous profiling instead.", new Object[0]);
                    sentryAndroidOptions.setTransactionProfiler(r1Var2);
                    if (r1Var != null) {
                        r1Var.close();
                    }
                    if (jVar != null) {
                        jVar.a(true);
                    }
                }
            } else {
                sentryAndroidOptions.setTransactionProfiler(r1Var2);
                if (r1Var != null) {
                    r1Var.close();
                }
                if (jVar != null) {
                    sentryAndroidOptions.setContinuousProfiler(jVar);
                    io.sentry.protocol.w wVar = jVar.Z;
                    if (jVar.w && !wVar.equals(io.sentry.protocol.w.b)) {
                        compositePerformanceCollector.a(wVar.a());
                    }
                } else {
                    io.sentry.android.core.internal.util.o frameMetricsCollector3 = sentryAndroidOptions.getFrameMetricsCollector();
                    io.sentry.util.b.r(frameMetricsCollector3, "options.getFrameMetricsCollector is required");
                    if (Build.VERSION.SDK_INT >= 35) {
                        Context applicationContext2 = context.getApplicationContext();
                        if (applicationContext2 == null) {
                            applicationContext2 = context;
                        }
                        sentryAndroidOptions.setContinuousProfiler(new l1(sentryAndroidOptions.getLogger(), frameMetricsCollector3, new r(sentryAndroidOptions, 0), new s(applicationContext2, sentryAndroidOptions)));
                    } else if (sentryAndroidOptions.isEnableLegacyProfiling()) {
                        sentryAndroidOptions.setContinuousProfiler(new j(o0Var, frameMetricsCollector3, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.getProfilingTracesHz(), new r(sentryAndroidOptions, i2)));
                    } else {
                        i = 0;
                        sentryAndroidOptions.getLogger().i(q5.WARNING, "enableLegacyProfiling is disabled and device is below API 35. No profiling data will be collected.", new Object[0]);
                    }
                }
                i = 0;
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            for (io.sentry.w1 w1Var : sentryAndroidOptions.getIntegrations()) {
                if (z3 && (w1Var instanceof FragmentLifecycleIntegration)) {
                    arrayList4.add(w1Var);
                }
                if (z4 && (w1Var instanceof SentryTimberIntegration)) {
                    arrayList3.add(w1Var);
                }
                if (w1Var instanceof SystemEventsBreadcrumbsIntegration) {
                    arrayList5.add(w1Var);
                }
            }
            if (arrayList4.size() > 1) {
                for (int i3 = i; i3 < arrayList4.size() - 1; i3++) {
                    sentryAndroidOptions.getIntegrations().remove((io.sentry.w1) arrayList4.get(i3));
                }
            }
            if (arrayList3.size() > 1) {
                for (int i4 = i; i4 < arrayList3.size() - 1; i4++) {
                    sentryAndroidOptions.getIntegrations().remove((io.sentry.w1) arrayList3.get(i4));
                }
            }
            if (arrayList5.size() > 1) {
                for (int i5 = i; i5 < arrayList5.size() - 1; i5++) {
                    sentryAndroidOptions.getIntegrations().remove((io.sentry.w1) arrayList5.get(i5));
                }
            }
        } catch (Throwable th4) {
            try {
                aVar2.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }
}
