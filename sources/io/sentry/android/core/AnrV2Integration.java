package io.sentry.android.core;

import android.content.Context;
import io.sentry.q5;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class AnrV2Integration implements io.sentry.w1, Closeable {
    public final Context a;
    public SentryAndroidOptions b;

    public AnrV2Integration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
    }

    @Override // io.sentry.w1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        this.b = sentryAndroidOptions;
        io.sentry.z0 logger = sentryAndroidOptions.getLogger();
        q5 q5Var = q5.DEBUG;
        logger.i(q5Var, "AnrIntegration enabled: %s", Boolean.valueOf(this.b.isAnrEnabled()));
        String cacheDirPath = this.b.getCacheDirPath();
        SentryAndroidOptions sentryAndroidOptions2 = this.b;
        if (cacheDirPath == null) {
            sentryAndroidOptions2.getLogger().i(q5.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (sentryAndroidOptions2.isAnrEnabled()) {
            try {
                io.sentry.k1 executorService = sentryAndroidOptions.getExecutorService();
                Context context = this.a;
                SentryAndroidOptions sentryAndroidOptions3 = this.b;
                executorService.submit(new n0(context, sentryAndroidOptions3, new c0(sentryAndroidOptions3)));
            } catch (Throwable th) {
                io.sentry.z0 logger2 = sentryAndroidOptions.getLogger();
                q5Var = q5.DEBUG;
                logger2.d(q5Var, "Failed to start ANR processor.", th);
            }
            sentryAndroidOptions.getLogger().i(q5Var, "AnrV2Integration installed.", new Object[0]);
            io.sentry.util.b.a("AnrV2");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.b;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }
}
