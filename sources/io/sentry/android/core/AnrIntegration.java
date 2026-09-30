package io.sentry.android.core;

import android.content.Context;
import defpackage.nzf;
import io.sentry.q5;
import io.sentry.y6;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class AnrIntegration implements io.sentry.w1, Closeable {
    public static a e;
    public static final io.sentry.util.a f = new io.sentry.util.a();
    public final Context a;
    public boolean b = false;
    public final io.sentry.util.a c = new io.sentry.util.a();
    public SentryAndroidOptions d;

    public AnrIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
    }

    @Override // io.sentry.w1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        this.d = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().i(q5.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            io.sentry.util.b.a("Anr");
            try {
                sentryAndroidOptions.getExecutorService().submit(new nzf(5, this, sentryAndroidOptions));
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().d(q5.DEBUG, "Failed to start AnrIntegration on executor thread.", th);
            }
        }
    }

    public final void b(SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.util.a aVar = f;
        aVar.b();
        try {
            if (e == null) {
                io.sentry.z0 logger = sentryAndroidOptions.getLogger();
                q5 q5Var = q5.DEBUG;
                logger.i(q5Var, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                a aVar2 = new a(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new y6(2, this, sentryAndroidOptions), sentryAndroidOptions.getLogger(), this.a);
                e = aVar2;
                aVar2.start();
                sentryAndroidOptions.getLogger().i(q5Var, "AnrIntegration installed.", new Object[0]);
            }
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.util.a aVar = this.c;
        aVar.b();
        try {
            this.b = true;
            aVar.close();
            io.sentry.util.a aVar2 = f;
            aVar2.b();
            try {
                a aVar3 = e;
                if (aVar3 != null) {
                    aVar3.interrupt();
                    e = null;
                    SentryAndroidOptions sentryAndroidOptions = this.d;
                    if (sentryAndroidOptions != null) {
                        sentryAndroidOptions.getLogger().i(q5.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
                aVar2.close();
            } catch (Throwable th) {
                try {
                    aVar2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                aVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
