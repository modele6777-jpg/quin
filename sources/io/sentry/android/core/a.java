package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Handler;
import android.os.SystemClock;
import com.adjust.sdk.sig.r3;
import defpackage.bwe;
import defpackage.tec;
import io.sentry.i5;
import io.sentry.q4;
import io.sentry.q5;
import io.sentry.y6;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends Thread {
    public final boolean a;
    public final y6 b;
    public final q0 c;
    public final r3 d;
    public final long e;
    public final long f;
    public final io.sentry.z0 g;
    public volatile long v;
    public final AtomicBoolean w;
    public final Context x;
    public final bwe y;

    public a(long j, boolean z, y6 y6Var, io.sentry.z0 z0Var, Context context) {
        r3 r3Var = new r3(14);
        q0 q0Var = new q0(3);
        super("|ANR-WatchDog|");
        this.v = 0L;
        this.w = new AtomicBoolean(false);
        this.d = r3Var;
        this.f = j;
        this.e = 500L;
        this.a = z;
        this.b = y6Var;
        this.g = z0Var;
        this.c = q0Var;
        this.x = context;
        this.y = new bwe(this, r3Var);
        if (j < 1000) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", 1000L));
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        this.y.run();
        while (!isInterrupted()) {
            ((Handler) this.c.a).post(this.y);
            try {
                Thread.sleep(this.e);
                this.d.getClass();
                if (SystemClock.uptimeMillis() - this.v > this.f) {
                    if (this.a || !(Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        ActivityManager activityManager = (ActivityManager) this.x.getSystemService("activity");
                        if (activityManager != null) {
                            try {
                                processesInErrorState = activityManager.getProcessesInErrorState();
                            } catch (Throwable th) {
                                this.g.d(q5.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th);
                                processesInErrorState = null;
                            }
                            if (processesInErrorState != null) {
                                Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (it.next().condition == 2) {
                                        }
                                    }
                                }
                            }
                        }
                        if (this.w.compareAndSet(false, true)) {
                            ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(tec.h(this.f, " ms.", new StringBuilder("Application Not Responding for at least ")), ((Handler) this.c.a).getLooper().getThread());
                            y6 y6Var = this.b;
                            Object obj = y6Var.b;
                            SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) y6Var.c;
                            a aVar = AnrIntegration.e;
                            sentryAndroidOptions.getLogger().i(q5.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
                            boolean zEquals = Boolean.TRUE.equals(i0.e.d);
                            String strConcat = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
                            if (zEquals) {
                                strConcat = "Background ".concat(strConcat);
                            }
                            Thread threadA = applicationNotResponding.a();
                            ApplicationNotResponding applicationNotResponding2 = threadA == null ? new ApplicationNotResponding(strConcat) : new ApplicationNotResponding(strConcat, threadA);
                            io.sentry.protocol.o oVar = new io.sentry.protocol.o();
                            oVar.a = "ANR";
                            i5 i5Var = new i5(new io.sentry.exception.a(oVar, applicationNotResponding2, threadA, true));
                            i5Var.J0 = q5.ERROR;
                            q4.b().C(i5Var, io.sentry.util.b.f(new a0(zEquals)));
                        }
                    } else {
                        this.g.i(q5.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.w.set(true);
                    }
                }
            } catch (InterruptedException e) {
                try {
                    Thread.currentThread().interrupt();
                    this.g.i(q5.WARNING, "Interrupted: %s", e.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.g.i(q5.WARNING, "Failed to interrupt due to SecurityException: %s", e.getMessage());
                    return;
                }
            }
        }
    }
}
