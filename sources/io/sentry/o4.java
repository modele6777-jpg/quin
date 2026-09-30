package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SentryAndroidOptions b;

    public /* synthetic */ o4(SentryAndroidOptions sentryAndroidOptions, int i) {
        this.a = i;
        this.b = sentryAndroidOptions;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        SentryAndroidOptions sentryAndroidOptions = this.b;
        switch (i) {
            case 0:
                sentryAndroidOptions.loadLazyFields();
                return;
            case 1:
                String cacheDirPathWithoutDsn = sentryAndroidOptions.getCacheDirPathWithoutDsn();
                if (cacheDirPathWithoutDsn != null) {
                    File file = new File(cacheDirPathWithoutDsn);
                    File file2 = new File(file, "app_start_profiling_config");
                    try {
                        io.sentry.util.b.g(file2);
                        if (sentryAndroidOptions.isEnableAppStartProfiling() || sentryAndroidOptions.isStartProfilerOnAppStart()) {
                            if (!sentryAndroidOptions.isStartProfilerOnAppStart() && !sentryAndroidOptions.isTracingEnabled()) {
                                sentryAndroidOptions.getLogger().i(q5.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                                return;
                            }
                            if (!io.sentry.util.b.e(file)) {
                                sentryAndroidOptions.getLogger().i(q5.ERROR, "Failed to create cache dir %s", cacheDirPathWithoutDsn);
                                return;
                            }
                            if (file2.createNewFile()) {
                                r4 r4Var = new r4(sentryAndroidOptions, sentryAndroidOptions.isEnableAppStartProfiling() ? sentryAndroidOptions.getInternalTracesSampler().a(new io.sentry.internal.debugmeta.c(new m7("app.launch", io.sentry.protocol.h0.CUSTOM, "profile", null), Double.valueOf(io.sentry.util.n.a().c()), false, 4)) : new w3(Boolean.FALSE, (Double) null));
                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                try {
                                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, q4.e));
                                    try {
                                        sentryAndroidOptions.getSerializer().a(bufferedWriter, r4Var);
                                        bufferedWriter.close();
                                        fileOutputStream.close();
                                        return;
                                    } catch (Throwable th) {
                                        try {
                                            bufferedWriter.close();
                                            break;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    try {
                                        fileOutputStream.close();
                                        break;
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th5) {
                        sentryAndroidOptions.getLogger().d(q5.ERROR, "Unable to create app start profiling config file. ", th5);
                        return;
                    }
                }
                return;
            case 2:
                for (a1 a1Var : sentryAndroidOptions.getOptionsObservers()) {
                    a1Var.g(sentryAndroidOptions.getRelease());
                    a1Var.f(sentryAndroidOptions.getProguardUuid());
                    a1Var.b(sentryAndroidOptions.getSdkVersion());
                    a1Var.c(sentryAndroidOptions.getDist());
                    a1Var.e(sentryAndroidOptions.getEnvironment());
                    a1Var.a(sentryAndroidOptions.getTags());
                    a1Var.d(sentryAndroidOptions.getSessionReplay().e);
                }
                io.sentry.cache.g gVarFindPersistingScopeObserver = sentryAndroidOptions.findPersistingScopeObserver();
                if (gVarFindPersistingScopeObserver != null) {
                    try {
                        io.sentry.cache.tape.f fVar = (io.sentry.cache.tape.f) gVarFindPersistingScopeObserver.b.a();
                        fVar.clear();
                        fVar.H0();
                        break;
                    } catch (IOException e) {
                        gVarFindPersistingScopeObserver.a.getLogger().d(q5.ERROR, "Failed to clear breadcrumbs from file queue", e);
                    }
                    gVarFindPersistingScopeObserver.a("user.json");
                    gVarFindPersistingScopeObserver.a("level.json");
                    gVarFindPersistingScopeObserver.a("request.json");
                    gVarFindPersistingScopeObserver.a("fingerprint.json");
                    gVarFindPersistingScopeObserver.a("contexts.json");
                    gVarFindPersistingScopeObserver.a("extras.json");
                    gVarFindPersistingScopeObserver.a("tags.json");
                    gVarFindPersistingScopeObserver.a("trace.json");
                    gVarFindPersistingScopeObserver.a("transaction.json");
                    return;
                }
                return;
            default:
                q4.b().e(sentryAndroidOptions.getFlushTimeoutMillis());
                return;
        }
    }
}
