package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class r4 implements k2 {
    public t3 X;
    public ConcurrentHashMap Y;
    public boolean a;
    public Double b;
    public boolean c;
    public Double d;
    public String e;
    public boolean f;
    public boolean g;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public r4(SentryAndroidOptions sentryAndroidOptions, w3 w3Var) {
        this.c = ((Boolean) w3Var.a).booleanValue();
        this.d = (Double) w3Var.b;
        this.a = ((Boolean) w3Var.d).booleanValue();
        this.b = (Double) w3Var.e;
        this.w = sentryAndroidOptions.getInternalTracesSampler().b(io.sentry.util.n.a().c());
        this.e = sentryAndroidOptions.getProfilingTracesDirPath();
        this.f = sentryAndroidOptions.isProfilingEnabled();
        this.g = sentryAndroidOptions.isContinuousProfilingEnabled();
        this.X = sentryAndroidOptions.getProfileLifecycle();
        this.v = sentryAndroidOptions.getProfilingTracesHz();
        this.x = sentryAndroidOptions.isEnableAppStartProfiling();
        this.y = sentryAndroidOptions.isStartProfilerOnAppStart();
        this.z = sentryAndroidOptions.isEnableLegacyProfiling();
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        cVar.q("profile_sampled");
        cVar.w(z0Var, Boolean.valueOf(this.a));
        cVar.q("profile_sample_rate");
        cVar.w(z0Var, this.b);
        cVar.q("continuous_profile_sampled");
        cVar.w(z0Var, Boolean.valueOf(this.w));
        cVar.q("trace_sampled");
        cVar.w(z0Var, Boolean.valueOf(this.c));
        cVar.q("trace_sample_rate");
        cVar.w(z0Var, this.d);
        cVar.q("profiling_traces_dir_path");
        cVar.w(z0Var, this.e);
        cVar.q("is_profiling_enabled");
        cVar.w(z0Var, Boolean.valueOf(this.f));
        cVar.q("is_continuous_profiling_enabled");
        cVar.w(z0Var, Boolean.valueOf(this.g));
        cVar.q("profile_lifecycle");
        cVar.w(z0Var, this.X.name());
        cVar.q("profiling_traces_hz");
        cVar.w(z0Var, Integer.valueOf(this.v));
        cVar.q("is_enable_app_start_profiling");
        cVar.w(z0Var, Boolean.valueOf(this.x));
        cVar.q("is_start_profiler_on_app_start");
        cVar.w(z0Var, Boolean.valueOf(this.y));
        cVar.q("enable_legacy_profiling");
        cVar.w(z0Var, Boolean.valueOf(this.z));
        ConcurrentHashMap concurrentHashMap = this.Y;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.Y, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}
