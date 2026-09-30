package io.sentry.android.core;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements io.sentry.android.core.internal.util.n {
    public final /* synthetic */ int a;
    public float b = 0.0f;
    public final /* synthetic */ Object c;

    public /* synthetic */ u(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    @Override // io.sentry.android.core.internal.util.n
    public final void b(long j, long j2, long j3, long j4, boolean z, boolean z2, float f) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                long jCurrentTimeMillis = System.currentTimeMillis();
                System.nanoTime();
                long j5 = jCurrentTimeMillis * 1000000;
                w wVar = (w) obj;
                long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() + (j2 - System.nanoTime())) - wVar.a;
                if (jElapsedRealtimeNanos >= 0) {
                    if (z2) {
                        wVar.j.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jElapsedRealtimeNanos), Long.valueOf(j3), j5));
                    } else if (z) {
                        wVar.i.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jElapsedRealtimeNanos), Long.valueOf(j3), j5));
                    }
                    if (f != this.b) {
                        this.b = f;
                        wVar.h.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jElapsedRealtimeNanos), Float.valueOf(f), j5));
                    }
                    break;
                }
                break;
            default:
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                System.nanoTime();
                long j6 = jCurrentTimeMillis2 * 1000000;
                k1 k1Var = (k1) obj;
                long jElapsedRealtimeNanos2 = (SystemClock.elapsedRealtimeNanos() + (j2 - System.nanoTime())) - k1Var.h;
                if (jElapsedRealtimeNanos2 >= 0) {
                    if (z2) {
                        k1Var.f.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jElapsedRealtimeNanos2), Long.valueOf(j3), j6));
                    } else if (z) {
                        k1Var.e.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jElapsedRealtimeNanos2), Long.valueOf(j3), j6));
                    }
                    if (f != this.b) {
                        this.b = f;
                        k1Var.g.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jElapsedRealtimeNanos2), Float.valueOf(f), j6));
                    }
                    break;
                }
                break;
        }
    }
}
