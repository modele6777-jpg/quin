package com.google.android.filament.utils;

import defpackage.z7c;
import java.nio.Buffer;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/filament/utils/HDRLoader;", "", "", "nativeEngine", "Ljava/nio/Buffer;", "buffer", "", "remaining", "format", "nCreateHDRTexture", "(JLjava/nio/Buffer;II)J", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = z7c.f)
public final class HDRLoader {
    private final native long nCreateHDRTexture(long nativeEngine, Buffer buffer, int remaining, int format);
}
