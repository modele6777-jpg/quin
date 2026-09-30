package io.sentry.android.core;

import android.content.Context;
import io.sentry.q5;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class TombstoneIntegration implements io.sentry.w1, Closeable {
    public final Context a;
    public SentryAndroidOptions b;

    public TombstoneIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
    }

    @Override // io.sentry.w1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        this.b = sentryAndroidOptions;
        io.sentry.z0 logger = sentryAndroidOptions.getLogger();
        q5 q5Var = q5.DEBUG;
        logger.i(q5Var, "TombstoneIntegration enabled: %s", Boolean.valueOf(this.b.isTombstoneEnabled()));
        if (this.b.isTombstoneEnabled()) {
            if (this.b.getCacheDirPath() == null) {
                this.b.getLogger().i(q5.INFO, "Cache dir is not set, unable to process Tombstones", new Object[0]);
                return;
            }
            try {
                io.sentry.k1 executorService = sentryAndroidOptions.getExecutorService();
                Context context = this.a;
                SentryAndroidOptions sentryAndroidOptions2 = this.b;
                executorService.submit(new n0(context, sentryAndroidOptions2, new j2(context, sentryAndroidOptions2)));
            } catch (Throwable th) {
                io.sentry.z0 logger2 = sentryAndroidOptions.getLogger();
                q5Var = q5.DEBUG;
                logger2.d(q5Var, "Failed to start tombstone processor.", th);
            }
            sentryAndroidOptions.getLogger().i(q5Var, "TombstoneIntegration installed.", new Object[0]);
            io.sentry.util.b.a("Tombstone");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.b;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "TombstoneIntegration removed.", new Object[0]);
        }
    }
}
