package com.google.android.filament;

import defpackage.kv2;
import defpackage.qc0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class Texture {
    public long a;

    static {
        try {
            Class.forName("android.hardware.HardwareBuffer");
        } catch (ClassNotFoundException unused) {
        }
        kv2.C(5);
        kv2.C(109);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFormat(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderHeight(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderLevels(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSampler(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderUsage(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderWidth(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native void nGenerateMipmaps(long j, long j2);

    private static native int nGetHeight(long j, int i);

    private static native int nGetWidth(long j, int i);

    public long getNativeObject() {
        long j = this.a;
        if (j != 0) {
            return j;
        }
        qc0.p("Calling method on destroyed Texture");
        return 0L;
    }

    public final void j(Engine engine) {
        nGenerateMipmaps(getNativeObject(), engine.getNativeObject());
    }

    public final int k() {
        return nGetHeight(getNativeObject(), 0);
    }

    public final int l() {
        return nGetWidth(getNativeObject(), 0);
    }
}
