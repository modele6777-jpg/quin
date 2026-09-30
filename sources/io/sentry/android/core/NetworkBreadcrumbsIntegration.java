package io.sentry.android.core;

import android.content.Context;
import io.sentry.q5;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class NetworkBreadcrumbsIntegration implements io.sentry.w1, Closeable {
    public final Context a;
    public final o0 b;
    public final io.sentry.util.a c = new io.sentry.util.a();
    public volatile g1 d;

    public NetworkBreadcrumbsIntegration(Context context, o0 o0Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.b = o0Var;
    }

    @Override // io.sentry.w1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        boolean z;
        io.sentry.z0 logger = sentryAndroidOptions.getLogger();
        q5 q5Var = q5.DEBUG;
        logger.i(q5Var, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            io.sentry.util.a aVar = this.c;
            aVar.b();
            try {
                this.d = new g1(this.b, sentryAndroidOptions.getDateProvider());
                Context context = this.a;
                io.sentry.z0 logger2 = sentryAndroidOptions.getLogger();
                g1 g1Var = this.d;
                io.sentry.util.a aVar2 = io.sentry.android.core.internal.util.b.z;
                if (io.sentry.config.a.r(context)) {
                    io.sentry.util.a aVar3 = io.sentry.android.core.internal.util.b.Y;
                    aVar3.b();
                    try {
                        io.sentry.android.core.internal.util.b.Z.add(g1Var);
                        aVar3.close();
                        z = true;
                    } catch (Throwable th) {
                        try {
                            aVar3.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    logger2.i(q5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                    z = false;
                }
                if (z) {
                    sentryAndroidOptions.getLogger().i(q5Var, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                    io.sentry.util.b.a("NetworkBreadcrumbs");
                } else {
                    sentryAndroidOptions.getLogger().i(q5Var, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
                }
                aVar.close();
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.util.a aVar = this.c;
        aVar.b();
        try {
            g1 g1Var = this.d;
            this.d = null;
            aVar.close();
            if (g1Var != null) {
                io.sentry.util.a aVar2 = io.sentry.android.core.internal.util.b.Y;
                aVar2.b();
                try {
                    io.sentry.android.core.internal.util.b.Z.remove(g1Var);
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
