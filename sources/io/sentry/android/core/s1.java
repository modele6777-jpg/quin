package io.sentry.android.core;

import android.content.Context;
import android.os.SystemClock;
import android.os.Trace;
import defpackage.xag;
import io.sentry.p4;
import io.sentry.q4;
import io.sentry.q5;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class s1 {
    public static final long a = SystemClock.uptimeMillis();
    public static final io.sentry.util.a b = new io.sentry.util.a();

    public static void a(Context context, x xVar, p4 p4Var) {
        Trace.beginSection("SentryAndroid.init");
        try {
            try {
                try {
                    io.sentry.util.a aVar = b;
                    aVar.b();
                    try {
                        q4.c(new x(6), new e(xVar, context, p4Var));
                        io.sentry.g1 g1VarB = q4.b();
                        if (p0.g()) {
                            if (g1VarB.o().isEnableAutoSessionTracking()) {
                                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                                g1VarB.n(new xag(8, atomicBoolean));
                                if (!atomicBoolean.get()) {
                                    g1VarB.r();
                                }
                            }
                            g1VarB.o().getReplayController().b();
                        }
                        aVar.close();
                        Trace.endSection();
                    } catch (Throwable th) {
                        try {
                            aVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (NoSuchMethodException e) {
                    xVar.d(q5.FATAL, "Fatal error during SentryAndroid.init(...)", e);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e);
                } catch (InvocationTargetException e2) {
                    xVar.d(q5.FATAL, "Fatal error during SentryAndroid.init(...)", e2);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e2);
                }
            } catch (IllegalAccessException e3) {
                xVar.d(q5.FATAL, "Fatal error during SentryAndroid.init(...)", e3);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e3);
            } catch (InstantiationException e4) {
                xVar.d(q5.FATAL, "Fatal error during SentryAndroid.init(...)", e4);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e4);
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
