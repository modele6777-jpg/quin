package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.io.Closeable;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class UncaughtExceptionHandlerIntegration implements w1, Thread.UncaughtExceptionHandler, Closeable {
    public static final io.sentry.util.a e = new io.sentry.util.a();
    public Thread.UncaughtExceptionHandler a;
    public g1 b;
    public SentryAndroidOptions c;
    public boolean d;

    @Override // io.sentry.w1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration;
        g1 g1Var;
        if (this.d) {
            sentryAndroidOptions.getLogger().i(q5.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.d = true;
        this.b = k4.a;
        this.c = sentryAndroidOptions;
        z0 logger = sentryAndroidOptions.getLogger();
        q5 q5Var = q5.DEBUG;
        logger.i(q5Var, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.c.isEnableUncaughtExceptionHandler()));
        if (this.c.isEnableUncaughtExceptionHandler()) {
            io.sentry.util.a aVar = e;
            aVar.b();
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                if (defaultUncaughtExceptionHandler != null) {
                    this.c.getLogger().i(q5Var, "default UncaughtExceptionHandler class='" + defaultUncaughtExceptionHandler.getClass().getName() + "'", new Object[0]);
                    if ((defaultUncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) && (g1Var = (uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) defaultUncaughtExceptionHandler).b) != null && q4.c == g1Var.v()) {
                        this.a = uncaughtExceptionHandlerIntegration.a;
                    } else {
                        this.a = defaultUncaughtExceptionHandler;
                    }
                }
                Thread.setDefaultUncaughtExceptionHandler(this);
                aVar.close();
                this.c.getLogger().i(q5Var, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
                io.sentry.util.b.a("UncaughtExceptionHandler");
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public final void b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, HashSet hashSet) {
        if (uncaughtExceptionHandler == null) {
            SentryAndroidOptions sentryAndroidOptions = this.c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().i(q5.DEBUG, "Found no UncaughtExceptionHandler to remove.", new Object[0]);
                return;
            }
            return;
        }
        if (!hashSet.add(uncaughtExceptionHandler)) {
            SentryAndroidOptions sentryAndroidOptions2 = this.c;
            if (sentryAndroidOptions2 != null) {
                sentryAndroidOptions2.getLogger().i(q5.WARNING, "Cycle detected in UncaughtExceptionHandler chain while removing handler.", new Object[0]);
                return;
            }
            return;
        }
        if (uncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) {
            UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) uncaughtExceptionHandler;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandlerIntegration.a;
            if (this != uncaughtExceptionHandler2) {
                b(uncaughtExceptionHandler2, hashSet);
                return;
            }
            uncaughtExceptionHandlerIntegration.a = this.a;
            SentryAndroidOptions sentryAndroidOptions3 = this.c;
            if (sentryAndroidOptions3 != null) {
                sentryAndroidOptions3.getLogger().i(q5.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.util.a aVar = e;
        aVar.b();
        try {
            if (this == Thread.getDefaultUncaughtExceptionHandler()) {
                Thread.setDefaultUncaughtExceptionHandler(this.a);
                SentryAndroidOptions sentryAndroidOptions = this.c;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().i(q5.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
                }
            } else {
                b(Thread.getDefaultUncaughtExceptionHandler(), new HashSet());
            }
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        io.sentry.protocol.w wVar;
        SentryAndroidOptions sentryAndroidOptions = this.c;
        if (sentryAndroidOptions == null || this.b == null) {
            return;
        }
        sentryAndroidOptions.getLogger().i(q5.INFO, "Uncaught exception received.", new Object[0]);
        try {
            o7 o7Var = new o7(this.c.getFlushTimeoutMillis(), this.c.getLogger());
            io.sentry.protocol.o oVar = new io.sentry.protocol.o();
            oVar.d = Boolean.FALSE;
            oVar.a = "UncaughtExceptionHandler";
            i5 i5Var = new i5(new io.sentry.exception.a(oVar, th, thread, false));
            i5Var.J0 = q5.FATAL;
            if (this.b.p() == null && (wVar = i5Var.a) != null) {
                o7Var.g(wVar);
            }
            l0 l0VarF = io.sentry.util.b.f(o7Var);
            boolean zEquals = this.b.C(i5Var, l0VarF).equals(io.sentry.protocol.w.b);
            io.sentry.hints.e eVar = (io.sentry.hints.e) l0VarF.c("sentry:eventDropReason", io.sentry.hints.e.class);
            if ((!zEquals || io.sentry.hints.e.MULTITHREADED_DEDUPLICATION.equals(eVar)) && !o7Var.d()) {
                this.c.getLogger().i(q5.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", i5Var.a);
            }
        } catch (Throwable th2) {
            this.c.getLogger().d(q5.ERROR, "Error sending uncaught exception to Sentry.", th2);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        SentryAndroidOptions sentryAndroidOptions2 = this.c;
        if (uncaughtExceptionHandler != null) {
            sentryAndroidOptions2.getLogger().i(q5.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.a.uncaughtException(thread, th);
        } else if (sentryAndroidOptions2.isPrintUncaughtStackTrace()) {
            th.printStackTrace();
        }
    }
}
