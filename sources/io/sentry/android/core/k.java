package io.sentry.android.core;

import android.os.Process;
import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.o3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements io.sentry.c1 {
    public long a;
    public long b;
    public long c;
    public boolean d;

    @Override // io.sentry.c1
    public final void a(o3 o3Var) {
        if (this.d) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j = jElapsedRealtimeNanos - this.a;
            this.a = jElapsedRealtimeNanos;
            long elapsedCpuTime = Process.getElapsedCpuTime() * 1000000;
            long j2 = elapsedCpuTime - this.b;
            this.b = elapsedCpuTime;
            o3Var.a = ((j2 / j) / this.c) * 100.0d;
            o3Var.b = true;
        }
    }

    @Override // io.sentry.c1
    public final void c() {
        this.d = true;
        this.c = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.a = SystemClock.elapsedRealtimeNanos();
        this.b = Process.getElapsedCpuTime() * 1000000;
    }
}
