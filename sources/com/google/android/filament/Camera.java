package com.google.android.filament;

import defpackage.kv2;
import defpackage.qc0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class Camera {
    public long a;

    private static native void nLookAt(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9);

    private static native void nSetExposure(long j, float f, float f2, float f3);

    private static native void nSetProjectionFov(long j, double d, double d2, double d3, double d4, int i);

    public final long a() {
        long j = this.a;
        if (j != 0) {
            return j;
        }
        qc0.p("Calling method on destroyed Camera");
        return 0L;
    }

    public final void b(double d, double d2) {
        nLookAt(a(), 0.0d, d, d2, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d);
    }

    public final void c() {
        nSetExposure(a(), 1.0f, 1.2f, 100.0f);
    }

    public final void d(double d) {
        nSetProjectionFov(a(), 30.0d, d, 0.1d, 20.0d, kv2.B(1));
    }
}
