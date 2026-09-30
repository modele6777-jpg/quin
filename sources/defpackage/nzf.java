package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.PowerManager;
import android.view.Choreographer;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import io.sentry.ShutdownHookIntegration;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.AnrIntegration;
import io.sentry.android.core.FeedbackShakeIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.a;
import io.sentry.android.core.anr.AnrProfilingIntegration;
import io.sentry.android.core.anr.d;
import io.sentry.android.core.c2;
import io.sentry.android.core.i0;
import io.sentry.android.core.internal.util.o;
import io.sentry.android.core.y1;
import io.sentry.android.replay.util.h;
import io.sentry.g;
import io.sentry.j4;
import io.sentry.k1;
import io.sentry.ndk.NativeScope;
import io.sentry.o1;
import io.sentry.q5;
import io.sentry.q6;
import io.sentry.util.b;
import io.sentry.z0;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nzf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nzf(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock;
        String strD = null;
        switch (this.a) {
            case 0:
                vea veaVar = (vea) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                synchronized (veaVar) {
                    if (atomicBoolean.get() && (wakeLock = (PowerManager.WakeLock) veaVar.c) != null) {
                        wakeLock.release();
                    }
                    break;
                }
                return;
            case 1:
                kcg kcgVar = (kcg) this.b;
                h48 h48Var = (h48) this.c;
                if (kcgVar.c) {
                    return;
                }
                kcgVar.d = h48Var;
                h48Var.a(kcgVar);
                return;
            case 2:
                ((k1) this.c).a(((j4) this.b).o().getShutdownTimeoutMillis());
                return;
            case 3:
                ShutdownHookIntegration shutdownHookIntegration = (ShutdownHookIntegration) this.b;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.c;
                shutdownHookIntegration.a.addShutdownHook(shutdownHookIntegration.b);
                sentryAndroidOptions.getLogger().i(q5.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
                b.a("ShutdownHook");
                return;
            case 4:
                ActivityLifecycleIntegration.h((o1) this.b, (o1) this.c);
                return;
            case 5:
                AnrIntegration anrIntegration = (AnrIntegration) this.b;
                SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) this.c;
                a aVar = AnrIntegration.e;
                io.sentry.util.a aVar2 = anrIntegration.c;
                aVar2.b();
                try {
                    if (!anrIntegration.b) {
                        anrIntegration.b(sentryAndroidOptions2);
                        break;
                    }
                    aVar2.close();
                    return;
                } catch (Throwable th) {
                    try {
                        aVar2.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case 6:
                ((i0) this.b).h((z0) this.c);
                return;
            case 7:
                FeedbackShakeIntegration feedbackShakeIntegration = (FeedbackShakeIntegration) this.b;
                SentryAndroidOptions sentryAndroidOptions3 = (SentryAndroidOptions) this.c;
                y1 y1Var = feedbackShakeIntegration.b;
                Application application = feedbackShakeIntegration.a;
                z0 logger = sentryAndroidOptions3.getLogger();
                synchronized (y1Var) {
                    y1Var.f = logger;
                    y1Var.b(application);
                }
                return;
            case 8:
                FeedbackShakeIntegration feedbackShakeIntegration2 = (FeedbackShakeIntegration) this.b;
                Activity activity = (Activity) this.c;
                if (feedbackShakeIntegration2.e || activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                try {
                    feedbackShakeIntegration2.e = true;
                    Runnable runnable = feedbackShakeIntegration2.c.getFeedbackOptions().h;
                    feedbackShakeIntegration2.f = runnable;
                    feedbackShakeIntegration2.c.getFeedbackOptions().h = new nzf(9, feedbackShakeIntegration2, runnable);
                    new c2(activity).show();
                    return;
                } catch (Throwable th3) {
                    feedbackShakeIntegration2.e = false;
                    feedbackShakeIntegration2.c.getFeedbackOptions().h = feedbackShakeIntegration2.f;
                    feedbackShakeIntegration2.f = null;
                    feedbackShakeIntegration2.c.getLogger().d(q5.ERROR, "Failed to show feedback dialog on shake.", th3);
                    return;
                }
            case 9:
                FeedbackShakeIntegration feedbackShakeIntegration3 = (FeedbackShakeIntegration) this.b;
                Runnable runnable2 = (Runnable) this.c;
                feedbackShakeIntegration3.e = false;
                feedbackShakeIntegration3.c.getFeedbackOptions().h = runnable2;
                if (runnable2 != null) {
                    runnable2.run();
                }
                feedbackShakeIntegration3.f = null;
                return;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                c2 c2Var = (c2) this.b;
                Activity activity2 = (Activity) this.c;
                if (activity2.isFinishing() || activity2.isDestroyed()) {
                    return;
                }
                c2Var.show();
                return;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                AnrProfilingIntegration anrProfilingIntegration = (AnrProfilingIntegration) this.b;
                d dVar = (d) this.c;
                if (dVar == null) {
                    return;
                }
                try {
                    dVar.close();
                    return;
                } catch (IOException unused) {
                    anrProfilingIntegration.w.i(q5.WARNING, "Failed to close AnrProfileManager", new Object[0]);
                    return;
                }
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                o oVar = (o) this.b;
                z0 z0Var = (z0) this.c;
                try {
                    oVar.y = Choreographer.getInstance();
                } catch (Throwable th4) {
                    z0Var.d(q5.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th4);
                }
                try {
                    oVar.z = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                    oVar.z.setAccessible(true);
                    return;
                } catch (NoSuchFieldException e) {
                    z0Var.d(q5.ERROR, "Unable to get the frame timestamp from the choreographer: ", e);
                    return;
                }
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                io.sentry.android.ndk.b bVar = (io.sentry.android.ndk.b) this.b;
                g gVar = (g) this.c;
                SentryAndroidOptions sentryAndroidOptions4 = bVar.a;
                q5 q5Var = gVar.w;
                String lowerCase = q5Var != null ? q5Var.name().toLowerCase(Locale.ROOT) : null;
                String strF = io.sentry.vendor.a.f(gVar.c().getTime());
                try {
                    Map mapB = gVar.b();
                    if (!mapB.isEmpty()) {
                        strD = sentryAndroidOptions4.getSerializer().d(mapB);
                    }
                    break;
                } catch (Throwable th5) {
                    sentryAndroidOptions4.getLogger().c(q5.ERROR, th5, "Breadcrumb data is not serializable.", new Object[0]);
                }
                NativeScope.nativeAddBreadcrumb(lowerCase, gVar.d, gVar.g, gVar.e, strF, strD);
                return;
            case 14:
                NativeScope.nativeSetExtra((String) this.b, (String) this.c);
                return;
            case 15:
                File file = (File) this.b;
                io.sentry.android.replay.capture.o oVar2 = (io.sentry.android.replay.capture.o) this.c;
                b.g(file);
                oVar2.k(-1);
                return;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                bwe bweVar = (bwe) this.b;
                q6 q6Var = (q6) this.c;
                try {
                    bweVar.run();
                    return;
                } catch (Throwable th6) {
                    q6Var.getLogger().d(q5.ERROR, "Failed to execute task ReplayIntegration.finalize_previous_replay", th6);
                    return;
                }
            default:
                Runnable runnable3 = (Runnable) this.b;
                io.sentry.android.replay.util.g gVar2 = (io.sentry.android.replay.util.g) this.c;
                try {
                    runnable3.run();
                    return;
                } catch (Throwable th7) {
                    gVar2.b.getLogger().d(q5.ERROR, "Failed to execute task ".concat(runnable3 instanceof h ? ((h) runnable3).a : ""), th7);
                    return;
                }
        }
    }

    public /* synthetic */ nzf(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj2;
        this.c = obj3;
    }
}
