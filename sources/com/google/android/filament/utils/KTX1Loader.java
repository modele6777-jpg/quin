package com.google.android.filament.utils;

import defpackage.z7c;
import java.nio.Buffer;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001J0\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0082 ¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\rH\u0082 ¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/google/android/filament/utils/KTX1Loader;", "", "", "nativeEngine", "Ljava/nio/Buffer;", "buffer", "", "remaining", "", "srgb", "nCreateKTXTexture", "(JLjava/nio/Buffer;IZ)J", "ktxTexture", "", "sphericalHarmonics", "nCreateIndirectLight", "(JJ[F)J", "outSphericalHarmonics", "nGetSphericalHarmonics", "(Ljava/nio/Buffer;I[F)Z", "nCreateSkybox", "(JJ)J", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = z7c.f)
public final class KTX1Loader {
    private final native long nCreateIndirectLight(long nativeEngine, long ktxTexture, float[] sphericalHarmonics);

    private final native long nCreateKTXTexture(long nativeEngine, Buffer buffer, int remaining, boolean srgb);

    private final native long nCreateSkybox(long nativeEngine, long ktxTexture);

    private final native boolean nGetSphericalHarmonics(Buffer buffer, int remaining, float[] outSphericalHarmonics);
}
