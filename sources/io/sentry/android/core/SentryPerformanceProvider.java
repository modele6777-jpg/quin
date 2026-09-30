package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import defpackage.qc0;
import defpackage.xag;
import io.sentry.k5;
import io.sentry.l7;
import io.sentry.q5;
import io.sentry.q6;
import io.sentry.r4;
import io.sentry.w3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class SentryPerformanceProvider extends v0 {
    public static final long e = SystemClock.uptimeMillis();
    public static final /* synthetic */ int f = 0;
    public Application b;
    public final io.sentry.z0 c;
    public final o0 d;

    public SentryPerformanceProvider() {
        x xVar = new x(3);
        this.c = xVar;
        this.d = new o0(xVar);
    }

    public final void a(Context context, r4 r4Var, io.sentry.android.core.performance.g gVar) {
        boolean z = r4Var.w;
        io.sentry.z0 z0Var = this.c;
        if (!z) {
            z0Var.i(q5.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        j jVar = new j(this.d, new io.sentry.android.core.internal.util.o(context.getApplicationContext(), z0Var, this.d), this.c, r4Var.e, r4Var.v, new xag(9, new k5()));
        gVar.w = null;
        gVar.x = jVar;
        z0Var.i(q5.DEBUG, "App start continuous profiling started.", new Object[0]);
        q6 q6VarEmpty = q6.empty();
        q6VarEmpty.setProfileSessionSampleRate(Double.valueOf(r4Var.w ? 1.0d : 0.0d));
        jVar.c(r4Var.X, new l7(q6VarEmpty));
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            qc0.p("An applicationId is required to fulfill the manifest placeholder.");
        } else {
            super.attachInfo(context, providerInfo);
        }
    }

    public final void b(Context context, r4 r4Var, io.sentry.android.core.performance.g gVar) {
        boolean z = r4Var.c;
        w3 w3Var = new w3(Boolean.valueOf(z), r4Var.d, (Double) null, Boolean.valueOf(r4Var.a), r4Var.b);
        gVar.y = w3Var;
        boolean zBooleanValue = ((Boolean) w3Var.d).booleanValue();
        io.sentry.z0 z0Var = this.c;
        if (!zBooleanValue || !z) {
            z0Var.i(q5.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        k5 k5Var = new k5();
        o0 o0Var = this.d;
        y yVar = new y(context, o0Var, new io.sentry.android.core.internal.util.o(context, z0Var, o0Var), this.c, r4Var.e, r4Var.f, r4Var.v, new xag(9, k5Var));
        gVar.x = null;
        gVar.w = yVar;
        z0Var.i(q5.DEBUG, "App start profiling started.", new Object[0]);
        yVar.start();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.BufferedReader, java.io.Reader] */
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        ?? CanRead;
        r4 r4VarB;
        io.sentry.android.core.performance.g.e(this);
        io.sentry.android.core.performance.g gVarC = io.sentry.android.core.performance.g.c();
        Context context = getContext();
        gVarC.e.f(e);
        this.d.getClass();
        gVarC.d.f(Process.getStartUptimeMillis());
        if (context instanceof Application) {
            this.b = (Application) context;
        }
        Application application = this.b;
        if (application != null) {
            gVarC.h(application);
        }
        Context context2 = getContext();
        io.sentry.z0 z0Var = this.c;
        if (context2 == null) {
            z0Var.i(q5.FATAL, "App. Context from ContentProvider is null", new Object[0]);
        } else {
            File file = new File(new File(context2.getCacheDir(), "sentry"), "app_start_profiling_config");
            if (file.exists() && (CanRead = file.canRead()) != 0) {
                try {
                    try {
                        CanRead = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                        try {
                            io.sentry.j2 j2Var = new io.sentry.j2(CanRead);
                            try {
                                r4VarB = io.sentry.f.b(j2Var, z0Var);
                                j2Var.close();
                            } catch (Throwable th) {
                                try {
                                    j2Var.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Exception e2) {
                            z0Var.d(q5.ERROR, "Error when deserializing", e2);
                            r4VarB = null;
                        }
                        if (r4VarB == null) {
                            z0Var.i(q5.WARNING, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start.", new Object[0]);
                        } else if (Build.VERSION.SDK_INT >= 35) {
                            z0Var.i(q5.DEBUG, "Device is API 35+. Skipping legacy app-start profiling — Perfetto ProfilingManager will be initialized after Sentry.init().", new Object[0]);
                        } else if (!r4VarB.z) {
                            z0Var.i(q5.WARNING, "enableLegacyProfiling is disabled and device is below API 35. App start profiling will not start.", new Object[0]);
                        } else if (r4VarB.g && r4VarB.y) {
                            a(context2, r4VarB, gVarC);
                        } else if (!r4VarB.f) {
                            z0Var.i(q5.INFO, "Profiling is not enabled. App start profiling will not start.", new Object[0]);
                        } else if (r4VarB.x) {
                            b(context2, r4VarB, gVarC);
                        }
                        CanRead.close();
                    } catch (Throwable th3) {
                        try {
                            CanRead.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (FileNotFoundException e3) {
                    z0Var.d(q5.ERROR, "App start profiling config file not found. ", e3);
                } catch (Throwable th5) {
                    z0Var.d(q5.ERROR, "Error reading app start profiling config file. ", th5);
                }
            }
        }
        io.sentry.android.core.performance.g.f(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        io.sentry.util.a aVar = io.sentry.android.core.performance.g.P0;
        aVar.b();
        try {
            y yVar = io.sentry.android.core.performance.g.c().w;
            if (yVar != null) {
                yVar.close();
            }
            j jVar = io.sentry.android.core.performance.g.c().x;
            if (jVar != null) {
                jVar.a(true);
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

    public SentryPerformanceProvider(io.sentry.z0 z0Var, o0 o0Var) {
        this.c = z0Var;
        this.d = o0Var;
    }
}
