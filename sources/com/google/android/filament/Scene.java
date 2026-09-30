package com.google.android.filament;

import defpackage.qc0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class Scene {
    public long a;

    private static native void nAddEntity(long j, int i);

    private static native void nRemove(long j, int i);

    public final void a(int i) {
        nAddEntity(b(), i);
    }

    public final long b() {
        long j = this.a;
        if (j != 0) {
            return j;
        }
        qc0.p("Calling method on destroyed Scene");
        return 0L;
    }

    public final void c(int i) {
        nRemove(b(), i);
    }
}
