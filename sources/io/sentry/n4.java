package io.sentry;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n4 {
    public final /* synthetic */ int a;
    public final io.sentry.android.core.r b;

    public /* synthetic */ n4(io.sentry.android.core.r rVar, int i) {
        this.a = i;
        this.b = rVar;
    }

    public static boolean b(z0 z0Var, String str) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        z0Var.i(q5.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }

    public final m4 a(g1 g1Var, q6 q6Var) {
        int i = this.a;
        io.sentry.android.core.r rVar = this.b;
        switch (i) {
            case 0:
                io.sentry.util.b.r(g1Var, "Scopes are required");
                io.sentry.util.b.r(q6Var, "SentryOptions is required");
                String cacheDirPath = rVar.b.getCacheDirPath();
                if (cacheDirPath == null || !b(q6Var.getLogger(), cacheDirPath)) {
                    q6Var.getLogger().i(q5.ERROR, "No cache dir path is defined in options.", new Object[0]);
                    return null;
                }
                return new m4(q6Var.getLogger(), cacheDirPath, new e0(g1Var, q6Var.getSerializer(), q6Var.getLogger(), q6Var.getFlushTimeoutMillis(), q6Var.getMaxQueueSize()), new File(cacheDirPath));
            default:
                io.sentry.util.b.r(g1Var, "Scopes are required");
                io.sentry.util.b.r(q6Var, "SentryOptions is required");
                String outboxPath = rVar.b.getOutboxPath();
                if (outboxPath == null || !b(q6Var.getLogger(), outboxPath)) {
                    q6Var.getLogger().i(q5.ERROR, "No outbox dir path is defined in options.", new Object[0]);
                    return null;
                }
                return new m4(q6Var.getLogger(), outboxPath, new n3(g1Var, q6Var.getEnvelopeReader(), q6Var.getSerializer(), q6Var.getLogger(), q6Var.getFlushTimeoutMillis(), q6Var.getMaxQueueSize()), new File(outboxPath));
        }
    }
}
