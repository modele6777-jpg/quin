package com.google.android.filament;

import defpackage.kv2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class TextureSampler {
    public final long a;

    public TextureSampler() {
        this.a = 0L;
        this.a = nCreateSampler(kv2.B(6), kv2.B(2), kv2.B(1), kv2.B(1), kv2.B(1));
    }

    private static native long nCreateSampler(int i, int i2, int i3, int i4, int i5);
}
