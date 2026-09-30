package com.google.android.filament;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class TransformManager {
    public long a;

    private static native int nCreate(long j, int i);

    private static native void nDestroy(long j, int i);

    private static native int nGetInstance(long j, int i);

    private static native void nSetTransform(long j, int i, float[] fArr);

    public final void a(int i) {
        nCreate(this.a, i);
    }

    public final void b(int i) {
        nDestroy(this.a, i);
    }

    public final int c(int i) {
        return nGetInstance(this.a, i);
    }

    public final void d(int i, float[] fArr) {
        if (fArr.length < 16) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
        }
        nSetTransform(this.a, i, fArr);
    }
}
