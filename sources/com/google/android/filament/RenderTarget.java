package com.google.android.filament;

import defpackage.kv2;
import defpackage.qc0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class RenderTarget {
    public static final int b = kv2.C(9).length;
    public long a;

    static {
        kv2.C(6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderTexture(long j, int i, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    public final long e() {
        long j = this.a;
        if (j != 0) {
            return j;
        }
        qc0.p("Calling method on destroyed RenderTarget");
        return 0L;
    }
}
