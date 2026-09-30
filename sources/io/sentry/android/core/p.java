package io.sentry.android.core;

import android.os.Debug;
import io.sentry.o3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements io.sentry.c1 {
    @Override // io.sentry.c1
    public final void a(o3 o3Var) {
        long jFreeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long nativeHeapSize = Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize();
        o3Var.c = jFreeMemory;
        o3Var.d = true;
        o3Var.e = nativeHeapSize;
        o3Var.f = true;
    }

    @Override // io.sentry.c1
    public final void c() {
    }
}
