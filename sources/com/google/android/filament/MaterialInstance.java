package com.google.android.filament;

import defpackage.kv2;
import defpackage.qc0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialInstance {
    public long a;

    static {
        kv2.C(4);
    }

    private static native void nSetParameterFloat(long j, String str, float f);

    private static native void nSetParameterTexture(long j, String str, long j2, long j3);

    public final long a() {
        long j = this.a;
        if (j != 0) {
            return j;
        }
        qc0.p("Calling method on destroyed MaterialInstance");
        return 0L;
    }

    public final void b(String str, float f) {
        nSetParameterFloat(a(), str, f);
    }

    public final void c(String str, Texture texture, TextureSampler textureSampler) {
        nSetParameterTexture(a(), str, texture.getNativeObject(), textureSampler.a);
    }
}
