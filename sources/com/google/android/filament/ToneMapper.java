package com.google.android.filament;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ToneMapper {
    public final long a;

    public ToneMapper(long j) {
        this.a = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreatePBRNeutralToneMapper();

    private static native void nDestroyToneMapper(long j);

    public final void finalize() {
        long j = this.a;
        try {
            super.finalize();
        } finally {
            nDestroyToneMapper(j);
        }
    }
}
