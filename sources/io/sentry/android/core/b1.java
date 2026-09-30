package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import defpackage.ib8;
import io.sentry.l4;
import io.sentry.l5;
import io.sentry.o5;
import io.sentry.q4;
import io.sentry.q5;
import io.sentry.t3;
import io.sentry.u5;
import io.sentry.u6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b1 {
    public static void a(String str, q5 q5Var, String str2, Throwable th) {
        io.sentry.g gVar = new io.sentry.g();
        gVar.g = "Logcat";
        gVar.d = str2;
        gVar.w = q5Var;
        if (str != null) {
            gVar.d(str, "tag");
        }
        if (th != null && th.getMessage() != null) {
            gVar.d(th.getMessage(), "throwable");
        }
        q4.b().j(gVar);
    }

    public static void b(u5 u5Var, String str, Throwable th) {
        if (q4.b().o().getLogs().a) {
            String message = th != null ? th.getMessage() : null;
            io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c();
            cVar.c = "auto.log.logcat";
            if (th == null || message == null) {
                q4.b().t().d(u5Var, cVar, str, new Object[0]);
                return;
            }
            io.sentry.logger.a aVarT = q4.b().t();
            if (str != null) {
                message = ib8.j(str, "\n", message);
            }
            aVarT.d(u5Var, cVar, message, new Object[0]);
        }
    }

    public static void c(Context context, o0 o0Var, SentryAndroidOptions sentryAndroidOptions) {
        List listH;
        List listH2;
        List listH3;
        List listH4;
        try {
            sentryAndroidOptions.getLogger();
            ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) p0.d.a(context) : (ApplicationInfo) p0.e.a(context);
            Bundle bundle = applicationInfo != null ? applicationInfo.metaData : null;
            io.sentry.z0 logger = sentryAndroidOptions.getLogger();
            if (bundle != null) {
                sentryAndroidOptions.setDebug(f(bundle, logger, "io.sentry.debug", sentryAndroidOptions.isDebug()));
                if (sentryAndroidOptions.isDebug()) {
                    String strName = sentryAndroidOptions.getDiagnosticLevel().name();
                    Locale locale = Locale.ROOT;
                    String strJ = j(bundle, logger, "io.sentry.debug.level", strName.toLowerCase(locale));
                    if (strJ != null) {
                        sentryAndroidOptions.setDiagnosticLevel(q5.valueOf(strJ.toUpperCase(locale)));
                    }
                }
                sentryAndroidOptions.setAnrEnabled(f(bundle, logger, "io.sentry.anr.enable", sentryAndroidOptions.isAnrEnabled()));
                sentryAndroidOptions.setTombstoneEnabled(f(bundle, logger, "io.sentry.tombstone.enable", sentryAndroidOptions.isTombstoneEnabled()));
                sentryAndroidOptions.setAttachRawTombstone(f(bundle, logger, "io.sentry.tombstone.attach-raw", sentryAndroidOptions.isAttachRawTombstone()));
                sentryAndroidOptions.setReportHistoricalTombstones(f(bundle, logger, "io.sentry.tombstone.report-historical", sentryAndroidOptions.isReportHistoricalTombstones()));
                sentryAndroidOptions.setEnableAutoSessionTracking(f(bundle, logger, "io.sentry.auto-session-tracking.enable", sentryAndroidOptions.isEnableAutoSessionTracking()));
                if (sentryAndroidOptions.getSampleRate() == null) {
                    double dG = g(bundle, logger, "io.sentry.sample-rate");
                    if (dG != -1.0d) {
                        sentryAndroidOptions.setSampleRate(Double.valueOf(dG));
                    }
                }
                sentryAndroidOptions.setAnrReportInDebug(f(bundle, logger, "io.sentry.anr.report-debug", sentryAndroidOptions.isAnrReportInDebug()));
                sentryAndroidOptions.setAnrTimeoutIntervalMillis(i(bundle, logger, "io.sentry.anr.timeout-interval-millis", sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                sentryAndroidOptions.setAttachAnrThreadDump(f(bundle, logger, "io.sentry.anr.attach-thread-dumps", sentryAndroidOptions.isAttachAnrThreadDump()));
                sentryAndroidOptions.setReportHistoricalAnrs(f(bundle, logger, "io.sentry.anr.report-historical", sentryAndroidOptions.isReportHistoricalAnrs()));
                sentryAndroidOptions.setEnableNdkAppHangTracking(f(bundle, logger, "io.sentry.ndk.app-hang.enable", sentryAndroidOptions.isEnableNdkAppHangTracking()));
                sentryAndroidOptions.setNdkAppHangTimeoutIntervalMillis(i(bundle, logger, "io.sentry.ndk.app-hang.timeout-interval-millis", sentryAndroidOptions.getNdkAppHangTimeoutIntervalMillis()));
                String strJ2 = j(bundle, logger, "io.sentry.dsn", sentryAndroidOptions.getDsn());
                boolean zF = f(bundle, logger, "io.sentry.enabled", sentryAndroidOptions.isEnabled());
                if (!zF || (strJ2 != null && strJ2.isEmpty())) {
                    sentryAndroidOptions.getLogger().i(q5.DEBUG, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android", new Object[0]);
                } else if (strJ2 == null) {
                    sentryAndroidOptions.getLogger().i(q5.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);
                }
                sentryAndroidOptions.setEnabled(zF);
                sentryAndroidOptions.setDsn(strJ2);
                sentryAndroidOptions.setEnableNdk(f(bundle, logger, "io.sentry.ndk.enable", sentryAndroidOptions.isEnableNdk()));
                sentryAndroidOptions.setEnableScopeSync(f(bundle, logger, "io.sentry.ndk.scope-sync.enable", sentryAndroidOptions.isEnableScopeSync()));
                String strJ3 = j(bundle, logger, "io.sentry.ndk.sdk-name", sentryAndroidOptions.getNativeSdkName());
                if (strJ3 != null) {
                    sentryAndroidOptions.setNativeSdkName(strJ3);
                }
                sentryAndroidOptions.setRelease(j(bundle, logger, "io.sentry.release", sentryAndroidOptions.getRelease()));
                sentryAndroidOptions.setDist(j(bundle, logger, "io.sentry.dist", sentryAndroidOptions.getDist()));
                sentryAndroidOptions.setEnvironment(j(bundle, logger, "io.sentry.environment", sentryAndroidOptions.getEnvironment()));
                sentryAndroidOptions.setSessionTrackingIntervalMillis(i(bundle, logger, "io.sentry.session-tracking.timeout-interval-millis", sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                sentryAndroidOptions.setMaxBreadcrumbs((int) i(bundle, logger, "io.sentry.max-breadcrumbs", sentryAndroidOptions.getMaxBreadcrumbs()));
                sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(f(bundle, logger, "io.sentry.breadcrumbs.activity-lifecycle", sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(f(bundle, logger, "io.sentry.breadcrumbs.app-lifecycle", sentryAndroidOptions.isEnableAppLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableSystemEventBreadcrumbs(f(bundle, logger, "io.sentry.breadcrumbs.system-events", sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                sentryAndroidOptions.setEnableAppComponentBreadcrumbs(f(bundle, logger, "io.sentry.breadcrumbs.app-components", sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(f(bundle, logger, "io.sentry.breadcrumbs.user-interaction", sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(f(bundle, logger, "io.sentry.breadcrumbs.network-events", sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
                sentryAndroidOptions.setEnableUncaughtExceptionHandler(f(bundle, logger, "io.sentry.uncaught-exception-handler.enable", sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                sentryAndroidOptions.setAttachThreads(f(bundle, logger, "io.sentry.attach-threads", sentryAndroidOptions.isAttachThreads()));
                sentryAndroidOptions.setAttachScreenshot(f(bundle, logger, "io.sentry.attach-screenshot", sentryAndroidOptions.isAttachScreenshot()));
                sentryAndroidOptions.setAttachViewHierarchy(f(bundle, logger, "io.sentry.attach-view-hierarchy", sentryAndroidOptions.isAttachViewHierarchy()));
                sentryAndroidOptions.setSendClientReports(f(bundle, logger, "io.sentry.send-client-reports", sentryAndroidOptions.isSendClientReports()));
                if (f(bundle, logger, "io.sentry.auto-init", true)) {
                    sentryAndroidOptions.setInitPriority(io.sentry.u1.LOW);
                }
                sentryAndroidOptions.setForceInit(f(bundle, logger, "io.sentry.force-init", sentryAndroidOptions.isForceInit()));
                sentryAndroidOptions.setCollectAdditionalContext(f(bundle, logger, "io.sentry.additional-context", sentryAndroidOptions.isCollectAdditionalContext()));
                sentryAndroidOptions.setCollectExternalStorageContext(f(bundle, logger, "io.sentry.external-storage-context", sentryAndroidOptions.isCollectExternalStorageContext()));
                if (sentryAndroidOptions.getTracesSampleRate() == null) {
                    double dG2 = g(bundle, logger, "io.sentry.traces.sample-rate");
                    if (dG2 != -1.0d) {
                        sentryAndroidOptions.setTracesSampleRate(Double.valueOf(dG2));
                    }
                }
                sentryAndroidOptions.setTraceSampling(f(bundle, logger, "io.sentry.traces.trace-sampling", sentryAndroidOptions.isTraceSampling()));
                sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(f(bundle, logger, "io.sentry.traces.activity.enable", sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(f(bundle, logger, "io.sentry.traces.activity.auto-finish.enable", sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                if (sentryAndroidOptions.getProfilesSampleRate() == null) {
                    double dG3 = g(bundle, logger, "io.sentry.traces.profiling.sample-rate");
                    if (dG3 != -1.0d) {
                        sentryAndroidOptions.setProfilesSampleRate(Double.valueOf(dG3));
                    }
                }
                if (sentryAndroidOptions.getProfileSessionSampleRate() == null) {
                    double dG4 = g(bundle, logger, "io.sentry.traces.profiling.session-sample-rate");
                    if (dG4 != -1.0d) {
                        sentryAndroidOptions.setProfileSessionSampleRate(Double.valueOf(dG4));
                    }
                }
                String strName2 = sentryAndroidOptions.getProfileLifecycle().name();
                Locale locale2 = Locale.ROOT;
                String strJ4 = j(bundle, logger, "io.sentry.traces.profiling.lifecycle", strName2.toLowerCase(locale2));
                if (strJ4 != null) {
                    sentryAndroidOptions.setProfileLifecycle(t3.valueOf(strJ4.toUpperCase(locale2)));
                }
                sentryAndroidOptions.setStartProfilerOnAppStart(f(bundle, logger, "io.sentry.traces.profiling.start-on-app-start", sentryAndroidOptions.isStartProfilerOnAppStart()));
                sentryAndroidOptions.setEnableUserInteractionTracing(f(bundle, logger, "io.sentry.traces.user-interaction.enable", sentryAndroidOptions.isEnableUserInteractionTracing()));
                sentryAndroidOptions.setEnableTimeToFullDisplayTracing(f(bundle, logger, "io.sentry.traces.time-to-full-display.enable", sentryAndroidOptions.isEnableTimeToFullDisplayTracing()));
                long jI = i(bundle, logger, "io.sentry.traces.idle-timeout", -1L);
                if (jI != -1) {
                    sentryAndroidOptions.setIdleTimeout(Long.valueOf(jI));
                }
                List<String> listH5 = h(bundle, logger, "io.sentry.traces.trace-propagation-targets");
                if (bundle.containsKey("io.sentry.traces.trace-propagation-targets") && listH5 == null) {
                    sentryAndroidOptions.setTracePropagationTargets(Collections.EMPTY_LIST);
                } else if (listH5 != null) {
                    sentryAndroidOptions.setTracePropagationTargets(listH5);
                }
                sentryAndroidOptions.setEnableFramesTracking(f(bundle, logger, "io.sentry.traces.frames-tracking", true));
                sentryAndroidOptions.setProguardUuid(j(bundle, logger, "io.sentry.proguard-uuid", sentryAndroidOptions.getProguardUuid()));
                io.sentry.protocol.u sdkVersion = sentryAndroidOptions.getSdkVersion();
                if (sdkVersion == null) {
                    sdkVersion = new io.sentry.protocol.u("", "");
                }
                String strK = k(bundle, logger, "io.sentry.sdk.name", sdkVersion.a);
                io.sentry.util.b.r(strK, "name is required.");
                sdkVersion.a = strK;
                String strK2 = k(bundle, logger, "io.sentry.sdk.version", sdkVersion.b);
                io.sentry.util.b.r(strK2, "version is required.");
                sdkVersion.b = strK2;
                sentryAndroidOptions.setSdkVersion(sdkVersion);
                sentryAndroidOptions.setSendDefaultPii(f(bundle, logger, "io.sentry.send-default-pii", sentryAndroidOptions.isSendDefaultPii()));
                List listH6 = h(bundle, logger, "io.sentry.gradle-plugin-integrations");
                if (listH6 != null) {
                    Iterator it = listH6.iterator();
                    while (it.hasNext()) {
                        o5.d().a((String) it.next());
                    }
                }
                sentryAndroidOptions.setEnableRootCheck(f(bundle, logger, "io.sentry.enable-root-check", sentryAndroidOptions.isEnableRootCheck()));
                sentryAndroidOptions.setSendModules(f(bundle, logger, "io.sentry.send-modules", sentryAndroidOptions.isSendModules()));
                sentryAndroidOptions.setEnablePerformanceV2(f(bundle, logger, "io.sentry.performance-v2.enable", sentryAndroidOptions.isEnablePerformanceV2()));
                sentryAndroidOptions.setEnableStandaloneAppStartTracing(f(bundle, logger, "io.sentry.standalone-app-start-tracing.enable", sentryAndroidOptions.isEnableStandaloneAppStartTracing()));
                sentryAndroidOptions.setEnableAppStartProfiling(f(bundle, logger, "io.sentry.profiling.enable-app-start", sentryAndroidOptions.isEnableAppStartProfiling()));
                sentryAndroidOptions.setEnableLegacyProfiling(f(bundle, logger, "io.sentry.profiling.enable-legacy-profiling", sentryAndroidOptions.isEnableLegacyProfiling()));
                sentryAndroidOptions.setEnableScopePersistence(f(bundle, logger, "io.sentry.enable-scope-persistence", sentryAndroidOptions.isEnableScopePersistence()));
                sentryAndroidOptions.setEnableAutoTraceIdGeneration(f(bundle, logger, "io.sentry.traces.enable-auto-id-generation", sentryAndroidOptions.isEnableAutoTraceIdGeneration()));
                sentryAndroidOptions.setDeadlineTimeout(i(bundle, logger, "io.sentry.traces.deadline-timeout", sentryAndroidOptions.getDeadlineTimeout()));
                if (sentryAndroidOptions.getSessionReplay().d == null) {
                    double dG5 = g(bundle, logger, "io.sentry.session-replay.session-sample-rate");
                    if (dG5 != -1.0d) {
                        sentryAndroidOptions.getSessionReplay().D(Double.valueOf(dG5));
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().e == null) {
                    double dG6 = g(bundle, logger, "io.sentry.session-replay.on-error-sample-rate");
                    if (dG6 != -1.0d) {
                        sentryAndroidOptions.getSessionReplay().C(Double.valueOf(dG6));
                    }
                }
                sentryAndroidOptions.getSessionReplay().v(f(bundle, logger, "io.sentry.session-replay.mask-all-text", true));
                sentryAndroidOptions.getSessionReplay().u(f(bundle, logger, "io.sentry.session-replay.mask-all-images", true));
                sentryAndroidOptions.getSessionReplay().m = f(bundle, logger, "io.sentry.session-replay.debug", false);
                String strJ5 = j(bundle, logger, "io.sentry.session-replay.screenshot-strategy", null);
                if (strJ5 != null) {
                    if ("canvas".equals(strJ5.toLowerCase(Locale.ROOT))) {
                        sentryAndroidOptions.getSessionReplay().n = l4.CANVAS;
                    } else {
                        sentryAndroidOptions.getSessionReplay().n = l4.PIXEL_COPY;
                    }
                }
                sentryAndroidOptions.getSessionReplay().o = f(bundle, logger, "io.sentry.session-replay.capture-surface-views", sentryAndroidOptions.getSessionReplay().o);
                if (sentryAndroidOptions.getSessionReplay().p.isEmpty() && (listH4 = h(bundle, logger, "io.sentry.session-replay.network-detail-allow-urls")) != null && !listH4.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = listH4.iterator();
                    while (it2.hasNext()) {
                        String strTrim = ((String) it2.next()).trim();
                        if (!strTrim.isEmpty()) {
                            arrayList.add(strTrim);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().y(arrayList);
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().q.isEmpty() && (listH3 = h(bundle, logger, "io.sentry.session-replay.network-detail-deny-urls")) != null && !listH3.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = listH3.iterator();
                    while (it3.hasNext()) {
                        String strTrim2 = ((String) it3.next()).trim();
                        if (!strTrim2.isEmpty()) {
                            arrayList2.add(strTrim2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().z(arrayList2);
                    }
                }
                sentryAndroidOptions.getSessionReplay().r = f(bundle, logger, "io.sentry.session-replay.network-capture-bodies", sentryAndroidOptions.getSessionReplay().r);
                if (sentryAndroidOptions.getSessionReplay().s.size() == u6.u.size() && (listH2 = h(bundle, logger, "io.sentry.session-replay.network-request-headers")) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it4 = listH2.iterator();
                    while (it4.hasNext()) {
                        String strTrim3 = ((String) it4.next()).trim();
                        if (!strTrim3.isEmpty()) {
                            arrayList3.add(strTrim3);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().A(arrayList3);
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().t.size() == u6.u.size() && (listH = h(bundle, logger, "io.sentry.session-replay.network-response-headers")) != null && !listH.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it5 = listH.iterator();
                    while (it5.hasNext()) {
                        String strTrim4 = ((String) it5.next()).trim();
                        if (!strTrim4.isEmpty()) {
                            arrayList4.add(strTrim4);
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().B(arrayList4);
                    }
                }
                sentryAndroidOptions.setIgnoredErrors(h(bundle, logger, "io.sentry.ignored-errors"));
                List listH7 = h(bundle, logger, "io.sentry.in-app-includes");
                if (listH7 != null && !listH7.isEmpty()) {
                    Iterator it6 = listH7.iterator();
                    while (it6.hasNext()) {
                        sentryAndroidOptions.addInAppInclude((String) it6.next());
                    }
                }
                List listH8 = h(bundle, logger, "io.sentry.in-app-excludes");
                if (listH8 != null && !listH8.isEmpty()) {
                    Iterator it7 = listH8.iterator();
                    while (it7.hasNext()) {
                        sentryAndroidOptions.addInAppExclude((String) it7.next());
                    }
                }
                sentryAndroidOptions.getLogs().a = f(bundle, logger, "io.sentry.logs.enabled", sentryAndroidOptions.getLogs().a);
                sentryAndroidOptions.getMetrics().a = f(bundle, logger, "io.sentry.metrics.enabled", sentryAndroidOptions.getMetrics().a);
                l5 feedbackOptions = sentryAndroidOptions.getFeedbackOptions();
                feedbackOptions.a = f(bundle, logger, "io.sentry.feedback.is-name-required", feedbackOptions.a);
                feedbackOptions.b = f(bundle, logger, "io.sentry.feedback.show-name", feedbackOptions.b);
                feedbackOptions.c = f(bundle, logger, "io.sentry.feedback.is-email-required", feedbackOptions.c);
                feedbackOptions.d = f(bundle, logger, "io.sentry.feedback.show-email", feedbackOptions.d);
                feedbackOptions.e = f(bundle, logger, "io.sentry.feedback.use-sentry-user", feedbackOptions.e);
                feedbackOptions.f = f(bundle, logger, "io.sentry.feedback.show-branding", feedbackOptions.f);
                feedbackOptions.g = f(bundle, logger, "io.sentry.feedback.use-shake-gesture", feedbackOptions.g);
                sentryAndroidOptions.setStrictTraceContinuation(f(bundle, logger, "io.sentry.strict-trace-continuation.enabled", sentryAndroidOptions.isStrictTraceContinuation()));
                String strJ6 = j(bundle, logger, "io.sentry.org-id", null);
                if (strJ6 != null) {
                    sentryAndroidOptions.setOrgId(strJ6);
                }
                sentryAndroidOptions.setEnableSpotlight(f(bundle, logger, "io.sentry.spotlight.enable", sentryAndroidOptions.isEnableSpotlight()));
                String strJ7 = j(bundle, logger, "io.sentry.spotlight.url", null);
                if (strJ7 != null) {
                    sentryAndroidOptions.setSpotlightConnectionUrl(strJ7);
                }
                sentryAndroidOptions.getScreenshot().v(f(bundle, logger, "io.sentry.screenshot.mask-all-text", false));
                sentryAndroidOptions.getScreenshot().u(f(bundle, logger, "io.sentry.screenshot.mask-all-images", false));
                if (sentryAndroidOptions.getAnrProfilingSampleRate() == null) {
                    double dG7 = g(bundle, logger, "io.sentry.anr.profiling.sample-rate");
                    if (dG7 != -1.0d) {
                        sentryAndroidOptions.setAnrProfilingSampleRate(Double.valueOf(dG7));
                    }
                }
                sentryAndroidOptions.setEnableAnrFingerprinting(f(bundle, logger, "io.sentry.anr.enable-fingerprinting", sentryAndroidOptions.isEnableAnrFingerprinting()));
            }
            sentryAndroidOptions.getLogger().i(q5.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(q5.ERROR, "Failed to read configuration from android manifest metadata.", th);
        }
    }

    public static int d(String str, String str2) {
        a(str, q5.ERROR, str2, null);
        b(u5.ERROR, str2, null);
        return Log.e(str, str2);
    }

    public static int e(String str, String str2, Throwable th) {
        a(str, q5.ERROR, str2, th);
        b(u5.ERROR, str2, th);
        return Log.e(str, str2, th);
    }

    public static boolean f(Bundle bundle, io.sentry.z0 z0Var, String str, boolean z) {
        boolean z2 = bundle.getBoolean(str, z);
        q5 q5Var = q5.DEBUG;
        if (z0Var.k(q5Var)) {
            z0Var.i(q5Var, str + " read: " + z2, new Object[0]);
        }
        return z2;
    }

    public static double g(Bundle bundle, io.sentry.z0 z0Var, String str) {
        double dDoubleValue = Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue();
        if (dDoubleValue == -1.0d) {
            dDoubleValue = Integer.valueOf(bundle.getInt(str, -1)).doubleValue();
        }
        q5 q5Var = q5.DEBUG;
        if (z0Var.k(q5Var)) {
            z0Var.i(q5Var, str + " read: " + dDoubleValue, new Object[0]);
        }
        return dDoubleValue;
    }

    public static List h(Bundle bundle, io.sentry.z0 z0Var, String str) {
        String string = bundle.getString(str);
        q5 q5Var = q5.DEBUG;
        if (z0Var.k(q5Var)) {
            z0Var.i(q5Var, ib8.j(str, " read: ", string), new Object[0]);
        }
        if (string != null) {
            return Arrays.asList(string.split(",", -1));
        }
        return null;
    }

    public static long i(Bundle bundle, io.sentry.z0 z0Var, String str, long j) {
        long j2 = bundle.getInt(str, (int) j);
        q5 q5Var = q5.DEBUG;
        if (z0Var.k(q5Var)) {
            z0Var.i(q5Var, str + " read: " + j2, new Object[0]);
        }
        return j2;
    }

    public static String j(Bundle bundle, io.sentry.z0 z0Var, String str, String str2) {
        String string = bundle.getString(str, str2);
        q5 q5Var = q5.DEBUG;
        if (z0Var.k(q5Var)) {
            z0Var.i(q5Var, ib8.j(str, " read: ", string), new Object[0]);
        }
        return string;
    }

    public static String k(Bundle bundle, io.sentry.z0 z0Var, String str, String str2) {
        String string = bundle.getString(str, str2);
        q5 q5Var = q5.DEBUG;
        if (z0Var.k(q5Var)) {
            z0Var.i(q5Var, ib8.j(str, " read: ", string), new Object[0]);
        }
        return string;
    }

    public static int l(String str, String str2) {
        a(str, q5.WARNING, str2, null);
        b(u5.WARN, str2, null);
        return Log.w(str, str2);
    }

    public static void m(Exception exc, String str) {
        a(str, q5.WARNING, null, exc);
        b(u5.WARN, null, exc);
        Log.w(str, exc);
    }

    public static void n(String str, String str2, Throwable th) {
        a(str, q5.WARNING, str2, th);
        b(u5.WARN, str2, th);
        Log.w(str, str2, th);
    }

    public static void o(String str, String str2, Exception exc) {
        a(str, q5.ERROR, str2, exc);
        b(u5.FATAL, str2, exc);
        Log.wtf(str, str2, exc);
    }
}
