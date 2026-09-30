package io.sentry.android.core;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import defpackage.mc0;
import defpackage.r82;
import io.sentry.q5;
import java.io.File;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class o1 {
    public final io.sentry.z0 a;
    public final io.sentry.k1 b;
    public final ProfilingManager c;
    public final CancellationSignal d;
    public final Object e;
    public volatile ProfilingResult f;
    public Consumer g;
    public volatile boolean h;

    public o1(Context context, io.sentry.z0 z0Var, io.sentry.k1 k1Var) {
        ProfilingManager profilingManagerA = r82.a(context.getSystemService("profiling"));
        this.d = new CancellationSignal();
        this.e = new Object();
        this.f = null;
        this.g = null;
        this.h = false;
        this.a = z0Var;
        this.b = k1Var;
        this.c = profilingManagerA;
    }

    public static String a(int i) {
        if (i == 1) {
            return "ERROR_FAILED_RATE_LIMIT_SYSTEM";
        }
        if (i == 2) {
            return "ERROR_FAILED_RATE_LIMIT_PROCESS";
        }
        if (i == 3) {
            return "ERROR_FAILED_PROFILING_IN_PROGRESS";
        }
        if (i == 5) {
            return "ERROR_FAILED_POST_PROCESSING";
        }
        if (i != 7) {
            return i != 8 ? "UNKNOWN_ERROR_CODE" : "ERROR_UNKNOWN";
        }
        return "ERROR_FAILED_INVALID_REQUEST";
    }

    public final File b(ProfilingResult profilingResult) {
        int errorCode = profilingResult.getErrorCode();
        io.sentry.z0 z0Var = this.a;
        if (errorCode != 0) {
            if (errorCode == 1 || errorCode == 2) {
                z0Var.i(q5.INFO, "Perfetto profiling failed: %s. To disable during development run: adb shell device_config put profiling_testing rate_limiter.disabled true", a(errorCode));
            } else {
                z0Var.i(q5.WARNING, "Perfetto profiling failed with %s (error code %d): %s. See https://developer.android.com/reference/android/os/ProfilingResult", a(errorCode), Integer.valueOf(errorCode), profilingResult.getErrorMessage());
            }
            return null;
        }
        String resultFilePath = profilingResult.getResultFilePath();
        if (resultFilePath == null) {
            z0Var.i(q5.WARNING, "Perfetto profiling result file path is null.", new Object[0]);
            return null;
        }
        File file = new File(resultFilePath);
        if (file.exists() && file.length() != 0) {
            return file;
        }
        z0Var.i(q5.WARNING, "Perfetto trace file does not exist or is empty.", new Object[0]);
        return null;
    }

    public final boolean c() {
        if (this.h) {
            this.a.i(q5.WARNING, "PerfettoProfiler was already started.", new Object[0]);
            return false;
        }
        this.h = true;
        if (this.c == null) {
            this.a.i(q5.WARNING, "ProfilingManager is not available.", new Object[0]);
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("KEY_DURATION_MS", 60000);
        bundle.putInt("KEY_FREQUENCY_HZ", 101);
        try {
            this.c.requestProfiling(3, bundle, "sentry-profiling", this.d, new mc0(1), new Consumer() { // from class: io.sentry.android.core.m1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    o1 o1Var = this.a;
                    ProfilingResult profilingResult = (ProfilingResult) obj;
                    o1Var.a.i(q5.DEBUG, "Perfetto ProfilingResult received: errorCode=%d, filePath=%s", Integer.valueOf(profilingResult.getErrorCode()), profilingResult.getResultFilePath());
                    synchronized (o1Var.e) {
                        try {
                            o1Var.f = profilingResult;
                            Consumer consumer = o1Var.g;
                            if (consumer != null) {
                                consumer.accept(o1Var.b(profilingResult));
                                o1Var.g = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
            return true;
        } catch (Throwable th) {
            this.a.d(q5.ERROR, "Failed to request Profiling.", th);
            return false;
        }
    }
}
