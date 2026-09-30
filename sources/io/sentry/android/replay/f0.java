package io.sentry.android.replay;

import android.os.Handler;
import defpackage.tec;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.q5;
import io.sentry.z0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements Runnable {
    public final SentryAndroidOptions a;
    public final io.sentry.d b;
    public a0 c;
    public b0 d;
    public final AtomicBoolean e;

    public f0(SentryAndroidOptions sentryAndroidOptions, io.sentry.d dVar) {
        dVar.getClass();
        this.a = sentryAndroidOptions;
        this.b = dVar;
        this.e = new AtomicBoolean(true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.e.get();
        SentryAndroidOptions sentryAndroidOptions = this.a;
        if (!z) {
            if (sentryAndroidOptions.getSessionReplay().m) {
                sentryAndroidOptions.getLogger().i(q5.DEBUG, "Not capturing frames, recording is not running.", new Object[0]);
                return;
            }
            return;
        }
        try {
            if (sentryAndroidOptions.getSessionReplay().m) {
                sentryAndroidOptions.getLogger().i(q5.DEBUG, "Capturing a frame.", new Object[0]);
            }
            a0 a0Var = this.c;
            if (a0Var != null) {
                a0Var.b();
            }
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(q5.ERROR, "Failed to capture a frame", th);
        }
        if (sentryAndroidOptions.getSessionReplay().m) {
            z0 logger = sentryAndroidOptions.getLogger();
            q5 q5Var = q5.DEBUG;
            StringBuilder sb = new StringBuilder("Posting the capture runnable again, frame rate is ");
            b0 b0Var = this.d;
            logger.i(q5Var, tec.g(b0Var != null ? b0Var.e : 1, " fps.", sb), new Object[0]);
        }
        b0 b0Var2 = this.d;
        if (((Handler) this.b.b).postDelayed(this, 1000 / ((long) (b0Var2 != null ? b0Var2.e : 1)))) {
            return;
        }
        sentryAndroidOptions.getLogger().i(q5.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
    }
}
